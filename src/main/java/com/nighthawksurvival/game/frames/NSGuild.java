package com.nighthawksurvival.game.frames;

import com.google.common.collect.Lists;
import com.nighthawksurvival.engine.uid.GUID;
import com.nighthawksurvival.game.player.NSPlayer;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.List;

public class NSGuild {

    private String name;
    private String id;
    private String desc;
    private int colorID;
    private String owner;
    private List<String> officers;
    private List<String> members;
    private List<String> trainees;
    private File file;
    private FileConfiguration fc;

    private void buildGuild(String id) {
        file = new File("plugins/Nighthawk-Survival/guilds/" + id + ".yml");
        createFile(file);
        fc = YamlConfiguration.loadConfiguration(file);
        this.name = fc.getString("name");
        this.id = file.getName();
        this.colorID = fc.getInt("color-id");
        this.owner = fc.getString("owner");
        List<String> offics = Lists.newArrayList();
        String[] off = fc.getString("officers").split(",");
        for (String s : off) {
            offics.add(s);
            this.officers = offics;
        }
        List<String> membs = Lists.newArrayList();
        String[] mem = fc.getString("members").split(",");
        for (String s : mem) {
            membs.add(s);
            this.officers = offics;
        }
    }

    private void buildGuild(NSPlayer nsPlayer) {

    }

    public NSGuild(String id) {
        buildGuild(id);
    }

    public NSGuild(NSPlayer nsPlayer) {
        buildGuild(nsPlayer);
    }

    public void create(String name, NSPlayer nsPlayer) {
        String id = GUID.randomGUID().toString();
        this.fc.set("name", name);
        this.fc.set("desc", "");
        this.fc.set("id", id);
        this.fc.set("colorID", 1);
        this.fc.set("owner", nsPlayer.getClass().toString());
        buildGuild(id);
    }

    private void createFile(File file) {
        try {
            if (file.exists()) {
                this.fc = YamlConfiguration.loadConfiguration(file);
                return;
            }
            file.mkdirs();
            file.createNewFile();
            this.fc = YamlConfiguration.loadConfiguration(file);
        } catch (Exception e){}
    }


}
