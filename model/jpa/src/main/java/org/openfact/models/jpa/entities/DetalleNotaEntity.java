package org.openfact.models.jpa.entities;

public class DetalleNotaEntity {

    private String motivo;
    private String unidadMedida;
    private double cantidad;

    private String codigoProducto;

    private String descripcion;
    private double valorUnitario;
    private double precio;

    private  double igv;
    private  double isc;

    private NotaEntity nota;

}
