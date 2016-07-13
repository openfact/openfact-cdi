package org.openfact.models.jpa.entities;

import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "RESUMEN_DIARIO")
@Entity
public class ResumenDiarioEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ID", length = 36)
    private String id;

    @Column(name = "TIPO_DOCUMENTO")
    private String TipoDocumento;

    private String NumeroSerie;

    private String NumeroCorrelativoInicio;

    private String NumeroCorrelativoFin;

    private BigDecimal TotalValorVentaOpeGrabadas;

    private BigDecimal TotalValorVentaOpeExoneradas;

    private BigDecimal TotalValorVentaOpeInafectas;

    private BigDecimal ImporteTotalOtrosCargos;

    private BigDecimal TotalISC;

    private BigDecimal TotalIGV;

    private BigDecimal TotalOtrosTributos;

    private BigDecimal ImporteTotalVenta;

    private BigDecimal totalValorVentaOperacionesGratuitas;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        NumeroSerie = numeroSerie;
    }

    public String getNumeroCorrelativoInicio() {
        return NumeroCorrelativoInicio;
    }

    public void setNumeroCorrelativoInicio(String numeroCorrelativoInicio) {
        NumeroCorrelativoInicio = numeroCorrelativoInicio;
    }

    public String getNumeroCorrelativoFin() {
        return NumeroCorrelativoFin;
    }

    public void setNumeroCorrelativoFin(String numeroCorrelativoFin) {
        NumeroCorrelativoFin = numeroCorrelativoFin;
    }

    public BigDecimal getTotalValorVentaOpeGrabadas() {
        return TotalValorVentaOpeGrabadas;
    }

    public void setTotalValorVentaOpeGrabadas(BigDecimal totalValorVentaOpeGrabadas) {
        TotalValorVentaOpeGrabadas = totalValorVentaOpeGrabadas;
    }

    public BigDecimal getTotalValorVentaOpeExoneradas() {
        return TotalValorVentaOpeExoneradas;
    }

    public void setTotalValorVentaOpeExoneradas(BigDecimal totalValorVentaOpeExoneradas) {
        TotalValorVentaOpeExoneradas = totalValorVentaOpeExoneradas;
    }

    public BigDecimal getTotalValorVentaOpeInafectas() {
        return TotalValorVentaOpeInafectas;
    }

    public void setTotalValorVentaOpeInafectas(BigDecimal totalValorVentaOpeInafectas) {
        TotalValorVentaOpeInafectas = totalValorVentaOpeInafectas;
    }

    public BigDecimal getImporteTotalOtrosCargos() {
        return ImporteTotalOtrosCargos;
    }

    public void setImporteTotalOtrosCargos(BigDecimal importeTotalOtrosCargos) {
        ImporteTotalOtrosCargos = importeTotalOtrosCargos;
    }

    public BigDecimal getTotalISC() {
        return TotalISC;
    }

    public void setTotalISC(BigDecimal totalISC) {
        TotalISC = totalISC;
    }

    public BigDecimal getTotalIGV() {
        return TotalIGV;
    }

    public void setTotalIGV(BigDecimal totalIGV) {
        TotalIGV = totalIGV;
    }

    public BigDecimal getTotalOtrosTributos() {
        return TotalOtrosTributos;
    }

    public void setTotalOtrosTributos(BigDecimal totalOtrosTributos) {
        TotalOtrosTributos = totalOtrosTributos;
    }

    public BigDecimal getImporteTotalVenta() {
        return ImporteTotalVenta;
    }

    public void setImporteTotalVenta(BigDecimal importeTotalVenta) {
        ImporteTotalVenta = importeTotalVenta;
    }

    public BigDecimal getTotalValorVentaOperacionesGratuitas() {
        return totalValorVentaOperacionesGratuitas;
    }

    public void setTotalValorVentaOperacionesGratuitas(BigDecimal totalValorVentaOperacionesGratuitas) {
        this.totalValorVentaOperacionesGratuitas = totalValorVentaOperacionesGratuitas;
    }
}
