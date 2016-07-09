package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.BoletaProvider;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class BoletasAdminResourceImpl implements BoletasAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private BoletaProvider boletaProvider;

    @Inject
    public BoletasAdminResourceImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }

    @Override
    public BoletaAdminResource botela(String idBoleta) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response create(BotelaRepresentation rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response importar(List<BotelaRepresentation> rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SearchResultsRepresentation<BotelaRepresentation> search(SearchCriteriaRepresentation criterial) {
        // TODO Auto-generated method stub
        return null;
    }

}
