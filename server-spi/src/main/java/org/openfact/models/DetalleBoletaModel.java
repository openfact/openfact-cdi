package org.openfact.models;

public interface DetalleBoletaModel extends Model{
	String getUnidadMedida();

	void setUnidadMedida(String unidadMedida);

	 double getCantidad();

	 void setCantidad(double cantidad);

	 String getDescripcion();

	void setDescripcion(String descripcion);

	double getPrecioVenta();

    void setPrecioVenta(double precioVenta);

	 BoletaModel getBoleta();

	 void setBoleta(BoletaModel boleta);
}
