package com.nighthawksurvival.engine.chat;

import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class ChatRegistry extends Registry {

    @Override
    public Manager registers() {
        return new ChatManager();
    }
}
