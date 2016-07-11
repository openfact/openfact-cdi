package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by AHREN on 07/07/2016.
 */
@Local
public interface DetalleNotaProvider extends Provider {
    /*
    String unidadMedida
    BigDecimal cantidad
    String descripcion
    BigDecimal valorUnitario
    BigDecimal precioVenta
    BigDecimal igv
    BigDecimal isc
        **/
    DetalleNotaModel create(NotaModel n, DetalleNotaModel d);

    DetalleNotaModel findById(int id);

    List<DetalleNotaModel> getAll(NotaModel model);

    SearchResultsModel<DetalleNotaModel> search(NotaModel model, SearchCriteriaModel criteria);

    SearchResultsModel<DetalleNotaModel> search(NotaModel model, SearchCriteriaModel criteria,
                                                String filterText);
}
