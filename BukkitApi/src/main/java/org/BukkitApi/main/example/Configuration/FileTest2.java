package org.BukkitApi.main.example.Configuration;

import org.BukkitApi.main.BukkitUtiles.MulticonfigurationUtils.BukkitFileCreator;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class FileTest2 extends BukkitFileCreator {
    public FileTest2(JavaPlugin plugin, File file, FileConfiguration configuration) {
        super(plugin, file, configuration);
    }

    @Override
    protected void onFile(File file) {
        createFile("plugins/BukkitApi/server_test2.yml");
        set("plugins/BukkitApi/server_test2.yml","asa.sag","gaasd");
        save("plugins/BukkitApi/server_test2.yml");
    }
}
