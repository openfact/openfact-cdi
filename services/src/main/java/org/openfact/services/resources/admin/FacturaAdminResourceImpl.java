package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;
import org.openfact.models.FacturaModel;
import org.openfact.models.FacturaProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.DetalleFacturaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.services.managers.AppAuthManager;
import org.openfact.services.managers.FacturaManager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.util.List;

@Stateless
public class FacturaAdminResourceImpl implements FacturaAdminResource {

    @PathParam("idFactura")
    private String idFactura;

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    private FacturaManager facturaManager;

    @Inject
    private FacturaProvider facturaProvider;

    private FacturaModel getFacturaModel() {
        return facturaProvider.findById(idFactura);
    }

    @Inject
    public FacturaAdminResourceImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }

    @Override
    public FacturaRepresentation toRepresentation() {
        FacturaRepresentation rep = ModelToRepresentation.toRepresentation(getFacturaModel());
        if (rep != null) {
            return rep;
        } else {
            throw new NotFoundException("Factura no encontrado");
        }
    }

    @Override
    public void update(FacturaRepresentation facturaRepresentation) {

    }

    @Override
    public Response send() {
        return null;
    }

    @Override
    public Response status() {
        return null;
    }

    @Override
    public List<EventoRepresentation> eventos() {
        return null;
    }

    @Override
    public Response downloadXml() {
        return null;
    }

    @Override
    public Response downloadXls() {
        return null;
    }

    @Override
    public Response downloadPdf() {
        return null;
    }

    @Override
    public Response downloadCdr() {
        return null;
    }

    @Override
    public List<DetalleFacturaRepresentation> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

}
