package org.openfact.models;

import java.math.BigDecimal;

public interface ResumenComprobantePagoModel extends Model {

	public String getId();

	public BigDecimal getIgv();

	public void setIgv(BigDecimal igv);

	public BigDecimal getIsc();

	public void setIsc(BigDecimal isc);

	public BigDecimal getCargos();

	public void setCargos(BigDecimal cargos);

	public BigDecimal getTributos();

	public void setTributos(BigDecimal tributos);

	public BigDecimal getDescuentos();

	public void setDescuentos(BigDecimal descuentos);

	public BigDecimal getTotalGravado();

	public void setTotalGravado(BigDecimal totalGravado);

	public BigDecimal getTotalInafecto();

	public void setTotalInafecto(BigDecimal totalInafecto);

	public BigDecimal getTotalExonerado();

	public void setTotalExonerado(BigDecimal totalExonerado);

	public String getMoneda();

	public void setMoneda(String moneda);

	public BigDecimal getImporteTotal();

	public void setImporteTotal(BigDecimal importeTotal);

}
