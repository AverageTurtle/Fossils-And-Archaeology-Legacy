package willatendo.fossilslegacy.server.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import willatendo.fossilslegacy.server.block.FossilsLegacyBlocks;
import willatendo.fossilslegacy.server.inventory.CultivationBookCategory;
import willatendo.fossilslegacy.server.recipe.serialiser.FossilsLegacyRecipeSerialisers;

public class CultivationRecipe implements Recipe<SingleRecipeInput> {
    public final CultivationBookCategory cultivationBookCategory;
    public final Ingredient ingredient;
    public final ItemStack result;
    public final int time;
    public String group;

    public CultivationRecipe(CultivationBookCategory cultivationBookCategory, String group, Ingredient ingredient, ItemStack result, int time) {
        this.cultivationBookCategory = cultivationBookCategory;
        this.group = group;
        this.ingredient = ingredient;
        this.result = result;
        this.time = time;
    }

    @Override
    public boolean matches(SingleRecipeInput singleRecipeInput, Level level) {
        return this.ingredient.test(singleRecipeInput.getItem(0));
    }

    @Override
    public ItemStack assemble(SingleRecipeInput singleRecipeInput, HolderLookup.Provider provider) {
        return this.result.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        return nonnulllist;
    }

    @Override
    public boolean canCraftInDimensions(int x, int y) {
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider provider) {
        return this.result;
    }

    @Override
    public ItemStack getToastSymbol() {
        return FossilsLegacyBlocks.LIME_CULTIVATOR.get().asItem().getDefaultInstance();
    }

    public int getTime() {
        return this.time;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return FossilsLegacyRecipeSerialisers.CULTIVATION.get();
    }

    @Override
    public RecipeType<?> getType() {
        return FossilsLegacyRecipeTypes.CULTIVATION.get();
    }
}
