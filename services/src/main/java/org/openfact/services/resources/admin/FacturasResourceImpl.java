package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.FacturaProvider;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Stateless
public class FacturasResourceImpl implements FacturasResource {

	@PathParam("idEmisor")
	private int idEmisor;

	@Inject
	private EmisorProvider emisorProvider;

	@Inject
	private FacturaProvider facturaProvider;

	private EmisorModel getEmisorModel() {
		return emisorProvider.findById(idEmisor);
	}

	@Override
	public FacturaResource factura(String idFactura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response create(FacturaRepresentation rep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Response importar(List<FacturaRepresentation> rep) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SearchResultsRepresentation<FacturaRepresentation> search(SearchCriteriaRepresentation criteria) {
		// TODO Auto-generated method stub
		return null;
	}

}
