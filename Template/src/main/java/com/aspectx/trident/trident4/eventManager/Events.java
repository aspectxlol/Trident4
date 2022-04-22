package com.aspectx.trident.trident4.eventManager;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage("§b[§a+§b]§a " + e.getPlayer().getName());
        if(e.getPlayer().hasPlayedBefore()) {
            e.setJoinMessage("§b[§a+§b]§a " + e.getPlayer().getName() + "§d§l[NEW]");
            e.getPlayer().sendTitle("Welcome", "to Trident4", 100, 1000, 100);
        }
    }

    @EventHandler
    public void onPlayerDisconnect(PlayerQuitEvent e) {
        e.setQuitMessage("§b[§4+§b]§4 " + e.getPlayer().getName());
    }
}
