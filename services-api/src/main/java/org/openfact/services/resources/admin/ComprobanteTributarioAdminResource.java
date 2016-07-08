package org.openfact.services.resources.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.openfact.representations.idm.ComprobanteTributarioRepresentation;

public interface ComprobanteTributarioAdminResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    ComprobanteTributarioRepresentation toRepresentation();

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void update(final ComprobanteTributarioRepresentation rep);

}
