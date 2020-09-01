package me.lory24.mcplugin.commandfixer.config;

public class FixedCommands {

    private final String command;

    public FixedCommands(String s) {

        command = s;
    }

    public boolean isFixed() {

        return new Values().commands.contains(command);
    }
}
