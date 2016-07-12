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
import org.jboss.resteasy.spi.NoLogWebApplicationException;
import org.openfact.common.ClientConnection;
import org.openfact.models.EmisorModel;
import org.openfact.models.OpenfactSession;
import org.openfact.services.managers.EmisorManager;
import org.openfact.services.resources.Cors;
import org.openfact.services.resources.admin.info.ServerInfoAdminResourceImpl;
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
    protected EmisoresAdminResource emisoresAdminResource;

    @Inject
    protected CommonsAdminResource commonsAdminResource;

    @Inject
    protected ServerInfoAdminResourceImpl serverInfoAdminResource;
    
    @Inject
    protected OpenfactSession session;

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
        EmisorModel emisor = locateEmisor(codigoPais, razonSocial, emisorManager);
        session.getContext().setEmisor(emisor);
        return adminConsole;
    }

    // Proteger este endpoint
    @Override
    public EmisoresAdminResource getEmisoresAdmin(HttpHeaders headers) {
        handlePreflightRequest();

        /*
         * AdminAuth auth = authenticateRealmAdminRequest(headers); if (auth !=
         * null) { logger.debug("authenticated admin access for: " +
         * auth.getUser().getUsername()); }
         */

        Cors.add(request).allowedOrigins("*").allowedMethods("GET", "PUT", "POST", "DELETE").auth()
                .build(response);
        return emisoresAdminResource;
    }

    @Override
    public CommonsAdminResource getCommonsResource(HttpHeaders headers) {
        handlePreflightRequest();
        return commonsAdminResource;
    }

    @Override
    public ServerInfoAdminResourceImpl getServerInfo(HttpHeaders headers) {
        handlePreflightRequest();

        /*
         * AdminAuth auth = authenticateRealmAdminRequest(headers); if
         * (!isAdmin(auth)) { throw new ForbiddenException(); }
         */

        Cors.add(request).allowedOrigins("*").allowedMethods("GET", "PUT", "POST", "DELETE").auth()
                .build(response);

        return serverInfoAdminResource;
    }

    protected void handlePreflightRequest() {
        if (request.getHttpMethod().equalsIgnoreCase("OPTIONS")) {
            Response response = Cors.add(request, Response.ok()).preflight()
                    .allowedMethods("GET", "PUT", "POST", "DELETE").auth().build();
            throw new NoLogWebApplicationException(response);
        }
    }

}
