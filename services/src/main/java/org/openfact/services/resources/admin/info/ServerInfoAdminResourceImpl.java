package org.openfact.services.resources.admin.info;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;

import org.openfact.models.OpenfactSession;
import org.openfact.representations.info.MemoryInfoRepresentation;
import org.openfact.representations.info.ServerInfoRepresentation;
import org.openfact.representations.info.SystemInfoRepresentation;

@Stateless
public class ServerInfoAdminResourceImpl implements ServerInfoAdminResource {

    @Inject
    private OpenfactSession session;

    @GET
    public ServerInfoRepresentation getInfo() {
        ServerInfoRepresentation info = new ServerInfoRepresentation();
        info.setSystemInfo(SystemInfoRepresentation.create(System.currentTimeMillis()));
        info.setMemoryInfo(MemoryInfoRepresentation.create());
        return info;
    }

}
