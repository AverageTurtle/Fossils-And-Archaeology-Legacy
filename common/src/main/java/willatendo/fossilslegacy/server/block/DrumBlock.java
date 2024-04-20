package willatendo.fossilslegacy.server.block;

import java.util.List;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import willatendo.fossilslegacy.server.entity.PlayerCommandableAccess;
import willatendo.fossilslegacy.server.item.FossilsLegacyItemTags;
import willatendo.fossilslegacy.server.sound.FossilsLegacySoundEvents;
import willatendo.fossilslegacy.server.utils.DinosaurCommand;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class DrumBlock extends Block {
	public static final EnumProperty<DinosaurCommand> DINOSAUR_ORDER = EnumProperty.create("order", DinosaurCommand.class);

	public DrumBlock(Properties properties) {
		super(properties);
		this.stateDefinition.any().setValue(DINOSAUR_ORDER, DinosaurCommand.FOLLOW);
	}

	@Override
	public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
		ItemStack itemStack = player.getItemInHand(interactionHand);
		if (itemStack.is(FossilsLegacyItemTags.DRUM_INSTRUMENT)) {
			DinosaurCommand current = blockState.getValue(DrumBlock.DINOSAUR_ORDER);
			List<LivingEntity> allEntities = level.getEntitiesOfClass(LivingEntity.class, new AABB(blockPos).inflate(30.0D));
			for (LivingEntity livingEntity : allEntities) {
				if (livingEntity instanceof PlayerCommandableAccess playerCommandableAccess) {
					if (playerCommandableAccess.willListenToDrum(player, interactionHand)) {
						playerCommandableAccess.setCommand(blockState.getValue(DINOSAUR_ORDER));
					}
				}
			}
			player.displayClientMessage(FossilsLegacyUtils.translation("block", "drum.hit", itemStack.getHoverName(), current.getComponent()), true);
			if (level.isClientSide()) {
				player.playSound(FossilsLegacySoundEvents.DRUM_TRIPLE_HIT.get());
			}
		} else {
			DinosaurCommand next = DinosaurCommand.FOLLOW;
			DinosaurCommand current = blockState.getValue(DrumBlock.DINOSAUR_ORDER);
			if (current == DinosaurCommand.FOLLOW) {
				next = DinosaurCommand.STAY;
			} else if (current == DinosaurCommand.STAY) {
				next = DinosaurCommand.FREE_MOVE;
			} else {
				next = DinosaurCommand.FOLLOW;
			}
			level.setBlock(blockPos, FossilsLegacyBlocks.DRUM.get().defaultBlockState().setValue(DrumBlock.DINOSAUR_ORDER, next), 3);
			if (level.isClientSide()) {
				player.playSound(FossilsLegacySoundEvents.DRUM_HIT.get());
			}
		}
		return InteractionResult.SUCCESS;
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(DINOSAUR_ORDER);
		super.createBlockStateDefinition(builder);
	}
}