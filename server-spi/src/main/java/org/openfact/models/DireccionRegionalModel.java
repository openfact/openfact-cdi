package org.openfact.models;

public interface DireccionRegionalModel extends Model {

	String getId();

	String getDenominacion();

	void setDenominacion(String denominacion);

	boolean getEstado();

	void setEstado(boolean estado);

    String setObservacion();
}
