package org.openfact.models;

/**
 * Created by Alex Pariona on 1/07/2016.
 */
public class FacturaModel extends ComprobantePagoElectronicoModel {

	String RazonSocialAdqueriente;

	/*------------RESUMEN IMPORTE TOTAL----------*/	
	double ValorVenta;	
	/*------------INFORMACION ADICIONAL----------*/	
	String TipoNumeroOtroDocumento;
	String NumeroOtroDocumento;
	String CodigoOtroDocumento;	
	/*------------DATOS ADICIONALES----------*/
	String DireccionPartida;
	String DireccionLlegada;
	String MarcaVehiculo;
	String PlacaVehiculo;
	String NumeroLicenciaConducir;
	String RucTransportista;
	String RazonSocialTransportista;
}
