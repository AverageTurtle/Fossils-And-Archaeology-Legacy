package willatendo.fossilslegacy.server.block;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class FossilsLegacyWoodTypes {
    public static final WoodType LEPIDODENDRON = register("lepidodendron", FossilsLegacyBlockSetTypes.LEPIDODENDRON);

    public static WoodType register(String id, BlockSetType blockSetType) {
        return WoodType.register(new WoodType(FossilsLegacyUtils.ID + ":" + id, blockSetType));
    }

    public static void register(WoodType woodType) {
        ResourceLocation resourceLocation = ResourceLocation.parse(woodType.name());
        Sheets.SIGN_MATERIALS.put(woodType, new Material(Sheets.SIGN_SHEET, ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(), "entity/sign/" + resourceLocation.getPath())));
        Sheets.HANGING_SIGN_MATERIALS.put(woodType, new Material(Sheets.SIGN_SHEET, ResourceLocation.fromNamespaceAndPath(resourceLocation.getNamespace(), "entity/sign/hanging/" + resourceLocation.getPath())));
    }
}
