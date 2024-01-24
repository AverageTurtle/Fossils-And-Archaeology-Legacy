package willatendo.fossilslegacy.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import willatendo.fossilslegacy.server.block.AnalyzerBlock;
import willatendo.fossilslegacy.server.block.ArchaeologyWorkbenchBlock;
import willatendo.fossilslegacy.server.block.CultivatorBlock;
import willatendo.fossilslegacy.server.block.DrumBlock;
import willatendo.fossilslegacy.server.block.FeederBlock;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.block.JurassicFernBlock;
import willatendo.fossilslegacy.server.utils.DinosaurCommand;
import willatendo.simplelibrary.data.SimpleBlockStateProvider;
import willatendo.simplelibrary.data.model.ConfiguredModel;
import willatendo.simplelibrary.data.util.ExistingFileHelper;

public class FossilsLegacyBlockStateProvider extends SimpleBlockStateProvider {
	public FossilsLegacyBlockStateProvider(FabricDataOutput fabricDataOutput, String modId, ExistingFileHelper existingFileHelper) {
		super(fabricDataOutput, modId, existingFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		this.simpleBlock(FossilsLegacyBlocks.FOSSIL_ORE.get());
		this.simpleBlock(FossilsLegacyBlocks.DEEPSLATE_FOSSIL_ORE.get());
		this.horizontalBlock(FossilsLegacyBlocks.SKULL_BLOCK.get(), blockState -> this.models().cube("skull_block", this.modLoc("block/skull"), this.modLoc("block/skull"), this.modLoc("block/skull_front"), this.modLoc("block/skull_crack"), this.modLoc("block/skull_crack"), this.modLoc("block/skull_crack")).texture("particle", this.modLoc("block/skull_crack")));
		this.horizontalBlock(FossilsLegacyBlocks.SKULL_LANTURN_BLOCK.get(), blockState -> this.models().cube("skull_lanturn_block", this.modLoc("block/skull"), this.modLoc("block/skull"), this.modLoc("block/skull_lanturn_front"), this.modLoc("block/skull_crack"), this.modLoc("block/skull_crack"), this.modLoc("block/skull_crack")).texture("particle", this.modLoc("block/skull_crack")));
		this.horizontalBlock(FossilsLegacyBlocks.ANALYZER.get(), blockState -> this.models().cube("analyzer" + (blockState.getValue(AnalyzerBlock.ACTIVE) ? "_active" : ""), this.modLoc("block/analyzer_top"), this.modLoc("block/analyzer_top"), this.modLoc("block/analyzer_front_" + (blockState.getValue(ArchaeologyWorkbenchBlock.ACTIVE) ? "on" : "off")), this.modLoc("block/analyzer_side"), this.modLoc("block/analyzer_side"), this.modLoc("block/analyzer_side")).texture("particle", this.modLoc("block/analyzer_side")));
		this.getVariantBuilder(FossilsLegacyBlocks.CULTIVATOR.get()).partialState().with(CultivatorBlock.ACTIVE, false).addModels(new ConfiguredModel(this.models().cube("cultivator", this.modLoc("block/cultivator_bottom"), this.modLoc("block/cultivator_top"), this.modLoc("block/cultivator_side_off"), this.modLoc("block/cultivator_side_off"), this.modLoc("block/cultivator_side_off"), this.modLoc("block/cultivator_side_off")).texture("particle", this.modLoc("block/cultivator_side_off")))).partialState().with(CultivatorBlock.ACTIVE, true).addModels(new ConfiguredModel(this.models().cube("cultivator_active", this.modLoc("block/cultivator_bottom"), this.modLoc("block/cultivator_top"), this.modLoc("block/cultivator_side_on"), this.modLoc("block/cultivator_side_on"), this.modLoc("block/cultivator_side_on"), this.modLoc("block/cultivator_side_on")).texture("particle", this.modLoc("block/cultivator_side_on"))));
		this.horizontalBlock(FossilsLegacyBlocks.ARCHAEOLOGY_WORKBENCH.get(), blockState -> this.models().cube("archaeology_workbench" + (blockState.getValue(ArchaeologyWorkbenchBlock.ACTIVE) ? "_active" : ""), this.mcLoc("block/spruce_planks"), this.modLoc("block/archaeology_workbench_top_" + (blockState.getValue(ArchaeologyWorkbenchBlock.ACTIVE) ? "on" : "off")), this.modLoc("block/archaeology_workbench_books"), this.modLoc("block/archaeology_workbench_side"), this.modLoc("block/archaeology_workbench_side"), this.modLoc("block/archaeology_workbench_side")).texture("particle", this.modLoc("block/archaeology_workbench_side")));
		this.getVariantBuilder(FossilsLegacyBlocks.JURASSIC_FERN.get()).partialState().with(JurassicFernBlock.GROWTH, 0).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_0", this.modLoc("block/fern_lower_0")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 1).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_1", this.modLoc("block/fern_lower_1")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 2).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_2", this.modLoc("block/fern_lower_2")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 3).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_3", this.modLoc("block/fern_lower_3")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 4).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_4", this.modLoc("block/fern_lower_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 5).with(JurassicFernBlock.HALF, DoubleBlockHalf.LOWER).addModels(new ConfiguredModel(this.models().crop("fern_lower_5", this.modLoc("block/fern_lower_5")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 0).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_0", this.modLoc("block/fern_upper_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 1).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_1", this.modLoc("block/fern_upper_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 2).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_2", this.modLoc("block/fern_upper_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 3).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_3", this.modLoc("block/fern_upper_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 4).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_4", this.modLoc("block/fern_upper_4")).renderType("cutout"))).partialState().with(JurassicFernBlock.GROWTH, 5).with(JurassicFernBlock.HALF, DoubleBlockHalf.UPPER).addModels(new ConfiguredModel(this.models().crop("fern_upper_5", this.modLoc("block/fern_upper_5")).renderType("cutout")));
		this.getVariantBuilder(FossilsLegacyBlocks.DRUM.get()).partialState().with(DrumBlock.DINOSAUR_ORDER, DinosaurCommand.FOLLOW).addModels(new ConfiguredModel(this.models().cube("drum_follow", this.mcLoc("block/spruce_planks"), this.modLoc("block/drum_follow"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side")).texture("particle", this.modLoc("block/drum_side")))).partialState().with(DrumBlock.DINOSAUR_ORDER, DinosaurCommand.FREE_MOVE).addModels(new ConfiguredModel(this.models().cube("drum_free_move", this.mcLoc("block/spruce_planks"), this.modLoc("block/drum_free_move"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side")).texture("particle", this.modLoc("block/drum_side")))).partialState().with(DrumBlock.DINOSAUR_ORDER, DinosaurCommand.STAY).addModels(new ConfiguredModel(this.models().cube("drum_stay", this.mcLoc("block/spruce_planks"), this.modLoc("block/drum_stay"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side"), this.modLoc("block/drum_side")).texture("particle", this.modLoc("block/drum_side"))));
		this.horizontalBlock(FossilsLegacyBlocks.FEEDER.get(), blockState -> this.models().cube("feeder" + (blockState.getValue(FeederBlock.HAS_FOOD) ? "_full" : "_empty"), this.mcLoc("block/iron_block"), this.modLoc("block/feeder_top" + (blockState.getValue(FeederBlock.HAS_FOOD) ? "_full" : "_empty")), this.modLoc("block/feeder_front"), this.modLoc("block/feeder_side"), this.modLoc("block/feeder_side"), this.modLoc("block/feeder_side")).texture("particle", this.modLoc("block/feeder_side")));
		this.simpleBlock(FossilsLegacyBlocks.PERMAFROST.get());
		this.simpleBlock(FossilsLegacyBlocks.ICED_STONE.get());
		this.simpleBlock(FossilsLegacyBlocks.AXOLOTLSPAWN.get(), this.models().withExistingParent("axolotlspawn", this.mcLoc("block/frogspawn")).texture("texture", this.modLoc("block/axolotlspawn")).texture("particle", this.modLoc("block/axolotlspawn")));
	}
}
