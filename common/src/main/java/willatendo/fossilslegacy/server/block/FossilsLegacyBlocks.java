package willatendo.fossilslegacy.server.block;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;
import willatendo.simplelibrary.server.registry.SimpleHolder;
import willatendo.simplelibrary.server.registry.SimpleRegistry;
import willatendo.simplelibrary.server.util.SimpleUtils;

import java.util.List;

public class FossilsLegacyBlocks {
    public static final SimpleRegistry<Block> BLOCKS = SimpleRegistry.create(Registries.BLOCK, FossilsLegacyUtils.ID);

    public static final SimpleHolder<Block> FOSSIL_ORE = BLOCKS.register("fossil_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final SimpleHolder<Block> DEEPSLATE_FOSSIL_ORE = BLOCKS.register("deepslate_fossil_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
    public static final SimpleHolder<SkullBlock> SKULL_BLOCK = BLOCKS.register("skull_block", () -> new SkullBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.XYLOPHONE).strength(1.0F)));
    public static final SimpleHolder<GenericSkullBlock> SKULL_LANTURN_BLOCK = BLOCKS.register("skull_lanturn_block", () -> new GenericSkullBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.XYLOPHONE).strength(1.0F).lightLevel(blockState -> 15)));
    public static final SimpleHolder<AnalyzerBlock> ANALYZER = BLOCKS.register("analyzer", () -> new AnalyzerBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final SimpleHolder<CultivatorBlock> WHITE_CULTIVATOR = BLOCKS.register("white_cultivator", () -> new CultivatorBlock(DyeColor.WHITE, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> ORANGE_CULTIVATOR = BLOCKS.register("orange_cultivator", () -> new CultivatorBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> MAGENTA_CULTIVATOR = BLOCKS.register("magenta_cultivator", () -> new CultivatorBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> LIGHT_BLUE_CULTIVATOR = BLOCKS.register("light_blue_cultivator", () -> new CultivatorBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> YELLOW_CULTIVATOR = BLOCKS.register("yellow_cultivator", () -> new CultivatorBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> LIME_CULTIVATOR = BLOCKS.register("lime_cultivator", () -> new CultivatorBlock(DyeColor.LIME, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> PINK_CULTIVATOR = BLOCKS.register("pink_cultivator", () -> new CultivatorBlock(DyeColor.PINK, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> GRAY_CULTIVATOR = BLOCKS.register("gray_cultivator", () -> new CultivatorBlock(DyeColor.GRAY, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> LIGHT_GRAY_CULTIVATOR = BLOCKS.register("light_gray_cultivator", () -> new CultivatorBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> CYAN_CULTIVATOR = BLOCKS.register("cyan_cultivator", () -> new CultivatorBlock(DyeColor.CYAN, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> PURPLE_CULTIVATOR = BLOCKS.register("purple_cultivator", () -> new CultivatorBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> BLUE_CULTIVATOR = BLOCKS.register("blue_cultivator", () -> new CultivatorBlock(DyeColor.BLUE, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> BROWN_CULTIVATOR = BLOCKS.register("brown_cultivator", () -> new CultivatorBlock(DyeColor.BROWN, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> GREEN_CULTIVATOR = BLOCKS.register("green_cultivator", () -> new CultivatorBlock(DyeColor.GREEN, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> RED_CULTIVATOR = BLOCKS.register("red_cultivator", () -> new CultivatorBlock(DyeColor.RED, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<CultivatorBlock> BLACK_CULTIVATOR = BLOCKS.register("black_cultivator", () -> new CultivatorBlock(DyeColor.BLACK, BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).strength(0.3F).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SimpleUtils::never).isRedstoneConductor(SimpleUtils::never).isSuffocating(SimpleUtils::never).isViewBlocking(SimpleUtils::never).lightLevel(blockState -> 13)));
    public static final SimpleHolder<ArchaeologyWorkbenchBlock> ARCHAEOLOGY_WORKBENCH = BLOCKS.register("archaeology_workbench", () -> new ArchaeologyWorkbenchBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final SimpleHolder<JurassicFernBlock> JURASSIC_FERN = BLOCKS.register("jurassic_fern", () -> new JurassicFernBlock(BlockBehaviour.Properties.of().noCollission().instabreak().randomTicks().sound(SoundType.GRASS)));
    public static final SimpleHolder<DrumBlock> DRUM = BLOCKS.register("drum", () -> new DrumBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final SimpleHolder<FeederBlock> FEEDER = BLOCKS.register("feeder", () -> new FeederBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.IRON_XYLOPHONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
    public static final SimpleHolder<PermafrostBlock> PERMAFROST = BLOCKS.register("permafrost", () -> new PermafrostBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.CHIME).strength(0.5F).randomTicks().noOcclusion().sound(SoundType.GRAVEL)));
    public static final SimpleHolder<IcedStoneBlock> ICED_STONE = BLOCKS.register("iced_stone", () -> new IcedStoneBlock(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.CHIME).requiresCorrectToolForDrops().strength(1.5F, 6.0F).randomTicks().noOcclusion()));
    public static final SimpleHolder<AxolotlspawnBlock> AXOLOTLSPAWN = BLOCKS.register("axolotlspawn", () -> new AxolotlspawnBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WATER).instabreak().noOcclusion().noCollission().sound(SoundType.FROGSPAWN).pushReaction(PushReaction.DESTROY)));
    public static final SimpleHolder<TimeMachineBlock> TIME_MACHINE = BLOCKS.register("time_machine", () -> new TimeMachineBlock(BlockBehaviour.Properties.of().strength(0.3F).lightLevel(blockState -> 14).sound(SoundType.GLASS)));
    public static final SimpleHolder<RawSoupCauldronBlock> RAW_CHICKEN_SOUP_CAULDRON = BLOCKS.register("raw_chicken_soup_cauldron", () -> new RawSoupCauldronBlock(FossilsLegacyCauldronInteraction.RAW_CHICKEN_SOUP, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final SimpleHolder<SoupCauldronBlock> COOKED_CHICKEN_SOUP_CAULDRON = BLOCKS.register("cooked_chicken_soup_cauldron", () -> new SoupCauldronBlock(FossilsLegacyCauldronInteraction.COOKED_CHICKEN_SOUP, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final SimpleHolder<RawSoupCauldronBlock> RAW_BERRY_MEDLEY_CAULDRON = BLOCKS.register("raw_berry_medley_cauldron", () -> new RawSoupCauldronBlock(FossilsLegacyCauldronInteraction.RAW_BERRY_MEDLEY, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));
    public static final SimpleHolder<SoupCauldronBlock> COOKED_BERRY_MEDLEY_CAULDRON = BLOCKS.register("cooked_berry_medley_cauldron", () -> new SoupCauldronBlock(FossilsLegacyCauldronInteraction.COOKED_BERRY_MEDLEY, BlockBehaviour.Properties.ofFullCopy(Blocks.CAULDRON)));

    public static void init(List<SimpleRegistry<?>> simpleRegistries) {
        simpleRegistries.add(BLOCKS);
    }
}
