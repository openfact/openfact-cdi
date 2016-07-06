package org.openfact.services.resources.admin;


import org.openfact.representations.idm.DetalleFacturaRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public interface FacturaResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public FacturaRepresentation toRepresentation();

    @GET
    @Path("send")
    @Produces(MediaType.APPLICATION_JSON)
    public Response send();

    @GET
    @Path("estatus")
    @Produces(MediaType.APPLICATION_JSON)
    public Response status();

    @GET
    @Path("chart")
    @Produces(MediaType.APPLICATION_JSON)
    public Response chart();

    @GET
    @Path("xml")
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

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void update(FacturaRepresentation facturaRepresentation);

}
