package org.openfact.models.jpa.entities;

import org.hibernate.annotations.*;
import org.openfact.models.ResumenNotaModel;
import org.openfact.models.enums.TipoNotaType;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "NOTA")
@NamedQueries(value = { @NamedQuery(name = "NotaEntity.findAll", query = "SELECT n FROM NotaEntity n"),
        @NamedQuery(name = "NotaEntity.findByNumeracion", query = "SELECT n FROM NotaEntity n WHERE n.serie=:serie AND n.numero=:numero"),
        @NamedQuery(name = "EmisorEntity.findByNumeracion", query = "SELECT e FROM EmisorEntity e WHERE e.pais=:pais AND e.ruc=:ruc") })

public class NotaEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name ="uuid2", strategy = "uuid2")
    @Column(name = "ID")
    private String id;

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

//    @OneToMany(cascade = {CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "nota")
//    private ResumenNotaEntity resumenNota;

    public String getGetId() {
        return id;
    }

    public void setGetId(String getId) {
        this.id = getId;
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
       NotaEntity other = (NotaEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
