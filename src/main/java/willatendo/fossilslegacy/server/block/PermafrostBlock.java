package willatendo.fossilslegacy.server.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import willatendo.fossilslegacy.server.fluid.FossilsLegacyFluidTags;

public class PermafrostBlock extends HalfTransparentBlock {
	public PermafrostBlock(Properties properties) {
		super(properties);
	}

	@Override
	public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, BlockEntity blockEntity, ItemStack itemStack) {
		if (level.getBrightness(LightLayer.BLOCK, blockPos) > 11 - blockState.getLightBlock(level, blockPos) || level.dimensionType().ultraWarm()) {
			return;
		}
		for (int targetX = -1; targetX <= 1; targetX++) {
			for (int targetY = -1; targetY <= 1; targetY++) {
				for (int targetZ = -1; targetZ <= 1; targetZ++) {
					if (level.getBlockState(new BlockPos(blockPos.getX() + targetX, blockPos.getY() + targetY, blockPos.getZ() + targetZ)).is(FossilsLegacyBlockTags.PERMAFROST_FROSTABLE)) {
						level.setBlock(new BlockPos(blockPos.getX() + targetX, blockPos.getY() + targetY, blockPos.getZ() + targetZ), FossilsLegacyBlocks.ICED_STONE.get().defaultBlockState(), 3);
					}
					if (level.getFluidState(new BlockPos(blockPos.getX() + targetX, blockPos.getY() + targetY, blockPos.getZ() + targetZ)).is(FossilsLegacyFluidTags.PERMAFROST_FREEZABLE)) {
						level.setBlock(new BlockPos(blockPos.getX() + targetX, blockPos.getY() + targetY, blockPos.getZ() + targetZ), Blocks.ICE.defaultBlockState(), 3);
					}
				}
			}
		}
	}

	@Override
	public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
		if (serverLevel.getBrightness(LightLayer.BLOCK, blockPos) > 11 - blockState.getLightBlock(serverLevel, blockPos)) {
			this.melt(blockState, serverLevel, blockPos);
		}
	}

	protected void melt(BlockState blockState, Level level, BlockPos blockPos) {
		level.setBlockAndUpdate(blockPos, Blocks.DIRT.defaultBlockState());
		level.neighborChanged(blockPos, Blocks.DIRT, blockPos);
	}
}
