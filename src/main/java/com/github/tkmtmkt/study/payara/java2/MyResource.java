package com.github.tkmtmkt.study.payara.java2;

import java.io.File;
import java.util.ResourceBundle;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class MyResource {
    @GET
    @Produces("text/plain")
    public String get() {
        ResourceBundle rb = ResourceBundle.getBundle("message");
        String message = rb.getString("message");

        File file = new File(".");
        message += "\n" + file.getAbsolutePath();

        return message;
    }
}
