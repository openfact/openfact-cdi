package org.openfact.services.resources.admin;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.openfact.services.resources.admin.info.ServerInfoAdminResourceImpl;

public class AdminRootImpl implements AdminRoot {

    @Override
    public Response masterEmisorAdminConsoleRedirect() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response masterEmisorAdminConsoleRedirectHtml() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdminConsole getAdminConsole(String codigoPais, String razonSocial) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EmisoresAdminResource getEmidoresAdmin(HttpHeaders headers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CommonsAdminResource getCommonsResource(HttpHeaders headers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ServerInfoAdminResourceImpl getServerInfo(HttpHeaders headers) {
        // TODO Auto-generated method stub
        return null;
    }

}
