package org.BukkitApi.main.BukkitUtiles.CommandUtils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class CommandCreator implements CommandExecutor{

	private JavaPlugin plugin;

	public CommandCreator(JavaPlugin plugin, String commandName) {
		this.plugin=plugin;
		plugin.getCommand(commandName).setExecutor(this);
	}
	
	public abstract boolean executeCommand(Player player, String title, String[] arg);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		if (sender instanceof Player) executeCommand((Player)sender, label, arg);
		return true;
	}
}
