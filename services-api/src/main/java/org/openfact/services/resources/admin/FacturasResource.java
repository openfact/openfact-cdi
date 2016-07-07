package org.openfact.services.resources.admin;

import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
@Path("/facturas")
@Consumes(MediaType.APPLICATION_JSON)
public interface FacturasResource {
    @Path("{idFactura}")
    public FacturaResource factura(@PathParam("idFactura") String idFactura);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response createFactura(FacturaRepresentation rep);

    @POST
    @Path("importar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response createFacturas(List<FacturaRepresentation> rep);

    @POST
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    public SearchResultsRepresentation<FacturaRepresentation> search( SearchCriteriaRepresentation criteria);
}
