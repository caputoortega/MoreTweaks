package net.glaciar.moretweaks.recipes;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.BundleMeta;

import net.glaciar.moretweaks.MoreTweaks;

public final class RecipeBundle extends ShapedRecipe {

    private final static ItemStack output = new ItemStack(Material.BUNDLE);

    public RecipeBundle() {
        super(new NamespacedKey(MoreTweaks.getInstance(), "bundle"), output);

        BundleMeta meta = (BundleMeta) output.getItemMeta();

        super.shape("SFS", "F F", "FFF");
        super.setIngredient('S', Material.STRING);
        super.setIngredient('F', Material.RABBIT_HIDE);


    }

    public void register() {

        MoreTweaks.getInstance().getServer().addRecipe(this);

    }

}
