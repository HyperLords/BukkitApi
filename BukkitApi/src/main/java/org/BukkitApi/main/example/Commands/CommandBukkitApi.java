package org.BukkitApi.main.example.Commands;

import org.BukkitApi.main.BukkitUtiles.CommandUtils.CommandCreator;
import org.BukkitApi.main.BukkitUtiles.MesageUtils.GetColoredMessage;
import org.BukkitApi.main.BukkitUtiles.MesageUtils.GetPlayerMessage;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandBukkitApi extends CommandCreator {

    public CommandBukkitApi(JavaPlugin plugin, String commandName) {
        super(plugin, "bukkitapi");
    }

    @Override
    public boolean executeCommand(Player player, String title, String[] arg) {
        Command command=(Command) getPlugin().getCommand(title);
        if (player.hasPermission("bukkit.api")) {
            if (command.getName().equals("bukkitapi")) {
                if (arg.length==0) {
                    GetPlayerMessage.getPlayerMessage(player, GetColoredMessage.getColoredMessage("&aTutorial Command worked BukkitApi"));
                return true;}

return true;}}else{
    GetPlayerMessage.getPlayerMessage(player, GetColoredMessage.getColoredMessage("&c&lYou don't have the permission!"));
return true;}
return true;}
}
