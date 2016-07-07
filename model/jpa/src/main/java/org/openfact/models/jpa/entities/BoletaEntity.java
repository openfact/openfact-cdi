package org.openfact.models.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BOLETA")
@DiscriminatorValue(value = "BOLETA")
public class BoletaEntity extends ComprobantePagoEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey)
	private ResumenDiarioEntity resumenDiario;

	@OneToMany(cascade = { CascadeType.REMOVE }, orphanRemoval = true, mappedBy = "boleta")
	private Set<DetalleBoletaEntity> detalle = new HashSet<>();

	public ResumenDiarioEntity getResumenDiario() {
		return resumenDiario;
	}

	public void setResumenDiario(ResumenDiarioEntity resumenDiario) {
		this.resumenDiario = resumenDiario;
	}

	public Set<DetalleBoletaEntity> getDetalle() {
		return detalle;
	}

	public void setDetalle(Set<DetalleBoletaEntity> detalle) {
		this.detalle = detalle;
	}

}
