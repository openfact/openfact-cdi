package org.openfact.services.resources.admin;

import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Consumes(MediaType.APPLICATION_JSON)
public interface BoletasResource {

	@Path("{idBoleta}")
	public BoletaResource botela(@PathParam("idBoleta") String idBoleta);

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Response create(BotelaRepresentation rep);

	@GET
	@Path("importar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response importar(List<BotelaRepresentation> rep);

	@GET
	@Path("search")
	@Produces(MediaType.APPLICATION_JSON)
	public SearchResultsRepresentation<BotelaRepresentation> search(SearchCriteriaRepresentation criterial);

}
