package org.openfact.representations.idm;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
public class BoletaRepresentation extends ComprobantePagoRepresentation implements Serializable {

    public String getNumeroDocumentoRelacionado() {
        return numeroDocumentoRelacionado;
    }

    public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
        this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
    }

    public List<DetalleBoletaRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleBoletaRepresentation> detalle) {
        this.detalle = detalle;
    }

    private String numeroDocumentoRelacionado;
    List<DetalleBoletaRepresentation> detalle;
}
