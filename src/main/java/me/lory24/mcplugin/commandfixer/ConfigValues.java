package me.lory24.mcplugin.commandfixer;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

public class ConfigValues {
    @Getter private final List<String> commands;
    @Getter private final String fixedCommandMessage;

    public ConfigValues() {
        FileConfiguration config = CommandFixer.getInstance().getConfig();
        fixedCommandMessage = config.getString("General.FixedCommandMessage");
        commands = config.getStringList("General.Commands");
    }
}
