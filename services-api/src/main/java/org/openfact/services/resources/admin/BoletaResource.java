package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface BoletaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public BoletaRepresentation toRepresentation();

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(BoletaRepresentation rep);

}
