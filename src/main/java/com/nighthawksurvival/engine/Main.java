package com.nighthawksurvival.engine;

import com.nighthawksurvival.engine.logger.NSLogger;
import com.nighthawksurvival.engine.uid.GUID;
import com.nighthawksurvival.engine.uid.GUIDType;
import com.nighthawksurvival.game.frames.NSGroup;

import java.util.logging.Level;

public class Main {

    public static void main(String[] args) {
        String id = GUID.randomGUID().toString();
        NSLogger.logMessage(Level.INFO, "OUTPUT: " + GUID.generateGUIDFor(GUIDType.PLAYER).length());
        Engine engine = new Engine();

        NSLogger.logMessage(Level.INFO, NSGroup.valueOf("owner").getName());

    }


}
