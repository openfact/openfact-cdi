package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by AHREN on 07/07/2016.
 */
@Local public interface DetalleFacturaProvider extends Provider {
    /*
    String unidadMedida
    BigDecimal cantidad
    String descripcion
    BigDecimal valorUnitario
    BigDecimal precioVenta
    BigDecimal igv
    BigDecimal isc
        **/
    DetalleFacturaModel create(FacturaModel f, DetalleFacturaModel d);

    DetalleFacturaModel findById(int id);

    List<DetalleFacturaModel> getAll(FacturaModel model);

    SearchResultsModel<DetalleFacturaModel> search(FacturaModel model, SearchCriteriaModel criteria);

    SearchResultsModel<DetalleFacturaModel> search(FacturaModel model, SearchCriteriaModel criteria,
            String filterText);
}
