package com.nighthawksurvival.engine.registry;

import com.nighthawksurvival.engine.Engine;
import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;
import com.nighthawksurvival.engine.chat.ChatManager;
import com.nighthawksurvival.engine.json.JSONManager;
import com.nighthawksurvival.engine.key.KeyManager;
import com.nighthawksurvival.engine.sql.SQLManager;
import com.nighthawksurvival.engine.uid.GUIDManager;
import com.nighthawksurvival.engine.yml.YMLManager;

import java.util.ArrayList;
import java.util.List;

public class ManagerRegistry extends Registry {

    @Override
    public Manager registers() {
        return new Manager();
    }

    private List<Manager> managers = new ArrayList<Manager>();
    private Engine engine;

    public ManagerRegistry() {
        managers.add(new ChatManager());
        managers.add(new JSONManager());
        managers.add(new KeyManager());
        managers.add(new SQLManager());
        managers.add(new GUIDManager());
        managers.add(new YMLManager());
    }

    public Manager getManager(Class clazz) {
        for (Manager manager : this.managers) {
            if (manager.getClass() == clazz) {
                if (new Engine().getKeyRegistry().isRegistered(manager.getKey())) {
                    return manager;
                }
                return null;
            }
        }
        return null;
    }

    public Class getClazz(Manager manager) {
        if (new Engine().getKeyRegistry().isRegistered(manager.getKey())) {
            return manager.getClass();
        }
        return null;
    }

    public Manager getManagerByName(String name) throws IllegalAccessException, InstantiationException {
        for (Manager manager : this.managers) {
            System.out.println("1");
            if (new  Engine().getKeyRegistry().isRegistered(manager.getKey())) {
                System.out.println("2");
                if (manager.getClass().newInstance().getName() == name) {
                    System.out.println("3");
                    return manager;
                }
            }
            return null;
        }
        return null;
    }
}
