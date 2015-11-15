package com.nighthawksurvival.engine;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class Registry {

    public Manager registers() {
        return new Manager();
    }

    public String getRegistryName() {
        return this.getClass().getSimpleName();
    }
}
