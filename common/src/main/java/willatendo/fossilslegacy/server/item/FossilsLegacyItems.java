package willatendo.fossilslegacy.server.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.*;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.level.Level;
import willatendo.fossilslegacy.platform.FossilsModloaderHelper;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.dimension.FossilsLegacyLevels;
import willatendo.fossilslegacy.server.entity.FossilsLegacyEggVariants;
import willatendo.fossilslegacy.server.entity.FossilsLegacyEntityTypes;
import willatendo.fossilslegacy.server.entity.FossilsLegacyPregnancyTypes;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;
import willatendo.simplelibrary.server.registry.SimpleHolder;
import willatendo.simplelibrary.server.registry.SimpleRegistry;
import willatendo.simplelibrary.server.util.SimpleUtils;

import java.util.ArrayList;
import java.util.List;

public class FossilsLegacyItems {
    public static final SimpleRegistry<Item> ITEMS = SimpleRegistry.create(Registries.ITEM, FossilsLegacyUtils.ID);
    public static final SimpleRegistry<Item> DEBUG_ITEMS = SimpleRegistry.create(Registries.ITEM, FossilsLegacyUtils.ID);
    public static final List<EggItem> EGGS = new ArrayList<>();

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
    public static final SimpleHolder<Item> CARNOTAURUS_DNA = ITEMS.register("carnotaurus_dna", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> CRYOLOPHOSAURUS_DNA = ITEMS.register("cryolophosaurus_dna", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> THERIZINOSAURUS_DNA = ITEMS.register("therizinosaurus_dna", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> PACHYCEPHALOSAURUS_DNA = ITEMS.register("pachycephalosaurus_dna", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> COMPSOGNATHUS_DNA = ITEMS.register("compsognathus_dna", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<EggItem> TRICERATOPS_EGG = ITEMS.register("triceratops_egg", () -> new EggItem(FossilsLegacyEggVariants.TRICERATOPS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> VELOCIRAPTOR_EGG = ITEMS.register("velociraptor_egg", () -> new EggItem(FossilsLegacyEggVariants.VELOCIRAPTOR, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> TYRANNOSAURUS_EGG = ITEMS.register("tyrannosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.TYRANNOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> PTERANODON_EGG = ITEMS.register("pteranodon_egg", () -> new EggItem(FossilsLegacyEggVariants.PTERANODON, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<PlaceEntityItem> NAUTILUS_EGGS = ITEMS.register("nautilus_eggs", () -> new PlaceEntityItem(() -> FossilsLegacyEntityTypes.NAUTILUS.get(), new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> FUTABASAURUS_EGG = ITEMS.register("futabasaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.FUTABASAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> MOSASAURUS_EGG = ITEMS.register("mosasaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.MOSASAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> STEGOSAURUS_EGG = ITEMS.register("stegosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.STEGOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> DILOPHOSAURUS_EGG = ITEMS.register("dilophosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.DILOPHOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> BRACHIOSAURUS_EGG = ITEMS.register("brachiosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.BRACHIOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> CARNOTAURUS_EGG = ITEMS.register("carnotaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.CARNOTAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> CRYOLOPHOSAURUS_EGG = ITEMS.register("cryolophosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.CRYOLOPHOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> THERIZINOSAURUS_EGG = ITEMS.register("therizinosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.THERIZINOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> PACHYCEPHALOSAURUS_EGG = ITEMS.register("pachycephalosaurus_egg", () -> new EggItem(FossilsLegacyEggVariants.PACHYCEPHALOSAURUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<EggItem> COMPSOGNATHUS_EGG = ITEMS.register("compsognathus_egg", () -> new EggItem(FossilsLegacyEggVariants.COMPSOGNATHUS, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<Item> RAW_TRICERATOPS_MEAT = ITEMS.register("raw_triceratops_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_VELOCIRAPTOR_MEAT = ITEMS.register("raw_velociraptor_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_TYRANNOSAURUS_MEAT = ITEMS.register("raw_tyrannosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_PTERANODON_MEAT = ITEMS.register("raw_pteranodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<PlaceEntityItem> NAUTILUS = ITEMS.register("nautilus", () -> new PlaceEntityItem(() -> FossilsLegacyEntityTypes.NAUTILUS.get(), new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<Item> RAW_FUTABASAURUS_MEAT = ITEMS.register("raw_futabasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_MOSASAURUS_MEAT = ITEMS.register("raw_mosasaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_STEGOSAURUS_MEAT = ITEMS.register("raw_stegosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_DILOPHOSAURUS_MEAT = ITEMS.register("raw_dilophosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_BRACHIOSAURUS_MEAT = ITEMS.register("raw_brachiosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_SMILODON_MEAT = ITEMS.register("raw_smilodon_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_MAMMOTH_MEAT = ITEMS.register("raw_mammoth_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_CARNOTAURUS_MEAT = ITEMS.register("raw_carnotaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_CRYOLOPHOSAURUS_MEAT = ITEMS.register("raw_cryolophosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_THERIZINOSAURUS_MEAT = ITEMS.register("raw_therizinosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_PACHYCEPHALOSAURUS_MEAT = ITEMS.register("raw_pachycephalosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> RAW_COMPSOGNATHUS_MEAT = ITEMS.register("raw_compsognathus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.RAW_DINOSAUR_MEAT)));
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
    public static final SimpleHolder<Item> COOKED_CARNOTAURUS_MEAT = ITEMS.register("cooked_carnotaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> COOKED_CRYOLOPHOSAURUS_MEAT = ITEMS.register("cooked_cryolophosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> COOKED_THERIZINOSAURUS_MEAT = ITEMS.register("cooked_therizinosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> COOKED_PACHYCEPHALOSAURUS_MEAT = ITEMS.register("cooked_pachycephalosaurus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> COOKED_COMPSOGNATHUS_MEAT = ITEMS.register("cooked_compsognathus_meat", () -> new Item(new Item.Properties().food(FossilsLegacyFoods.COOKED_DINOSAUR_MEAT)));
    public static final SimpleHolder<Item> TYRANNOSAURUS_TOOTH = ITEMS.register("tyrannosaurus_tooth", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<ToothDaggerItem> TOOTH_DAGGER = ITEMS.register("tooth_dagger", () -> new ToothDaggerItem(FossilsLegacyTiers.DAGGER, new Item.Properties().attributes(SwordItem.createAttributes(FossilsLegacyTiers.DAGGER, 3, -2.4F))));
    public static final SimpleHolder<Item> SKULL_STICK = ITEMS.register("skull_stick", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<TherizinosaurusClawsItem> THERIZINOSAURUS_CLAWS = ITEMS.register("therizinosaurus_claws", () -> new TherizinosaurusClawsItem(FossilsLegacyTiers.DAGGER, new Item.Properties().attributes(TherizinosaurusClawsItem.createAttributes(FossilsLegacyTiers.DAGGER, 0, -3.0F))));
    public static final SimpleHolder<DinopediaItem> DINOPEDIA = ITEMS.register("dinopedia", () -> new DinopediaItem(new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<BucketFoodItem> RAW_CHICKEN_SOUP_BUCKET = ITEMS.register("raw_chicken_soup_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.RAW_CHICKEN_SOUP)));
    public static final SimpleHolder<BucketFoodItem> RAW_BERRY_MEDLEY_BUCKET = ITEMS.register("raw_berry_medley_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.RAW_BERRY_MEDLEY_BUCKET)));
    public static final SimpleHolder<BucketFoodItem> COOKED_CHICKEN_SOUP_BUCKET = ITEMS.register("cooked_chicken_soup_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.COOKED_CHICKEN_SOUP)));
    public static final SimpleHolder<BucketFoodItem> COOKED_BERRY_MEDLEY_BUCKET = ITEMS.register("cooked_berry_medley_bucket", () -> new BucketFoodItem(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).food(FossilsLegacyFoods.COOKED_BERRY_MEDLEY_BUCKET)));
    public static final SimpleHolder<ChickenEssanceBottleItem> CHICKEN_ESSENCE_BOTTLE = ITEMS.register("chicken_essence_bottle", () -> new ChickenEssanceBottleItem(new Item.Properties().stacksTo(16).food(FossilsLegacyFoods.CHICKEN_ESSENCE)));
    public static final SimpleHolder<DrinkingGlassBottleItem> ROMANTIC_CONCOCTION_BOTTLE = ITEMS.register("romantic_concoction_bottle", () -> new DrinkingGlassBottleItem(new Item.Properties().stacksTo(16).food(FossilsLegacyFoods.ROMANTIC_CONCOCTION)));
    public static final SimpleHolder<Item> NAUTILUS_SHELL = ITEMS.register("nautilus_shell", () -> new Item(new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<MagicConchItem> MAGIC_CONCH = ITEMS.register("magic_conch", () -> new MagicConchItem(new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<FrozenMeatItem> FROZEN_MEAT = ITEMS.register("frozen_meat", () -> new FrozenMeatItem(new Item.Properties()));
    public static final SimpleHolder<BrokenFrozenMeatItem> BROKEN_FROZEN_MEAT = ITEMS.register("broken_frozen_meat", () -> new BrokenFrozenMeatItem(FossilsLegacyTiers.ICED_MEAT, new Item.Properties().attributes(BrokenFrozenMeatItem.createAttributes(FossilsLegacyTiers.ICED_MEAT, 3, -2.4F))));
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
    public static final SimpleHolder<SyringeItem> CAT_EMBRYO_SYRINGE = ITEMS.register("cat_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.CAT, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<IncubatedEggItem> INCUBATED_CHICKEN_EGG = ITEMS.register("incubated_chicken_egg", () -> new IncubatedEggItem(0, new Item.Properties().stacksTo(16)));
    public static final SimpleHolder<SyringeItem> COW_EMBRYO_SYRINGE = ITEMS.register("cow_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.COW, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> DOLPHIN_EMBRYO_SYRINGE = ITEMS.register("dolphin_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.DOLPHIN, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> DONKEY_EMBRYO_SYRINGE = ITEMS.register("donkey_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.DONKEY, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> FOX_EMBRYO_SYRINGE = ITEMS.register("fox_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.FOX, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> GOAT_EMBRYO_SYRINGE = ITEMS.register("goat_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.GOAT, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> HORSE_EMBRYO_SYRINGE = ITEMS.register("horse_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.HORSE, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> LLAMA_EMBRYO_SYRINGE = ITEMS.register("llama_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.LLAMA, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> MULE_EMBRYO_SYRINGE = ITEMS.register("mule_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.MULE, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> OCELOT_EMBRYO_SYRINGE = ITEMS.register("ocelot_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.OCELOT, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> PANDA_EMBRYO_SYRINGE = ITEMS.register("panda_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.PANDA, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<IncubatedEggItem> INCUBATED_PARROT_EGG = ITEMS.register("incubated_parrot_egg", () -> new IncubatedEggItem(1, new Item.Properties().stacksTo(16)));
    public static final SimpleHolder<SyringeItem> PIG_EMBRYO_SYRINGE = ITEMS.register("pig_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.PIG, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> POLAR_BEAR_EMBRYO_SYRINGE = ITEMS.register("polar_bear_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.POLAR_BEAR, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> RABBIT_EMBRYO_SYRINGE = ITEMS.register("rabbit_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.RABBIT, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> SHEEP_EMBRYO_SYRINGE = ITEMS.register("sheep_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.SHEEP, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> WOLF_EMBRYO_SYRINGE = ITEMS.register("wolf_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.WOLF, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> SMILODON_EMBRYO_SYRINGE = ITEMS.register("smilodon_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.SMILODON, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<SyringeItem> MAMMOTH_EMBRYO_SYRINGE = ITEMS.register("mammoth_embryo_syringe", () -> new SyringeItem(FossilsLegacyPregnancyTypes.MAMMOTH, new Item.Properties().stacksTo(1)));
    public static final SimpleHolder<ItemNameBlockItem> JURASSIC_FERN_SPORES = ITEMS.register("jurassic_fern_spores", () -> new ItemNameBlockItem(FossilsLegacyBlocks.JURASSIC_FERN.get(), new Item.Properties()));
    public static final SimpleHolder<Item> RELIC_SCRAP = ITEMS.register("relic_scrap", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<StoneTabletItem> STONE_TABLET = ITEMS.register("stone_tablet", () -> new StoneTabletItem(new Item.Properties()));
    public static final SimpleHolder<Item> ANCIENT_SWORD_ARTIFACT = ITEMS.register("ancient_sword_artifact", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> ANCIENT_HELMET_ARTIFACT = ITEMS.register("ancient_helmet_artifact", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> ANCIENT_CHESTPLATE_ARTIFACT = ITEMS.register("ancient_chestplate_artifact", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> ANCIENT_LEGGINGS_ARTIFACT = ITEMS.register("ancient_leggings_artifact", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> ANCIENT_BOOTS_ARTIFACT = ITEMS.register("ancient_boots_artifact", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<Item> SCARAB_GEM = ITEMS.register("scarab_gem", () -> new Item(new Item.Properties()));
    public static final SimpleHolder<CoinItem> OVERWORLD_COIN = ITEMS.register("overworld_coin", () -> new CoinItem(Level.OVERWORLD, new Item.Properties()));
    public static final SimpleHolder<CoinItem> NETHER_COIN = ITEMS.register("nether_coin", () -> new CoinItem(Level.NETHER, new Item.Properties()));
    public static final SimpleHolder<CoinItem> PREHISTORIC_COIN = ITEMS.register("prehistoric_coin", () -> new CoinItem(FossilsLegacyLevels.PREHISTORY, new Item.Properties()));
    public static final SimpleHolder<AncientSwordItem> ANCIENT_SWORD = ITEMS.register("ancient_sword", () -> new AncientSwordItem(FossilsLegacyTiers.ANCIENT, new Item.Properties().attributes(AncientSwordItem.createAttributes(FossilsLegacyTiers.ANCIENT, 3, -2.4F))));
    public static final SimpleHolder<ArmorItem> ANCIENT_HELMET = ITEMS.register("ancient_helmet", () -> new ArmorItem(FossilsLegacyArmorMaterials.ANCIENT, Type.HELMET, new Item.Properties()));
    public static final SimpleHolder<ArmorItem> ANCIENT_CHESTPLATE = ITEMS.register("ancient_chestplate", () -> new ArmorItem(FossilsLegacyArmorMaterials.ANCIENT, Type.CHESTPLATE, new Item.Properties()));
    public static final SimpleHolder<ArmorItem> ANCIENT_LEGGINGS = ITEMS.register("ancient_leggings", () -> new ArmorItem(FossilsLegacyArmorMaterials.ANCIENT, Type.LEGGINGS, new Item.Properties()));
    public static final SimpleHolder<ArmorItem> ANCIENT_BOOTS = ITEMS.register("ancient_boots", () -> new ArmorItem(FossilsLegacyArmorMaterials.ANCIENT, Type.BOOTS, new Item.Properties()));
    public static final SimpleHolder<SwordItem> SCARAB_GEM_SWORD = ITEMS.register("scarab_gem_sword", () -> new SwordItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().attributes(SwordItem.createAttributes(FossilsLegacyTiers.SCARAB_GEM, 3, -2.4F))));
    public static final SimpleHolder<ShovelItem> SCARAB_GEM_SHOVEL = ITEMS.register("scarab_gem_shovel", () -> new ShovelItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().attributes(ShovelItem.createAttributes(FossilsLegacyTiers.SCARAB_GEM, 1.5F, -3.0F))));
    public static final SimpleHolder<PickaxeItem> SCARAB_GEM_PICKAXE = ITEMS.register("scarab_gem_pickaxe", () -> new PickaxeItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().attributes(PickaxeItem.createAttributes(FossilsLegacyTiers.SCARAB_GEM, 1, -2.8F))));
    public static final SimpleHolder<AxeItem> SCARAB_GEM_AXE = ITEMS.register("scarab_gem_axe", () -> new AxeItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().attributes(AxeItem.createAttributes(FossilsLegacyTiers.SCARAB_GEM, 5.0F, -3.0F))));
    public static final SimpleHolder<HoeItem> SCARAB_GEM_HOE = ITEMS.register("scarab_gem_hoe", () -> new HoeItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties().attributes(HoeItem.createAttributes(FossilsLegacyTiers.SCARAB_GEM, -4, 0.0F))));
    public static final SimpleHolder<ModSmithingTemplateItem> SCARAB_GEM_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("scarab_gem_upgrade_smithing_template", () -> ModSmithingTemplateItem.createGemUpgradeTemplate());
    public static final SimpleHolder<JavelinItem> WOODEN_JAVELIN = ITEMS.register("wooden_javelin", () -> new JavelinItem(Tiers.WOOD, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_WOODEN_JAVELIN = ITEMS.register("broken_wooden_javelin", () -> new BrokenJavelinItem(Tiers.WOOD, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> STONE_JAVELIN = ITEMS.register("stone_javelin", () -> new JavelinItem(Tiers.STONE, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_STONE_JAVELIN = ITEMS.register("broken_stone_javelin", () -> new BrokenJavelinItem(Tiers.STONE, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> IRON_JAVELIN = ITEMS.register("iron_javelin", () -> new JavelinItem(Tiers.IRON, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_IRON_JAVELIN = ITEMS.register("broken_iron_javelin", () -> new BrokenJavelinItem(Tiers.IRON, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> GOLDEN_JAVELIN = ITEMS.register("golden_javelin", () -> new JavelinItem(Tiers.GOLD, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_GOLDEN_JAVELIN = ITEMS.register("broken_golden_javelin", () -> new BrokenJavelinItem(Tiers.GOLD, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> DIAMOND_JAVELIN = ITEMS.register("diamond_javelin", () -> new JavelinItem(Tiers.DIAMOND, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_DIAMOND_JAVELIN = ITEMS.register("broken_diamond_javelin", () -> new BrokenJavelinItem(Tiers.DIAMOND, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> NETHERITE_JAVELIN = ITEMS.register("netherite_javelin", () -> new JavelinItem(Tiers.NETHERITE, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_NETHERITE_JAVELIN = ITEMS.register("broken_netherite_javelin", () -> new BrokenJavelinItem(Tiers.NETHERITE, new Item.Properties()));
    public static final SimpleHolder<JavelinItem> SCARAB_GEM_JAVELIN = ITEMS.register("scarab_gem_javelin", () -> new JavelinItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties()));
    public static final SimpleHolder<BrokenJavelinItem> BROKEN_SCARAB_GEM_JAVELIN = ITEMS.register("broken_scarab_gem_javelin", () -> new BrokenJavelinItem(FossilsLegacyTiers.SCARAB_GEM, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> ANU_SPAWN_EGG = ITEMS.register("anu_spawn_egg", () -> SimpleUtils.createSpawnEgg(() -> FossilsLegacyEntityTypes.ANU.get(), 0x432600, 0xa62c14, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> FAILURESAURUS_SPAWN_EGG = ITEMS.register("failuresaurus_spawn_egg", () -> SimpleUtils.createSpawnEgg(() -> FossilsLegacyEntityTypes.FAILURESAURUS.get(), 0x51e6a5, 0x1b5128, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> BRACHIOSAURUS_SPAWN_EGG = ITEMS.register("brachiosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.BRACHIOSAURUS.get(), 0x3b3e55, 0x7f8ba1, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> DILOPHOSAURUS_SPAWN_EGG = ITEMS.register("dilophosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.DILOPHOSAURUS.get(), 0x686442, 0xf1bc2c, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> FUTABASAURUS_SPAWN_EGG = ITEMS.register("futabasaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.FUTABASAURUS.get(), 0xca6700, 0xb92200, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> MAMMOTH_SPAWN_EGG = ITEMS.register("mammoth_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.MAMMOTH.get(), 0x3d2700, 0x211500, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> MOSASAURUS_SPAWN_EGG = ITEMS.register("mosasaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.MOSASAURUS.get(), 0x0d7346, 0xffe1a7, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> NAUTILUS_SPAWN_EGG = ITEMS.register("nautilus_spawn_egg", () -> SimpleUtils.createSpawnEgg(() -> FossilsLegacyEntityTypes.NAUTILUS.get(), 0xc1c1c1, 0xa95453, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> PTERANODON_SPAWN_EGG = ITEMS.register("pteranodon_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.PTERANODON.get(), 0x7c5d89, 0x450e5b, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> SMILODON_SPAWN_EGG = ITEMS.register("smilodon_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.SMILODON.get(), 0xefa745, 0x9a6527, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> STEGOSAURUS_SPAWN_EGG = ITEMS.register("stegosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.STEGOSAURUS.get(), 0x839d00, 0x785f00, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> TRICERATOPS_SPAWN_EGG = ITEMS.register("triceratops_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.TRICERATOPS.get(), 0xc2ff51, 0x638a25, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> TYRANNOSAURUS_SPAWN_EGG = ITEMS.register("tyrannosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.TYRANNOSAURUS.get(), 0x918066, 0x4f473a, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> VELOCIRAPTOR_SPAWN_EGG = ITEMS.register("velociraptor_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.VELOCIRAPTOR.get(), 0x66965f, 0x884c2e, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> CARNOTAURUS_SPAWN_EGG = ITEMS.register("carnotaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.CARNOTAURUS.get(), 0xbf5242, 0x371c18, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> CRYOLOPHOSAURUS_SPAWN_EGG = ITEMS.register("cryolophosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.CRYOLOPHOSAURUS.get(), 0x547096, 0xec353c, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> THERIZINOSAURUS_SPAWN_EGG = ITEMS.register("therizinosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.THERIZINOSAURUS.get(), 0x626c44, 0xcf561e, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> PACHYCEPHALOSAURUS_SPAWN_EGG = ITEMS.register("pachycephalosaurus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.PACHYCEPHALOSAURUS.get(), 0xc06929, 0x2e1a0b, new Item.Properties()));
    public static final SimpleHolder<SpawnEggItem> COMPSOGNATHUS_SPAWN_EGG = ITEMS.register("compsognathus_spawn_egg", () -> FossilsModloaderHelper.INSTANCE.createDinosaurSpawnEgg(() -> FossilsLegacyEntityTypes.COMPSOGNATHUS.get(), 0x2b482a, 0x172116, new Item.Properties()));

    public static void init(List<SimpleRegistry<?>> simpleRegistries) {
        // Debug
        DEBUG_ITEMS.register("debug_max_hunger", () -> DebugItem.debugMaxHunger());
        DEBUG_ITEMS.register("debug_max_health", () -> DebugItem.debugMaxHealth());
        DEBUG_ITEMS.register("debug_full_grown", () -> DebugItem.debugFullGrown());
        DEBUG_ITEMS.register("debug_baby", () -> DebugItem.debugBaby());
        DEBUG_ITEMS.register("debug_tame", () -> DebugItem.debugTame());

        SimpleUtils.registerAllItems(ITEMS, FossilsLegacyBlocks.BLOCKS, FossilsLegacyBlocks.AXOLOTLSPAWN, FossilsLegacyBlocks.RAW_CHICKEN_SOUP_CAULDRON, FossilsLegacyBlocks.COOKED_CHICKEN_SOUP_CAULDRON, FossilsLegacyBlocks.RAW_BERRY_MEDLEY_CAULDRON, FossilsLegacyBlocks.COOKED_BERRY_MEDLEY_CAULDRON);
        ITEMS.register("axolotlspawn", () -> new PlaceOnWaterBlockItem(FossilsLegacyBlocks.AXOLOTLSPAWN.get(), new Item.Properties()));
        simpleRegistries.add(ITEMS);
        simpleRegistries.add(DEBUG_ITEMS);
    }
}
