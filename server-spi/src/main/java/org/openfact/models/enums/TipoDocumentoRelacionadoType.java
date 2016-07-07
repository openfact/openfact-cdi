package org.openfact.models.enums;

public enum TipoDocumentoRelacionadoType {

    TICKET("TICKET DE SALIDA - ENAPU", "04"),
    CODIGO_SCOP("CODIGO SCOP", "05"),
    OTROS("OTROS", "99"),
    FACTURA_EMITIDA("FACTURA - EMITIDA PARA CORREGIR ERROR EN EL RUC", "01");

    private final String descripcion;
    private final String codigo;

    TipoDocumentoRelacionadoType(String descripcion, String codigo) {
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
