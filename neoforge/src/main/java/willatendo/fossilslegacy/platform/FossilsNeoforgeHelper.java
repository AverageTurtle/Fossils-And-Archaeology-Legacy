package willatendo.fossilslegacy.platform;

import net.minecraft.client.RecipeBookCategories;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.network.PacketDistributor;
import willatendo.fossilslegacy.FossilsLegacyNeoforgeMod;
import willatendo.fossilslegacy.network.ServerboundTimeMachineUpdatePacket;
import willatendo.fossilslegacy.server.config.FossilsLegacyConfig;
import willatendo.fossilslegacy.server.item.DeferredDinosaurSpawnEggItem;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

import java.util.function.Supplier;

public class FossilsNeoforgeHelper implements FossilsModloaderHelper {
    @Override
    public void sendTimeMachinePacket(BlockPos blockPos) {
        PacketDistributor.sendToServer(new ServerboundTimeMachineUpdatePacket(blockPos));
    }

    @Override
    public <T> Supplier<EntityDataSerializer<Holder<T>>> registerDataSerializer(String id, StreamCodec<RegistryFriendlyByteBuf, Holder<T>> streamCodec) {
        return FossilsLegacyNeoforgeMod.ENTITY_DATA_SERIALIZER.register(id, () -> EntityDataSerializer.forValueType(streamCodec));
    }

    @Override
    public SpawnEggItem createDinosaurSpawnEgg(Supplier<EntityType<? extends Mob>> entityType, int primaryColor, int secondaryColor, Item.Properties properties) {
        return new DeferredDinosaurSpawnEggItem(entityType, primaryColor, secondaryColor, properties);
    }

    @Override
    public RecipeBookType createRecipeBookType(String name) {
        return RecipeBookType.valueOf(FossilsLegacyUtils.ID + name);
    }

    @Override
    public RecipeBookCategories createRecipeBookCategory(String name) {
        return RecipeBookCategories.valueOf(FossilsLegacyUtils.ID + name);
    }

    @Override
    public boolean featheredDinosaurs() {
        return FossilsLegacyConfig.CLIENT_CONFIG.featheredDinosaurs();
    }

    @Override
    public boolean legacyModels() {
        return FossilsLegacyConfig.CLIENT_CONFIG.legacyModels();
    }

    @Override
    public boolean willAnimalsStarve() {
        return FossilsLegacyConfig.COMMON_CONFIG.willAnimalsStarve();
    }

    @Override
    public boolean willAnimalsBreakBlocks() {
        return FossilsLegacyConfig.COMMON_CONFIG.willAnimalsStarve();
    }

    @Override
    public boolean willAnimalsGrow() {
        return FossilsLegacyConfig.COMMON_CONFIG.willAnimalsGrow();
    }
}
