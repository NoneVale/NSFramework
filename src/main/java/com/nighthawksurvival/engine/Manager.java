package com.nighthawksurvival.engine;

import com.nighthawksurvival.engine.key.Key;
import com.nighthawksurvival.engine.registry.ManagerRegistry;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class Manager {

    private Manager manager;
    private Key key;

    public Manager() {
        this.manager = this;
    }
    
    public String getName() {
        return getClass().getSimpleName();
    }

    public String getKey() {
        return "7a16758a-c803-4719-8533-f698dec74bca";
    }

    public Registry getRegistry() {
        return new ManagerRegistry();
    }
}
