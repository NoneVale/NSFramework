package com.nighthawksurvival.game;

import com.nighthawksurvival.engine.Engine;
import com.nighthawksurvival.engine.chat.ChatManager;
import com.nighthawksurvival.engine.chat.ChatRegistry;
import com.nighthawksurvival.engine.json.JSONManager;
import com.nighthawksurvival.engine.json.JSONRegistry;
import com.nighthawksurvival.engine.key.KeyManager;
import com.nighthawksurvival.engine.key.KeyRegistry;

public class NSEngine {

    public static Engine getEngine() {
        return new Engine();
    }

    public static ChatManager getChatManager() {
        return getEngine().getOnlineChatManager();
    }

    public static ChatRegistry getChatRegistry() {
        return getEngine().getChatRegistry();
    }

    public static JSONManager getJSONManager() {
        return getEngine().getJSONManager();
    }

    public static JSONRegistry getJSONRegistry() {
        return getEngine().getJSONRegistry();
    }

    public static KeyManager getKeyManager() {
        return getEngine().getKeyManager();
    }

    public static KeyRegistry getKeyRegistry() {
        return getEngine().getKeyRegistry();
    }
}
