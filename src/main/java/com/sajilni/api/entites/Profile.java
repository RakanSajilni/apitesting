package com.sajilni.api.entites;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
@Data
@XmlRootElement
public class Profile {
    private long id;
    private String profileName;
    private String lastName;
    private Date created;
    public Profile(){

    }

    public Profile(long id, String profileName, String lastName) {
        this.id = id;
        this.profileName = profileName;
        this.lastName = lastName;
        this.created = new Date();
    }
}
