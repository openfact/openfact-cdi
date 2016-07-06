package org.openfact.models;

public interface FacturaModel extends ComprobantePagoModel {

    double getIgv();

    double getIsc();

    DocumentoRelacionadoTributario getDocumentoRelacionado();

    String getNumeroDocumentoRelacionado();

    void setIgv(double igv);

    void setIsc(double isc);

    void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado);
/*	private double igv;
    private double isc;

	// Catalogo 12
	private DocumentoRelacionadoTributario documentoRelacionado;
	private String numeroDocumentoRelacionado;*/

}
