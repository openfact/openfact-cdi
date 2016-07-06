package org.openfact.models;

public interface DetalleFacturaModel {

    String getUnidadMedida();

    void setUnidadMedida(String unidadMedida);

    double getCantidad();

    void setCantidad(double cantidad);

    String getDescripcion();

    void setDescripcion(String descripcion);

    double getValorUnitario();

    void setValorUnitario(double valorUnitario);

    double getPrecioVenta();

    void setPrecioVenta(double precioVenta);

    double getIgv();

    void setIgv(double igv);

    double getIsc();

    void setIsc(double isc);

    FacturaModel getFactura();

}
