package willatendo.fossilslegacy.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import willatendo.fossilslegacy.client.FossilsLegacyModels;
import willatendo.fossilslegacy.client.model.StegosaurusModel;
import willatendo.fossilslegacy.server.entity.Stegosaurus;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class StegosaurusRenderer extends DinosaurRenderer<Stegosaurus, StegosaurusModel> {
    public static final ResourceLocation TEXTURE = FossilsLegacyUtils.resource("textures/entities/animals/stegosaurus/stegosaurus.png");
    public static final ResourceLocation BABY_TEXTURE = FossilsLegacyUtils.resource("textures/entities/animals/stegosaurus/baby_stegosaurus.png");

    public StegosaurusRenderer(Context context) {
        super(context, new StegosaurusModel(context.bakeLayer(FossilsLegacyModels.STEGOSAURUS)), 0.15F);
    }

    @Override
    public ResourceLocation getTextureLocation(Stegosaurus stegosaurus) {
        return stegosaurus.isBaby() ? BABY_TEXTURE : TEXTURE;
    }
}
