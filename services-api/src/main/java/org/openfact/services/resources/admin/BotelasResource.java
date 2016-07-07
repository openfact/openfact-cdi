package org.openfact.services.resources.admin;

import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
@Path("/botelas")
@Consumes(MediaType.APPLICATION_JSON)
public interface BotelasResource {
    @Path("{idBoleta}")
    public BotelaResource botela(@PathParam("idBoleta") String idBoleta);

    @POST
    @Path("saveboleta")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createBoleta(BotelaRepresentation rep);


    @GET
    @Path("saveboletas")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createBoletas(List<BotelaRepresentation> rep);

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public SearchResultsRepresentation<BotelaRepresentation> search(SearchCriteriaRepresentation criterial);
}
