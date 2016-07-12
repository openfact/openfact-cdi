package org.openfact.services.resources;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.jboss.resteasy.spi.HttpRequest;
import org.jboss.resteasy.spi.HttpResponse;
import org.openfact.models.EmisorModel;
import org.openfact.models.OpenfactSession;
import org.openfact.representations.idm.PublishedEmisorRepresentation;

@Stateless
public class PublicEmisorResourceImpl implements PublicEmisorResource {

    @Context
    protected UriInfo uriInfo;

    @Context
    protected HttpRequest request;

    @Context
    protected HttpResponse response;

    @Inject
    protected OpenfactSession session;

    @Override
    public Response accountPreflight() {
        return Cors.add(request, Response.ok()).auth().preflight().build();
    }

    @Override
    public PublishedEmisorRepresentation getEmisor() {
        Cors.add(request).allowedOrigins(Cors.ACCESS_CONTROL_ALLOW_ORIGIN_WILDCARD).auth().build(response);
        return emisorRep(session.getContext().getEmisor(), uriInfo);
    }

    public static PublishedEmisorRepresentation emisorRep(EmisorModel emisor, UriInfo uriInfo) {
        PublishedEmisorRepresentation rep = new PublishedEmisorRepresentation();
        rep.setRuc(emisor.getRuc());
        rep.setRazonSocial(emisor.getRazonSocial());
        rep.setDireccion(emisor.getDomicilioFiscal());
        return rep;
    }

}
