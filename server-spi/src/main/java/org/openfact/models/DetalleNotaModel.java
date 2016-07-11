package org.openfact.models;

import java.math.BigDecimal;

public interface DetalleNotaModel {


    String getId();

    String getMotivo();

    void setMotivo(String motivo);

    String getUnidadMedida();

    void setUnidadMedida(String unidadMedida);

    BigDecimal getCantidad();

    void setCantidad(BigDecimal cantidad);

    String getCodigoProducto();

    void setCodigoProducto(String codigoProducto);

    String getDescripcion();

    void setDescripcion(String descripcion);

    BigDecimal getValorUnitario();

    void setValorUnitario(BigDecimal valorUnitario);

    BigDecimal getPrecio();

    void setPrecio(BigDecimal precio);

    BigDecimal getIgv();

    void setIgv(BigDecimal igv);

    BigDecimal getIsc();

     void setIsc(BigDecimal isc);

    NotaModel getNota();
}
