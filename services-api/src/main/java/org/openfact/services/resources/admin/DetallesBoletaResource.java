package org.openfact.services.resources.admin;

import org.openfact.models.BoletaModel;
import org.openfact.representations.idm.DetalleBoletaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
@Consumes(MediaType.APPLICATION_JSON)
public interface DetallesBoletaResource {

    @Path  ("{idDetalleBoleta}") DetalleBoletaResoure detalleBoleta(@PathParam("idDetalleBoleta") String idDetalleBoleta);
    @GET  @Produces (MediaType.APPLICATION_JSON) public List<DetalleBoletaRepresentation> getAll(BoletaModel b);

    @GET @Path("search") @Produces(MediaType.APPLICATION_JSON) SearchResultsRepresentation<DetalleBoletaRepresentation> search(
            SearchCriteriaRepresentation criteria);
}
