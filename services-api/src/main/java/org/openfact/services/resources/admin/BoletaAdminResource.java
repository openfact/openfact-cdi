package org.openfact.services.resources.admin;

import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import org.openfact.representations.idm.BoletaRepresentation;

public interface BoletaAdminResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public BoletaRepresentation toRepresentation();

//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	public void update(BoletaRepresentation boletaRepresentation);
@PUT
@Consumes(MediaType.APPLICATION_JSON)
void update(final BoletaRepresentation rep);
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

	@Path("detalle") DetallesBoletaResource detallesBoleta();
	@Path("envios") EnviosResource enviosResource();


}
