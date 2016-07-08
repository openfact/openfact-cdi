package org.openfact.services.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

public class WelcomeResourceImpl implements WelcomeResource {

    @Context
    protected HttpHeaders headers;

    @Context
    private UriInfo uriInfo;

    public WelcomeResourceImpl(boolean bootstrapAdminUser) {

    }

    @Override
    public Response getWelcomePage() throws URISyntaxException {
        String requestUri = uriInfo.getRequestUri().toString();
        if (!requestUri.endsWith("/")) {
            return Response.seeOther(new URI(requestUri + "/")).build();
        } else {
            // return createWelcomePage(null, null);
            return null;
        }
    }

    @Override
    public Response createUser(MultivaluedMap<String, String> formData) {
        // TODO Auto-generated method stub
        return null;
    }

}
