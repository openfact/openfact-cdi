package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.DetalleFacturaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

public interface FacturaAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    FacturaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final FacturaRepresentation facturaRepresentation);

    @GET
    @Path("send")
    @Produces(MediaType.APPLICATION_JSON)
    Response send();

    @GET
    @Path("status")
    @Produces(MediaType.APPLICATION_JSON)
    Response status();

    @GET
    @Path("eventos")
    @Produces(MediaType.APPLICATION_JSON)
    List<EventoRepresentation> eventos();

    @GET
    @Path("ubl")
    @Produces(MediaType.APPLICATION_JSON)
    Response downloadXml();

    @GET
    @Path("xls")
    @Produces(MediaType.APPLICATION_JSON)
    Response downloadXls();

    @GET
    @Path("pdf")
    @Produces(MediaType.APPLICATION_JSON)
    Response downloadPdf();

    @GET
    @Path("cdr")
    @Produces(MediaType.APPLICATION_JSON)
    Response downloadCdr();

    @GET
    @Path("detalles")
    @Produces(MediaType.APPLICATION_JSON)
    List<DetalleFacturaRepresentation> getAll();

}
