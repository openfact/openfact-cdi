package org.openfact.services.resources.admin;


import org.openfact.representations.idm.FacturaRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public interface FacturaResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FacturaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(FacturaRepresentation rep);

    @POST
    @Path("enable")
    @Produces(MediaType.APPLICATION_JSON)
    public Response enable();

    @POST
    @Path("disable")
    @Produces(MediaType.APPLICATION_JSON)
    public Response disable();
}
