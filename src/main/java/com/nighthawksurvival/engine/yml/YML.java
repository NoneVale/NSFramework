package com.nighthawksurvival.engine.yml;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class YML {

    private File file;
    private FileConfiguration conf;
    private String directory = null;

    public YML(String filename, FileConfiguration conf) {
        this.file = new File("plugins/Nighthawk-Survival/" + filename + ".yml");
        this.conf = conf;
    }

    public YML(String filename, FileConfiguration conf, String directory) {
        this.file = new File("plugins/Nighthawk-Survival/" + directory + "/" + filename + ".yml");
        this.conf = conf;
        this.directory = directory;
    }

    public void loadFile() {
        try {
            File folder = new File("plugins/Nighthawk-Survival/");
            if (this.directory != null) {
                folder = new File("plugins/Nighthawk-Survival/" + directory + "/");
            }

            if (!folder.exists()) {
                folder.mkdirs();
            }

            if (!file.exists()) {
                file.createNewFile();
            }

            conf = YamlConfiguration.loadConfiguration(file);
        } catch (Exception e) {}
    }

    public void saveFile() {
        try {
            conf.save(file);
        } catch (Exception e) {}
    }

    public FileConfiguration getConf() {
        return conf;
    }

    public File getFile() {
        return file;
    }
}
