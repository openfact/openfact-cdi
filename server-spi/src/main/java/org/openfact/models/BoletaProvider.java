package org.openfact.models;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface BoletaProvider extends Provider {

	EmisorModel create(EmisorModel emisor, LocalDate fechaEmision, String serie, String numero, BigDecimal importeTotal);

	EmisorModel findById(String id);

	SearchResultsModel<EmisorModel> search(EmisorModel emisor, SearchCriteriaModel criteria);

	SearchResultsModel<EmisorModel> search(EmisorModel emisor, SearchCriteriaModel criteria, String filterText);
    
}
