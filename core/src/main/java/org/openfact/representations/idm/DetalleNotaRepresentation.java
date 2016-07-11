package org.openfact.representations.idm;

import java.io.Serializable;

/**
 * Created by Gissela-Sistemas on 11/07/2016.
 */
public class DetalleNotaRepresentation implements Serializable {
    private String motivo;
    private String unidadMedida;
    private double cantidad;
    private double cantida;

    private String codigoProducto;

    private String descripcion;
    private double valorUnitario;
    private double precio;

    private double igv;
    private double isc;

  private NotaRepresentation nota;

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

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

    public double getCantida() {
        return cantida;
    }

    public void setCantida(double cantida) {
        this.cantida = cantida;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getIsc() {
        return isc;
    }

    public void setIsc(double isc) {
        this.isc = isc;
    }

    public NotaRepresentation getNota() {
        return nota;
    }

    public void setNota(NotaRepresentation nota) {
        this.nota = nota;
    }
}
