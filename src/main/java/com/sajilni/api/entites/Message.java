package com.sajilni.api.entites;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@XmlRootElement
public @Data
class Message {
    private long id;
    private String message;
    private Date created;
    private String author;

    public Message(){}
    public Message(long id, String message,  String author) {
        this.id = id;
        this.message = message;
        this.created = new Date();
        this.author = author;
    }
}
