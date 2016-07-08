package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.EnvioRepresentation;

public interface EnvioAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    EnvioRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final EnvioRepresentation rep);

}
