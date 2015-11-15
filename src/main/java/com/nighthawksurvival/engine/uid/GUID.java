package com.nighthawksurvival.engine.uid;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by NoneVale on 11/5/2015.
 */
public class GUID {

    private String id;

    private GUID(String id) {
        this.id = id;
    }

    public static String generateGameUniqueID() {
        int length = 18;
        String alphanum = "0123456789abcdefghijklmnopqrstuvwxyz0123456789";

        int res = alphanum.length();
        String result = new String();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            result = result + alphanum.charAt(random.nextInt(res));
        }

        String jointed = new StringBuilder(result)
                .insert(8, "-")
                .insert(13, "-")
                .insert(20, "")
                .toString();
        return jointed;
    }

    public static String generateGUIDFor(GUIDType type) {
        return generateGameUniqueID() + "-" + type.getName().toLowerCase();
    }

    public static GUID randomGUID() {
        return new GUID(generateGameUniqueID());
    }

    public String toString() {
        return id;
    }
}
