package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.openfact.models.ResumenNotaModel;
import org.openfact.models.enums.TipoNotaType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NOTA")
public class NotaEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2")
    @Column(name = "ID")
    private String getId;

    @NotNull
    @Column(name = "SERIE")
    private String serie;

    @NotNull
    @Column(name = "NUMERO")
    private String numero;

    @NotNull
    @Column(name = "FECHA_EMISION")
    private LocalDate fechaEmision;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TIPO_NOTA", foreignKey = @ForeignKey)
    private TipoNotaEntity tipoNota;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ADQUIRIENTE", foreignKey = @ForeignKey)
    private AdquirienteEntity adquiriente;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HISTORIAL_EMISOR", foreignKey = @ForeignKey)
    private HistorialEmisorEntity historialEmisor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPROBANTE", foreignKey = @ForeignKey)
    private ComprobantePagoEntity comprobante;


    @Column(name = "DOCUMENTO_REFERENCIA")
    private String DocumentoReferencia;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESUM", foreignKey = @ForeignKey)
    private ResumenNotaEntity resumen;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey)
    private EnvioEntity envio;

    @OneToMany(cascade = {CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "nota")
    private Set<DetalleNotaEntity> detalle= new HashSet<>();

    public String getGetId() {
        return getId;
    }

    public void setGetId(String getId) {
        this.getId = getId;
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


    public TipoNotaEntity getTipoNota() {
        return tipoNota;
    }

    public void setTipoNota(TipoNotaEntity tipoNota) {
        this.tipoNota = tipoNota;
    }

    public AdquirienteEntity getAdquiriente() {
        return adquiriente;
    }

    public void setAdquiriente(AdquirienteEntity adquiriente) {
        this.adquiriente = adquiriente;
    }

    public HistorialEmisorEntity getHistorialEmisor() {
        return historialEmisor;
    }

    public void setHistorialEmisor(HistorialEmisorEntity historialEmisor) {
        this.historialEmisor = historialEmisor;
    }

    public ComprobantePagoEntity getComprobante() {
        return comprobante;
    }

    public void setComprobante(ComprobantePagoEntity comprobante) {
        this.comprobante = comprobante;
    }

    public String getDocumentoReferencia() {
        return DocumentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        DocumentoReferencia = documentoReferencia;
    }

    public EnvioEntity getEnvio() {
        return envio;
    }

    public void setEnvio(EnvioEntity envio) {
        this.envio = envio;
    }

    public ResumenNotaEntity getResumen() {
        return resumen;
    }

    public void setResumen(ResumenNotaEntity resumen) {
        this.resumen = resumen;
    }
}
