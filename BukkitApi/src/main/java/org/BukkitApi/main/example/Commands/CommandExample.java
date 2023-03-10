package org.BukkitApi.main.example.Commands;

import org.BukkitApi.main.BukkitUtiles.CommandUtils.PlayerChatCommands;
import org.BukkitApi.main.BukkitUtiles.MessageUtils.PlayerUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CommandExample extends PlayerChatCommands {

    public CommandExample(JavaPlugin plugin, String commandName) {
        super(plugin, "example");
        setTabsCompletor(plugin,"example");
    }

    @Override
    public void executeCommand(Player player, String title, String[] arg) {
        command=(Command) getPlugin().getCommand(title);
        if (player.hasPermission("example.tutorial")) {
            if (command.getName().equals("example")) {
                if (arg.length==0) {
                    PlayerUtils.getPlayerMessage(player, PlayerUtils.getColoredMessage("Command successfull work"));
                return;}

                if (arg[0].equalsIgnoreCase("tutorial")) {
                    PlayerUtils.getPlayerMessage(player, PlayerUtils.getColoredMessage("argument successfull"));
                return;}

            }
        }
    }

    @Override
    public List<String> executeTabCompleter(CommandSender sender, Command command, String s, String[] arg) {
        ArrayList<String> list=new ArrayList<>();
        list.add("tutorial");
        return list;
    }
}
