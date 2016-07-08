package org.openfact.models.jpa.entities;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name="HISTORIAL_EMISOR")
@Entity
@org.hibernate.annotations.NamedQueries(value = {
        @org.hibernate.annotations.NamedQuery(name = "HistorialEmisorEntity.findAll", query = "SELECT d FROM HistorialEmisorEntity d"),
        @org.hibernate.annotations.NamedQuery(name = "HistorialEmisorEntity.findByEstado", query = "SELECT d FROM HistorialEmisorEntity d WHERE d.estado = :estado")})
public class HistorialEmisorEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name="ID", length = 36)
    private String id;

    @Column(name="RESOLUCION_AUTORIZACION")
    private String resolucionAutorizacion;

    @Column(name="MENSAJE_REPRESENTACION_IMPRESA")
    private String mensajeRepresentacionImpresa;

    @Column(name="MENSAJE_SERVICIO_GRATUITO")
    private String mensajeServicioGratuito;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EMISOR", foreignKey = @ForeignKey)
    private EmisorEntity emisor;

    @Type(type = "org.hibernate.type.TrueFalseType")
    @Column(name = "ESTADO")
    private boolean estado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResolucionAutorizacion() {
        return resolucionAutorizacion;
    }

    public void setResolucionAutorizacion(String resolucionAutorizacion) {
        this.resolucionAutorizacion = resolucionAutorizacion;
    }
    public String getMensajeRepresentacionImpresa() {
        return mensajeRepresentacionImpresa;
    }

    public void setMensajeRepresentacionImpresa(String mensajeRepresentacionImpresa) {
        this.mensajeRepresentacionImpresa = mensajeRepresentacionImpresa;
    }

    public String getMensajeServicioGratuito() {
        return mensajeServicioGratuito;
    }

    public void setMensajeServicioGratuito(String mensajeServicioGratuito) {
        this.mensajeServicioGratuito = mensajeServicioGratuito;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public EmisorEntity getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorEntity emisor) {
        this.emisor = emisor;
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
        HistorialEmisorEntity other = (HistorialEmisorEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
