package org.BukkitApi.main.example.Commands;

import org.BukkitApi.main.BukkitUtiles.CommandUtils.ConsoleChatCommands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class ConsoleCommandExample extends ConsoleChatCommands {

    public ConsoleCommandExample(JavaPlugin plugin, String commandName) {
        super(plugin, "bukkitconsole");
    }

    @Override
    public void executeCommand(ConsoleCommandSender player, String title, String[] arg) {
        command=(Command)getPlugin().getCommand(title);
        if (command.getName().equals("bukkitconsole")) {
            if (arg.length==0) {
                player.sendMessage("successfull console command worked");

            return;}

            if (arg[0].equalsIgnoreCase("argument")) {
                player.sendMessage("successfull console command with argument worked");
            return;}

        return;}
    }

    @Override
    public List<String> executeTabCompleter(CommandSender sender, Command command, String s, String[] arg) {
        return null;
    }
}
