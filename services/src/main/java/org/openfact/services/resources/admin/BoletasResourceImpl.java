package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.openfact.models.BoletaProvider;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

@Stateless
public class BoletasResourceImpl implements BoletasResource {

	@PathParam("idEmisor")
	private int idEmisor;

	@Inject
	private EmisorProvider emisorProvider;

	@Inject
	private BoletaProvider boletaProvider;

	private EmisorModel getEmisorModel() {
		return emisorProvider.findById(idEmisor);
	}

	@Override
	public BoletaResource botela(String idBoleta) {
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
