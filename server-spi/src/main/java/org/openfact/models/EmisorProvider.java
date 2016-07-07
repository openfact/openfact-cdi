package org.openfact.models;

import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface EmisorProvider extends Provider {

	EmisorModel create(String ruc, String razonSocial);

	EmisorModel findById(int id);

	EmisorModel findByRuc(String ruc);

	EmisorModel findByRazonSocial(String razonSocial);

	List<EmisorModel> getAll();

	SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria);

	SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText);

}


