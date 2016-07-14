package org.openfact.services.resources.admin;

import org.openfact.models.EmisorModel;
import org.openfact.models.NotaModel;
import org.openfact.models.NotaProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.DetalleNotaRepresentation;
import org.openfact.representations.idm.EventoRepresentation;
import org.openfact.representations.idm.NotaRepresentation;
import org.openfact.services.managers.AppAuthManager;
import org.openfact.services.managers.NotaManager;

import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

public class NotaAdminResourceImpl implements NotaAdminResource {

    @PathParam("idNota")
    private String idNota;
    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    private NotaManager notaManager;
    @Inject
    private NotaProvider notaProvider;

    private NotaModel getNotaModel(){return notaProvider.findById(idNota);}

    @Inject
    public NotaAdminResourceImpl (AppAuthManager authManager,EmisorModel emisor){
        this.emisor=emisor;
        this.authManager=authManager;
    }
    @Override
    public NotaRepresentation toRepresentation() {
        NotaRepresentation rep= ModelToRepresentation.toRepresentacion(getNotaModel());
        if (rep !=null){
            return  rep;
        }else {
            throw new NotFoundException("Nota no encontrado");
        }

    }

    @Override
    public void update(NotaRepresentation facturaRepresentation) {
        // TODO Auto-generated method stub
        
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
    public Response downloadXl() {
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
    public List<DetalleNotaRepresentation> getALL() {
        return null;
    }

}
