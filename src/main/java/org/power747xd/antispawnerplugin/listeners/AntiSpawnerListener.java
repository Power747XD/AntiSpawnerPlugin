package org.power747xd.antispawnerplugin.listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.SpawnCategory;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;

public class AntiSpawnerListener implements Listener {
    @EventHandler
    public void AntiSpawner (SpawnerSpawnEvent event){
        Entity entity = event.getEntity();
        if (entity.getSpawnCategory() != SpawnCategory.MONSTER) {
            event.setCancelled(true);
        }
    }
}
