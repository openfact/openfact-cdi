package org.openfact.services.resources.admin;

import org.openfact.models.BoletaModel;
import org.openfact.models.BoletaProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.services.managers.BoletaManager;

import javax.ejb.Stateless;

import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
@Stateless
public class BoletaResourceImpl implements BoletaResource {
    @PathParam("idBoleta")
    private String idBoleta;
    @Inject
    private BoletaManager boletaManager;
    @Inject
    private BoletaProvider boletaProvider;
    @Inject
    private DetallesBoletaResource detallesBoletaResource;

    private BoletaModel getBoletaModel(){
        return boletaProvider.findById(idBoleta);
    }

    @Override public DetallesBoletaResource detallesBoleta() {
        return detallesBoletaResource;
    }
    @Override public EnviosResource enviosResource() {
        return null;
    }

    @Override public BoletaRepresentation toRepresentation() {
       BoletaRepresentation rep= ModelToRepresentation.toRepresentation(getBoletaModel());
        if (rep !=null){
            return  rep;
        }else {
            throw  new NotFoundException("Boleta no encontrado");
        }
    }

    @Override public void update(BoletaRepresentation boletaRepresentation) {

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
