package org.openfact.models.jpa.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "DIRECCION_REGIONAL")
@NamedQueries(value = {
		@NamedQuery(name = "DireccionRegionalEntity.findAll", query = "SELECT d FROM DireccionRegionalEntity d"),
		@NamedQuery(name = "DireccionRegionalEntity.findByDenominacion", query = "SELECT d FROM DireccionRegionalEntity d WHERE d.denominacion = :denominacion") })
public class DireccionRegionalEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7440521067260177441L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@NaturalId(mutable = true)
	@Column(name = "DENOMINACION")
	private String denominacion;

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

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Integer getOptlk() {
		return optlk;
	}

	public void setOptlk(Integer optlk) {
		this.optlk = optlk;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denominacion == null) ? 0 : denominacion.hashCode());
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
		DireccionRegionalEntity other = (DireccionRegionalEntity) obj;
		if (denominacion == null) {
			if (other.denominacion != null)
				return false;
		} else if (!denominacion.equals(other.denominacion))
			return false;
		return true;
	}

}
