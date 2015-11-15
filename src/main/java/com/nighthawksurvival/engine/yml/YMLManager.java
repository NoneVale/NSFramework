package com.nighthawksurvival.engine.yml;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;
import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class YMLManager extends Manager {

    public YML getYaml(String file, FileConfiguration config) {
        return new YML(file, config);
    }

    @Override
    public Registry getRegistry() {
        return new YMLRegistry();
    }

}
