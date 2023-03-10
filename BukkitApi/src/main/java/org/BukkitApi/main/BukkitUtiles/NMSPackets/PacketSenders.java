package org.BukkitApi.main.BukkitUtiles.NMSPackets;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PacketSenders {

    public static void sendPacket(Player player,Object packet) {
        try {
            Object handle=player.getClass().getMethod("getHandle").invoke(player);
            Object playerConnect=handle.getClass().getField("playerConnection").get(handle);
            playerConnect.getClass().getMethod("sendPacket",getNMSClassName("Packet")).invoke(playerConnect,packet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    return;}

    public static Class<?> getNMSClassName(String name) {
        String version= Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3];
        try {
            return Class.forName("net.minecraft.server."+version+"."+name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }


}
