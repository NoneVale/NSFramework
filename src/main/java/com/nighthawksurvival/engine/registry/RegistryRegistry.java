package com.nighthawksurvival.engine.registry;

import com.google.common.collect.Lists;
import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;
import com.nighthawksurvival.engine.chat.ChatRegistry;
import com.nighthawksurvival.engine.json.JSONRegistry;
import com.nighthawksurvival.engine.key.KeyRegistry;
import com.nighthawksurvival.engine.sql.SQLRegistry;
import com.nighthawksurvival.engine.uid.GUIDRegistry;
import com.nighthawksurvival.engine.yml.YMLRegistry;

import java.util.List;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class RegistryRegistry extends Registry {

    private List<Registry> registries = Lists.newArrayList();

    public RegistryRegistry() {
        this.registries.add(new ChatRegistry());
        this.registries.add(new JSONRegistry());
        this.registries.add(new KeyRegistry());
        this.registries.add(new ManagerRegistry());
        this.registries.add(new SQLRegistry());
        this.registries.add(new GUIDRegistry());
        this.registries.add(new YMLRegistry());
    }

    public Registry getRegistry(Manager manager) {
        for (Registry registry : this.registries) {
            System.out.println("1");
            if (new KeyRegistry().isRegistered(manager.getKey())) {
                System.out.println("2");
                if (manager.getRegistry().equals(registry)) {
                    System.out.println("3");
                    return registry;
                }
            }
        }
        return null;
    }
}
