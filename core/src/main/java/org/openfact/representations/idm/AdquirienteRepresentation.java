package org.openfact.representations.idm;

import java.io.Serializable;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public class AdquirienteRepresentation implements Serializable {
    private String numeroDocumento;
    private String nombre;
    private String direccion;

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
