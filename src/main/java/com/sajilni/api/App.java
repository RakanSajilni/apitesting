package com.sajilni.api;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class App extends Application {
    @GET
    public String getMessage() {
        return "<h1>Hello world!</h1><br/>" +
                "<a href=\"/messages\">Go to welcome</a>";
    }

    public void start(Stage primaryStage) throws Exception {

    }
}