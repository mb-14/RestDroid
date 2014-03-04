package com.mb14;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class RestDroid extends ServerResource{

    @Get
    public String getMessage() {
        return "abcd";
    }
}
