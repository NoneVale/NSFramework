package com.nighthawksurvival.game.util;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.WorldCreator;

/**
 * Created by NoneVale on 11/13/2015.
 */
public class NSWorld {

    private World world;

    public NSWorld(String world) {
        new NSWorld(Bukkit.getWorld(world));
    }

    public NSWorld(Location location) {
        new NSWorld(location.getWorld());
    }

    public NSWorld(World world) {
        this.world = world;
    }

    public void setWorld(World world) {
        world = Bukkit.createWorld(new WorldCreator("Hey"));
    }
}
