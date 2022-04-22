package com.aspectx.trident.trident4;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.aspectx.trident.trident4.eventManager.Events;

public final class Trident4 extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[Trident4] Enabled");
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Trident4] Disabled");
    }
}
