package com.sajilni.api;

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



}