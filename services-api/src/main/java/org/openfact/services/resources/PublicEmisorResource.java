package org.openfact.services.resources;

import org.jboss.resteasy.annotations.cache.NoCache;
import org.openfact.representations.idm.PublishedEmisorRepresentation;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Resource class for public emisor information
 */
public interface PublicEmisorResource {

    /**
     * CORS preflight
     *
     * @return
     */
    @Path("/")
    @OPTIONS
    public Response accountPreflight();

    /**
     * Public information about the emisor.
     *
     * @return
     */
    @GET
    @NoCache
    @Produces(MediaType.APPLICATION_JSON)
    public PublishedEmisorRepresentation getEmisor();

}
