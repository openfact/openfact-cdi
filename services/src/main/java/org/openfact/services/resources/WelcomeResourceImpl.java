package org.openfact.services.resources;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.openfact.common.ClientConnection;
import org.openfact.models.BrowserSecurityHeaders;
import org.openfact.models.OpenfactSession;
import org.openfact.models.utils.OpenfactModelUtils;
import org.openfact.services.util.CacheControlUtil;
import org.openfact.services.util.CookieHelper;
import org.openfact.theme.BrowserSecurityHeaderSetup;
import org.openfact.theme.FreeMarkerUtil;
import org.openfact.theme.Theme;

@Stateless
public class WelcomeResourceImpl implements WelcomeResource {

    private static final String OPENFACT_STATE_CHECKER = "OPENFACT_STATE_CHECKER";

    @Context
    protected HttpHeaders headers;

    @Context
    private UriInfo uriInfo;

    @Inject
    private OpenfactSession session;

    private boolean bootstrap = true;

    public WelcomeResourceImpl(boolean bootstrapAdminUser) {

    }

    @Override
    public Response getWelcomePage() throws URISyntaxException {
        checkBootstrap();
        String requestUri = uriInfo.getRequestUri().toString();
        if (!requestUri.endsWith("/")) {
            return Response.seeOther(new URI(requestUri + "/")).build();
        } else {
            return createWelcomePage(null, null);
        }
    }

    @Override
    public Response createUser(MultivaluedMap<String, String> formData) {
        // TODO Auto-generated method stub
        return null;
    }

    private Response createWelcomePage(String successMessage, String errorMessage) {
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("bootstrap", bootstrap);
            if (bootstrap) {
                boolean isLocal = isLocal();
                map.put("localUser", isLocal);

                if (isLocal) {
                    String stateChecker = updateCsrfChecks();
                    map.put("stateChecker", stateChecker);
                }
            }
            if (successMessage != null) {
                map.put("successMessage", successMessage);
            }
            if (errorMessage != null) {
                map.put("errorMessage", errorMessage);
            }
            FreeMarkerUtil freeMarkerUtil = new FreeMarkerUtil();
            String result = freeMarkerUtil.processTemplate(map, "index.ftl", getTheme());

            ResponseBuilder rb = Response.status(errorMessage == null ? Status.OK : Status.BAD_REQUEST)
                    .entity(result).cacheControl(CacheControlUtil.noCache());
            BrowserSecurityHeaderSetup.headers(rb, BrowserSecurityHeaders.defaultHeaders);
            return rb.build();
        } catch (Exception e) {
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    private Theme getTheme() {
        /*Config.Scope config = Config.scope("theme");
        ThemeProvider themeProvider = session.getProvider(ThemeProvider.class, "extending");
        try {
            return themeProvider.getTheme(config.get("welcomeTheme"), Theme.Type.WELCOME);
        } catch (IOException e) {
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }*/
        return null;
    }

    private void checkBootstrap() {

    }

    private boolean isLocal() {
        try {
            ClientConnection clientConnection = session.getContext().getConnection();
            InetAddress remoteInetAddress = InetAddress.getByName(clientConnection.getRemoteAddr());
            InetAddress localInetAddress = InetAddress.getByName(clientConnection.getLocalAddr());
            String xForwardedFor = headers.getHeaderString("X-Forwarded-For");

            return isLocalAddress(remoteInetAddress) && isLocalAddress(localInetAddress)
                    && xForwardedFor == null;
        } catch (UnknownHostException e) {
            throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    private boolean isLocalAddress(InetAddress inetAddress) {
        return inetAddress.isAnyLocalAddress() || inetAddress.isLoopbackAddress();
    }

    private String updateCsrfChecks() {
        String stateChecker = getCsrfCookie();
        if (stateChecker != null) {
            return stateChecker;
        } else {
            stateChecker = OpenfactModelUtils.generateSecret();
            String cookiePath = uriInfo.getPath();
            boolean secureOnly = uriInfo.getRequestUri().getScheme().equalsIgnoreCase("https");
            CookieHelper.addCookie(OPENFACT_STATE_CHECKER, stateChecker, cookiePath, null, null, -1,
                    secureOnly, true);
            return stateChecker;
        }
    }

    private String getCsrfCookie() {
        Cookie cookie = headers.getCookies().get(OPENFACT_STATE_CHECKER);
        return cookie == null ? null : cookie.getValue();
    }

    private void csrfCheck(String cookieStateChecker, String formStateChecker) {
        if (cookieStateChecker == null || !cookieStateChecker.equals(formStateChecker)) {
            throw new ForbiddenException();
        }
    }

}
