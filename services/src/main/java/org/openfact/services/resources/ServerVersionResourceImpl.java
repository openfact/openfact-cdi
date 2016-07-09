package org.openfact.services.resources;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;
import org.openfact.representations.VersionRepresentation;

@Stateless
public class ServerVersionResourceImpl implements ServerVersionResource {

    @Context
    protected HttpRequest request;

    @Context
    protected HttpResponse response;

    @Override
    public Response getVersionPreflight() {
        return Cors.add(request, Response.ok()).allowedMethods("GET").auth().preflight().build();
    }

    @Override
    public VersionRepresentation getVersion() {
        Cors.add(request).allowedOrigins("*").allowedMethods("GET").auth().build(response);
        return VersionRepresentation.SINGLETON;
    }

}
