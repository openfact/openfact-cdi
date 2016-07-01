package org.openfact.models;

/**
 * Created by Alex Pariona on 1/07/2016.
 */
public class DetalleFacturaModel {
	FacturaModel factura;
	String UnidadMedida;
	double Cantidad;
	String Descripcion;
	double PrecioVenta;
	// double Igv;
	double ValorUnitario;
	String Codigo;// 01--pv+igv/02--operaciones no onerosas
	String AfectacionIgv;
	String ISC;// Catalogo 8
}
