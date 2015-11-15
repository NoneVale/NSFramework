package com.nighthawksurvival.engine.sql;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

public class SQLRegistry extends Registry {

    @Override
    public Manager registers() {
        return new SQLManager();
    }
}
