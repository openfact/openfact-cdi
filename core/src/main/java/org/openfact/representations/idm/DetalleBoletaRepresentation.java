package org.openfact.representations.idm;

import java.io.Serializable;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
public class DetalleBoletaRepresentation implements Serializable {
    private String unidadMedida;
    private double cantidad;
    private String descripcion;

    private double precioVenta;

    private BoletaRepresentation boleta;

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public BoletaRepresentation getBoleta() {
        return boleta;
    }

    public void setBoleta(BoletaRepresentation boleta) {
        this.boleta = boleta;
    }
}
