package org.openfact.models;

import java.time.LocalDate;

public interface ComprobantePagoModel {

    TipoDocumentoModel getTipoDocumento();

    String getSerie();

    String getNumero();

    LocalDate getFechaEmision();

    String getMoneda();

    double getImporteTotal();

    double getCargos();

    double getTributos();

    double getDescuentos();

    double getTotalOperacionesGravadas();

    double getTotalOperacionesExoneradas();

    double getTotalOperacionesInafectas();

    double getTotalValorVentaOperacionesGratuitas();

    double getTotalIgv();

    double getTotalIsc();

    AdquirienteModel getAdquiriente();

    TipoDocumentoModel getTipoDocumentoGuiaRemision();

    String getNumeroGuiaRemision();

    EmisorModel getEmisor();

    // Catalogo 01
    /*private TipoDocumentoModel tipoDocumento;

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

	private EmisorModel emisor;*/
}
