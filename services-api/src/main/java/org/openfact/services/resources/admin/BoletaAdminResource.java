package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.BoletaRepresentation;

public interface BoletaAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    BoletaRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final BoletaRepresentation rep);

}
