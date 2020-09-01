package me.lory24.mcplugin.commandfixer.config;

import me.lory24.mcplugin.commandfixer.CommandFixer;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class Values {

    public List<String> commands;
    public String fixedCommandMessage;

    public Values() {

        FileConfiguration config = CommandFixer.instance.getConfig();

        commands = config.getStringList("General.Commands");
        fixedCommandMessage = config.getString("General.FixedCommandMessage");
    }

    public String parseMessageColor(String input) {

        return ChatColor.translateAlternateColorCodes('&', input);
    }
}
