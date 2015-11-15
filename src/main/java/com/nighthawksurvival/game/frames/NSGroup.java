package com.nighthawksurvival.game.frames;

import net.md_5.bungee.api.ChatColor;

/**
 * Created by NoneVale on 11/14/2015.
 */
public class NSGroup {

    public static final NSGroup GUEST = new NSGroup("Guest", "GRAY");
    public static final NSGroup MEMBER = new NSGroup("Member", "YELLOW");
    public static final NSGroup BUILDER = new NSGroup("Builder", "GREEN");
    public static final NSGroup MOD = new NSGroup("Mod", "DARK_AQUA");
    public static final NSGroup ADMIN = new NSGroup("Admin", "RED");
    public static final NSGroup OWNER = new NSGroup("Owner", "DARK_GREEN");

    private String name;
    private String color;

    public NSGroup(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public static NSGroup valueOf(String name) {
        NSGroup[] groups = new NSGroup[] {
                GUEST, MEMBER, BUILDER, MOD, ADMIN, OWNER
        };
        for (NSGroup group : groups) {
            if (group.getName().toLowerCase().equals(name.toLowerCase())) {
                return group;
            }
        }
        return null;
    }
}
