package org.openfact.representations.idm;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class NotaRepresentation implements Serializable {
    //    private String serie;
//    private String numero;
//    private LocalDate fechaEmision;
//
//    private String moneda;
//    private double importeTotal;
//
//    private double cargos;
//    private double tributos;
//
//    private double totalOperacionesGravadas;
//    private double totalOperacionesInafectas;
//    private double totalOperacionesExoneradas;
//
//    private double totalIgv;
//    private double totalIsc;
//
//    private TipoNotaModel tipoNota;
//
//    private AdquirienteRepresentation adquiriente;
//
//    private EmisorRepresentation emisor;
//
//
//    private ComprobantePagoRepresentation comprobante;
//    private String DocumentoReferencia;
    private AdquirienteRepresentation adquiriente;

    private ComprobantePagoRepresentation comprobantePagoRepresentation;

    private EmisorRepresentation emisor;

    private List<DetalleNotaRepresentation> detalle;

    public List<DetalleNotaRepresentation> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<DetalleNotaRepresentation> detalle) {
        this.detalle = detalle;
    }

    public AdquirienteRepresentation getAdquiriente() {
        return adquiriente;
    }

    public void setAdquiriente(AdquirienteRepresentation adquiriente) {
        this.adquiriente = adquiriente;
    }

    public EmisorRepresentation getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorRepresentation emisor) {
        this.emisor = emisor;
    }

    public ComprobantePagoRepresentation getComprobantePagoRepresentation() {
        return comprobantePagoRepresentation;
    }

    public void setComprobantePagoRepresentation(ComprobantePagoRepresentation comprobantePagoRepresentation) {
        this.comprobantePagoRepresentation = comprobantePagoRepresentation;
    }
}
