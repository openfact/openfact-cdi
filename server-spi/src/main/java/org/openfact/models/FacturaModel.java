package org.openfact.models;

public class FacturaModel extends ComprobantePagoModel {

	private double igv;
	private double isc;

	// Catalogo 12
	private DocumentoRelacionadoTributario documentoRelacionado;
	private String numeroDocumentoRelacionado;

	private EnvioModel envio;

}
