package org.BukkitApi.main.BukkitUtiles.MessageUtils;

import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.entity.Player;

public class PlayerUtils {

    public static Player getPlayerMessage(Player player, String...strings) {
        for (String message:strings) {
            player.sendMessage(message);
        }
        return player;
    }

    public static String getColoredMessage(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static String getUTFMessage(String message) {
        return message= StringEscapeUtils.escapeJava(message);
    }

}
