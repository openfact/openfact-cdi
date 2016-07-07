package org.openfact.models;

import java.math.BigDecimal;

public interface DetalleFacturaModel {

    String getId();

    String getUnidadMedida();

    void setUnidadMedida(String unidadMedida);

    BigDecimal getCantidad();

    void setCantidad(BigDecimal cantidad);

    String getDescripcion();

    void setDescripcion(String descripcion);

    BigDecimal getValorUnitario();

    void setValorUnitario(BigDecimal valorUnitario);

    BigDecimal getPrecioVenta();

    void setPrecioVenta(BigDecimal precioVenta);

    BigDecimal getIgv();

    void setIgv(BigDecimal igv);

    BigDecimal getIsc();

    void setIsc(BigDecimal isc);

    FacturaModel getFactura();

}
