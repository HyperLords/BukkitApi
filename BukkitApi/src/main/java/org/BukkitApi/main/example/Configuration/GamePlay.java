package org.BukkitApi.main.example.Configuration;

import org.BukkitApi.main.BukkitUtiles.MulticonfigurationUtils.MultiConfigurationVarient;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class GamePlay extends MultiConfigurationVarient {

    public GamePlay(JavaPlugin plugin, File file) {
        super(plugin, file);
        onFile(file);
    }

    @Override
    protected void onFile(File file) {
        newFileCreate(file);
        configObjectText(file);
        saveFile(file);
    }

    @Override
    public File newFileCreate(File file) {
        return file=new File(getPlugin().getDataFolder(),"exampleGame.yml");
    }

    @Override
    public void configObjectText(File file) {
        file=new File(getPlugin().getDataFolder(),"exampleGame.yml");
        FileConfiguration c= YamlConfiguration.loadConfiguration(file);
        c.set("gameSelect",true);
        try {
            c.save(file);
        } catch (IOException e) {
            return;
        }
    }

    @Override
    public void saveFile(File file) {
        file=new File(getPlugin().getDataFolder(),"exampleGame.yml");
        FileConfiguration c=YamlConfiguration.loadConfiguration(file);
        try {
            c.save(file);
        } catch (IOException e) {
            return;
        }
    }
}
