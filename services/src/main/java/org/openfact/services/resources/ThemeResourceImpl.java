package org.openfact.services.resources;

import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

@Stateless
public class ThemeResourceImpl implements ThemeResource {

    @Override
    public Response getResource(String version, String themType, String themeName, String path) {
        // TODO Auto-generated method stub
        return null;
    }

}
