package willatendo.fossilslegacy.data;

import net.minecraft.DetectedVersion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.metadata.PackMetadataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.metadata.pack.PackMetadataSection;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.AdvancementProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import willatendo.fossilslegacy.data.loot.FossilsLegacyBlockLootSubProvider;
import willatendo.fossilslegacy.data.loot.FossilsLegacyChestLootSubProvider;
import willatendo.fossilslegacy.data.loot.FossilsLegacyEntityLootSubProvider;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = FossilsLegacyUtils.ID)
public class FossilsLegacyData {
    @SubscribeEvent
    public static void gatherDataEvent(GatherDataEvent gatherDataEvent) {
        DataGenerator dataGenerator = gatherDataEvent.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = gatherDataEvent.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> registries = gatherDataEvent.getLookupProvider();

        dataGenerator.addProvider(gatherDataEvent.includeClient(), new FossilsLegacyItemModelProvider(packOutput, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeClient(), new FossilsLegacyBlockStateProvider(packOutput, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeClient(), new FossilsLegacySoundDefinitionsProvider(packOutput, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeClient(), new FossilsLegacyLanguageProvider(packOutput, FossilsLegacyUtils.ID, "en_us"));

        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyRecipeProvider(packOutput));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new AdvancementProvider(packOutput, registries, existingFileHelper, List.of(new FossilsLegacyAdvancementGenerator())));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new LootTableProvider(packOutput, BuiltInLootTables.all(), List.of(new LootTableProvider.SubProviderEntry(FossilsLegacyBlockLootSubProvider::new, LootContextParamSets.BLOCK), new LootTableProvider.SubProviderEntry(FossilsLegacyEntityLootSubProvider::new, LootContextParamSets.ENTITY), new LootTableProvider.SubProviderEntry(FossilsLegacyChestLootSubProvider::new, LootContextParamSets.CHEST))) {
            @Override
            protected void validate(Map<ResourceLocation, LootTable> map, ValidationContext validationcontext) {
            }
        });
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyBuiltinProvider(packOutput, registries, FossilsLegacyUtils.ID));
        FossilsLegacyBlockTagProvider fossilsLegacyBlockTagProvider = new FossilsLegacyBlockTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper);
        dataGenerator.addProvider(gatherDataEvent.includeServer(), fossilsLegacyBlockTagProvider);
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyItemTagProvider(packOutput, registries, fossilsLegacyBlockTagProvider.contentsGetter(), FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyBiomeTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyFluidTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyEntityTypeTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyDamageTypeTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyFossilVariantTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new FossilsLegacyStoneTabletVariantTagProvider(packOutput, registries, FossilsLegacyUtils.ID, existingFileHelper));
        dataGenerator.addProvider(gatherDataEvent.includeServer(), new PackMetadataGenerator(packOutput).add(PackMetadataSection.TYPE, new PackMetadataSection(FossilsLegacyUtils.translation("resourcePack", "description"), DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES), Optional.empty())));

        ResourceLocation legacyPack = FossilsLegacyUtils.resource("fa_legacy_textures");
        FossilsLegacyData.PackGenerator legacyPackGenerator = new FossilsLegacyData.PackGenerator(dataGenerator, true, legacyPack.toString(), new PackOutput(dataGenerator.getPackOutput().getOutputFolder().resolve("resourcepacks").resolve(legacyPack.getPath())));
        legacyPackGenerator.addProvider(legacyPackOutput -> new PackMetadataGenerator(legacyPackOutput).add(PackMetadataSection.TYPE, new PackMetadataSection(FossilsLegacyUtils.translation("resourcePack", "fa_legacy_textures.description"), DetectedVersion.BUILT_IN.getPackVersion(PackType.CLIENT_RESOURCES), Optional.empty())));
    }

    private static class PackGenerator {
        private final DataGenerator dataGenerator;
        private final boolean toRun;
        private final String providerPrefix;
        private final PackOutput packOutput;

        public PackGenerator(DataGenerator dataGenerator, boolean toRun, String providerPrefix, PackOutput packOutput) {
            this.dataGenerator = dataGenerator;
            this.toRun = toRun;
            this.providerPrefix = providerPrefix;
            this.packOutput = packOutput;
        }

        public <T extends DataProvider> T addProvider(DataProvider.Factory<T> factory) {
            T dataProvider = factory.create(this.packOutput);
            String name = this.providerPrefix + "/" + dataProvider.getName();
            if (!this.dataGenerator.allProviderIds.add(name)) {
                throw new IllegalStateException("Duplicate provider: " + name);
            } else {
                if (this.toRun) {
                    this.dataGenerator.providersToRun.put(name, dataProvider);
                }
                return dataProvider;
            }
        }
    }
}
