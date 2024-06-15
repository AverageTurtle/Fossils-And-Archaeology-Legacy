package willatendo.fossilslegacy.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.LootTable.Builder;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetPotionFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import willatendo.fossilslegacy.server.item.FossilsLegacyItems;
import willatendo.fossilslegacy.server.item.FossilsLegacyLootTables;

import java.util.function.BiConsumer;

public class FossilsLegacyChestLootSubProvider implements LootTableSubProvider {
    @Override
    public void generate(HolderLookup.Provider provider, BiConsumer<ResourceKey<LootTable>, Builder> chestLoot) {
        chestLoot.accept(FossilsLegacyLootTables.ACADEMY_LOOT, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 10.0F)).add(LootItem.lootTableItem(FossilsLegacyItems.SCARAB_GEM_JAVELIN.get()).setWeight(1)).add(LootItem.lootTableItem(FossilsLegacyItems.FOSSIL.get()).setWeight(20)).add(LootItem.lootTableItem(FossilsLegacyItems.TRICERATOPS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.VELOCIRAPTOR_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.TYRANNOSAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.FUTABASAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.MOSASAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.STEGOSAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.DILOPHOSAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.BRACHIOSAURUS_DNA.get()).setWeight(2)).add(LootItem.lootTableItem(FossilsLegacyItems.CARNOTAURUS_DNA.get()).setWeight(1)).add(LootItem.lootTableItem(FossilsLegacyItems.CRYOLOPHOSAURUS_DNA.get()).setWeight(1)).add(LootItem.lootTableItem(FossilsLegacyItems.THERIZINOSAURUS_DNA.get()).setWeight(1))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0.0F, 1.0F)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.WATER)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.AWKWARD)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.NIGHT_VISION)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_NIGHT_VISION)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.INVISIBILITY)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_INVISIBILITY)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.FIRE_RESISTANCE)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_FIRE_RESISTANCE)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.SWIFTNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_SWIFTNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_SWIFTNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.SLOWNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_SLOWNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_SLOWNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.HEALING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_HEALING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.HARMING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_HARMING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.POISON)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_POISON)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_POISON)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.REGENERATION)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_REGENERATION)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_REGENERATION)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRENGTH)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_STRENGTH)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_STRENGTH)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.WEAKNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_WEAKNESS)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LEAPING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_LEAPING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_LEAPING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.TURTLE_MASTER)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_TURTLE_MASTER)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.STRONG_TURTLE_MASTER)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.WATER_BREATHING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_WATER_BREATHING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.SLOW_FALLING)).setWeight(1)).add(LootItem.lootTableItem(Items.POTION).apply(SetPotionFunction.setPotion(Potions.LONG_SLOW_FALLING)).setWeight(1))));
        chestLoot.accept(FossilsLegacyLootTables.ACADEMY_DISC, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(LootItem.lootTableItem(Items.MUSIC_DISC_11)).add(LootItem.lootTableItem(Items.MUSIC_DISC_13)).add(LootItem.lootTableItem(Items.MUSIC_DISC_BLOCKS)).add(LootItem.lootTableItem(Items.MUSIC_DISC_CAT)).add(LootItem.lootTableItem(Items.MUSIC_DISC_CHIRP)).add(LootItem.lootTableItem(Items.MUSIC_DISC_FAR)).add(LootItem.lootTableItem(Items.MUSIC_DISC_MALL)).add(LootItem.lootTableItem(Items.MUSIC_DISC_MELLOHI)).add(LootItem.lootTableItem(Items.MUSIC_DISC_STAL)).add(LootItem.lootTableItem(Items.MUSIC_DISC_STRAD)).add(LootItem.lootTableItem(Items.MUSIC_DISC_WAIT)).add(LootItem.lootTableItem(Items.MUSIC_DISC_WARD))));
        chestLoot.accept(FossilsLegacyLootTables.WEAPON_SHOP_DECOY, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(1.0F, 3.0F)).add(LootItem.lootTableItem(Items.WOODEN_AXE)).add(LootItem.lootTableItem(Items.WOODEN_HOE)).add(LootItem.lootTableItem(Items.WOODEN_PICKAXE)).add(LootItem.lootTableItem(Items.WOODEN_SHOVEL)).add(LootItem.lootTableItem(Items.WOODEN_SWORD)).add(LootItem.lootTableItem(FossilsLegacyItems.WOODEN_JAVELIN.get())).add(LootItem.lootTableItem(Items.STONE_AXE)).add(LootItem.lootTableItem(Items.STONE_HOE)).add(LootItem.lootTableItem(Items.STONE_PICKAXE)).add(LootItem.lootTableItem(Items.STONE_SHOVEL)).add(LootItem.lootTableItem(Items.STONE_SWORD)).add(LootItem.lootTableItem(FossilsLegacyItems.STONE_JAVELIN.get()))));
        chestLoot.accept(FossilsLegacyLootTables.WEAPON_SHOP_LOOT, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(UniformGenerator.between(0.0F, 1.0F)).add(LootItem.lootTableItem(FossilsLegacyItems.SCARAB_GEM_UPGRADE_SMITHING_TEMPLATE.get()))).withPool(LootPool.lootPool().setRolls(UniformGenerator.between(3.0F, 10.0F)).add(LootItem.lootTableItem(Items.GOLDEN_AXE)).add(LootItem.lootTableItem(Items.GOLDEN_HOE)).add(LootItem.lootTableItem(Items.GOLDEN_PICKAXE)).add(LootItem.lootTableItem(Items.GOLDEN_SHOVEL)).add(LootItem.lootTableItem(Items.GOLDEN_SWORD)).add(LootItem.lootTableItem(FossilsLegacyItems.GOLDEN_JAVELIN.get())).add(LootItem.lootTableItem(Items.DIAMOND_AXE)).add(LootItem.lootTableItem(Items.DIAMOND_HOE)).add(LootItem.lootTableItem(Items.DIAMOND_PICKAXE)).add(LootItem.lootTableItem(Items.DIAMOND_SHOVEL)).add(LootItem.lootTableItem(Items.DIAMOND_SWORD)).add(LootItem.lootTableItem(FossilsLegacyItems.DIAMOND_JAVELIN.get())).add(LootItem.lootTableItem(Items.IRON_AXE)).add(LootItem.lootTableItem(Items.IRON_HOE)).add(LootItem.lootTableItem(Items.IRON_PICKAXE)).add(LootItem.lootTableItem(Items.IRON_SHOVEL)).add(LootItem.lootTableItem(Items.IRON_SWORD)).add(LootItem.lootTableItem(FossilsLegacyItems.IRON_JAVELIN.get())).add(LootItem.lootTableItem(Items.BOW)).add(LootItem.lootTableItem(Items.ARROW)).add(LootItem.lootTableItem(Items.TIPPED_ARROW)).apply(SetPotionFunction.setPotion(Potions.HARMING)).add(LootItem.lootTableItem(Items.SPECTRAL_ARROW))));
    }
}
