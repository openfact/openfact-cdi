package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "EMISOR")
@Entity
@NamedQueries(value = { @NamedQuery(name = "EmisorEntity.findAll", query = "SELECT e FROM EmisorEntity e"),
        @NamedQuery(name = "EmisorEntity.findByPaisRuc", query = "SELECT e FROM EmisorEntity e WHERE e.pais=:pais AND e.ruc=:ruc"),
        @NamedQuery(name = "EmisorEntity.findByPaisRazonSocial", query = "SELECT e FROM EmisorEntity e WHERE e.pais=:pais AND e.razonSocial=:razonSocial") })
public class EmisorEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ID", length = 36)
    private String id;

    @Column(name = "PAIS")
    private String pais;

    @Column(name = "RUC")
    private String ruc;

    @Column(name = "RAZON_SOCIAL", unique = true)
    private String razonSocial;

    @Column(name = "NOMBRE_COMERCIAL")
    private String nombreComercial;

    @Column(name = "DOMICILIO_FISCAL")
    private String domicilioFiscal;

    @Type(type = "org.hibernate.type.TrueFalseType")
    @Column(name = "ESTADO")
    private boolean estado;

    @Version
    private Integer version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
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
        EmisorEntity other = (EmisorEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
