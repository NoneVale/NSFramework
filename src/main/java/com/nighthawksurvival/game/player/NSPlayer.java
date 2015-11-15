package com.nighthawksurvival.game.player;

import com.nighthawksurvival.engine.uid.GUID;
import com.nighthawksurvival.engine.uid.GUIDType;
import com.nighthawksurvival.engine.yml.YML;
import com.nighthawksurvival.game.frames.NSGroup;
import com.nighthawksurvival.game.frames.NSGuild;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.util.UUID;

public class NSPlayer {

    private FileConfiguration config;
    private String id;
    private String name;
    private NSGroup group;
    private int balance;
    private NSGuild guild;
    private UUID uuid;

    private void loadInfo(Player player) {
        loadInfo(player.getUniqueId());
    }

    private void loadInfo(UUID uuid) {
        this.uuid = uuid;
        if (!exists(uuid.toString())) {
            create(uuid);
        }

        this.id = getIdFile().getString("players." + uuid.toString());
        if (this.id.length() != 27) {
            throw new IllegalArgumentException("Invalid Player ID Input: " + id);
        }
        loadPlayerData();

        this.name = getPlayerData().getString("name");
        this.group = NSGroup.valueOf(getPlayerData().getString("group"));
        this.balance = getPlayerData().getInt("balance");

        if (hasGuild()) {
            this.guild = new NSGuild(getPlayerData().getString("guild.guild"));
        }
    }

    public NSPlayer(Player player) {
        loadInfo(player);
    }

    public NSPlayer(UUID uuid) {
        loadInfo(uuid);
    }

    public void create(UUID uuid) {
        this.id = GUID.generateGUIDFor(GUIDType.PLAYER);
        getIdFile().set("players." + uuid.toString(), id);

        this.loadPlayerData();

        Player player = Bukkit.getPlayer(uuid);

        this.getPlayerData().set("name", player.getName());
        this.getPlayerData().set("group", "guest");
        this.getPlayerData().set("balance", 100);
    }

    public boolean exists(String id) {
        if (getIdFile().isSet("players." + id)) {
            return true;
        }
        return false;
    }

    public boolean hasGuild() {
        if (getPlayerData().isSet("guild.guild")) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public NSGroup getGroup() {
        return group;
    }

    public NSGuild getGuild() {
        if (hasGuild()) {
            return guild;
        }
        return null;
    }

    public UUID getUuid() {
        return uuid;
    }

    private YML getPlayerYaml() {
        return new YML(this.id, this.config, "players");
    }

    private YML getIdYaml() {
        return new YML("ids", this.config);
    }

    private void loadPlayerData() {
        getPlayerYaml().loadFile();
    }

    private void savePlayerData() {
        getPlayerYaml().saveFile();
    }

    private FileConfiguration getPlayerData() {
        return getPlayerYaml().getConf();
    }

    private void loadIdFile() {
        getIdYaml().loadFile();
    }

    private void saveIdFile() {
        getIdYaml().saveFile();
    }

    private FileConfiguration getIdFile() {
        return getIdYaml().getConf();
    }
}
