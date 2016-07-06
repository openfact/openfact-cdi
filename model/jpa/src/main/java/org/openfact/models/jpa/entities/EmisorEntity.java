package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Table(name = "EMISOR")
@Entity
@NamedQueries(value = {
        @NamedQuery(name = "EmisorEntity.findAll", query = "SELECT d FROM EmisorEntity d"),
        @NamedQuery(name = "EmisorEntity.findByRuc", query = "SELECT d FROM EmisorEntity d WHERE d.ruc = :ruc"),
        @NamedQuery(name = "EmisorEntity.findByRazonSocial", query = "SELECT d FROM EmisorEntity d WHERE d.razonSocial = :razonSocial")})
public class EmisorEntity {

	@Id
	@Access(AccessType.PROPERTY)
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID", length = 36)
	private String id;

	@Column(name = "RUC", unique = true)
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
	private Integer optlk;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
