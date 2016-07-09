package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.services.ErrorResponse;
import org.openfact.services.managers.AppAuthManager;
import org.openfact.services.managers.EmisorManager;

@Stateless
public class EmisorAdminResourceImpl implements EmisorAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    private EmisorManager emisorManager;

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private ComprobantesPagoAdminResource comprobantesPagoResource;

    @Inject
    public EmisorAdminResourceImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }

    @Override
    public ComprobantesPagoAdminResource comprobantesPago() {
        return comprobantesPagoResource;
    }

    @Override
    public EmisorRepresentation toRepresentation() {
        EmisorRepresentation rep = ModelToRepresentation.toRepresentation(emisor);
        if (rep != null) {
            return rep;
        } else {
            throw new NotFoundException("Emisor no encontrado");
        }
    }

    @Override
    public void update(EmisorRepresentation rep) {
        boolean result = emisorManager.update(emisor, rep);
        if (!result) {
            throw new InternalServerErrorException();
        }
    }

    @Override
    public Response enable() {
        boolean result = emisorManager.enable(emisor);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Emisor no pudo ser activado", Response.Status.BAD_REQUEST);
        }
    }

    @Override
    public Response disable() {
        boolean result = emisorManager.disable(emisor);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Emisor no pudo ser desactivado", Response.Status.BAD_REQUEST);
        }
    }

    @Override
    public NotasAdminResourceImpl notas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ComprobantesTributariosAdminResource comprobantesTributarios() {
        // TODO Auto-generated method stub
        return null;
    }

}
