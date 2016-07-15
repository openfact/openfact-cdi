package org.openfact.representations.idm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class NotaRepresentation implements Serializable {
        private String serie;
    private String numero;
    private LocalDate fechaEmision;

    private String moneda;
    private BigDecimal importeTotal;

    private BigDecimal cargos;
    private BigDecimal tributos;

    private BigDecimal totalOperacionesGravadas;
    private BigDecimal totalOperacionesInafectas;
    private BigDecimal totalOperacionesExoneradas;

    private BigDecimal totalIgv;
    private BigDecimal totalIsc;

//    private TipoNotaModel tipoNota;

    private ComprobantePagoRepresentation comprobante;
    private String DocumentoReferencia;
    private AdquirienteRepresentation adquiriente;


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


    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getCargos() {
        return cargos;
    }

    public void setCargos(BigDecimal cargos) {
        this.cargos = cargos;
    }

    public BigDecimal getTributos() {
        return tributos;
    }

    public void setTributos(BigDecimal tributos) {
        this.tributos = tributos;
    }

    public BigDecimal getTotalOperacionesGravadas() {
        return totalOperacionesGravadas;
    }

    public void setTotalOperacionesGravadas(BigDecimal totalOperacionesGravadas) {
        this.totalOperacionesGravadas = totalOperacionesGravadas;
    }

    public BigDecimal getTotalOperacionesInafectas() {
        return totalOperacionesInafectas;
    }

    public void setTotalOperacionesInafectas(BigDecimal totalOperacionesInafectas) {
        this.totalOperacionesInafectas = totalOperacionesInafectas;
    }

    public BigDecimal getTotalOperacionesExoneradas() {
        return totalOperacionesExoneradas;
    }

    public void setTotalOperacionesExoneradas(BigDecimal totalOperacionesExoneradas) {
        this.totalOperacionesExoneradas = totalOperacionesExoneradas;
    }

    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    public BigDecimal getTotalIsc() {
        return totalIsc;
    }

    public void setTotalIsc(BigDecimal totalIsc) {
        this.totalIsc = totalIsc;
    }

    public ComprobantePagoRepresentation getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobantePagoRepresentation comprobante) {
        this.comprobante = comprobante;
    }

    public String getDocumentoReferencia() {
        return DocumentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        DocumentoReferencia = documentoReferencia;
    }
}
