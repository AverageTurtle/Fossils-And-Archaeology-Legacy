package willatendo.fossilslegacy.server.config.forge;

import org.apache.commons.lang3.tuple.Pair;

import fuzs.forgeconfigapiport.fabric.api.neoforge.v4.NeoForgeConfigRegistry;
import net.neoforged.fml.config.ModConfig.Type;
import net.neoforged.neoforge.common.ModConfigSpec;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class FossilsLegacyForgeConfig {
	public static final ModConfigSpec COMMON_SPEC;
	public static final FossilsLegacyCommonConfig COMMON_CONFIG;

	public static final ModConfigSpec SERVER_SPEC;
	public static final FossilsLegacyServerConfig SERVER_CONFIG;

	static {
		Pair<FossilsLegacyCommonConfig, ModConfigSpec> commonConfig = new ModConfigSpec.Builder().configure(FossilsLegacyCommonConfig::new);
		COMMON_SPEC = commonConfig.getRight();
		COMMON_CONFIG = commonConfig.getLeft();

		Pair<FossilsLegacyServerConfig, ModConfigSpec> serverConfig = new ModConfigSpec.Builder().configure(FossilsLegacyServerConfig::new);
		SERVER_SPEC = serverConfig.getRight();
		SERVER_CONFIG = serverConfig.getLeft();
	}

	public static void loadConfig() {
		NeoForgeConfigRegistry.INSTANCE.register(FossilsLegacyUtils.ID, Type.COMMON, FossilsLegacyForgeConfig.COMMON_SPEC);
		NeoForgeConfigRegistry.INSTANCE.register(FossilsLegacyUtils.ID, Type.SERVER, FossilsLegacyForgeConfig.SERVER_SPEC);
	}
}
