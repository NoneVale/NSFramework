package com.nighthawksurvival.engine;

public class Registry {

    public Manager registers() {
        return new Manager();
    }

    public String getRegistryName() {
        return this.getClass().getSimpleName();
    }
}
