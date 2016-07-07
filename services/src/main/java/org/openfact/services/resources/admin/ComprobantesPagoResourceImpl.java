package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ComprobantesPagoResourceImpl implements ComprobantesPagoResource {

	@Inject
	private FacturasResource facturasResource;

	@Inject
	private BoletasResource boletasResource;

	@Override
	public FacturasResource facturas() {
		return facturasResource;
	}

	@Override
	public BoletasResource boletas() {
		return boletasResource;
	}

}
