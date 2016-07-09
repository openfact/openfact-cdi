package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.NotaRepresentation;

public interface NotaAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    NotaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final NotaRepresentation rep);

}
