package org.openfact.models;

public interface DireccionRegionalModel extends Model {

	public String Id = "";

	String getId();

	String getDenominacion();

	void setDenominacion(String denominacion);

	boolean getEstado();

	void setEstado(boolean estado);

    String setObservacion();
}
