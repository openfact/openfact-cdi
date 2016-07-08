package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
@Local
public interface DetalleBoletaProvider extends Provider {
    DetalleBoletaModel create(BoletaModel b, DetalleBoletaModel d);
    DetalleBoletaModel findById(int id);
    List<DetalleBoletaModel> getAll(BoletaModel model);
    SearchResultsModel<DetalleBoletaModel> search(BoletaModel model, SearchCriteriaModel criteria);
    SearchResultsModel<DetalleBoletaModel> search(BoletaModel model, SearchCriteriaModel criteria,
            String filtertext);
}
