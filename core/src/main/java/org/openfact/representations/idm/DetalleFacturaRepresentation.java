package org.openfact.representations.idm;

import java.io.Serializable;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
public class DetalleFacturaRepresentation implements Serializable {
    private String unidadMedida;
    private double cantidad;
    private String descripcion;

    private double valorUnitario;
    private double precioVenta;

    private double igv;
    private double isc;

    private FacturaRepresentation factura;

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

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
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

    public FacturaRepresentation getFactura() {
        return factura;
    }

    public void setFactura(FacturaRepresentation factura) {
        this.factura = factura;
    }
}
