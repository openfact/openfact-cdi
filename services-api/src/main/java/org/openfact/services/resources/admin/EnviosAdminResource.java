package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.EnvioRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Consumes(MediaType.APPLICATION_JSON)
public interface EnviosAdminResource {

    @Path("{idEnvio}")
    EnvioAdminResource envio(@PathParam("idEnvio") final String idEnvio);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    Response create(final EnvioRepresentation rep);

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    SearchResultsRepresentation<EnvioRepresentation> search(final SearchCriteriaRepresentation criterial);

}
