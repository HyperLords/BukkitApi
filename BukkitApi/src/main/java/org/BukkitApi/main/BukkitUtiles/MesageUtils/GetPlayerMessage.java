package org.BukkitApi.main.BukkitUtiles.MesageUtils;

import org.bukkit.entity.Player;

public class GetPlayerMessage {
	public static Player getPlayerMessage(Player player, String...strings) {
		for (String message:strings) {
			player.sendMessage(message);
		}
		return player;
	}
}
