package com.nighthawksurvival.engine.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NSLogger {

    public static void logMessage(Level level, String message) {
        Logger logger = Logger.getLogger("Nighthawk Survival");

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new LogFormatter());

        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);

        logger.log(level, message);

        logger.removeHandler(consoleHandler);

        logger.setUseParentHandlers(true);

    }
}
