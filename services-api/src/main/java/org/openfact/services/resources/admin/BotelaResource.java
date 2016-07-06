package org.openfact.services.resources.admin;

import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
public interface BotelaResource {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public BotelaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(EmisorRepresentation rep);

    @POST
    @Path("enable")
    @Produces(MediaType.APPLICATION_JSON)
    public Response enable();

    @POST
    @Path("disable")
    @Produces(MediaType.APPLICATION_JSON)
    public Response disable();
}
