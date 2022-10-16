package org.BukkitApi.main.BukkitUtiles.MesageUtils;

import net.md_5.bungee.api.ChatColor;

public class GetColoredMessage {
	public static String getColoredMessage(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
}
