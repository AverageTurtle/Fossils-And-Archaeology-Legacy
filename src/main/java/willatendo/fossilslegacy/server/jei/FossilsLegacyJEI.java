package willatendo.fossilslegacy.server.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeTransferRegistration;
import mezz.jei.api.runtime.IIngredientManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import willatendo.fossilslegacy.client.screen.AnalyzerScreen;
import willatendo.fossilslegacy.client.screen.ArchaeologyWorkbenchScreen;
import willatendo.fossilslegacy.client.screen.CultivatorScreen;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.jei.category.AnalyzationCategory;
import willatendo.fossilslegacy.server.jei.category.ArchaeologyCategory;
import willatendo.fossilslegacy.server.jei.category.CultivationCategory;
import willatendo.fossilslegacy.server.menu.AnalyzerMenu;
import willatendo.fossilslegacy.server.menu.ArchaeologyWorkbenchMenu;
import willatendo.fossilslegacy.server.menu.CultivatorMenu;
import willatendo.fossilslegacy.server.menu.FossilsLegacyMenus;
import willatendo.fossilslegacy.server.recipe.AnalyzationRecipe;
import willatendo.fossilslegacy.server.recipe.ArchaeologyRecipe;
import willatendo.fossilslegacy.server.recipe.CultivationRecipe;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

@JeiPlugin
public class FossilsLegacyJEI implements IModPlugin {
	public static final RecipeType<ArchaeologyRecipe> ARCHAEOLOGY = RecipeType.create(FossilsLegacyUtils.ID, "archaeology_category", ArchaeologyRecipe.class);
	public static final RecipeType<CultivationRecipe> CULTIVATION = RecipeType.create(FossilsLegacyUtils.ID, "cultivation_category", CultivationRecipe.class);
	public static final RecipeType<AnalyzationRecipe> ANALYZATION = RecipeType.create(FossilsLegacyUtils.ID, "analyzation_category", AnalyzationRecipe.class);
	public static final ResourceLocation TEXTURE = FossilsLegacyUtils.resource("textures/gui/fossils_legacy_jei.png");

	private ArchaeologyCategory archaeologyCategory;
	private CultivationCategory cultivationCategory;
	private AnalyzationCategory analyzationCategory;

	@Override
	public ResourceLocation getPluginUid() {
		return FossilsLegacyUtils.resource("fossils_legacy_jei");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration iRecipeCategoryRegistration) {
		IGuiHelper iGuiHelper = iRecipeCategoryRegistration.getJeiHelpers().getGuiHelper();
		iRecipeCategoryRegistration.addRecipeCategories(this.archaeologyCategory = new ArchaeologyCategory(iGuiHelper), this.cultivationCategory = new CultivationCategory(iGuiHelper), this.analyzationCategory = new AnalyzationCategory(iGuiHelper));
	}

	@Override
	public void registerRecipes(IRecipeRegistration iRecipeRegistration) {
		IIngredientManager iIngredientManager = iRecipeRegistration.getIngredientManager();

		FossilsLegacyRecipes fossilsLegacyRecipes = new FossilsLegacyRecipes(iIngredientManager);

		iRecipeRegistration.addRecipes(FossilsLegacyJEI.ARCHAEOLOGY, fossilsLegacyRecipes.getArchaeologyRecipes(this.archaeologyCategory));
		iRecipeRegistration.addRecipes(FossilsLegacyJEI.CULTIVATION, fossilsLegacyRecipes.getCultivationRecipes(this.cultivationCategory));
		iRecipeRegistration.addRecipes(FossilsLegacyJEI.ANALYZATION, fossilsLegacyRecipes.getAnalyzationRecipes(this.analyzationCategory));
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration iRecipeCatalystRegistration) {
		iRecipeCatalystRegistration.addRecipeCatalyst(new ItemStack(FossilsLegacyBlocks.ARCHAEOLOGY_WORKBENCH.get()), FossilsLegacyJEI.ARCHAEOLOGY);
		iRecipeCatalystRegistration.addRecipeCatalyst(new ItemStack(FossilsLegacyBlocks.CULTIVATOR.get()), FossilsLegacyJEI.CULTIVATION);
		iRecipeCatalystRegistration.addRecipeCatalyst(new ItemStack(FossilsLegacyBlocks.ANALYZER.get()), FossilsLegacyJEI.ANALYZATION);
	}

	@Override
	public void registerGuiHandlers(IGuiHandlerRegistration iGuiHandlerRegistration) {
		iGuiHandlerRegistration.addRecipeClickArea(ArchaeologyWorkbenchScreen.class, 76, 21, 24, 14, FossilsLegacyJEI.ARCHAEOLOGY);
		iGuiHandlerRegistration.addRecipeClickArea(CultivatorScreen.class, 76, 21, 24, 14, FossilsLegacyJEI.CULTIVATION);
		iGuiHandlerRegistration.addRecipeClickArea(AnalyzerScreen.class, 68, 39, 21, 9, FossilsLegacyJEI.ANALYZATION);
	}

	@Override
	public void registerRecipeTransferHandlers(IRecipeTransferRegistration iRecipeTransferRegistration) {
		iRecipeTransferRegistration.addRecipeTransferHandler(ArchaeologyWorkbenchMenu.class, FossilsLegacyMenus.ARCHAEOLOGY_WORKBENCH.get(), FossilsLegacyJEI.ARCHAEOLOGY, 0, 1, 3, 36);
		iRecipeTransferRegistration.addRecipeTransferHandler(CultivatorMenu.class, FossilsLegacyMenus.CULTIVATOR.get(), FossilsLegacyJEI.CULTIVATION, 0, 1, 3, 36);
		iRecipeTransferRegistration.addRecipeTransferHandler(AnalyzerMenu.class, FossilsLegacyMenus.ANALYZER.get(), FossilsLegacyJEI.ANALYZATION, 0, 9, 10, 36);
	}
}