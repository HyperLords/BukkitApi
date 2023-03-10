package org.BukkitApi.main.BukkitUtiles.ListenerUtils;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BukkitListener implements Listener{

	private JavaPlugin plugin;
	private Listener listener;

	public BukkitListener(JavaPlugin plugin) {
		this.plugin=plugin;
		plugin.getServer().getPluginManager().registerEvents(this,plugin);
	}

	public BukkitListener(JavaPlugin plugin,Listener listener) {
		this.plugin=plugin;
		this.listener=listener;
		plugin.getServer().getPluginManager().registerEvents(listener,this.getPlugin());
	}

}
