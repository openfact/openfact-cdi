package org.openfact.models;

import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface EmisorProvider extends Provider {

    EmisorModel create(String pais, String ruc, String razonSocial);

    EmisorModel findById(String id);

    EmisorModel findByRuc(String pais, String ruc);

    EmisorModel findByRazonSocial(String pais, String razonSocial);

    List<EmisorModel> getAll();

    SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria);

    SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText);

    /*HistorialEmisorModel createHistorial(EmisorModel emisorModel, String resolucionAutorizacion,
            String mensajeRepresentacionImpresa);

    HistorialEmisorModel findByEstado(boolean status);

    boolean desactivar(HistorialEmisorModel historialEmisorModel);*/
}
