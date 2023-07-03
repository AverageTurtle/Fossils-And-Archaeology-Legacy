package fossilslegacy.client.render;

import org.joml.Matrix3f;
import org.joml.Matrix4f;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.PoseStack.Pose;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;

import fossilslegacy.server.entity.StoneHieroglyph;
import fossilslegacy.server.entity.StoneHieroglyphTypes;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class StoneHieroglyphRenderer extends EntityRenderer<StoneHieroglyph> {
	public StoneHieroglyphRenderer(Context context) {
		super(context);
	}

	@Override
	public void render(StoneHieroglyph stoneHieroglyph, float packedLight, float packedOverlay, PoseStack poseStack, MultiBufferSource multiBufferSource, int partialTicks) {
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - packedLight));
		StoneHieroglyphTypes stoneHieroglyphTypes = StoneHieroglyphTypes.values()[stoneHieroglyph.getStoneHieroglyph().ordinal()];
		poseStack.scale(0.0625F, 0.0625F, 0.0625F);
		VertexConsumer vertexConsumer = multiBufferSource.getBuffer(RenderType.entityTranslucent(this.getTextureLocation(stoneHieroglyph)));
		this.renderStoneHieroglyph(poseStack, vertexConsumer, stoneHieroglyph, stoneHieroglyphTypes.getWidth(), stoneHieroglyphTypes.getHeight());
		poseStack.popPose();
		super.render(stoneHieroglyph, packedLight, packedOverlay, poseStack, multiBufferSource, partialTicks);
	}

	private void renderStoneHieroglyph(PoseStack poseStack, VertexConsumer vertexConsumer, StoneHieroglyph cavePainting, int width, int height) {
		Pose pose = poseStack.last();
		Matrix4f matrix4f = pose.pose();
		Matrix3f matrix3f = pose.normal();
		float f = (float) (-width) / 2.0F;
		float f1 = (float) (-height) / 2.0F;
		int i = width / 16;
		int j = height / 16;
		float d0 = 16.0F / i;
		float d1 = 16.0F / j;

		for (int k = 0; k < i; ++k) {
			for (int l = 0; l < j; ++l) {
				float uStart = f + (float) (k * 16);
				float uEnd = f + (float) ((k + 1) * 16);
				float vStart = f1 + (float) (l * 16);
				float vEnd = f1 + (float) ((l + 1) * 16);
				int x = cavePainting.getBlockX();
				int y = Mth.floor(cavePainting.getY() + (double) ((vStart + vEnd) / 2.0F / 16.0F));
				int z = cavePainting.getBlockZ();
				Direction direction = cavePainting.getDirection();
				if (direction == Direction.NORTH) {
					x = Mth.floor(cavePainting.getX() + (double) ((uStart + uEnd) / 2.0F / 16.0F));
				}

				if (direction == Direction.WEST) {
					z = Mth.floor(cavePainting.getZ() - (double) ((uStart + uEnd) / 2.0F / 16.0F));
				}

				if (direction == Direction.SOUTH) {
					x = Mth.floor(cavePainting.getX() - (double) ((uStart + uEnd) / 2.0F / 16.0F));
				}

				if (direction == Direction.EAST) {
					z = Mth.floor(cavePainting.getZ() + (double) ((uStart + uEnd) / 2.0F / 16.0F));
				}

				int lightColour = LevelRenderer.getLightColor(cavePainting.level(), new BlockPos(x, y, z));
				float spriteMinU = (float) (d0 * (i - k)) / 16f;
				float spriteMaxU = (float) (d0 * (i - (k + 1))) / 16f;
				float spriteMinV = (float) (d1 * (j - l)) / 16f;
				float spriteMaxV = (float) (d1 * (j - (l + 1))) / 16f;
				this.vertex(matrix4f, matrix3f, vertexConsumer, uEnd, vStart, spriteMaxU, spriteMinV, -0.5F, 0, 0, -1, lightColour);
				this.vertex(matrix4f, matrix3f, vertexConsumer, uStart, vStart, spriteMinU, spriteMinV, -0.5F, 0, 0, -1, lightColour);
				this.vertex(matrix4f, matrix3f, vertexConsumer, uStart, vEnd, spriteMinU, spriteMaxV, -0.5F, 0, 0, -1, lightColour);
				this.vertex(matrix4f, matrix3f, vertexConsumer, uEnd, vEnd, spriteMaxU, spriteMaxV, -0.5F, 0, 0, -1, lightColour);
			}
		}

	}

	private void vertex(Matrix4f matrix4f, Matrix3f matrix3f, VertexConsumer vertexConsumer, float x, float y, float u, float v, float z, int x2, int y2, int y3, int lightColour) {
		vertexConsumer.vertex(matrix4f, x, y, z).color(255, 255, 255, 255).uv(u, v).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(lightColour).normal(matrix3f, (float) x2, (float) y2, (float) y3).endVertex();
	}

	@Override
	public ResourceLocation getTextureLocation(StoneHieroglyph stoneHieroglyph) {
		return stoneHieroglyph.getStoneHieroglyph().getTexture();
	}
}
