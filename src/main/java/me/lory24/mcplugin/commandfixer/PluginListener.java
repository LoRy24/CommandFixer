package me.lory24.mcplugin.commandfixer;

import me.lory24.mcplugin.commandfixer.config.FixedCommands;
import me.lory24.mcplugin.commandfixer.config.Values;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PluginListener implements Listener {

    @EventHandler
    public void CommandPreProcess(PlayerCommandPreprocessEvent e) {

        if (e.getPlayer().hasPermission("cmd.override")) return;

        if (new FixedCommands((e.getMessage().split("\\s++"))[0]).isFixed()) {

            e.setCancelled(true);
            e.getPlayer().sendMessage(new Values().parseMessageColor(new Values().fixedCommandMessage));
        }
    }
}
