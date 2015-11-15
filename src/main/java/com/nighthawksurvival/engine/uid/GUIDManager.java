package com.nighthawksurvival.engine.uid;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class GUIDManager extends Manager {

    @Override
    public Registry getRegistry() {
        return new GUIDRegistry();
    }

    public void manage(GUID guid) {

    }

    public GUID newGUID() {
        return GUID.randomGUID();
    }

    public void register(GUID guid) {
        new GUIDRegistry().register(guid);
    }
}
