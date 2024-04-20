package willatendo.fossilslegacy.platform;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.entity.BlockEntity;
import willatendo.fossilslegacy.server.menu.ExtendedMenuSupplier;
import willatendo.simplelibrary.server.util.SimpleUtils;

public interface FossilsModloaderHelper {
    public static final FossilsModloaderHelper INSTANCE = SimpleUtils.loadModloaderHelper(FossilsModloaderHelper.class);

    <T extends AbstractContainerMenu> MenuType<T> createMenuType(ExtendedMenuSupplier<T> extendedMenuSupplier);

    <T> void registerDataSerializer(String id, EntityDataSerializer<T> entityDataSerializer);

    <T> Registry<T> createRegistry(ResourceKey<Registry<T>> resourceKey);

    void openContainer(BlockEntity blockEntity, BlockPos blockPos, ServerPlayer serverPlayer);

    boolean willAnimalsStarve();

    boolean willAnimalsBreakBlocks();

    boolean willAnimalsGrow();

    boolean shouldAnuSpawn();

    boolean shouldEnableExperiments();
}
