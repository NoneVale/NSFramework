package com.nighthawksurvival.engine.sql;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class SQLRegistry extends Registry {

    @Override
    public Manager registers() {
        return new SQLManager();
    }
}
