package com.nighthawksurvival.engine.yml;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;
import com.nighthawksurvival.engine.yml.YMLManager;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class YMLRegistry extends Registry {

    @Override
    public Manager registers() {
        return new YMLManager();
    }


}
