package org.openfact.services.resources.admin;

import javax.ws.rs.Path;

public interface ComprobantesPagoResource {

	@Path("facturas")
	FacturasResource facturas();

	@Path("boletas")
	BoletasResource boletas();

}
