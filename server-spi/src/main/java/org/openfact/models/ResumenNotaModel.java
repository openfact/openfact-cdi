package org.openfact.models;

import java.math.BigDecimal;

/**
 * Created by Gissela-Sistemas on 12/07/2016.
 */
public interface ResumenNotaModel extends Model {

    public String getId();

    public String getMoneda();

    public void setMoneda(String moneda);

    public BigDecimal getImporteTotal();

    public void setImporteTotal(BigDecimal importeTotal);

    public BigDecimal getCargos();

    public void setCargos(BigDecimal cargos);

    public BigDecimal getTributos();

    public void setTributos(BigDecimal tributos);

    public BigDecimal getTotalGravado();

    public void setTotalGravado(BigDecimal totalGravado);

    public BigDecimal getTotalInafecto();

    public void setTotalInafecto(BigDecimal totalInafecto);

    public BigDecimal getTotalExonerado();

    public void setTotalExonerado(BigDecimal totalExonerado);

    public BigDecimal getIgvTotal();

    public void setIgvTotal(BigDecimal igvTotal);

    public BigDecimal getIscTotal();

    public void setIscTotal(BigDecimal iscTotal);

}
