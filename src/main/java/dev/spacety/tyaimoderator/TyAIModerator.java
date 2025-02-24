package dev.spacety.tyaimoderator;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TyAIModerator extends JavaPlugin {
    
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("TyAIModerator has been enabled!");
        
        // Save default config if it doesn't exist
        saveDefaultConfig();
        
        // Register commands and event listeners
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("TyAIModerator has been disabled!");
    }

    private void registerCommands() {
        // Register commands here
    }

    private void registerListeners() {
        // Register event listeners here
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players!");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("tyai")) {
            if (!player.hasPermission("tyai.admin")) {
                player.sendMessage("§cYou don't have permission to use this command!");
                return true;
            }

            // Handle command logic here
            player.sendMessage("§aTyAIModerator command received!");
            return true;
        }

        return false;
    }
} 