package org.openfact.services.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/organizations")
public interface OrganizationsResource {

	@Path("{organization}")
	public PublicOrganizationResource getOrganizationResource(final @PathParam("organization") String name);

}
