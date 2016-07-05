package org.openfact.models;

import java.time.LocalDate;

public class ComprobantePagoModel {

	// Catalogo 01
	private TipoDocumentoModel tipoDocumento;

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
	private TipoDocumentoModel tipoDocumentoGuiaRemision;
	private String numeroGuiaRemision;

	private HistorialEmisorModel historialEmisor;
}
