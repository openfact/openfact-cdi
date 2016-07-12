package org.openfact.services.resources.admin;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.services.managers.AppAuthManager;
import org.openfact.theme.BrowserSecurityHeaderSetup;
import org.openfact.theme.FreeMarkerException;
import org.openfact.theme.FreeMarkerUtil;
import org.openfact.theme.Theme;
import org.openfact.utils.MediaType;

public class AdminConsoleImpl implements AdminConsole {

    @Context
    private UriInfo uriInfo;

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
        if (!uriInfo.getRequestUri().getPath().endsWith("/")) {
            return Response.status(302).location(uriInfo.getRequestUriBuilder().path("/").build()).build();
        } else {
            Theme theme = null;/*AdminRoot.getTheme(session, realm);*/

            Map<String, Object> map = new HashMap<>();

            URI baseUri = uriInfo.getBaseUri();

            String authUrl = baseUri.toString();
            authUrl = authUrl.substring(0, authUrl.length() - 1);

            /*map.put("authUrl", authUrl);
            map.put("resourceUrl", Urls.themeRoot(baseUri) + "/admin/" + theme.getName());
            map.put("resourceVersion", Version.RESOURCES_VERSION);
            map.put("properties", theme.getProperties());*/

            FreeMarkerUtil freeMarkerUtil = new FreeMarkerUtil();
            String result = null;
            try {
                result = freeMarkerUtil.processTemplate(map, "index.ftl", theme);
            } catch (FreeMarkerException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Response.ResponseBuilder builder = Response.status(Response.Status.OK)
                    .type(MediaType.TEXT_HTML_UTF_8).language(Locale.ENGLISH).entity(result);
            //BrowserSecurityHeaderSetup.headers(builder, realm);
            return builder.build();
        }
    }

    @Override
    public Response getIndexHtmlRedirect() {
        return Response.status(302).location(uriInfo.getRequestUriBuilder().path("../").build()).build();
    }

    @Override
    public Properties getMessages(String lang) {
        // TODO Auto-generated method stub
        return null;
    }

}
