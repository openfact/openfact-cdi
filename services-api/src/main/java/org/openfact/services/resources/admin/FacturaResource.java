package org.openfact.services.resources.admin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

import java.util.List;

public interface FacturaResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FacturaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update( FacturaRepresentation facturaRepresentation);

	@GET
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
	public List<EventoRepresentation> eventos();

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
	public Response downloadCdr();

	@Path("detalle") DetallesFacturaResource detallesFactura();
	@Path("envios") EnviosResource enviosResource();
}
