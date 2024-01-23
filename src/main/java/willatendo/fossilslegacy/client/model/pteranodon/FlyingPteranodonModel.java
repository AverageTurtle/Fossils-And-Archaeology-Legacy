package willatendo.fossilslegacy.client.model.pteranodon;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import willatendo.fossilslegacy.server.entity.Pteranodon;

public class FlyingPteranodonModel extends AbstractPteranodonModel {
	private final ModelPart root;
	private final ModelPart head;
	private final ModelPart crown;
	private final ModelPart lowerMouth;
	private final ModelPart upperMouth;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart body;
	private final ModelPart rightWing1;
	private final ModelPart rightWing2;
	private final ModelPart leftWing1;
	private final ModelPart leftWing2;
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;
	private final ModelPart tail;

	public FlyingPteranodonModel(ModelPart root) {
		this.root = root;
		this.head = root.getChild("head");
		this.crown = root.getChild("crown");
		this.lowerMouth = root.getChild("lower_mouth");
		this.upperMouth = root.getChild("upper_mouth");
		this.neck1 = root.getChild("neck_1");
		this.neck2 = root.getChild("neck_2");
		this.body = root.getChild("body");
		this.rightLeg = root.getChild("right_leg");
		this.leftLeg = root.getChild("left_leg");
		this.rightWing1 = root.getChild("right_wing_1");
		this.rightWing2 = root.getChild("right_wing_2");
		this.leftWing1 = root.getChild("left_wing_1");
		this.leftWing2 = root.getChild("left_wing_2");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshDefinition = new MeshDefinition();
		PartDefinition partDefinition = meshDefinition.getRoot();

		partDefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, -13.0F, -1.0F, 4.0F, 5.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("crown", CubeListBuilder.create().texOffs(16, 22).addBox(-1.0F, -10.0F, -9.0F, 2.0F, 4.0F, 6.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.4859298F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("lower_mouth", CubeListBuilder.create().texOffs(44, 9).addBox(-1.0F, -2.0F, -20.0F, 2.0F, 1.0F, 8.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.1356083F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("upper_mouth", CubeListBuilder.create().texOffs(44, 0).addBox(-1.0F, -1.0F, -21.0F, 2.0F, 1.0F, 8.0F), PartPose.offset(0.0F, 23.0F, 0.0F));
		partDefinition.addOrReplaceChild("neck_1", CubeListBuilder.create().texOffs(8, 16).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("neck_2", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -11.0F, -1.0F, 2.0F, 4.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.5F, -2.0F, 4.0F, 7.0F, 4.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("right_wing_1", CubeListBuilder.create().texOffs(16, 7).addBox(2.0F, -3.0F, -1.0F, 8.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 1.0F, 1.570796F, 0.0F, -2.792527F));
		partDefinition.addOrReplaceChild("right_wing_2", CubeListBuilder.create().texOffs(46, 18).addBox(9.0F, -3.0F, -4.0F, 8.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -1.570796F, 3.141593F, -3.002F));
		partDefinition.addOrReplaceChild("left_wing_1", CubeListBuilder.create().texOffs(16, 0).addBox(2.0F, -3.0F, 0.0F, 8.0F, 6.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, -1.570796F, 3.141593F, 2.792527F));
		partDefinition.addOrReplaceChild("left_wing_2", CubeListBuilder.create().texOffs(46, 23).addBox(9.0F, -3.0F, 3.0F, 8.0F, 4.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(40, 4).addBox(-2.0F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(40, 0).addBox(1.0F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));
		partDefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 11).addBox(-2.0F, 2.0F, 0.0F, 4.0F, 3.0F, 2.0F), PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.570796F, 0.0F, 0.0F));

		return LayerDefinition.create(meshDefinition, 64, 32);
	}

	protected void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, boolean modelized) {
		if (modelized)
			return;

	}

	@Override
	public void setupAnim(Pteranodon pteranodon, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leftWing1.xRot = -1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.leftWing2.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.rightWing1.xRot = 1.570796F - (float) (pteranodon.airPitch * (Math.PI / 180));
		this.rightWing2.xRot = -1.570796F - (float) (pteranodon.airPitch * (Math.PI / 180));
		this.body.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.neck1.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.neck2.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.tail.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.crown.xRot = 0.4859298F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.head.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.upperMouth.xRot = (float) (pteranodon.airPitch * (Math.PI / 180));
		this.lowerMouth.xRot = 0.1356083F + (float) (pteranodon.airPitch * (Math.PI / 180));
		this.leftLeg.xRot = this.rightLeg.xRot = 1.570796F + (float) (pteranodon.airPitch * (Math.PI / 180));
		// Roll
		this.body.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.neck1.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.neck2.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.leftWing1.zRot = 2.792527F + (float) (pteranodon.airAngle * (Math.PI / 180));
		this.leftWing2.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.rightWing1.zRot = -2.792527F + (float) (pteranodon.airAngle * (Math.PI / 180));
		this.rightWing2.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.tail.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.crown.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.head.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.upperMouth.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.lowerMouth.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
		this.leftLeg.zRot = this.rightLeg.zRot = (float) (pteranodon.airAngle * (Math.PI / 180));
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		this.root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}