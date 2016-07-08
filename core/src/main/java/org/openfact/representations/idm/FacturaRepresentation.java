package org.openfact.representations.idm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public class FacturaRepresentation extends ComprobantePagoRepresentation implements Serializable {
    private BigDecimal igv;
    private BigDecimal isc;
    private String numeroDocumentoRelacionado;
    List<DetalleFacturaRepresentation> detalle;

    public List<DetalleFacturaRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleFacturaRepresentation> detalle) {
        this.detalle = detalle;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getIsc() {
        return isc;
    }

    public void setIsc(BigDecimal isc) {
        this.isc = isc;
    }

    public String getNumeroDocumentoRelacionado() {
        return numeroDocumentoRelacionado;
    }

    public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
        this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
    }
}
