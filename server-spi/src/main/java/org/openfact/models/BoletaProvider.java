package org.openfact.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface BoletaProvider extends Provider {

	BoletaModel create(EmisorModel emisor,AdquirienteModel adquiriente, LocalDate fechaEmision,
			NumeracionComprobantePagoModel numeracion, ResumenComprobantePagoModel resumen);

	AdquirienteModel createAdquiriente(DocumentoIdentidadModel documento, String numeroDocumento, String razonSocial);
	NumeracionComprobantePagoModel createNumeracion(String serie, String numero);

	ResumenComprobantePagoModel createResumenGravado(BigDecimal totalGravado, String moneda, BigDecimal importeTotal);
	ResumenComprobantePagoModel createResumenInafecto(BigDecimal totalInafecto, String moneda, BigDecimal importeTotal);
	ResumenComprobantePagoModel createResumenExonerado(BigDecimal totalExonerado, String moneda, BigDecimal importeTotal);

	BoletaModel findById(String id);

	List<BoletaModel> getAll(EmisorModel emisorModel);

	SearchResultsModel<BoletaModel> search(SearchCriteriaModel criteria);


	SearchResultsModel<BoletaModel> search( SearchCriteriaModel criteria,String filterText);

	SearchResultsModel<BoletaModel> search(BoletaModel emisorModel, SearchCriteriaModel criteria);
	SearchResultsModel<BoletaModel> search(BoletaModel emisorModel, SearchCriteriaModel criteria, String filterText);
    
}
