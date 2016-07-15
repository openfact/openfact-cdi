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
import org.openfact.representations.idm.NotaRepresentation;
import org.openfact.representations.idm.search.PagingRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaFilterOperatorRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.ErrorResponse;

@Stateless
public class NotasAdminResourceImpl implements NotasAdminResource {
    @PathParam("idNota")
    private String idEmisor;

    @Context
    private UriInfo uriInfo;
    @Inject
    private EmisorProvider emisorProvider;
    @Inject
    private NotaAdminResource notaResource;
    @Inject
    private NotaProvider notaProvider;
    @Inject
    private RepresentationToModel representationToModel;

    private EmisorModel getEmisorModel() {
        return emisorProvider.findById(idEmisor);
    }


    @Override
    public NotaAdminResource nota(String idNota) {
        // TODO Auto-generated method stub
        return notaResource;
    }

    @Override
    public Response create(NotaRepresentation rep) {
        try {
            NotaModel model = representationToModel.createNota(rep, getEmisorModel(), notaProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build()).header("Access-Control-Expose-Headers", "Location").entity(ModelToRepresentation.toRepresentacion(model)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Nota ya registrada");
        }
    }

    @Override
    public Response importar(List<NotaRepresentation> rep) {
        try {
            rep.forEach(n -> representationToModel.createNota(n, getEmisorModel(), notaProvider));
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Nota ya registrada");
        }
        return Response.ok().build();
    }

    @Override
    public List<NotaRepresentation> getAll() {
        List<NotaModel> models = notaProvider.getAll(getEmisorModel());
        List<NotaRepresentation> result = new ArrayList<>();
        models.forEach(n -> result.add(ModelToRepresentation.toRepresentacion(n)));
        return result;
    }

    @Override
    public SearchResultsRepresentation<NotaRepresentation> search(SearchCriteriaRepresentation criteria) {
        SearchCriteriaModel criteriaModel = new SearchCriteriaModel();

        Function<SearchCriteriaFilterOperatorRepresentation, SearchCriteriaFilterOperator> function = n -> {
            return SearchCriteriaFilterOperator.valueOf(n.toString());
        };
        criteria.getFilters().forEach(n -> {
            criteriaModel.addFilter(n.getName(), n.getValue(), function.apply(n.getOperator()));
        });
        criteria.getOrders().forEach(n -> criteriaModel.addOrder(n.getName(), n.isAscending()));
        PagingRepresentation paging = criteria.getPaging();
        criteriaModel.setPageSize(paging.getPageSize());
        criteriaModel.setPage(paging.getPage());

        String filterText = criteria.getFilterText();
        SearchResultsModel<NotaModel> results = null;
        if (filterText == null) {
            results = notaProvider.search(criteriaModel);
        } else {
            results = notaProvider.search(criteriaModel, filterText);
        }
        SearchResultsRepresentation<NotaRepresentation> rep = new SearchResultsRepresentation<>();
        List<NotaRepresentation> items = new ArrayList<>();
        results.getModels().forEach(n -> items.add(ModelToRepresentation.toRepresentacion(n)));
        rep.setItems(items);
        rep.setTotalSize(results.getTotalSize());
        return rep;
    }

}
