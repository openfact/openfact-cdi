package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.NotaProvider;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.NotaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Stateless
public class NotasAdminResourceImpl implements NotasAdminResource {
    @PathParam("idNota")
    private String idEmisor;

    @Context
    private UriInfo uriInfo;
    @Inject
    private EmisorProvider emisorProvider;
    @Inject
    private NotaAdminResource notaResource;
    @Inject
    private NotaProvider notaProvider;
    @Inject
    private RepresentationToModel representationToModel;
    private EmisorModel getEmisorModel(){
        return  emisorProvider.findById(idEmisor);
    }


    @Override
    public NotaAdminResource nota(String idNota) {
        // TODO Auto-generated method stub
        return notaResource;
    }



    @Override
    public Response create(NotaRepresentation rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response importar(List<NotaRepresentation> rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<NotaRepresentation> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SearchResultsRepresentation<NotaRepresentation> search(SearchCriteriaRepresentation criteria) {
        // TODO Auto-generated method stub
        return null;
    }

}
