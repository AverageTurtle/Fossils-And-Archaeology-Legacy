package willatendo.fossilslegacy.server.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;
import willatendo.fossilslegacy.server.item.FossilsLegacyItems;

public class Fossil extends Mob {
	private static final EntityDataAccessor<Integer> FOSSIL = SynchedEntityData.defineId(Fossil.class, EntityDataSerializers.INT);
	private static final EntityDataAccessor<Integer> SIZE = SynchedEntityData.defineId(Fossil.class, EntityDataSerializers.INT);

	public Fossil(EntityType<? extends Fossil> entityType, Level level) {
		super(entityType, level);
	}

	public static AttributeSupplier fossilAttributes() {
		return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 1.0D).build();
	}

	@Override
	public float getScale() {
		FossilTypes fossilTypes = FossilTypes.get(this.getFossil());
		return fossilTypes.getBaseSize() + (((float) fossilTypes.getBoundingBoxGrowth()) * ((float) this.getSize()));
	}

	@Override
	public void die(DamageSource damageSource) {
		if (this.getSize() > 1) {
			for (int i = 0; i < this.getSize(); i++) {
				Block.popResource(this.level(), this.blockPosition(), new ItemStack(Items.BONE));
			}
		}
		Block.popResource(this.level(), this.blockPosition(), new ItemStack(FossilsLegacyItems.FOSSIL.get()));
		super.die(damageSource);
	}

	@Override
	protected SoundEvent getHurtSound(DamageSource damageSource) {
		return SoundEvents.SKELETON_HURT;
	}

	@Override
	public void refreshDimensions() {
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		super.refreshDimensions();
		this.setPos(x, y, z);
	}

	@Override
	public void onSyncedDataUpdated(EntityDataAccessor<?> entityDataAccessor) {
		if (SIZE.equals(entityDataAccessor)) {
			this.refreshDimensions();
		}

		super.onSyncedDataUpdated(entityDataAccessor);
	}

	@Override
	public ItemStack getPickResult() {
		return new ItemStack(FossilsLegacyItems.FOSSIL.get());
	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(FOSSIL, 0);
		this.entityData.define(SIZE, 1);
	}

	@Override
	public void readAdditionalSaveData(CompoundTag compoundTag) {
		super.readAdditionalSaveData(compoundTag);
		this.setFossil(compoundTag.getInt("Fossil"));
		this.setSize(compoundTag.getInt("Size"));
	}

	@Override
	public void addAdditionalSaveData(CompoundTag compoundTag) {
		super.addAdditionalSaveData(compoundTag);
		compoundTag.putInt("Fossil", this.getFossil());
		compoundTag.putInt("Size", this.getSize());
	}

	@Override
	public InteractionResult interactAt(Player player, Vec3 vec3, InteractionHand interactionHand) {
		ItemStack itemStack = player.getItemInHand(interactionHand);
		if (itemStack.is(Items.BONE)) {
			if (this.getSize() < FossilTypes.values()[this.getFossil()].getMaxSize()) {
				this.setSize(this.getSize() + 1);
				itemStack.shrink(1);
				return InteractionResult.SUCCESS;
			}
		}
		if (itemStack.isEmpty()) {
			if (this.getSize() >= 1) {
				this.setSize(this.getSize() - 1);
				player.addItem(new ItemStack(Items.BONE));
				return InteractionResult.SUCCESS;
			}
		}
		return super.interactAt(player, vec3, interactionHand);
	}

	public void setFossil(int fossils) {
		this.entityData.set(FOSSIL, fossils);
	}

	public int getFossil() {
		return this.entityData.get(FOSSIL);
	}

	public void setSize(int size) {
		this.entityData.set(SIZE, size);
	}

	public int getSize() {
		return this.entityData.get(SIZE);
	}
}
