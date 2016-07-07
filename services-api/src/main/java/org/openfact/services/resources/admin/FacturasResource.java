package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON) public interface FacturasResource {

    @Path("{idFactura}") FacturaResource factura(@PathParam("idFactura") String idFactura);

    @POST @Produces(MediaType.APPLICATION_JSON) Response create(FacturaRepresentation rep);

    @POST @Path("importar") @Produces(MediaType.APPLICATION_JSON) Response importar(
            List<FacturaRepresentation> rep);

    @GET @Produces(MediaType.APPLICATION_JSON) public List<FacturaRepresentation> getAll(EmisorModel e);

    @GET @Path("search") @Produces(MediaType.APPLICATION_JSON) SearchResultsRepresentation<FacturaRepresentation> search(
            SearchCriteriaRepresentation criteria);

}
