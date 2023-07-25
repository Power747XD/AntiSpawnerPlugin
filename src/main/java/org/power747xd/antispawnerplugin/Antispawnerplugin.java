package org.power747xd.antispawnerplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.power747xd.antispawnerplugin.listeners.AntiSpawnerListener;

public final class Antispawnerplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new AntiSpawnerListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
