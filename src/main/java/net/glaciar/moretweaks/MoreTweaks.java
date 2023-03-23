package net.glaciar.moretweaks;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import net.glaciar.moretweaks.recipes.RecipeBundle;

public class MoreTweaks extends JavaPlugin
{
  private static final Logger LOGGER=Logger.getLogger("bundles");

  public void onEnable()
  {

    LOGGER.info("MoreTweaks plugin enabled");
    new RecipeBundle(this);

  }

  public void onDisable()
  {
    LOGGER.info("MoreTweaks plugin disabled");
  }
}
