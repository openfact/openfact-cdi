package org.openfact.models;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import javax.ejb.Local;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by AHREN on 06/07/2016.
 */
@Local
public interface ComprobantePagoProvider extends Provider {
     /*
	private String serie;
	private String numero;
	private LocalDate fechaEmision;
	private String moneda;
	private double importeTotal;
	private double cargos;
	private double tributos;
	private double descuentos;
	private double totalOperacionesGravadas;
	private double totalOperacionesInafectas;
	private double totalOperacionesExoneradas;
	private double totalValorVentaOperacionesGratuitas;
	private double totalIgv;
	private double totalIsc;
	private AdquirienteModel adquiriente;
	// Catalogo 01
	private String numeroGuiaRemision;
	private EmisorModel emisor;
	*/

    ComprobantePagoModel create(String serie, String numero,LocalDate fechaEmision,double importeTotal,double totalIgv);

    ComprobantePagoModel findByNumero(String numero);

    SearchResultsModel<ComprobantePagoModel> search(SearchCriteriaModel criteria);

    SearchResultsModel<ComprobantePagoModel> search(SearchCriteriaModel criteria, String filterText);
}
