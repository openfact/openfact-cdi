package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.DetalleBoletaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Consumes(MediaType.APPLICATION_JSON)
public interface DetallesBoletaResource {

    @Path("{idDetalleBoleta}")
    DetalleBoletaResoure detalleBoleta(@PathParam("idDetalleBoleta") String idDetalleBoleta);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DetalleBoletaRepresentation> getAll();

    @GET
    @Path("search")
    @Produces(MediaType.APPLICATION_JSON)
    SearchResultsRepresentation<DetalleBoletaRepresentation> search(SearchCriteriaRepresentation criteria);
}
