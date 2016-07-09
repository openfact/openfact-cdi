package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class ComprobantesPagoAdminResourceImpl implements ComprobantesPagoAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @Inject
    private FacturasAdminResource facturasResource;

    @Inject
    private BoletasAdminResource boletasResource;

    @Inject
    public ComprobantesPagoAdminResourceImpl(AppAuthManager authManager, EmisorModel emisor) {
        this.emisor = emisor;
        this.authManager = authManager;
    }

    @Override
    public FacturasAdminResource facturas() {
        return facturasResource;
    }

    @Override
    public BoletasAdminResource boletas() {
        return boletasResource;
    }

}
