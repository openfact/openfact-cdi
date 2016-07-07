package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;
import org.openfact.models.FacturaModel;
import org.openfact.representations.idm.DetalleFacturaRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by AHREN on 07/07/2016.
 */
@Consumes(MediaType.APPLICATION_JSON)
public interface DetallesFacturaResource {
    @Path("{idDetalleFactura}") DetalleFacturaResource detalleFactura(@PathParam("idDetalleFactura") String idDetalleFactura);
    @GET @Produces(MediaType.APPLICATION_JSON) public List<DetalleFacturaRepresentation> getAll(FacturaModel f);

    @GET @Path("search") @Produces(MediaType.APPLICATION_JSON) SearchResultsRepresentation<DetalleFacturaRepresentation> search(
            SearchCriteriaRepresentation criteria);
}
