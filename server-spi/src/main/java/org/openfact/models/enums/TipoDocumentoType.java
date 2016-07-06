package org.openfact.models.enums;

public enum TipoDocumentoType {

    FACTURA("FACTURA", "01"),
    BOLETA("BOLETA DE VENTA", "02"),
    NOTA_CREDITO("NOTA DE CREDITO", "03");

    private final String descripcion;
    private final String codigo;

    TipoDocumentoType(String descripcion, String codigo) {
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return this.descripcion;
    }

    public String getCodigo() {
        return this.codigo;
    }

}
