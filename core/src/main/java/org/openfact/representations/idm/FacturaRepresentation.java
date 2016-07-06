package org.openfact.representations.idm;

import java.io.Serializable;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public class FacturaRepresentation extends ComprobantePagoRepresentation implements Serializable {
    private double igv;
    private double isc;
    private String numeroDocumentoRelacionado;

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getIsc() {
        return isc;
    }

    public void setIsc(double isc) {
        this.isc = isc;
    }

    public String getNumeroDocumentoRelacionado() {
        return numeroDocumentoRelacionado;
    }

    public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
        this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
    }
}
