package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Local
public interface NotaProvider extends Provider {

	NotaModel create(EmisorModel emisor, AdquirienteModel adquiriente, LocalDate fechaEmision,
						NumeracionComprobantePagoModel numeracion, ResumenNotaModel resumen);

	AdquirienteModel createAdquiriente(DocumentoIdentidadModel documento, String numeroDocumento, String razonSocial);
	NumeracionComprobantePagoModel createNumeracion(String serie, String numero);

	ResumenNotaModel createResumenGravado(BigDecimal totalGravado, String moneda, BigDecimal importeTotal);
	ResumenNotaModel createResumenInafecto(BigDecimal totalInafecto, String moneda, BigDecimal importeTotal);
	ResumenNotaModel createResumenExonerado(BigDecimal totalExonerado, String moneda, BigDecimal importeTotal);

	FacturaModel findById(String id);

	List<NotaModel> getAll(EmisorModel emisorModel);

	SearchResultsModel<NotaModel> search(SearchCriteriaModel criteria);

	SearchResultsModel<NotaModel> search(SearchCriteriaModel criteria, String filterText);

	SearchResultsModel<NotaModel> search(NotaModel facturaModel, SearchCriteriaModel criteria);

	SearchResultsModel<NotaModel> search(NotaModel facturaModel, SearchCriteriaModel criteria, String filterText);

}
