package net.glaciar.moretweaks;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import net.glaciar.moretweaks.recipes.RecipeBundle;

public class MoreTweaks extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("bundles");
  private static MoreTweaks INSTANCE;


  public void onEnable()
  {
    
    INSTANCE = this;

    RecipeBundle bundleRecipe = new RecipeBundle();
    bundleRecipe.register();

    LOGGER.info("MoreTweaks plugin enabled");

  }

  public void onDisable()
  {
    LOGGER.info("MoreTweaks plugin disabled");
  }

  public static MoreTweaks getInstance() {
    return INSTANCE;
  }

}
