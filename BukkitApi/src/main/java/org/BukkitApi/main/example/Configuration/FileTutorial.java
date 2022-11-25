package org.BukkitApi.main.example.Configuration;

import org.BukkitApi.main.BukkitUtiles.MulticonfigurationUtils.MultiConfigurationVarient;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class FileTutorial extends MultiConfigurationVarient {


    public FileTutorial(JavaPlugin plugin, File file) {
        super(plugin, file);
        onFile(file);
    }

    @Override
    protected void onFile(File file) {
        newFileCreate(file);
        configObjects(file);
        saveFile(file);
    }

    @Override
    public File newFileCreate(File file) {
        return new File(getPlugin().getDataFolder(),"tutorial.yml");
    }

    @Override
    public void configObjects(File file) {
        file=new File(getPlugin().getDataFolder(),"tutorial.yml");
        FileConfiguration c= YamlConfiguration.loadConfiguration(file);
        c.addDefault("tutorial",false);
        c.options().copyDefaults(true);
        c.set("tutorial.file","true");
        try {
            c.save(file);
        } catch (IOException e) {
            return;
        }
    }

    @Override
    public File saveFile(File file) {
        file=new File(getPlugin().getDataFolder(),"tutorial.yml");
        FileConfiguration c=YamlConfiguration.loadConfiguration(file);
        try {
            c.save(file);
        } catch (IOException e) {

        }
        return file;
    }
}
