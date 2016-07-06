package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.EmisorRepresentation;

public interface EmisorResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public EmisorRepresentation toRepresentation();

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(EmisorRepresentation rep);

	@POST
	@Path("enable")
	@Produces(MediaType.APPLICATION_JSON)
	public Response enable();

	@POST
	@Path("disable")
	@Produces(MediaType.APPLICATION_JSON)
	public Response disable();
	
}
