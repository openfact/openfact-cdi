package org.openfact.services.resources.admin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.DetalleNotaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.NotaRepresentation;

import java.util.List;

public interface NotaAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    NotaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final NotaRepresentation rep);

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
    Response downloadXl();

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
    List<DetalleNotaRepresentation> getALL();

}
