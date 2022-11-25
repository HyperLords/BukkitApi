package org.BukkitApi.main.example.ExampleListener;

import org.BukkitApi.main.BukkitUtiles.ListenerUtils.BukkitListener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Listener extends BukkitListener {


    public Listener(JavaPlugin plugin) {
        super(plugin);
    }

    public Listener(JavaPlugin plugin, org.bukkit.event.Listener listener) {
        super(plugin, listener);
    }

    @EventHandler
    public void event(PlayerJoinEvent e){
        e.getPlayer().kickPlayer("s");
    }

}
