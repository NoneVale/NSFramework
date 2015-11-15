package com.nighthawksurvival.engine.yml;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

public class YMLRegistry extends Registry {

    @Override
    public Manager registers() {
        return new YMLManager();
    }


}
