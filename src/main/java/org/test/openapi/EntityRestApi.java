package org.test.openapi;

import org.test.openapi.rest.EntityApi;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.UUID;

//@Path("/api/private") //java.lang.StackOverflowError
//@Path("/hello") //successful build
@Path("/hello/quarkus") //successful build
public class EntityRestApi implements EntityApi {

    @POST
    @Path("/entityset/perform")
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public String perform(@QueryParam("id") final UUID id) {
        return "response";
    }
}