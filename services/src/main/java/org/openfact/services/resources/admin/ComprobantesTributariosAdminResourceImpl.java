package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.ComprobanteTributarioRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

public class ComprobantesTributariosAdminResourceImpl implements ComprobantesTributariosAdminResource {

    @Override
    public ComprobanteTributarioAdminResource factura(String idComprobanteTributario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response create(ComprobanteTributarioRepresentation rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response importar(List<ComprobanteTributarioRepresentation> rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<ComprobanteTributarioRepresentation> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SearchResultsRepresentation<ComprobanteTributarioRepresentation> search(
            SearchCriteriaRepresentation criteria) {
        // TODO Auto-generated method stub
        return null;
    }

}
