package com.nighthawksurvival.engine.key;

import com.google.common.collect.Lists;
import com.nighthawksurvival.engine.Manager;
import com.nighthawksurvival.engine.Registry;

import java.util.List;

/**
 * Created by NoneVale on 11/6/2015.
 */
public class KeyRegistry extends Registry {

    @Override
    public Manager registers() {
        return new KeyManager();
    }

    private List<String> keys = Lists.newArrayList();

    public KeyRegistry() {
        keys.add("7a16758a-c803-4719-8533-f698dec74bca");
        keys.add("fdb5303c-447e-42d5-82fa-9e7e4f035ffd");
        keys.add("83cc24b8-2859-4b35-a357-c8aab0b8e6d9");
        keys.add("6f1a7b1f-88ff-4604-a69f-81c99aeec5e7");
        keys.add("ad11a402-dbee-4a5e-bb4d-b73417734bfc");
        keys.add("c6f8036b-8453-4f63-85cc-d04d00aee14a");
        keys.add("4f29579e-6803-4ac7-ae88-1613c4b94e04");
        keys.add("c56dec61-9276-45c8-9f1f-88eceb78cb5b");
        keys.add("96cd025c-9a51-4e19-8640-02e59ecf7634");
        keys.add("01d24303-8dc3-4823-a91e-b00a96c31059");
        keys.add("eca1e840-28f9-4a8c-be7b-2b6d23edb315");
        keys.add("f28e4eb4-66bf-4a0c-8b69-077587c5f91f");
        keys.add("this-is-the-beta-key");
    }

    public boolean isRegistered(String key) {
        return keys.contains(key);
    }
}
