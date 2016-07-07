package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.FacturaModel;
import org.openfact.models.FacturaProvider;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.search.SearchCriteriaFilterOperator;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.PagingRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaFilterOperatorRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.ErrorResponse;

@Stateless
public class FacturasResourceImpl implements FacturasResource {

	@PathParam("idEmisor")
	private int idEmisor;

	@Context
	private UriInfo uriInfo;

	@Inject
	private EmisorProvider emisorProvider;

	@Inject
	private FacturaResource facturaResource;

	@Inject
	private FacturaProvider facturaProvider;

	@Inject
	private RepresentationToModel representationToModel;

	private EmisorModel getEmisorModel() {
		return emisorProvider.findById(idEmisor);
	}

	@Override
	public FacturaResource factura(String idFactura) {
		return facturaResource;
	}

	@Override
	public Response create(FacturaRepresentation rep) {
		try {
			FacturaModel model = representationToModel.createFactura(rep, getEmisorModel(), facturaProvider);
			return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
					.header("Access-Control-Expose-Headers", "Location")
					.entity(ModelToRepresentation.toRepresentation(model)).build();
		} catch (ModelDuplicateException e) {
			return ErrorResponse.exists("Factura ya registrada");
		}
	}

	@Override
	public Response importar(List<FacturaRepresentation> rep) {
		try {
			rep.forEach(f -> representationToModel.createFactura(f, getEmisorModel(), facturaProvider));
		} catch (ModelDuplicateException e) {
			return ErrorResponse.exists("Factura ya registrada");
		}
		return Response.ok().build();
	}

	@Override
	public List<FacturaRepresentation> getAll(EmisorModel e) {
		List<FacturaModel> models = facturaProvider.getAll(e);
		List<FacturaRepresentation> result = new ArrayList<>();
		models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
		return result;
	}

	@Override
	public SearchResultsRepresentation<FacturaRepresentation> search(SearchCriteriaRepresentation criteria) {
		SearchCriteriaModel criteriaModel = new SearchCriteriaModel();

		// set filter and order
		Function<SearchCriteriaFilterOperatorRepresentation, SearchCriteriaFilterOperator> function = f -> {
			return SearchCriteriaFilterOperator.valueOf(f.toString());
		};
		criteria.getFilters().forEach(f -> {
			criteriaModel.addFilter(f.getName(), f.getValue(), function.apply(f.getOperator()));
		});
		criteria.getOrders().forEach(f -> criteriaModel.addOrder(f.getName(), f.isAscending()));

		// set paging
		PagingRepresentation paging = criteria.getPaging();
		criteriaModel.setPageSize(paging.getPageSize());
		criteriaModel.setPage(paging.getPage());

		// extract filterText
		String filterText = criteria.getFilterText();

		// search
		SearchResultsModel<FacturaModel> results = null;
		if (filterText == null) {
			results = facturaProvider.search(criteriaModel);
		} else {
			results = facturaProvider.search(criteriaModel, filterText);
		}

		// prepare for response
		SearchResultsRepresentation<FacturaRepresentation> rep = new SearchResultsRepresentation<>();
		List<FacturaRepresentation> items = new ArrayList<>();
		results.getModels().forEach(f -> items.add(ModelToRepresentation.toRepresentation(f)));

		rep.setItems(items);
		rep.setTotalSize(results.getTotalSize());
		return rep;
	}

}
