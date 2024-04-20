package willatendo.fossilslegacy.server.jei;

import mezz.jei.api.recipe.RecipeType;
import net.minecraft.world.item.crafting.RecipeHolder;
import willatendo.fossilslegacy.server.jei.recipe.BiomatterRecipe;
import willatendo.fossilslegacy.server.jei.recipe.FeederRecipe;
import willatendo.fossilslegacy.server.recipe.AnalyzationRecipe;
import willatendo.fossilslegacy.server.recipe.ArchaeologyRecipe;
import willatendo.fossilslegacy.server.recipe.CultivationRecipe;
import willatendo.fossilslegacy.server.recipe.FossilsLegacyRecipeTypes;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class FossilsLegacyJEIRecipeTypes {
    public static final RecipeType<RecipeHolder<ArchaeologyRecipe>> ARCHAEOLOGY = RecipeType.createFromVanilla(FossilsLegacyRecipeTypes.ARCHAEOLOGY.get());
    public static final RecipeType<RecipeHolder<CultivationRecipe>> CULTIVATION = RecipeType.createFromVanilla(FossilsLegacyRecipeTypes.CULTIVATION.get());
    public static final RecipeType<RecipeHolder<AnalyzationRecipe>> ANALYZATION = RecipeType.createFromVanilla(FossilsLegacyRecipeTypes.ANALYZATION.get());
    public static final RecipeType<BiomatterRecipe> BIOMATTER = RecipeType.create(FossilsLegacyUtils.ID, "biomatter_category", BiomatterRecipe.class);
    public static final RecipeType<FeederRecipe> FEEDER = RecipeType.create(FossilsLegacyUtils.ID, "feeder_category", FeederRecipe.class);
}
