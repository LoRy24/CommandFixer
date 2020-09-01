package me.lory24.mcplugin.commandfixer;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class CommandFixer extends JavaPlugin {

    public static CommandFixer instance;

    @Override
    public void onEnable() {

        instance = this;
        instance.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new PluginListener(), this);
        Bukkit.getLogger().info("[CommandFixer] Plugin Enabled!");
    }

    @Override
    public void onDisable() {

        Bukkit.getLogger().info("[CommandFixer] Plugin Disabled!");
    }
}
