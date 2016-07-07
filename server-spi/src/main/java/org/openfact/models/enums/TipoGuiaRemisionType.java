package org.openfact.models.enums;

public enum TipoGuiaRemisionType {

    REMITENTE("GUIA DE REMISION REMITENTE", "09"),
    TRANSPORTISTA("GUIA DE REMISION TRANSPORTISTA", "31");

    private final String descripcion;
    private final String codigo;

    TipoGuiaRemisionType(String descripcion, String codigo) {
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
