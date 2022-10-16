package org.BukkitApi.main.BukkitUtiles.MulticonfigurationUtils;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MultiConfigurationVarient {

	private JavaPlugin plugin;
	private File file;
	
	public MultiConfigurationVarient(JavaPlugin plugin,File file) {
		this.plugin=plugin;
		this.file=file;
	}
	
	protected abstract void onFile(File file);
	
	public abstract File newFileCreate(File file);
	
	public abstract void configObjectText(File file);

	public abstract void saveFile(File file);
	
}
