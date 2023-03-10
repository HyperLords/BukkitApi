package org.BukkitApi.main.BukkitUtiles.CommandUtils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.List;

@Getter
@Setter
public abstract class ConsoleChatCommands implements CommandExecutor, TabCompleter {

	private JavaPlugin plugin;
	public static Command command;

	public ConsoleChatCommands(JavaPlugin plugin, String commandName) {
		this.plugin=plugin;

		getPlugin().getCommand(commandName).setExecutor(this);

	}


	public void setTabsCompletor(JavaPlugin plugin, String tabCompletor) {
		this.plugin=plugin;

		getPlugin().getCommand(tabCompletor).setTabCompleter(this);
	}

	public abstract void executeCommand(ConsoleCommandSender player, String title, String[] arg);
	public abstract List<String> executeTabCompleter(CommandSender sender,Command command,String s,String[] arg);

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arg) {
		if (sender instanceof ConsoleCommandSender) executeCommand((ConsoleCommandSender) sender, label, arg);
		return true;
	}

	@Override
	public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
		return executeTabCompleter(commandSender,command,s,strings);
	}
}
