package com.Restful;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by DANCO on 06/04/2017.
 */
@Path("/hello")
public class HelloWorldService {
    @GET
    @Path("/dan")
    public Response TestStudent() {

        String output = "DAN says :WELCOMfhjfjE ";

        return Response.status(200).entity(output).build();

    }
}
