package com.sajilni.api.database;

import com.sajilni.api.entites.Message;
import com.sajilni.api.entites.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    static {
        messages.put(1L, new Message(1L, "Wake up", "Rakan"));
        messages.put(2L, new Message(2L, "Wake up", "Ahmad"));
        messages.put(3L, new Message(3L, "Wake up", "Aljamal"));
        messages.put(4L, new Message(4L, "Wake up", "Rakan"));
        messages.put(5L, new Message(5L, "Wake up", "Ahmad"));
        messages.put(6L, new Message(6L, "Wake up", "Aljamal"));
        messages.put(7L, new Message(7L, "Wake up", "Rakan"));
        messages.put(8L, new Message(8L, "Wake up", "Ahmad"));
        messages.put(9L, new Message(9L, "Wake up", "Aljamal"));
        messages.put(10L, new Message(10L, "Wake up", "Rakan"));
        messages.put(11L, new Message(11L, "Wake up", "Ahmad"));
        messages.put(12L, new Message(12L, "Wake up", "Aljamal"));
        profiles.put("Rakan", new Profile(1L, "Rakan", "Rakan", "Aljamal"));
    }

    public static Map<Long, Message> getMessages() {
        return messages;
    }


    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
