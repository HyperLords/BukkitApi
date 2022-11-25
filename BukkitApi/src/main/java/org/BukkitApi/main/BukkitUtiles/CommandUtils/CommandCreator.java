package org.BukkitApi.main.BukkitUtiles.CommandUtils;

import lombok.AccessLevel;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
public abstract class CommandCreator implements CommandExecutor, TabCompleter {

	private JavaPlugin plugin;

	public static Command command;

	public CommandCreator(JavaPlugin plugin, String commandName) {
		this.plugin=plugin;

		getPlugin().getCommand(commandName).setExecutor(this);

	}


	public void setTabsCompletor(JavaPlugin plugin, String tabCompletor) {
		this.plugin=plugin;

		getPlugin().getCommand(tabCompletor).setTabCompleter(this);
	}

	public abstract void executeCommand(Player player, String title, String[] arg);
	public abstract List<String> executeTabCompleter(CommandSender sender,Command command,String s,String[] arg);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		if (sender instanceof Player) executeCommand((Player)sender, label, arg);
		return true;
	}

	@Override
	public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
		return executeTabCompleter(commandSender,command,s,strings);
	}
}
