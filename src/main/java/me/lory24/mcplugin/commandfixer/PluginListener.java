package me.lory24.mcplugin.commandfixer;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.Locale;

public class PluginListener implements Listener {

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
        if (event.getPlayer().hasPermission("cmd.override")) return;
        if (CommandFixer.getInstance().getConfigValues().getCommands().contains(event.getMessage().split("\\s++")[0].toLowerCase(Locale.ROOT))) {
            event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', CommandFixer.getInstance()
                    .getConfigValues().getFixedCommandMessage()));
            event.setCancelled(true);
        }
    }
}
