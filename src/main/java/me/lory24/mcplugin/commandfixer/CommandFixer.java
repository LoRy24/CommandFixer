package me.lory24.mcplugin.commandfixer;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandFixer extends JavaPlugin {

    private static CommandFixer instance;
    @Getter private ConfigValues configValues;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        configValues = new ConfigValues();

        Bukkit.getPluginManager().registerEvents(new PluginListener(), this);
        this.getLogger().info("Plugin Enabled!");
    }

    public static CommandFixer getInstance() {
        return instance;
    }
}
