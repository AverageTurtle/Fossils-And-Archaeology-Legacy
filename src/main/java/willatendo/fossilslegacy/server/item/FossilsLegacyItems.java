package willatendo.fossilslegacy.server.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import willatendo.fossilsexperiments.server.item.FossilsExperimentsItems;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.entity.FossilsLegacyEggVariants;
import willatendo.fossilslegacy.server.entity.FossilsLegacyEntities;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;
import willatendo.fossilslegacy.server.utils.SyringeAnimals;
import willatendo.simplelibrary.server.registry.FabricRegister;
import willatendo.simplelibrary.server.registry.SimpleHolder;
import willatendo.simplelibrary.server.registry.SimpleRegistry;
import willatendo.simplelibrary.server.util.SimpleUtils;

public class FossilsLegacyItems {
	public static final SimpleRegistry<Item> ITEMS = SimpleRegistry.create(Registries.ITEM, FossilsLegacyUtils.ID);
	public static final SimpleRegistry<Item> DEBUG_ITEMS = SimpleRegistry.create(Registries.ITEM, FossilsLegacyUtils.ID);

	public static final SimpleHolder<Item> FOSSIL = ITEMS.register("fossil", () -> new FossilItem(new Item.Properties()));
	public static final SimpleHolder<Item> TRICERATOPS_DNA = ITEMS.register("triceratops_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> VELOCIRAPTOR_DNA = ITEMS.register("velociraptor_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> TYRANNOSAURUS_DNA = ITEMS.register("tyrannosaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> PTERANODON_DNA = ITEMS.register("pteranodon_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> NAUTILUS_DNA = ITEMS.register("nautilus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> FUTABASAURUS_DNA = ITEMS.register("futabasaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> MOSASAURUS_DNA = ITEMS.register("mosasaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> STEGOSAURUS_DNA = ITEMS.register("stegosaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> DILOPHOSAURUS_DNA = ITEMS.register("dilophosaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> BRACHIOSAURUS_DNA = ITEMS.register("brachiosaurus_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<EggItem> TRICERATOPS_EGG = ITEMS.register("triceratops_egg", () -> new EggItem(FossilsLegacyEggVariants.TRICERATOPS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> VELOCIRAPTOR_EGG = ITEMS.register("velociraptor_egg", () -> new EggItem(FossilsLegacyEggVariants.VELOCIRAPTOR.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> TYRANNOSAURUS_EGG = ITEMS.register("tyrannosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.TYRANNOSAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> PTERANODON_EGG = ITEMS.register("pteranodon_egg", () -> new EggItem(FossilsLegacyEggVariants.PTERANODON.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<PlaceEntityItem> NAUTILUS_EGGS = ITEMS.register("nautilus_eggs", () -> new PlaceEntityItem(() -> FossilsLegacyEntities.NAUTILUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> FUTABASAURUS_EGG = ITEMS.register("futabasaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.FUTABASAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> MOSASAURUS_EGG = ITEMS.register("mosasaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.MOSASAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> STEGOSAURUS_EGG = ITEMS.register("stegosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.STEGOSAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> DILOPHOSAURUS_EGG = ITEMS.register("dilophosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.DILOPHOSAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<EggItem> BRACHIOSAURUS_EGG = ITEMS.register("brachiosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.BRACHIOSAURUS.get(), new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<Item> RAW_TRICERATOPS_MEAT = ITEMS.register("raw_triceratops_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_VELOCIRAPTOR_MEAT = ITEMS.register("raw_velociraptor_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_TYRANNOSAURUS_MEAT = ITEMS.register("raw_tyrannosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_PTERANODON_MEAT = ITEMS.register("raw_pteranodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<PlaceEntityItem> NAUTILUS = ITEMS.register("nautilus", () -> new PlaceEntityItem(() -> FossilsLegacyEntities.NAUTILUS.get(), new Item.Properties()));
	public static final SimpleHolder<Item> RAW_FUTABASAURUS_MEAT = ITEMS.register("raw_futabasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_MOSASAURUS_MEAT = ITEMS.register("raw_mosasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_STEGOSAURUS_MEAT = ITEMS.register("raw_stegosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_DILOPHOSAURUS_MEAT = ITEMS.register("raw_dilophosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_BRACHIOSAURUS_MEAT = ITEMS.register("raw_brachiosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_SMILODON_MEAT = ITEMS.register("raw_smilodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> RAW_MAMMOTH_MEAT = ITEMS.register("raw_mammoth_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_TRICERATOPS_MEAT = ITEMS.register("cooked_triceratops_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_VELOCIRAPTOR_MEAT = ITEMS.register("cooked_velociraptor_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_TYRANNOSAURUS_MEAT = ITEMS.register("cooked_tyrannosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_PTERANODON_MEAT = ITEMS.register("cooked_pteranodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> SIO_CHIU_LE = ITEMS.register("sio_chiu_le", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.SIO_CHIU_LE)));
	public static final SimpleHolder<Item> COOKED_FUTABASAURUS_MEAT = ITEMS.register("cooked_futabasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_MOSASAURUS_MEAT = ITEMS.register("cooked_mosasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_STEGOSAURUS_MEAT = ITEMS.register("cooked_stegosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_DILOPHOSAURUS_MEAT = ITEMS.register("cooked_dilophosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_BRACHIOSAURUS_MEAT = ITEMS.register("cooked_brachiosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_SMILODON_MEAT = ITEMS.register("cooked_smilodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> COOKED_MAMMOTH_MEAT = ITEMS.register("cooked_mammoth_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
	public static final SimpleHolder<Item> TYRANNOSAURUS_TOOTH = ITEMS.register("tyrannosaurus_tooth", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<ToothDaggerItem> TOOTH_DAGGER = ITEMS.register("tooth_dagger", () -> new ToothDaggerItem(FossilsLegacyTiers.DAGGER, 3, -2.4F, new Item.Properties()));
	public static final SimpleHolder<Item> SKULL_STICK = ITEMS.register("skull_stick", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<DinopediaItem> DINOPEDIA = ITEMS.register("dinopedia", () -> new DinopediaItem(new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<BucketFoodItem> RAW_CHICKEN_SOUP_BUCKET = ITEMS.register("raw_chicken_soup_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.RAW_CHICKEN_SOUP)));
	public static final SimpleHolder<BucketFoodItem> COOKED_CHICKEN_SOUP_BUCKET = ITEMS.register("cooked_chicken_soup_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.COOKED_CHICKEN_SOUP)));
	public static final SimpleHolder<ChickenEssanceBottleItem> CHICKEN_ESSENCE_BOTTLE = ITEMS.register("chicken_essence_bottle", () -> new ChickenEssanceBottleItem(new Item.Properties().stacksTo(16).food(FossilsLegacyFoods.CHICKEN_ESSENCE)));
	public static final SimpleHolder<Item> NAUTILUS_SHELL = ITEMS.register("nautilus_shell", () -> new Item(new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<MagicConchItem> MAGIC_CONCH = ITEMS.register("magic_conch", () -> new MagicConchItem(new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<FrozenMeatItem> FROZEN_MEAT = ITEMS.register("frozen_meat", () -> new FrozenMeatItem(new Item.Properties()));
	public static final SimpleHolder<BrokenFrozenMeatItem> BROKEN_FROZEN_MEAT = ITEMS.register("broken_frozen_meat", () -> new BrokenFrozenMeatItem(FossilsLegacyTiers.ICED_MEAT, 3, -2.4F, new Item.Properties()));
	public static final SimpleHolder<Item> AXOLOTL_DNA = ITEMS.register("axolotl_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> CAT_DNA = ITEMS.register("cat_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> CHICKEN_DNA = ITEMS.register("chicken_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> COW_DNA = ITEMS.register("cow_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> DOLPHIN_DNA = ITEMS.register("dolphin_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> DONKEY_DNA = ITEMS.register("donkey_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> FOX_DNA = ITEMS.register("fox_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> FROG_DNA = ITEMS.register("frog_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> GOAT_DNA = ITEMS.register("goat_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> HORSE_DNA = ITEMS.register("horse_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> LLAMA_DNA = ITEMS.register("llama_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> MULE_DNA = ITEMS.register("mule_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> OCELOT_DNA = ITEMS.register("ocelot_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> PANDA_DNA = ITEMS.register("panda_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> PARROT_DNA = ITEMS.register("parrot_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> PIG_DNA = ITEMS.register("pig_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> POLAR_BEAR_DNA = ITEMS.register("polar_bear_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> RABBIT_DNA = ITEMS.register("rabbit_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> SHEEP_DNA = ITEMS.register("sheep_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> WOLF_DNA = ITEMS.register("wolf_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> SMILODON_DNA = ITEMS.register("smilodon_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> MAMMOTH_DNA = ITEMS.register("mammoth_dna", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<SyringeItem> CAT_EMBRYO_SYRINGE = ITEMS.register("cat_embryo_syringe", () -> new SyringeItem(SyringeAnimals.CAT, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<IncubatedEggItem> INCUBATED_CHICKEN_EGG = ITEMS.register("incubated_chicken_egg", () -> new IncubatedEggItem(0, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<SyringeItem> COW_EMBRYO_SYRINGE = ITEMS.register("cow_embryo_syringe", () -> new SyringeItem(SyringeAnimals.COW, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> DOLPHIN_EMBRYO_SYRINGE = ITEMS.register("dolphin_embryo_syringe", () -> new SyringeItem(SyringeAnimals.DOLPHIN, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> DONKEY_EMBRYO_SYRINGE = ITEMS.register("donkey_embryo_syringe", () -> new SyringeItem(SyringeAnimals.DONKEY, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> FOX_EMBRYO_SYRINGE = ITEMS.register("fox_embryo_syringe", () -> new SyringeItem(SyringeAnimals.FOX, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> GOAT_EMBRYO_SYRINGE = ITEMS.register("goat_embryo_syringe", () -> new SyringeItem(SyringeAnimals.GOAT, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> HORSE_EMBRYO_SYRINGE = ITEMS.register("horse_embryo_syringe", () -> new SyringeItem(SyringeAnimals.HORSE, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> LLAMA_EMBRYO_SYRINGE = ITEMS.register("llama_embryo_syringe", () -> new SyringeItem(SyringeAnimals.LLAMA, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> MULE_EMBRYO_SYRINGE = ITEMS.register("mule_embryo_syringe", () -> new SyringeItem(SyringeAnimals.MULE, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> OCELOT_EMBRYO_SYRINGE = ITEMS.register("ocelot_embryo_syringe", () -> new SyringeItem(SyringeAnimals.OCELOT, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> PANDA_EMBRYO_SYRINGE = ITEMS.register("panda_embryo_syringe", () -> new SyringeItem(SyringeAnimals.PANDA, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<IncubatedEggItem> INCUBATED_PARROT_EGG = ITEMS.register("incubated_parrot_egg", () -> new IncubatedEggItem(1, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<SyringeItem> PIG_EMBRYO_SYRINGE = ITEMS.register("pig_embryo_syringe", () -> new SyringeItem(SyringeAnimals.PIG, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> POLAR_BEAR_EMBRYO_SYRINGE = ITEMS.register("polar_bear_embryo_syringe", () -> new SyringeItem(SyringeAnimals.POLAR_BEAR, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> RABBIT_EMBRYO_SYRINGE = ITEMS.register("rabbit_embryo_syringe", () -> new SyringeItem(SyringeAnimals.RABBIT, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> SHEEP_EMBRYO_SYRINGE = ITEMS.register("sheep_embryo_syringe", () -> new SyringeItem(SyringeAnimals.SHEEP, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> WOLF_EMBRYO_SYRINGE = ITEMS.register("wolf_embryo_syringe", () -> new SyringeItem(SyringeAnimals.WOLF, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> SMILODON_EMBRYO_SYRINGE = ITEMS.register("smilodon_embryo_syringe", () -> new SyringeItem(SyringeAnimals.SMILODON, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<SyringeItem> MAMMOTH_EMBRYO_SYRINGE = ITEMS.register("mammoth_embryo_syringe", () -> new SyringeItem(SyringeAnimals.MAMMOTH, new Item.Properties().stacksTo(1)));
	public static final SimpleHolder<ItemNameBlockItem> JURASSIC_FERN_SPORES = ITEMS.register("jurassic_fern_spores", () -> new ItemNameBlockItem(FossilsLegacyBlocks.JURASSIC_FERN.get(), new Item.Properties()));
	public static final SimpleHolder<Item> RELIC_SCRAP = ITEMS.register("relic_scrap", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<StoneTabletItem> STONE_TABLET = ITEMS.register("stone_tablet", () -> new StoneTabletItem(new Item.Properties()));
	public static final SimpleHolder<Item> ANCIENT_SWORD_ARTIFACT = ITEMS.register("ancient_sword_artifact", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> ANCIENT_HELMET_ARTIFACT = ITEMS.register("ancient_helmet_artifact", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<Item> SCARAB_GEM = ITEMS.register("scarab_gem", () -> new Item(new Item.Properties()));
	public static final SimpleHolder<AncientSwordItem> ANCIENT_SWORD = ITEMS.register("ancient_sword", () -> new AncientSwordItem(FossilsLegacyTiers.ANCIENT, 3, -2.4F, new Item.Properties()));
	public static final SimpleHolder<ArmorItem> ANCIENT_HELMET = ITEMS.register("ancient_helmet", () -> new ArmorItem(FossilsLegacyArmorMaterials.ANCIENT, Type.HELMET, new Item.Properties()));
	public static final SimpleHolder<SwordItem> SCARAB_GEM_SWORD = ITEMS.register("scarab_gem_sword", () -> new SwordItem(FossilsLegacyTiers.SCARAB_GEM, 3, -2.4F, new Item.Properties()));
	public static final SimpleHolder<ShovelItem> SCARAB_GEM_SHOVEL = ITEMS.register("scarab_gem_shovel", () -> new ShovelItem(FossilsLegacyTiers.SCARAB_GEM, 1.5F, -3.0F, new Item.Properties()));
	public static final SimpleHolder<PickaxeItem> SCARAB_GEM_PICKAXE = ITEMS.register("scarab_gem_pickaxe", () -> new PickaxeItem(FossilsLegacyTiers.SCARAB_GEM, 1, -2.8F, new Item.Properties()));
	public static final SimpleHolder<AxeItem> SCARAB_GEM_AXE = ITEMS.register("scarab_gem_axe", () -> new AxeItem(FossilsLegacyTiers.SCARAB_GEM, 5.0F, -3.0F, new Item.Properties()));
	public static final SimpleHolder<HoeItem> SCARAB_GEM_HOE = ITEMS.register("scarab_gem_hoe", () -> new HoeItem(FossilsLegacyTiers.SCARAB_GEM, -4, 0.0F, new Item.Properties()));
	public static final SimpleHolder<ModSmithingTemplateItem> SCARAB_GEM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("scarab_gem_upgrade_smithing_template", () -> ModSmithingTemplateItem.createGemUpgradeTemplate());
	public static final SimpleHolder<JavelinItem> WOODEN_JAVELIN = ITEMS.register("wooden_javelin", () -> new JavelinItem(Tiers.WOOD, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_WOODEN_JAVELIN = ITEMS.register("broken_wooden_javelin", () -> new BrokenJavelinItem(Tiers.WOOD, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> STONE_JAVELIN = ITEMS.register("stone_javelin", () -> new JavelinItem(Tiers.STONE, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_STONE_JAVELIN = ITEMS.register("broken_stone_javelin", () -> new BrokenJavelinItem(Tiers.STONE, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> IRON_JAVELIN = ITEMS.register("iron_javelin", () -> new JavelinItem(Tiers.IRON, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_IRON_JAVELIN = ITEMS.register("broken_iron_javelin", () -> new BrokenJavelinItem(Tiers.IRON, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> GOLDEN_JAVELIN = ITEMS.register("golden_javelin", () -> new JavelinItem(Tiers.GOLD, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_GOLDEN_JAVELIN = ITEMS.register("broken_golden_javelin", () -> new BrokenJavelinItem(Tiers.GOLD, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> DIAMOND_JAVELIN = ITEMS.register("diamond_javelin", () -> new JavelinItem(Tiers.DIAMOND, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_DIAMOND_JAVELIN = ITEMS.register("broken_diamond_javelin", () -> new BrokenJavelinItem(Tiers.DIAMOND, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> NETHERITE_JAVELIN = ITEMS.register("netherite_javelin", () -> new JavelinItem(Tiers.NETHERITE, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_NETHERITE_JAVELIN = ITEMS.register("broken_netherite_javelin", () -> new BrokenJavelinItem(Tiers.NETHERITE, new Item.Properties()));
	public static final SimpleHolder<JavelinItem> SCARAB_GEM_JAVELIN = ITEMS.register("scarab_gem_javelin", () -> new JavelinItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().stacksTo(16)));
	public static final SimpleHolder<BrokenJavelinItem> BROKEN_SCARAB_GEM_JAVELIN = ITEMS.register("broken_scarab_gem_javelin", () -> new BrokenJavelinItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties()));
	public static final SimpleHolder<SpawnEggItem> FAILURESAURUS_SPAWN_EGG = ITEMS.register("failuresaurus_spawn_egg", () -> new SpawnEggItem(FossilsLegacyEntities.FAILURESAURUS.get(), 0x51e6a5, 0x1b5128, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> BRACHIOSAURUS_SPAWN_EGG = ITEMS.register("brachiosaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.BRACHIOSAURUS.get(), 0x3b3e55, 0x7f8ba1, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> DILOPHOSAURUS_SPAWN_EGG = ITEMS.register("dilophosaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.DILOPHOSAURUS.get(), 0x686442, 0xf1bc2c, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> MAMMOTH_SPAWN_EGG = ITEMS.register("mammoth_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.MAMMOTH.get(), 0x3d2700, 0x211500, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> MOSASAURUS_SPAWN_EGG = ITEMS.register("mosasaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.MOSASAURUS.get(), 0x0d7346, 0xffe1a7, new Item.Properties()));
	public static final SimpleHolder<SpawnEggItem> NAUTILUS_SPAWN_EGG = ITEMS.register("nautilus_spawn_egg", () -> new SpawnEggItem(FossilsLegacyEntities.NAUTILUS.get(), 0xc1c1c1, 0xa95453, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> FUTABASAURUS_SPAWN_EGG = ITEMS.register("futabasaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.FUTABASAURUS.get(), 0xca6700, 0xb92200, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> PTERANODON_SPAWN_EGG = ITEMS.register("pteranodon_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.PTERANODON.get(), 0x7c5d89, 0x450e5b, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> SMILODON_SPAWN_EGG = ITEMS.register("smilodon_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.SMILODON.get(), 0xefa745, 0x9a6527, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> STEGOSAURUS_SPAWN_EGG = ITEMS.register("stegosaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.STEGOSAURUS.get(), 0x839d00, 0x785f00, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> TRICERATOPS_SPAWN_EGG = ITEMS.register("triceratops_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.TRICERATOPS.get(), 0xc2ff51, 0x638a25, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> TYRANNOSAURUS_SPAWN_EGG = ITEMS.register("tyrannosaurus_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.TYRANNOSAURUS.get(), 0x918066, 0x4f473a, new Item.Properties()));
	public static final SimpleHolder<DinosaurSpawnEggItem> VELOCIRAPTOR_SPAWN_EGG = ITEMS.register("velociraptor_spawn_egg", () -> new DinosaurSpawnEggItem(FossilsLegacyEntities.VELOCIRAPTOR.get(), 0x66965f, 0x884c2e, new Item.Properties()));

	public static void init() {
		FossilsExperimentsItems.init();

		// Debug
		DEBUG_ITEMS.register("debug_max_hunger", () -> DebugItem.debugMaxHunger());
		DEBUG_ITEMS.register("debug_max_health", () -> DebugItem.debugMaxHealth());
		DEBUG_ITEMS.register("debug_full_grown", () -> DebugItem.debugFullGrown());
		DEBUG_ITEMS.register("debug_baby", () -> DebugItem.debugBaby());
		DEBUG_ITEMS.register("debug_tame", () -> DebugItem.debugTame());

		SimpleUtils.registerAllItems(ITEMS, FossilsLegacyBlocks.BLOCKS, FossilsLegacyBlocks.AXOLOTLSPAWN);
		ITEMS.register("axolotlspawn", () -> new PlaceOnWaterBlockItem(FossilsLegacyBlocks.AXOLOTLSPAWN.get(), new Item.Properties()));
		FabricRegister.register(ITEMS, DEBUG_ITEMS);
	}
}
