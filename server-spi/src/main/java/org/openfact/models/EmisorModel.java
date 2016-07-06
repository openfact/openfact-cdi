package org.openfact.models;

public interface EmisorModel extends Model {

	String getId();

	String getRuc();

	String getRazonSocial();

	String getNombreComercial();

	void setNombreComercial(String nombreComercial);

	String getDomicilioFiscal();

	void setDomicilioFiscal(String domicilioFiscal);

	boolean getEstado();

	void setEstado(boolean estado);

}
