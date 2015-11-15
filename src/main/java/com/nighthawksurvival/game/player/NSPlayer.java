package com.nighthawksurvival.game.player;

import com.nighthawksurvival.engine.uid.GUID;
import com.nighthawksurvival.engine.yml.YML;
import com.nighthawksurvival.game.frames.NSGroup;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.UUID;

/**
 * Created by NoneVale on 11/9/2015.
 */
public class NSPlayer {

    private File file;
    private FileConfiguration config;
    private String name;
    private String id;
    private NSGroup group;

    private void loadInfo(Player player) {

    }

    private void loadInfo(UUID uuid) {

    }

    private void loadInfo(String id) {

    }

    private void loadInfo(GUID guid) {

    }

    public NSPlayer(Player player) {
        loadInfo(player);
    }

    public NSPlayer(UUID uuid) {
        loadInfo(uuid);
    }

    public NSPlayer(String name) {
        loadInfo(name);
    }

    public NSPlayer(GUID guid) {
        loadInfo(guid);
    }

    private YML getPlayerYaml() {
        return new YML(this.id, this.config, "players");
    }
}
