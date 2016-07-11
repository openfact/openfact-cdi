package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
public interface BoletasAdminResource {

    @Path("{idBoleta}")
    BoletaAdminResource botela(@PathParam("idBoleta") final String idBoleta);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    Response create(final BoletaRepresentation rep);

    @GET
    @Path("importar")
    @Produces(MediaType.APPLICATION_JSON)
    Response importar(final List<BoletaRepresentation> rep);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BoletaRepresentation> getAll();

    @GET
    @Path("boletas")
    @Produces(MediaType.APPLICATION_JSON)
    public List<BoletaRepresentation> getAll(EmisorModel e);

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    SearchResultsRepresentation<BoletaRepresentation> search(final SearchCriteriaRepresentation criteria );

}
