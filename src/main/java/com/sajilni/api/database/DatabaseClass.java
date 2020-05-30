package com.sajilni.api.database;

import com.sajilni.api.entites.Message;
import com.sajilni.api.entites.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {
    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();
    static {
        messages.put(1L,new Message(1L,"Wake up","Rakan"));
        messages.put(2L,new Message(2L,"Wake up","Ahmad"));
        messages.put(3L,new Message(3L,"Wake up","Aljamal"));
        profiles.put("Rakan",new Profile(1L,"Rakan","Rakan","Aljamal"));
    }
    public static Map<Long, Message> getMessages() {
        return messages;
    }



    public static Map<String, Profile> getProfiles() {
        return profiles;
    }
}
