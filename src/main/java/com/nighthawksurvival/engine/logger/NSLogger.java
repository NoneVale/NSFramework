package com.nighthawksurvival.engine.logger;

import org.bukkit.Bukkit;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by NoneVale on 11/9/2015.
 */
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
