package willatendo.fossilslegacy.data;

import java.util.Objects;

import io.github.fabricators_of_create.porting_lib.data.ExistingFileHelper;
import io.github.fabricators_of_create.porting_lib.models.generators.ModelFile;
import io.github.fabricators_of_create.porting_lib.models.generators.item.ItemModelBuilder;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import willatendo.fossilslegacy.experiments.server.item.FossilsExperimentsItems;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.item.FossilsLegacyItems;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;
import willatendo.simplelibrary.data.SimpleItemModelProvider;
import willatendo.simplelibrary.server.registry.SimpleHolder;

public class FossilsLegacyItemModelProvider extends SimpleItemModelProvider {
	public FossilsLegacyItemModelProvider(FabricDataOutput fabricDataOutput, String modId, ExistingFileHelper existingFileHelper) {
		super(fabricDataOutput, modId, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		this.basicItem(FossilsLegacyItems.FOSSIL.get());
		this.basicItem(FossilsLegacyItems.TRICERATOPS_DNA.get());
		this.basicItem(FossilsLegacyItems.VELOCIRAPTOR_DNA.get());
		this.basicItem(FossilsLegacyItems.TYRANNOSAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.PTERANODON_DNA.get());
		this.basicItem(FossilsLegacyItems.NAUTILUS_DNA.get());
		this.basicItem(FossilsLegacyItems.FUTABASAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.MOSASAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.STEGOSAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.DILOPHOSAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.BRACHIOSAURUS_DNA.get());
		this.basicItem(FossilsLegacyItems.TRICERATOPS_EGG.get());
		this.basicItem(FossilsLegacyItems.VELOCIRAPTOR_EGG.get());
		this.basicItem(FossilsLegacyItems.TYRANNOSAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.PTERANODON_EGG.get());
		this.basicItem(FossilsLegacyItems.NAUTILUS_EGGS.get());
		this.basicItem(FossilsLegacyItems.FUTABASAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.MOSASAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.STEGOSAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.DILOPHOSAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.BRACHIOSAURUS_EGG.get());
		this.basicItem(FossilsLegacyItems.RAW_TRICERATOPS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_VELOCIRAPTOR_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_TYRANNOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_PTERANODON_MEAT.get());
		this.basicItem(FossilsLegacyItems.NAUTILUS.get());
		this.basicItem(FossilsLegacyItems.RAW_FUTABASAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_MOSASAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_STEGOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_DILOPHOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_BRACHIOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_SMILODON_MEAT.get());
		this.basicItem(FossilsLegacyItems.RAW_MAMMOTH_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_TRICERATOPS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_VELOCIRAPTOR_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_TYRANNOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_PTERANODON_MEAT.get());
		this.basicItem(FossilsLegacyItems.SIO_CHIU_LE.get());
		this.basicItem(FossilsLegacyItems.COOKED_FUTABASAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_MOSASAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_STEGOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_DILOPHOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_BRACHIOSAURUS_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_SMILODON_MEAT.get());
		this.basicItem(FossilsLegacyItems.COOKED_MAMMOTH_MEAT.get());
		this.basicItem(FossilsLegacyItems.TYRANNOSAURUS_TOOTH.get());
		this.handheldItem(FossilsLegacyItems.TOOTH_DAGGER.get());
		this.handheldItem(FossilsLegacyItems.SKULL_STICK.get());
		this.basicItem(FossilsLegacyItems.DINOPEDIA.get());
		this.basicItem(FossilsLegacyItems.RAW_CHICKEN_SOUP_BUCKET.get());
		this.basicItem(FossilsLegacyItems.COOKED_CHICKEN_SOUP_BUCKET.get());
		this.basicItem(FossilsLegacyItems.CHICKEN_ESSENCE_BOTTLE.get());
		this.basicItem(FossilsLegacyItems.NAUTILUS_SHELL.get());
		this.handheldItem(FossilsLegacyItems.FROZEN_MEAT.get());
		this.handheldItem(FossilsLegacyItems.BROKEN_FROZEN_MEAT.get(), this.modLoc("item/frozen_meat"));
		this.basicItem(FossilsLegacyItems.AXOLOTL_DNA.get());
		this.basicItem(FossilsLegacyItems.CAT_DNA.get());
		this.basicItem(FossilsLegacyItems.CHICKEN_DNA.get());
		this.basicItem(FossilsLegacyItems.COW_DNA.get());
		this.basicItem(FossilsLegacyItems.DOLPHIN_DNA.get());
		this.basicItem(FossilsLegacyItems.DONKEY_DNA.get());
		this.basicItem(FossilsLegacyItems.FOX_DNA.get());
		this.basicItem(FossilsLegacyItems.FROG_DNA.get());
		this.basicItem(FossilsLegacyItems.GOAT_DNA.get());
		this.basicItem(FossilsLegacyItems.HORSE_DNA.get());
		this.basicItem(FossilsLegacyItems.LLAMA_DNA.get());
		this.basicItem(FossilsLegacyItems.MULE_DNA.get());
		this.basicItem(FossilsLegacyItems.OCELOT_DNA.get());
		this.basicItem(FossilsLegacyItems.PANDA_DNA.get());
		this.basicItem(FossilsLegacyItems.PARROT_DNA.get());
		this.basicItem(FossilsLegacyItems.PIG_DNA.get());
		this.basicItem(FossilsLegacyItems.POLAR_BEAR_DNA.get());
		this.basicItem(FossilsLegacyItems.RABBIT_DNA.get());
		this.basicItem(FossilsLegacyItems.SHEEP_DNA.get());
		this.basicItem(FossilsLegacyItems.WOLF_DNA.get());
		this.basicItem(FossilsLegacyItems.SMILODON_DNA.get());
		this.basicItem(FossilsLegacyItems.MAMMOTH_DNA.get());
		this.basicItem(FossilsLegacyItems.CAT_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.INCUBATED_CHICKEN_EGG.get());
		this.basicItem(FossilsLegacyItems.COW_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.DOLPHIN_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.DONKEY_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.FOX_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.GOAT_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.HORSE_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.LLAMA_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.MULE_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.OCELOT_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.PANDA_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.INCUBATED_PARROT_EGG.get());
		this.basicItem(FossilsLegacyItems.PIG_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.POLAR_BEAR_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.RABBIT_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.SHEEP_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.WOLF_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.SMILODON_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.MAMMOTH_EMBRYO_SYRINGE.get());
		this.basicItem(FossilsLegacyItems.MAGIC_CONCH.get());
		this.basicItem(FossilsLegacyItems.JURASSIC_FERN_SPORES.get());
		this.basicItem(FossilsLegacyItems.RELIC_SCRAP.get());
		this.basicItem(FossilsLegacyItems.STONE_TABLET.get());
		this.handheldItem(FossilsLegacyItems.ANCIENT_SWORD_ARTIFACT.get());
		this.basicItem(FossilsLegacyItems.ANCIENT_HELMET_ARTIFACT.get());
		this.basicItem(FossilsLegacyItems.SCARAB_GEM.get());
		this.handheldItem(FossilsLegacyItems.ANCIENT_SWORD.get());
		this.basicItem(FossilsLegacyItems.ANCIENT_HELMET.get());
		this.handheldItem(FossilsLegacyItems.SCARAB_GEM_SWORD.get());
		this.handheldItem(FossilsLegacyItems.SCARAB_GEM_SHOVEL.get());
		this.handheldItem(FossilsLegacyItems.SCARAB_GEM_PICKAXE.get());
		this.handheldItem(FossilsLegacyItems.SCARAB_GEM_AXE.get());
		this.handheldItem(FossilsLegacyItems.SCARAB_GEM_HOE.get());
		this.basicItem(FossilsLegacyItems.SCARAB_GEM_UPGRADE_SMITHING_TEMPLATE.get());
		this.basicItem(FossilsLegacyItems.WOODEN_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_WOODEN_JAVELIN.get(), this.modLoc("item/wooden_javelin"));
		this.basicItem(FossilsLegacyItems.STONE_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_STONE_JAVELIN.get(), this.modLoc("item/stone_javelin"));
		this.basicItem(FossilsLegacyItems.IRON_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_IRON_JAVELIN.get(), this.modLoc("item/iron_javelin"));
		this.basicItem(FossilsLegacyItems.GOLDEN_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_GOLDEN_JAVELIN.get(), this.modLoc("item/golden_javelin"));
		this.basicItem(FossilsLegacyItems.DIAMOND_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_DIAMOND_JAVELIN.get(), this.modLoc("item/diamond_javelin"));
		this.basicItem(FossilsLegacyItems.NETHERITE_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_NETHERITE_JAVELIN.get(), this.modLoc("item/netherite_javelin"));
		this.basicItem(FossilsLegacyItems.SCARAB_GEM_JAVELIN.get());
		this.basicItem(FossilsLegacyItems.BROKEN_SCARAB_GEM_JAVELIN.get(), this.modLoc("item/scarab_gem_javelin"));

		this.spawnEggItem(FossilsLegacyItems.ANU_SPAWN_EGG.get());

		this.spawnEggItem(FossilsLegacyItems.FAILURESAURUS_SPAWN_EGG.get());

		this.spawnEggItem(FossilsLegacyItems.BRACHIOSAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.DILOPHOSAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.MAMMOTH_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.MOSASAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.NAUTILUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.FUTABASAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.PTERANODON_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.SMILODON_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.STEGOSAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.TRICERATOPS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.TYRANNOSAURUS_SPAWN_EGG.get());
		this.spawnEggItem(FossilsLegacyItems.VELOCIRAPTOR_SPAWN_EGG.get());

		this.basicItem(FossilsExperimentsItems.OVERWORLD_COIN.get());
		this.basicItem(FossilsExperimentsItems.NETHER_COIN.get());
		this.basicItem(FossilsExperimentsItems.PREHISTORIC_COIN.get());

		for (SimpleHolder<? extends Item> items : FossilsLegacyItems.DEBUG_ITEMS.getEntriesView()) {
			this.handheldItem(items.get(), new ResourceLocation("item/bone"));
		}

		for (SimpleHolder<? extends Block> blocks : FossilsLegacyBlocks.BLOCKS.getEntriesView()) {
			ResourceLocation blockId = blocks.getId();
			if (blocks.get() == FossilsLegacyBlocks.JURASSIC_FERN.get()) {
				this.basicItem(blockId, this.modLoc("block/fern_lower_3"));
			} else if (blocks.get() == FossilsLegacyBlocks.AXOLOTLSPAWN.get()) {
				this.basicItem(blockId, this.modLoc("block/axolotlspawn"));
			} else {
				this.getBuilder(blockId.toString()).parent(new ModelFile.UncheckedModelFile(FossilsLegacyUtils.resource("block/" + blockId.getPath() + (blockId.getPath().contains("drum") ? "_follow" : blockId.getPath().contains("feeder") ? "_empty" : ""))));
			}
		}
	}

	public ItemModelBuilder handheldItem(Item item) {
		return this.handheldItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), new ResourceLocation(BuiltInRegistries.ITEM.getKey(item).getNamespace(), "item/" + BuiltInRegistries.ITEM.getKey(item).getPath()));
	}

	public ItemModelBuilder handheldItem(Item item, ResourceLocation texture) {
		return this.handheldItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), texture);
	}

	public ItemModelBuilder basicItem(Item item, ResourceLocation texture) {
		return this.basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), texture);
	}

	public ItemModelBuilder basicItem(ResourceLocation item, ResourceLocation texture) {
		return this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/generated")).texture("layer0", texture);
	}

	public ItemModelBuilder handheldItem(ResourceLocation item, ResourceLocation texture) {
		return this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/handheld")).texture("layer0", texture);
	}

	public ItemModelBuilder handheldItem(Item item, ResourceLocation[] textures) {
		return this.handheldItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), textures);
	}

	public ItemModelBuilder basicItem(Item item, ResourceLocation[] textures) {
		return this.basicItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)), textures);
	}

	public ItemModelBuilder basicItem(ResourceLocation item, ResourceLocation[] textures) {
		ItemModelBuilder itemModelBuilder = this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/generated"));
		for (int i = 0; i < textures.length; i++) {
			itemModelBuilder.texture("layer" + i, textures[i]);
		}
		return itemModelBuilder;
	}

	public ItemModelBuilder handheldItem(ResourceLocation item, ResourceLocation[] textures) {
		ItemModelBuilder itemModelBuilder = this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/handheld"));
		for (int i = 0; i < textures.length; i++) {
			itemModelBuilder.texture("layer" + i, textures[i]);
		}
		return itemModelBuilder;
	}

	public ItemModelBuilder spawnEggItem(Item item) {
		return this.spawnEggItem(Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(item)));
	}

	public ItemModelBuilder spawnEggItem(ResourceLocation item) {
		return this.getBuilder(item.toString()).parent(new ModelFile.UncheckedModelFile("item/template_spawn_egg"));
	}

	public void basicBlock(Block block) {
		this.getBuilder(BuiltInRegistries.BLOCK.getKey(block).getPath()).parent(new ModelFile.UncheckedModelFile(this.modLoc("block/" + BuiltInRegistries.BLOCK.getKey(block).getPath())));
	}

}