package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;

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
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.*;

@Stateless public class FacturasResourceImpl implements FacturasResource {

    @Context private UriInfo uriInfo;

    @Inject private FacturaResource facturaResource;

    @Inject private FacturaProvider facturaProvider;

    @Inject private EmisorProvider emisorProvider;
   // @Inject private

    @Inject private RepresentationToModel representationToModel;

    @Override public FacturaResource factura(String idFactura) {
        return facturaResource;
    }

    @Override public Response create(FacturaRepresentation rep) {
        /*__DATOS DEL EMISOR__*/
        EmisorRepresentation emisorRepresentation = rep.getEmisor();
        EmisorModel emisorModel = emisorProvider.findByRuc(emisorRepresentation.getRuc());
/**/
        return null;
    }

    @Override public Response importar(List<FacturaRepresentation> rep) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override public List<FacturaRepresentation> getAll(EmisorModel e) {
        List<FacturaModel> models = facturaProvider.getAll(e);
        List<FacturaRepresentation> result = new ArrayList<>();
        models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
        return result;
    }

    @Override public SearchResultsRepresentation<FacturaRepresentation> search(
            SearchCriteriaRepresentation criteria) {

        SearchCriteriaModel criteriaModel = new SearchCriteriaModel();

        // set filter and order
        for (SearchCriteriaFilterRepresentation filter : criteria.getFilters()) {
            criteriaModel.addFilter(filter.getName(), filter.getValue(),
                    SearchCriteriaFilterOperator.valueOf(filter.getOperator().toString()));
        }
        for (OrderByRepresentation order : criteria.getOrders()) {
            criteriaModel.addOrder(order.getName(), order.isAscending());
        }

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
        SearchResultsRepresentation<FacturaRepresentation> rep = new SearchResultsRepresentation<>();
        List<FacturaRepresentation> items = new ArrayList<>();

        results.getModels().forEach(f -> items.add(ModelToRepresentation.toRepresentation(f)));
        //        for (FacturaModel model : results.getModels()) {
        //            items.add(ModelToRepresentation.toRepresentation(model));
        //        }
        rep.setItems(items);
        rep.setTotalSize(results.getTotalSize());
        return rep;
    }

}
