package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;
import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.enums.TipoGuiaRemisionType;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@MappedSuperclass
public class ComprobantePagoEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ID")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMISOR", foreignKey = @ForeignKey)
    private EmisorEntity emisor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADQUIRIENTE", foreignKey = @ForeignKey)
    private AdquirienteEntity adquiriente;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "TIPO_DOCUMENTO")
    private TipoDocumentoType tipoDocumento;

    @NotNull
    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @NotNull
    @NotBlank
    @Column(name = "SERIE")
    private String serie;

    @NotNull
    @NotBlank
    @Column(name = "NUMERO")
    private String numero;

    @NotNull
    @NotBlank
    @Column(name = "MONEDA")
    private String moneda;

    @NotNull
    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "IMPORTE_TOTAL")
    private BigDecimal importeTotal;


    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "IGV")
    private double igv;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "ISC")
    private double isc;


    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "CARGOS")
    private double cargos;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TRIBUTOS")
    private double tributos;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "DESCUENTOS")
    private double descuentos;


    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_GRAVADO")
    private double totalGravado;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_INAFECTO")
    private double totalInafecto;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_EXONERADO")
    private double totalExonerado;


    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_DOCUMENTO")
    private TipoGuiaRemisionType tipoGuiaRemision;

    @Column(name = "NUMERO_GUIA_REMISION")
    private String numeroGuiaRemision;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EmisorEntity getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorEntity emisor) {
        this.emisor = emisor;
    }

    public AdquirienteEntity getAdquiriente() {
        return adquiriente;
    }

    public void setAdquiriente(AdquirienteEntity adquiriente) {
        this.adquiriente = adquiriente;
    }

    public TipoDocumentoType getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoType tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
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

    public double getTotalGravado() {
        return totalGravado;
    }

    public void setTotalGravado(double totalGravado) {
        this.totalGravado = totalGravado;
    }

    public double getTotalInafecto() {
        return totalInafecto;
    }

    public void setTotalInafecto(double totalInafecto) {
        this.totalInafecto = totalInafecto;
    }

    public double getTotalExonerado() {
        return totalExonerado;
    }

    public void setTotalExonerado(double totalExonerado) {
        this.totalExonerado = totalExonerado;
    }

    public TipoGuiaRemisionType getTipoGuiaRemision() {
        return tipoGuiaRemision;
    }

    public void setTipoGuiaRemision(TipoGuiaRemisionType tipoGuiaRemision) {
        this.tipoGuiaRemision = tipoGuiaRemision;
    }

    public String getNumeroGuiaRemision() {
        return numeroGuiaRemision;
    }

    public void setNumeroGuiaRemision(String numeroGuiaRemision) {
        this.numeroGuiaRemision = numeroGuiaRemision;
    }
}
