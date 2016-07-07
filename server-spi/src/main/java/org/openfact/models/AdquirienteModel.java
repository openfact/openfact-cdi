package org.openfact.models;

public interface AdquirienteModel extends Model {

	String getId();

	void setNumeroDocumento(String numeroDocumento);

	String getNumeroDocumento();

	String getNombre();

	void setNombre(String nombre);

	String getDireccion();

	void setDireccion(String direccion);

	DocumentoIdentidadModel getDocumento();

}
