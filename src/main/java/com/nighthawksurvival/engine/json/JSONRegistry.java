package com.nighthawksurvival.engine.json;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

public class JSONRegistry extends Registry {

    @Override
    public Manager registers() {
        return new JSONManager();
    }
}
