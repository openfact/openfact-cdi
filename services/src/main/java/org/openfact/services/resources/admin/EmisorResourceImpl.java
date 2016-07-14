package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.HistorialEmisorModel;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.services.ErrorResponse;
import org.openfact.services.managers.EmisorManager;

@Stateless
public class EmisorResourceImpl implements EmisorAdminResource {

    @PathParam("idEmisor")
    private String idEmisor;

    @Inject
    private EmisorManager emisorManager;

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private ComprobantesPagoAdminResource comprobantesPagoResource;

    private EmisorModel getEmisorModel() {
        return emisorProvider.findById(idEmisor);
    }

    @Override
    public ComprobantesPagoAdminResource comprobantesPago() {
        return comprobantesPagoResource;
    }

    @Override
    public NotasAdminResource notas() {
        return null;
    }

    @Override
    public ComprobantesTributariosAdminResource comprobantesTributarios() {
        return null;
    }

    @Override
    public EnviosAdminResource envios() {
        return null;
    }

    @Override
    public EmisorRepresentation toRepresentation() {
        EmisorRepresentation rep = ModelToRepresentation.toRepresentation(getEmisorModel());
        if (rep != null) {
            return rep;
        } else {
            throw new NotFoundException("Emisor no encontrado");
        }
    }

    @Override
    public void update(EmisorRepresentation rep) {
        boolean result = emisorManager.update(getEmisorModel(), rep);
        /*HistorialEmisorModel historialEmisorModel = emisorProvider.createHistorial(getEmisorModel(), rep.getResolucionAutorizacion(), rep.getMensajeRepresentacionImpresa());
        if (!result) {
            throw new InternalServerErrorException();
        }*/
    }

    @Override
    public Response enable() {
        EmisorModel emisorModel = getEmisorModel();
        boolean result = emisorManager.enable(emisorModel);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Emisor no pudo ser activado", Response.Status.BAD_REQUEST);
        }
    }

    @Override
    public Response disable() {
        EmisorModel emisorModel = getEmisorModel();
        boolean result = emisorManager.disable(emisorModel);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Emisor no pudo ser desactivado", Response.Status.BAD_REQUEST);
        }
    }

}
