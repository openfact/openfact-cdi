package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;
import org.openfact.common.ClientConnection;
import org.openfact.models.EmisorModel;
import org.openfact.services.managers.EmisorManager;
import org.openfact.services.resources.admin.info.ServerInfoAdminResourceImpl;

@Stateless
public class AdminRootImpl implements AdminRoot {

    @Inject
    private EmisorManager emisorManager;

    @Context
    protected UriInfo uriInfo;

    @Context
    protected ClientConnection clientConnection;

    @Context
    protected HttpRequest request;

    @Context
    protected HttpResponse response;

    @Inject
    protected AdminConsole adminConsole;

    @Inject
    protected CommonsAdminResource commonsAdminResource;

    @Override
    public Response masterEmisorAdminConsoleRedirect() {
        EmisorModel master = emisorManager.getOpenfactAdminstrationEmisor();
        return Response.status(302)
                .location(uriInfo.getBaseUriBuilder().path(AdminRoot.class)
                        .path(AdminRoot.class, "getAdminConsole").path("/")
                        .build(master.getPais() + "-" + master.getRazonSocial()))
                .build();
    }

    @Override
    public Response masterEmisorAdminConsoleRedirectHtml() {
        return masterEmisorAdminConsoleRedirect();
    }

    protected EmisorModel locateEmisor(String codigoPais, String razonSocial, EmisorManager emisorManager) {
        EmisorModel emisor = emisorManager.getEmisorByPaisRazonSocial(codigoPais, razonSocial);
        if (emisor == null) {
            throw new NotFoundException("Emisor not found.  Did you type in a bad URL?");
        }
        return emisor;
    }

    @Override
    public AdminConsole getAdminConsole(String codigoPais, String razonSocial) {
        EmisorModel realm = locateEmisor(codigoPais, razonSocial, emisorManager);
        return adminConsole;
        error
        // AdminConsole service = new AdminConsole(realm);
        // return service;
    }

    @Override
    public EmisoresAdminResource getEmidoresAdmin(HttpHeaders headers) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public CommonsAdminResource getCommonsResource(HttpHeaders headers) {
        return commonsAdminResource;
    }

    @Override
    public ServerInfoAdminResourceImpl getServerInfo(HttpHeaders headers) {
        /*
         * handlePreflightRequest();
         * 
         * AdminAuth auth = authenticateRealmAdminRequest(headers); if
         * (!isAdmin(auth)) { throw new ForbiddenException(); }
         * 
         * if (auth != null) { logger.debug("authenticated admin access for: " +
         * auth.getUser().getUsername()); }
         * 
         * Cors.add(request).allowedOrigins(auth.getToken()).allowedMethods(
         * "GET", "PUT", "POST", "DELETE") .auth().build(response);
         * 
         * ServerInfoAdminResource adminResource = new
         * ServerInfoAdminResource();
         * ResteasyProviderFactory.getInstance().injectProperties(adminResource)
         * ; return adminResource;
         */
        return null;
    }

}
