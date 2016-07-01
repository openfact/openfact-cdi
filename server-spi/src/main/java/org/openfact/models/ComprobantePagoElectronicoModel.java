package org.openfact.models;

import java.util.Date;

/**
 * Created by Alex Pariona on 1/07/2016.
 */
public class ComprobantePagoElectronicoModel extends DocumentoElectronicoModel {
	Date FechaEmision;
	/*-----INI DATOS CONTRIBUYENTE----*/
	String RazonSocial;
	String NombreComercial;
	String DomicilioFiscal;
	String NumeroRuc;
	/*-----END DATOS CONTRIBUYENTE----*/
	String TipoDocumento;/* 01--caso de facturas *//* 06--Caso de Boleta */
	String SerieComprobantePago;
	String NumeroComprobantePago;
	String TipoNumeroDocumento;
	String NumeroDocumento;
	/*------------RESUMEN IMPORTE TOTAL----------*/
	double TotalVentaGravadas;
	double TotalVentaInafectas;
	double TotalVentaExoneradas;
	double TotalIgv;
	double TotalISC;
	double TotalTributos;
	double TotalOtrosCargos;
	double TotalDescuentos;
	double TotalVenta;
	String TipoMoneda;
	/*------------INFORMACION ADICIONAL----------*/
	String TipoGuia;
	String NumeroGuia;
	String LeyendaTransferencia;
	String LeyendaRepresentacion;
	String LeyendaAutorizacion;
	double TotalVentaGratuita;
}
