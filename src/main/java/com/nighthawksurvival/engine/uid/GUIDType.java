package com.nighthawksurvival.engine.uid;

public class GUIDType {

    public static GUIDType PLAYER = new GUIDType("PLAYER");
    public static GUIDType GUILD = new GUIDType("GUILD");
    public static GUIDType ABILITY = new GUIDType("ABILITY");
    public static GUIDType BOT = new GUIDType("BOT");

    private String name;

    private GUIDType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
