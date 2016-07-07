package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "RESUMEN_COMPROBANTE_PAGO")
public class ResumenComprobantePagoEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@NotNull
	@NotBlank
	@Column(name = "MONEDA")
	protected String moneda;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "IMPORTE_TOTAL")
	protected BigDecimal importeTotal;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		ResumenComprobantePagoEntity other = (ResumenComprobantePagoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
