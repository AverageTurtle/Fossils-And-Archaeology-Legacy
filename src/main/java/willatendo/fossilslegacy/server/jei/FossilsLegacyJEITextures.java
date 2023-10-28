package willatendo.fossilslegacy.server.jei;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class FossilsLegacyJEITextures {
	private final IGuiHelper iGuiHelper;

	private final FossilsLegacyDrawableSprite biomatterTexture;

	public FossilsLegacyJEITextures(IGuiHelper iGuiHelper, FossilsLegacySpriteUploader fossilsLegacySpriteUploader) {
		this.iGuiHelper = iGuiHelper;

		this.biomatterTexture = new FossilsLegacyDrawableSprite(fossilsLegacySpriteUploader, FossilsLegacyUtils.resource("icons/biomatter.png"), 14, 14);
	}

	public FossilsLegacyDrawableSprite getBiomatterTexture() {
		return this.biomatterTexture;
	}

	public IDrawable getBackground(int u, int v, int width, int height) {
		return this.iGuiHelper.createDrawable(FossilsLegacyJEI.TEXTURE, u, v, width, height);
	}

	public IDrawable getIconFromItemLike(ItemLike itemLike) {
		return this.iGuiHelper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(itemLike));
	}

	public LoadingCache<Integer, IDrawableAnimated> createProgressBar(long size, int u, int v, int width, int height, IDrawableAnimated.StartDirection startDirection, boolean inverted) {
		return CacheBuilder.newBuilder().maximumSize(size).build(new CacheLoader<>() {
			@Override
			public IDrawableAnimated load(Integer cookTime) {
				return FossilsLegacyJEITextures.this.iGuiHelper.drawableBuilder(FossilsLegacyJEI.TEXTURE, u, v, width, height).buildAnimated(cookTime, startDirection, inverted);
			}
		});
	}

	public LoadingCache<Integer, IDrawableAnimated> createProgressBar(long size, int u, int v, int width, int height, IDrawableAnimated.StartDirection startDirection) {
		return createProgressBar(size, u, v, width, height, startDirection, false);
	}

	public IDrawableAnimated createBiomatterBar() {
		IDrawableStatic iDrawableStatic = this.iGuiHelper.createDrawable(FossilsLegacyJEI.TEXTURE, 88, 56, 14, 14);
		return this.iGuiHelper.createAnimatedDrawable(iDrawableStatic, 300, IDrawableAnimated.StartDirection.TOP, true);
	}
}
