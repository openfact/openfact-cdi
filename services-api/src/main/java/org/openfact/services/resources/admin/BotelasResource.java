package org.openfact.services.resources.admin;

import org.openfact.representations.idm.EmisorRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
public interface BotelasResource {
    @Path("{idEmisor}")
    public EmisorResource emisor(@PathParam("idEmisor") String idEmisor);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(EmisorRepresentation rep);


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmisorRepresentation> getAll();

}
