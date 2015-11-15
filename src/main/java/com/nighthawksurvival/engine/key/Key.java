package com.nighthawksurvival.engine.key;

import com.nighthawksurvival.engine.Engine;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class Key {

    private Key key;
    private String address;

    public Key() {
        this.key = this;
        this.address = this.key.toString();
    }

    public Key getKey() {
        return this.key;
    }

    public String getAddress() {
        return address;
    }

    public boolean validateKey(String key) {
        return new Engine().getKeyRegistry().isRegistered(key);
    }
}
