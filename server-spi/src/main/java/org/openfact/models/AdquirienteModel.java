package org.openfact.models;

public interface AdquirienteModel {

    String getNumeroDocumento();

    String getNombre();

    String getDireccion();

    void setNombre(String nombre);

    void setDireccion(String direccion);

    DocumentoIdentidadModel getDocumento();

   /* private DocumentoIdentidadModel documento;
    private String numeroDocumento;
    private String nombre;
    private String direccion;*/

}
