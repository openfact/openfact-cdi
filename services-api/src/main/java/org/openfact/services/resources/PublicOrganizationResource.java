package org.openfact.services.resources;

import org.jboss.resteasy.annotations.cache.NoCache;
import org.openfact.representations.idm.PublishedOrganizationRepresentation;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Resource class for public realm information
 */
public interface PublicOrganizationResource {

	/**
	 * CORS preflight
	 *
	 * @return
	 */
	@Path("/")
	@OPTIONS
	public Response accountPreflight();

	/**
	 * Public information about the realm.
	 *
	 * @return
	 */
	@GET
	@NoCache
	@Produces(MediaType.APPLICATION_JSON)
	public PublishedOrganizationRepresentation getOrganization();

}
