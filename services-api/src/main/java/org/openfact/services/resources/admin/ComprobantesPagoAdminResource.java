package org.openfact.services.resources.admin;

import javax.ws.rs.Path;

public interface ComprobantesPagoAdminResource {

    @Path("facturas")
    FacturasAdminResource facturas();

    @Path("boletas")
    BoletasAdminResource boletas();

}
