package com.sajilni.api;

import com.sajilni.api.database.DatabaseClass;
import com.sajilni.api.entites.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App {
    @GET
    public String getMessage() {
        return "<h1>Hello world!</h1><br/>" +
                "<a href=\"/messages\">Go to welcome</a>"
                + "<br />"
                + "<a href=\"/profiles\">Go to profiles</a>";
    }

    public static void main(String[] args) {
        for (Message message : DatabaseClass.getMessages().values()) {
            System.out.println(message);
        }
    }

}