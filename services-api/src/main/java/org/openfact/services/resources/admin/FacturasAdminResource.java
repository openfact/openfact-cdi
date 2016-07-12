package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Consumes(MediaType.APPLICATION_JSON)
public interface FacturasAdminResource {

    @Path("{idFactura}")
    FacturaAdminResource factura(@PathParam("idFactura") String idFactura);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    Response create(final FacturaRepresentation rep);

    @POST
    @Path("importar")
    @Produces(MediaType.APPLICATION_JSON)
    Response importar(final List<FacturaRepresentation> rep);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FacturaRepresentation> getAll();

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    SearchResultsRepresentation<FacturaRepresentation> search(final SearchCriteriaRepresentation criteria);

}
