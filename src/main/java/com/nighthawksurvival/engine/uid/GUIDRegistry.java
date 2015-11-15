package com.nighthawksurvival.engine.uid;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class GUIDRegistry extends Registry {

    @Override
    public Manager registers() {
        return new GUIDManager();
    }

    public void register(GUID guid) {

    }
}
