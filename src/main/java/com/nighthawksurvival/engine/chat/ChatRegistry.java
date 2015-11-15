package com.nighthawksurvival.engine.chat;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

public class ChatRegistry extends Registry {

    @Override
    public Manager registers() {
        return new ChatManager();
    }
}
