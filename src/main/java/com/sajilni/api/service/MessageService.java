package com.sajilni.api.service;

import com.sajilni.api.database.DatabaseClass;
import com.sajilni.api.entites.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageService {
    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {
        messages.put(1l,new Message(1l,"Wake up","Rakan"));
        messages.put(2l,new Message(2l,"Wake up","Ahmad"));
        messages.put(3l,new Message(3l,"Wake up","Aljamal"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setId(messages.size()+1);
        messages.put(message.getId(),message);
        return message;
    }
    public Message removeMessage(long id){
        return messages.remove(id);
    }
    public Message updateMessage(Message message){
        if(message.getId()<=0){
            return null;
        }
        messages.put(message.getId(),message);
        return message;
    }

}
