package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.FacturaRepresentation;

public interface FacturaResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public FacturaRepresentation toRepresentation();

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void update(FacturaRepresentation facturaRepresentation);

	/*@GET
	@Path("send")
	@Produces(MediaType.APPLICATION_JSON)
	public Response send();

	@GET
	@Path("status")
	@Produces(MediaType.APPLICATION_JSON)
	public Response status();

	@GET
	@Path("eventos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FacturaRepresentation, eventorepresentation> eventos();

	@GET
	@Path("ubl")
	@Produces(MediaType.APPLICATION_JSON)
	public Response downloadXml();

	@GET
	@Path("xls")
	@Produces(MediaType.APPLICATION_JSON)
	public Response downloadXls();

	@GET
	@Path("pdf")
	@Produces(MediaType.APPLICATION_JSON)
	public Response downloadPdf();

	@GET
	@Path("cdr")
	@Produces(MediaType.APPLICATION_JSON)
	public Response downloadCdr();*/

}
