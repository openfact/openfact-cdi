package org.openfact.models;

import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local public interface EmisorProvider extends Provider {

    EmisorModel create(String ruc, String razonSocial);

    HistorialEmisorModel createHistorial(EmisorModel emisorModel, String resolucionAutorizacion,
            String mensajeRepresentacionImpresa);

    EmisorModel findById(String id);

    HistorialEmisorModel findByEstado(boolean status);

    EmisorModel findByRuc(String ruc);

    EmisorModel findByRazonSocial(String razonSocial);

    boolean desactivar(HistorialEmisorModel historialEmisorModel);

    List<EmisorModel> getAll();

    SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria);

    SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText);

}


