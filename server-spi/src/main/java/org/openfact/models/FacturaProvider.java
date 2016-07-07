package org.openfact.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local public interface FacturaProvider extends Provider {

	FacturaModel create(EmisorModel emisor, LocalDate fechaEmision, String serie, String numero, BigDecimal importeTotal);

	FacturaModel findById(String id);

	List<FacturaModel> getAll(EmisorModel emisorModel);

	SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria);

	SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria, String filterText);

	SearchResultsModel<FacturaModel> search(FacturaModel facturaModel, SearchCriteriaModel criteria);

	SearchResultsModel<FacturaModel> search(FacturaModel facturaModel, SearchCriteriaModel criteria, String filterText);
    
}
