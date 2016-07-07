package org.openfact.representations.idm;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
public class ComprobantePagoRepresentation {
    private String serie;
    private String numero;
    private LocalDate fechaEmision;

    private String moneda;
    private BigDecimal importeTotal;

    private double cargos;
    private double tributos;
    private double descuentos;

    private double totalOperacionesGravadas;
    private double totalOperacionesInafectas;
    private double totalOperacionesExoneradas;

    private double totalValorVentaOperacionesGratuitas;

    private double totalIgv;
    private double totalIsc;

    private AdquirienteRepresentation adquiriente;

    // Catalogo 01

    private String numeroGuiaRemision;

    private EmisorRepresentation emisor;

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

    public double getCargos() {
        return cargos;
    }

    public void setCargos(double cargos) {
        this.cargos = cargos;
    }

    public double getTributos() {
        return tributos;
    }

    public void setTributos(double tributos) {
        this.tributos = tributos;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getTotalOperacionesGravadas() {
        return totalOperacionesGravadas;
    }

    public void setTotalOperacionesGravadas(double totalOperacionesGravadas) {
        this.totalOperacionesGravadas = totalOperacionesGravadas;
    }

    public double getTotalOperacionesInafectas() {
        return totalOperacionesInafectas;
    }

    public void setTotalOperacionesInafectas(double totalOperacionesInafectas) {
        this.totalOperacionesInafectas = totalOperacionesInafectas;
    }

    public double getTotalOperacionesExoneradas() {
        return totalOperacionesExoneradas;
    }

    public void setTotalOperacionesExoneradas(double totalOperacionesExoneradas) {
        this.totalOperacionesExoneradas = totalOperacionesExoneradas;
    }

    public double getTotalValorVentaOperacionesGratuitas() {
        return totalValorVentaOperacionesGratuitas;
    }

    public void setTotalValorVentaOperacionesGratuitas(double totalValorVentaOperacionesGratuitas) {
        this.totalValorVentaOperacionesGratuitas = totalValorVentaOperacionesGratuitas;
    }

    public double getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(double totalIgv) {
        this.totalIgv = totalIgv;
    }

    public double getTotalIsc() {
        return totalIsc;
    }

    public void setTotalIsc(double totalIsc) {
        this.totalIsc = totalIsc;
    }

    public AdquirienteRepresentation getAdquiriente() {
        return adquiriente;
    }

    public void setAdquiriente(AdquirienteRepresentation adquiriente) {
        this.adquiriente = adquiriente;
    }

    public String getNumeroGuiaRemision() {
        return numeroGuiaRemision;
    }

    public void setNumeroGuiaRemision(String numeroGuiaRemision) {
        this.numeroGuiaRemision = numeroGuiaRemision;
    }

    public EmisorRepresentation getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorRepresentation emisor) {
        this.emisor = emisor;
    }
}
