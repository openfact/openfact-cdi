package org.openfact.models;

import java.math.BigDecimal;

public interface DetalleBoletaModel extends Model {

    String getId();

    String getUnidadMedida();

    void setUnidadMedida(String unidadMedida);

    BigDecimal getCantidad();

    void setCantidad(BigDecimal cantidad);

    String getDescripcion();

    void setDescripcion(String descripcion);

    BigDecimal getPrecioVenta();

    void setPrecioVenta(BigDecimal precioVenta);

    BoletaModel getBoleta();

}
