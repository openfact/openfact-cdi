package org.openfact.models;

import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface DireccionRegionalProvider extends Provider {

    DireccionRegionalModel create(String denominacion);

    DireccionRegionalModel findById(String id);

    DireccionRegionalModel findByDenominacion(String denominacion);

    List<DireccionRegionalModel> getAll();

    SearchResultsModel<DireccionRegionalModel> search(SearchCriteriaModel criteria);

    SearchResultsModel<DireccionRegionalModel> search(SearchCriteriaModel criteria, String filterText);

}