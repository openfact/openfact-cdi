package org.openfact.services.resources.admin.info;

import javax.ws.rs.GET;

import org.openfact.representations.info.ServerInfoRepresentation;

public interface ServerInfoAdminResource {

    /**
     * Get themes, social providers, auth providers, and event listeners
     * available on this server
     *
     * @return
     */
    @GET
    public ServerInfoRepresentation getInfo();

}
