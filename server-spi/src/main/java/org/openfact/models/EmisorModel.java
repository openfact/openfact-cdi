package org.openfact.models;

public interface EmisorModel extends Model {

	String getId();

	String getRuc();

	String getRazonSocial();

	void setRazonSocial(String razonSocial);

	String getNombreComercial();

	void setNombreComercial(String nombreComercial);

	String getDomicilioFiscal();

	void setDomicilioFiscal(String domicilioFiscal);

	boolean getEstado();

	void setEstado(boolean estado);

	/*
	 * private String ruc; private String razonSocial; private String
	 * nombreComercial; private String domicilioFiscal;
	 */

}
