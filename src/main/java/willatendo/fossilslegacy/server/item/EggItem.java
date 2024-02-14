package willatendo.fossilslegacy.server.item;

import java.util.function.Consumer;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import willatendo.fossilslegacy.server.entity.Egg;
import willatendo.fossilslegacy.server.entity.EggVariant;
import willatendo.fossilslegacy.server.entity.FossilsLegacyEntities;

public class EggItem extends Item {
	private final EggVariant eggVariant;

	public EggItem(EggVariant eggVariant, Properties properties) {
		super(properties);
		this.eggVariant = eggVariant;
	}

	@Override
	public InteractionResult useOn(UseOnContext useOnContext) {
		Direction direction = useOnContext.getClickedFace();
		if (direction == Direction.DOWN) {
			return InteractionResult.FAIL;
		}
		Level level = useOnContext.getLevel();
		BlockPlaceContext blockPlaceContext = new BlockPlaceContext(useOnContext);
		BlockPos blockPos = blockPlaceContext.getClickedPos();
		ItemStack itemStack = useOnContext.getItemInHand();
		Vec3 vec3 = Vec3.atBottomCenterOf(blockPos);
		AABB aABB = EntityType.ARMOR_STAND.getDimensions().makeBoundingBox(vec3.x(), vec3.y(), vec3.z());
		if (!level.noCollision(null, aABB) || !level.getEntities(null, aABB).isEmpty()) {
			return InteractionResult.FAIL;
		}
		if (level instanceof ServerLevel) {
			ServerLevel serverLevel = (ServerLevel) level;
			Consumer consumer = EntityType.createDefaultStackConfig(serverLevel, itemStack, useOnContext.getPlayer());
			Egg egg = FossilsLegacyEntities.EGG.get().create(serverLevel, itemStack.getTag(), consumer, blockPos, MobSpawnType.SPAWN_EGG, true, true);
			egg.setEggVariant(this.eggVariant);
			float yRot = (float) Mth.floor((Mth.wrapDegrees(useOnContext.getRotation() - 180.0f) + 22.5f) / 45.0f) * 45.0f;
			egg.moveTo(egg.getX(), egg.getY(), egg.getZ(), yRot, 0.0f);
			level.addFreshEntity(egg);
			Player player = useOnContext.getPlayer();
			egg.gameEvent(GameEvent.ENTITY_PLACE, player);
			InteractionHand interactionHand = useOnContext.getHand();
			player.getItemInHand(interactionHand).shrink(1);
		}
		return InteractionResult.sidedSuccess(level.isClientSide());
	}
}
