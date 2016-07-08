package org.openfact.services.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/emisores")
public interface EmisoresResource {

    @Path("{pais}-{razonSocial}")
    public PublicEmisorResource getEmisorResource(final @PathParam("pais") String pais,
            final @PathParam("razonSocial") String razonSocial);

}
