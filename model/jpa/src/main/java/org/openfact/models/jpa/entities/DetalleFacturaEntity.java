package org.openfact.models.jpa.entities;

public class DetalleFacturaEntity {

	private String unidadMedida;
	private double cantidad;
	private String descripcion;

	private double valorUnitario;
	private double precioVenta;

	private double igv;
	private double isc;

	private FacturaEntity factura;
}
