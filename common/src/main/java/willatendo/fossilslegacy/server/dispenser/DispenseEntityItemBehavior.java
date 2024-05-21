package willatendo.fossilslegacy.server.dispenser;

import net.minecraft.core.Direction;
import net.minecraft.core.dispenser.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.gameevent.GameEvent;
import willatendo.fossilslegacy.server.item.PlaceEntityItem;

import java.util.function.Consumer;

public class DispenseEntityItemBehavior extends DefaultDispenseItemBehavior {
	private Consumer<Entity> additionalInfo;

	public DispenseEntityItemBehavior(Consumer<Entity> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public DispenseEntityItemBehavior() {
	}

	@Override
	public ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
		Direction direction = blockSource.state().getValue(DispenserBlock.FACING);
		EntityType<?> entityType = ((PlaceEntityItem) itemStack.getItem()).getEntityType().get();
		try {
			Entity entity = entityType.spawn(blockSource.level(), itemStack, null, blockSource.pos().relative(direction), MobSpawnType.DISPENSER, direction != Direction.UP, false);
			if (this.additionalInfo != null) {
				this.additionalInfo.accept(entity);
			}
		} catch (Exception exception) {
			LOGGER.error("Error while dispensing entity from dispenser at {}", (Object) blockSource.pos(), (Object) exception);
			return ItemStack.EMPTY;
		}
		itemStack.shrink(1);
		blockSource.level().gameEvent(null, GameEvent.ENTITY_PLACE, blockSource.pos());
		return itemStack;
	}
}
