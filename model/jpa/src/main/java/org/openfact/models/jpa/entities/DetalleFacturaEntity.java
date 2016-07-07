package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "DETALLE_FACTURA")
public class DetalleFacturaEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@NotNull
	@Column(name = "UNIDAD_MEDIDA")
	private String unidadMedida;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "CANTIDAD")
	private BigDecimal cantidad;

	@NotNull
	@Column(name = "DESCRIPCION")
	private String descripcion;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "VALOR_UNITARIO")
	private BigDecimal valorUnitario;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "PRECIO_VENTA")
	private BigDecimal precioVenta;

	@NotNull
	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "IGV")
	private BigDecimal igv;

	@Min(value = 0)
	@Digits(integer = 18, fraction = 2)
	@Column(name = "ISC")
	private BigDecimal isc;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey)
	private FacturaEntity factura;

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

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public BigDecimal getIsc() {
		return isc;
	}

	public void setIsc(BigDecimal isc) {
		this.isc = isc;
	}

	public FacturaEntity getFactura() {
		return factura;
	}

	public void setFactura(FacturaEntity factura) {
		this.factura = factura;
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
		DetalleFacturaEntity other = (DetalleFacturaEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
