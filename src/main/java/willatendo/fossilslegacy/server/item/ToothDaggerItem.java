package willatendo.fossilslegacy.server.item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;

public class ToothDaggerItem extends SwordItem {
	public ToothDaggerItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
		super(tier, attackDamage, attackSpeed, properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext useOnContext) {
		GrowingPlantHeadBlock growingPlantHeadBlock;
		BlockPos blockPos;
		Level level = useOnContext.getLevel();
		BlockState blockState = level.getBlockState(blockPos = useOnContext.getClickedPos());
		Block block = blockState.getBlock();
		if (block instanceof GrowingPlantHeadBlock && !(growingPlantHeadBlock = (GrowingPlantHeadBlock) block).isMaxAge(blockState)) {
			Player usedPlayed = useOnContext.getPlayer();
			ItemStack itemStack = useOnContext.getItemInHand();
			if (usedPlayed instanceof ServerPlayer serverPlayer) {
				CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger(serverPlayer, blockPos, itemStack);
			}
			level.playSound(usedPlayed, blockPos, SoundEvents.GROWING_PLANT_CROP, SoundSource.BLOCKS, 1.0f, 1.0f);
			BlockState blockState2 = growingPlantHeadBlock.getMaxAgeState(blockState);
			level.setBlockAndUpdate(blockPos, blockState2);
			level.gameEvent(GameEvent.BLOCK_CHANGE, blockPos, GameEvent.Context.of(useOnContext.getPlayer(), blockState2));
			if (usedPlayed != null) {
				itemStack.hurtAndBreak(1, usedPlayed, player -> player.broadcastBreakEvent(useOnContext.getHand()));
			}
			return InteractionResult.sidedSuccess(level.isClientSide);
		}
		return super.useOn(useOnContext);
	}
}
