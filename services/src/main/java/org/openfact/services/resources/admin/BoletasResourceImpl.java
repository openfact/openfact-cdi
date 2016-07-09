package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.BoletaProvider;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.representations.idm.BotelaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.ErrorResponse;

@Stateless
public class BoletasResourceImpl implements BoletasResource {

	@PathParam("idEmisor")
	private int idEmisor;
	@Context
	private UriInfo uriInfo;

	@Inject
	private EmisorProvider emisorProvider;
	@Inject
	private BoletaResource boletaResource;

	@Inject
	private BoletaProvider boletaProvider;
	@Inject
	private RepresentationToModel representationToModel;

	private EmisorModel getEmisorModel() {
		return emisorProvider.findById(idEmisor);
	}

	@Override
	public BoletaResource botela(String idBoleta) {
		return boletaResource;
	}

	@Override
	public Response create(BoletaRepresentation rep) {
		try {
			BoletaModel model = representationToModel.createBoleta(rep, getEmisorModel(), boletaProvider);
			return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
					.header("", "").entity(ModelToRepresentation.toRepresentation(model)).build();
		}catch (ModelDuplicateException e){
			return ErrorResponse.exists("Factura ya registrada");
		}
	}

	@Override
	public Response importar(List<BoletaRepresentation> rep) {
		try {
			rep.forEach(b ->representationToModel.createBoleta(b, getEmisorModel(),boletaProvider));
		}catch (ModelDuplicateException e){
			return ErrorResponse.exists("Factura ya registrada");
		}
		return Response.ok().build();
	}

	@Override
	public SearchResultsRepresentation<BoletaRepresentation> search(SearchCriteriaRepresentation criterial) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<BoletaRepresentation> getAll() {
//		List<BoletaModel> models = BoletaProvider.getAll();
//		List<BoletaRepresentation> result = new ArrayList<>();
//		models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
//		return result;
//	}

}
