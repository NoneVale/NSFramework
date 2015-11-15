package com.nighthawksurvival.engine.json;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class JSONRegistry extends Registry {

    @Override
    public Manager registers() {
        return new JSONManager();
    }
}
