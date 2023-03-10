package org.BukkitApi.main.BukkitUtiles.MulticonfigurationUtils;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

@Getter
@Setter
public abstract class BukkitFileCreator {

	private JavaPlugin plugin;
	private String FileName;
	private File file;
	private FileConfiguration configuration;
	
	public BukkitFileCreator(JavaPlugin plugin,File file,FileConfiguration configuration) {
		this.plugin=plugin;
		this.file=file;
		this.configuration=configuration;
		onFile(file);
	return;}

	protected abstract void onFile(File file);

	public File createFile(String FileName) {
		this.FileName = FileName;
		return new File(FileName);
	}

	public void save(String FileName) {
		this.FileName=FileName;
		this.file=new File(FileName);
		this.configuration= YamlConfiguration.loadConfiguration(file);
		try {
			this.configuration.save(file);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	return;}

	public void reload(String FileName) {
		this.file = new File(FileName);
		this.configuration = YamlConfiguration.loadConfiguration(file);
		try {
			this.configuration.load(file);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InvalidConfigurationException e) {
			throw new RuntimeException(e);
		}
	return;}

	public void addDefaults(String FileName,String Object1,Object Object2){
			this.FileName = FileName;
			this.file = new File(FileName);
			this.configuration = YamlConfiguration.loadConfiguration(file);
			this.configuration.addDefault(Object1,Object2);
			this.configuration.options().copyDefaults(true);
		try {
			this.configuration.save(file);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	return;}

	public void set(String FileName,String Object1,Object Object2) {
		this.FileName=FileName;
		this.file=new File(FileName);
		this.configuration.set(Object1,Object2);
		try {
			this.configuration.save(file);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	return;}
}
