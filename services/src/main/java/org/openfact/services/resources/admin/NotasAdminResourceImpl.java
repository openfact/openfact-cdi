package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.NotaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Stateless
public class NotasAdminResourceImpl implements NotasAdminResource {

    @Override
    public NotaAdminResource factura(String idNota) {
        // TODO Auto-generated method stub
        return null;
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
