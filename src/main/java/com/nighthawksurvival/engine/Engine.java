package com.nighthawksurvival.engine;

import com.nighthawksurvival.engine.chat.ChatManager;
import com.nighthawksurvival.engine.chat.ChatRegistry;
import com.nighthawksurvival.engine.json.JSONManager;
import com.nighthawksurvival.engine.json.JSONRegistry;
import com.nighthawksurvival.engine.key.KeyManager;
import com.nighthawksurvival.engine.logger.LogFormatter;
import com.nighthawksurvival.engine.key.KeyRegistry;
import com.nighthawksurvival.engine.registry.ManagerRegistry;
import com.nighthawksurvival.engine.sql.SQLManager;
import com.nighthawksurvival.engine.yml.YMLManager;

import java.util.UUID;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class Engine {

    private Engine engine;
    private UUID uuid;
    private YMLManager ymlManager;
    private SQLManager sqlManager;
    private JSONManager jsonManager;
    private ChatManager chatManager;
    private KeyManager keyManager;
    private Manager manager;
    private ManagerRegistry registry;
    private Logger logger;
    private KeyRegistry keyRegistry;
    private ChatRegistry chatRegistry;
    private JSONRegistry jsonRegistry;
    private boolean fileCreation;

    public Engine() {
        this.engine = this;
        this.sqlManager = new SQLManager();
        this.jsonManager = new JSONManager();
        this.chatManager = new ChatManager();
        this.keyManager = new KeyManager();
        this.manager = new Manager();
        this.registry = new ManagerRegistry();
        this.ymlManager = new YMLManager();
        this.keyRegistry = new KeyRegistry();
        this.chatRegistry = new ChatRegistry();
        this.jsonRegistry = new JSONRegistry();
        this.fileCreation = true;

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new LogFormatter());

        logger = Logger.getLogger("Nighthawk Survival");
        logger.setUseParentHandlers(false);
        logger.addHandler(consoleHandler);
    }

    public UUID getUniqueID() {
        return uuid;
    }

    public Engine getEngine() {
        return this;
    }

    public Manager getManager() {
        return manager;
    }

    public YMLManager getYMLManager() {
        return ymlManager;
    }

    public SQLManager getSQLManager() {
        return sqlManager;
    }

    public JSONManager getJSONManager() {
        return jsonManager;
    }

    public ChatManager getOnlineChatManager() {
        return chatManager;
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public ManagerRegistry getManagerRegistry() {
        return registry;
    }

    public KeyRegistry getKeyRegistry() {
        return keyRegistry;
    }

    public Logger getLogger() {
        return logger;
    }

    public boolean tryFileCreation() {
        return fileCreation;
    }

    public ChatRegistry getChatRegistry() {
        return chatRegistry;
    }

    public JSONRegistry getJSONRegistry() {
        return jsonRegistry;
    }

}
