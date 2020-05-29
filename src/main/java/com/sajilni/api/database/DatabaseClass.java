package com.sajilni.api.database;

import com.sajilni.api.entites.Message;
import com.sajilni.api.entites.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<Long, Message>();
    private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();

    public static Map<Long, Message> getMessages() {
        return messages;

    }

    public static Map<Long, Profile> getProfiles() {
        return profiles;
    }
}
