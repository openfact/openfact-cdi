package org.openfact.services.resources.admin;

import org.openfact.models.FacturaProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.services.managers.FacturaManager;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by AHREN on 06/07/2016.
 */
@Stateless public class FacturaResourceImpl implements FacturaResource {

    @PathParam("idFactura") private String idFactura;

    @Inject private FacturaManager facturaManager;

    @Inject private FacturaProvider facturaProvider;

    @Inject private DetallesFacturaResource detalleFacturasResource;

    private FacturaModel getFacturaModel() {
        return facturaProvider.findById(idFactura);
    }

    @Override public DetallesFacturaResource detallesFactura() {
        return detalleFacturasResource;
    }

    @Override public FacturaRepresentation toRepresentation() {
        FacturaRepresentation rep = ModelToRepresentation.toRepresentation(getFacturaModel());
        if (rep != null) {
            return rep;
        } else {
            throw new NotFoundException("Factura no encontrado");
        }
    }

    @Override public void update(FacturaRepresentation facturaRepresentation) {

    }

    @Override public Response send() {
        return null;
    }

    @Override public Response status() {
        return null;
    }

    @Override public List<EventoRepresentation> eventos() {
        return null;
    }

    @Override public Response downloadXml() {
        return null;
    }

    @Override public Response downloadXls() {
        return null;
    }

    @Override public Response downloadPdf() {
        return null;
    }

    @Override public Response downloadCdr() {
        return null;
    }

}
