package fossilslegacy.data;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

import fossilslegacy.server.block.FossilsLegacyBlocks;
import fossilslegacy.server.entity.FossilsLegacyEntities;
import fossilslegacy.server.item.FossilsLegacyItems;
import fossilslegacy.server.utils.FossilsLegacyUtils;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.critereon.BlockPredicate;
import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemInteractWithBlockTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.KilledTrigger;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.advancements.critereon.PlayerTrigger;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;

public class FossilsLegacyAdvancementProvider extends ForgeAdvancementProvider {
	public FossilsLegacyAdvancementProvider(PackOutput output, CompletableFuture<Provider> provider, ExistingFileHelper existingFileHelper) {
		super(output, provider, existingFileHelper, List.of(new FossilLegacyAdvancements()));
	}

	public static class FossilLegacyAdvancements implements AdvancementGenerator {
		@Override
		public void generate(Provider provider, Consumer<Advancement> saver, ExistingFileHelper existingFileHelper) {
			Advancement root = Advancement.Builder.advancement().display(FossilsLegacyBlocks.FOSSIL_ORE.get(), FossilsLegacyUtils.translation("advancements", "legacy.root.title"), FossilsLegacyUtils.translation("advancements", "legacy.root.desc"), new ResourceLocation("textures/gui/advancements/backgrounds/stone.png"), FrameType.TASK, false, false, false).addCriterion("ticks", new PlayerTrigger.TriggerInstance(CriteriaTriggers.TICK.getId(), EntityPredicate.Composite.ANY)).save(saver, FossilsLegacyUtils.resource("legacy/root"), existingFileHelper);
//			Advancement fossil =
			Advancement.Builder.advancement().parent(root).display(FossilsLegacyItems.FOSSIL.get(), FossilsLegacyUtils.translation("advancements", "legacy.fossil.title"), FossilsLegacyUtils.translation("advancements", "legacy.fossil.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_fossil", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.FOSSIL.get())).save(saver, FossilsLegacyUtils.resource("legacy/fossil"), existingFileHelper);
			Advancement relicScraps = Advancement.Builder.advancement().parent(root).display(FossilsLegacyItems.RELIC_SCRAP.get(), FossilsLegacyUtils.translation("advancements", "legacy.relic_scrap.title"), FossilsLegacyUtils.translation("advancements", "legacy.relic_scrap.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_relic_scrap", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.RELIC_SCRAP.get())).save(saver, FossilsLegacyUtils.resource("legacy/relic_scrap"), existingFileHelper);
			Advancement swordArtifact = Advancement.Builder.advancement().parent(relicScraps).display(FossilsLegacyItems.SWORD_ARTIFACT.get(), FossilsLegacyUtils.translation("advancements", "legacy.sword_artifact.title"), FossilsLegacyUtils.translation("advancements", "legacy.sword_artifact.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_sword_artifact", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.SWORD_ARTIFACT.get())).save(saver, FossilsLegacyUtils.resource("legacy/sword_artifact"), existingFileHelper);
			Advancement ancientSword = Advancement.Builder.advancement().parent(swordArtifact).display(FossilsLegacyItems.ANCIENT_SWORD.get(), FossilsLegacyUtils.translation("advancements", "legacy.ancient_sword.title"), FossilsLegacyUtils.translation("advancements", "legacy.ancient_sword.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_ancient_sword", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.ANCIENT_SWORD.get())).save(saver, FossilsLegacyUtils.resource("legacy/ancient_sword"), existingFileHelper);
			Advancement.Builder.advancement().parent(ancientSword).display(FossilsLegacyItems.ANCIENT_SWORD.get(), FossilsLegacyUtils.translation("advancements", "legacy.pigman.title"), FossilsLegacyUtils.translation("advancements", "legacy.pigman.desc"), null, FrameType.TASK, true, true, true).addCriterion("created_pigman", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.ANCIENT_SWORD.get())).save(saver, FossilsLegacyUtils.resource("legacy/pigman"), existingFileHelper);
			Advancement helmetArtifact = Advancement.Builder.advancement().parent(relicScraps).display(FossilsLegacyItems.HELMET_ARTIFACT.get(), FossilsLegacyUtils.translation("advancements", "legacy.helmet_artifact.title"), FossilsLegacyUtils.translation("advancements", "legacy.helmet_artifact.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_helmet_artifact", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.HELMET_ARTIFACT.get())).save(saver, FossilsLegacyUtils.resource("legacy/helmet_artifact"), existingFileHelper);
			Advancement ancientHelmet = Advancement.Builder.advancement().parent(helmetArtifact).display(FossilsLegacyItems.ANCIENT_HELMET.get(), FossilsLegacyUtils.translation("advancements", "legacy.ancient_helmet.title"), FossilsLegacyUtils.translation("advancements", "legacy.ancient_helmet.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_ancient_helmet", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.ANCIENT_HELMET.get())).save(saver, FossilsLegacyUtils.resource("legacy/ancient_helmet"), existingFileHelper);
			Advancement.Builder.advancement().parent(ancientHelmet).display(FossilsLegacyItems.ANCIENT_HELMET.get(), FossilsLegacyUtils.translation("advancements", "legacy.tamed_pigman.title"), FossilsLegacyUtils.translation("advancements", "legacy.tamed_pigman.desc"), null, FrameType.TASK, true, true, true).addCriterion("tamed_pigman", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyItems.ANCIENT_SWORD.get())).save(saver, FossilsLegacyUtils.resource("legacy/tamed_pigman"), existingFileHelper);
			Advancement archaeologyWorkbench = Advancement.Builder.advancement().parent(relicScraps).display(FossilsLegacyBlocks.ARCHAEOLOGY_WORKBENCH.get(), FossilsLegacyUtils.translation("advancements", "legacy.archaeology_workbench.title"), FossilsLegacyUtils.translation("advancements", "legacy.archaeology_workbench.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_archaeology_workbench", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyBlocks.ARCHAEOLOGY_WORKBENCH.get())).save(saver, FossilsLegacyUtils.resource("legacy/archaeology_workbench"), existingFileHelper);
			Advancement.Builder.advancement().parent(archaeologyWorkbench).display(FossilsLegacyItems.CAVE_PAINTING.get(), FossilsLegacyUtils.translation("advancements", "legacy.cave_painting.title"), FossilsLegacyUtils.translation("advancements", "legacy.cave_painting.desc"), null, FrameType.TASK, true, true, true).addCriterion("used_cave_painting", ItemInteractWithBlockTrigger.TriggerInstance.itemUsedOnBlock(LocationPredicate.Builder.location().setBlock(BlockPredicate.ANY), ItemPredicate.Builder.item().of(FossilsLegacyItems.CAVE_PAINTING.get()))).save(saver, FossilsLegacyUtils.resource("legacy/cave_painting"), existingFileHelper);
			Advancement skull = Advancement.Builder.advancement().parent(root).display(FossilsLegacyBlocks.SKULL_BLOCK.get(), FossilsLegacyUtils.translation("advancements", "legacy.skull_block.title"), FossilsLegacyUtils.translation("advancements", "legacy.skull_block.desc"), null, FrameType.TASK, true, true, true).addCriterion("has_skull_block", InventoryChangeTrigger.TriggerInstance.hasItems(FossilsLegacyBlocks.SKULL_BLOCK.get())).save(saver, FossilsLegacyUtils.resource("legacy/skull_block"), existingFileHelper);
			Advancement.Builder.advancement().parent(skull).display(FossilsLegacyBlocks.SKULL_BLOCK.get(), FossilsLegacyUtils.translation("advancements", "legacy.skeletons.title"), FossilsLegacyUtils.translation("advancements", "legacy.skeletons.desc"), null, FrameType.TASK, true, true, true).addCriterion("killed_skeletons", KilledTrigger.TriggerInstance.playerKilledEntity(EntityPredicate.Builder.entity().of(FossilsLegacyEntities.DROWNED_PIRATE.get()))).save(saver, FossilsLegacyUtils.resource("legacy/skeleton"), existingFileHelper);
		}
	}
}
