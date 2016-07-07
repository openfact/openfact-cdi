package org.openfact.models.jpa.entities;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "DETALLE_BOLETA")
public class DetalleBoletaEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@NotNull
	@Column(name="UNIDAD_MEDIDA")
	private String unidadMedida;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name="CANTIDAD")
	private BigDecimal cantidad;

	@NotNull
	@Column(name="DESCRIPCION")
	private String descripcion;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name="PRECIO_VENTA")
	private BigDecimal precioVenta;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey)
	private BoletaEntity boleta;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BoletaEntity getBoleta() {
		return boleta;
	}

	public void setBoleta(BoletaEntity boleta) {
		this.boleta = boleta;
	}
}
