package willatendo.fossilslegacy.client.render;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import willatendo.fossilslegacy.client.FossilsLegacyModels;
import willatendo.fossilslegacy.client.model.MosasaurusModel;
import willatendo.fossilslegacy.client.render.layer.MosasaurusEyesLayer;
import willatendo.fossilslegacy.server.entity.Mosasaurus;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class MosasaurusRenderer extends DinosaurRenderer<Mosasaurus, MosasaurusModel> {
    public static final ResourceLocation TEXTURE = FossilsLegacyUtils.resource("textures/entities/animals/mosasaurus/mosasaurus.png");

    public MosasaurusRenderer(Context context) {
        super(context, new MosasaurusModel(context.bakeLayer(FossilsLegacyModels.MOSASAURUS)), 0.3F);
        this.addLayer(new MosasaurusEyesLayer(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Mosasaurus mosasaurus) {
        return TEXTURE;
    }
}
