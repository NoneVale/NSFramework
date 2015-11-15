package com.nighthawksurvival.game;

import com.nighthawksurvival.engine.yml.YML;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Game extends JavaPlugin {

    private static FileConfiguration c1;
    private static FileConfiguration c2;
    private static YML yml;

    public static void main(String[] args) {
        loadConf();
        saveConf();
        System.out.println(getConfYML().getFile().getName());
    }

    public void onEnable() {

    }

    public void onDisable() {

    }

    private static YML getConfYML() {
        return new YML("config", c1);
    }

    private static void loadConf() {
        getConfYML().loadFile();
    }

    public static void saveConf() {
        getConfYML().saveFile();
    }

    public static FileConfiguration getConf() {
        return getConfYML().getConf();
    }
}
