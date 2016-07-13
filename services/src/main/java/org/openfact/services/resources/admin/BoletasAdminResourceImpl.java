package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.*;
import org.openfact.models.search.SearchCriteriaFilterOperator;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.search.PagingRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaFilterOperatorRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.ErrorResponse;
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class BoletasAdminResourceImpl implements BoletasAdminResource {

    @Context
    private UriInfo uriInfo;
    private EmisorModel emisor;

    @PathParam(value = "idEmisor")
    private String idEmisor;

    @Inject
    private EmisorProvider emisorProvider;
    @Inject
    private BoletaAdminResource boletaAdminResource;

    @Inject
    private BoletaProvider boletaProvider;
    @Inject
    private RepresentationToModel representationToModel;

    private EmisorModel getEmisorModel() {
        return emisorProvider.findById(idEmisor);
    }

    @Override
    public BoletaAdminResource botela(String idBoleta) {
        return boletaAdminResource;
    }

    @Override
    public Response create(BoletaRepresentation rep) {
        try {
            BoletaModel model = representationToModel.createBoleta(rep, getEmisorModel(), boletaProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
                    .header("Access-Control-Expose-Headers", "Location").entity(ModelToRepresentation.toRepresentation(model)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Factura ya registrada");
        }
    }

    @Override
    public Response importar(List<BoletaRepresentation> rep) {
        try {
            rep.forEach(b -> representationToModel.createBoleta(b, getEmisorModel(), boletaProvider));
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Factura ya registrada");
        }
        return Response.ok().build();
    }

    @Override
    public List<BoletaRepresentation> getAll() {
        List<BoletaModel> models = boletaProvider.getAll(getEmisorModel());
        List<BoletaRepresentation> result = new ArrayList<>();
        models.forEach(b -> result.add(ModelToRepresentation.toRepresentation(b)));
        return result;
    }

    @Override
    public SearchResultsRepresentation<BoletaRepresentation> search(
            SearchCriteriaRepresentation criteria) {
        SearchCriteriaModel criteriaModel = new SearchCriteriaModel();
        Function<SearchCriteriaFilterOperatorRepresentation, SearchCriteriaFilterOperator> function = b -> {
            return SearchCriteriaFilterOperator.valueOf(b.toString());
        };
        criteria.getFilters().forEach(b -> {
            criteriaModel.addFilter(b.getName(), b.getValue(), function.apply(b.getOperator()));
        });
        criteria.getOrders().forEach(b -> criteriaModel.addOrder(b.getName(), b.isAscending()));
        PagingRepresentation paging = criteria.getPaging();
        criteriaModel.setPageSize(paging.getPageSize());
        criteriaModel.setPage(paging.getPage());
        String filterText = criteria.getFilterText();
        SearchResultsModel<BoletaModel> results = null;
        if (filterText == null) {
            results = boletaProvider.search(criteriaModel);
        } else {
            results = boletaProvider.search(criteriaModel, filterText);
        }
        SearchResultsRepresentation<BoletaRepresentation>rep =new SearchResultsRepresentation<>();
                List<BoletaRepresentation> items=new ArrayList<>();
        results.getModels().forEach(b->items.add(ModelToRepresentation.toRepresentation(b)));
        rep.setItems(items);
        rep.setTotalSize(results.getTotalSize());
        return rep;
    }

    //	@Override
    //	public List<BoletaRepresentation> getAll() {
    //		List<BoletaModel> models = BoletaProvider.getAll();
    //		List<BoletaRepresentation> result = new ArrayList<>();
    //		models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
    //		return result;
    //	}


}
