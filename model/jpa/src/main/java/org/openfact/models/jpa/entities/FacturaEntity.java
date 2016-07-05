package org.openfact.models.jpa.entities;

public class FacturaEntity extends ComprobantePagoEntity {

	private double igv;
	private double isc;

	// Catalogo 12
	private DocumentoRelacionadoTributarioEntity documentoRelacionado;
	private String numeroDocumentoRelacionado;

	private EnvioEntity envio;

}
