package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name="HISTORIAL_EMISOR")
@Entity
public class HistorialEmisorEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name="id", length = 36)
    private String id;

    @Column(name="resolucion_autorizacion")
    private String resolucionAutorizacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emisor", foreignKey = @ForeignKey)
    private EmisorEntity emisor;

    @Type(type = "org.hibernate.type.TrueFalseType")
    @Column(name = "estado")
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

    public EmisorEntity getEmisor() {
        return emisor;
    }

    public void setEmisor(EmisorEntity emisor) {
        this.emisor = emisor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
