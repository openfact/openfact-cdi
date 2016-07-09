package org.openfact.services.resources.admin;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Properties;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.services.managers.AppAuthManager;

public class AdminConsoleImpl implements AdminConsole {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    public AdminConsoleImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }

    @Override
    public Response config() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response whoAmI(HttpHeaders headers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response logout() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response getMainPage() throws URISyntaxException, IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response getIndexHtmlRedirect() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Properties getMessages(String lang) {
        // TODO Auto-generated method stub
        return null;
    }

}
