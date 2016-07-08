package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class BoletaAdminResourceImpl implements BoletaAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    public BoletaAdminResourceImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }
    
    @Override
    public BotelaRepresentation toRepresentation() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void update(BotelaRepresentation rep) {
        // TODO Auto-generated method stub

    }

}
