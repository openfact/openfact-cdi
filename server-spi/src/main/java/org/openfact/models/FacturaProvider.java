package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
@Local public interface FacturaProvider extends Provider {

    /*
    private double igv;
    private double isc;
	private String numeroDocumentoRelacionado;
	*/
    FacturaModel create(double igv);

    FacturaModel findById(int id);

    SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria);

    SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria, String filterText);
}
