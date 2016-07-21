package org.openfact.models.enums;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
public enum CurrencyCodeContentType {
    PERU("PEN");

    private final String codigo;

    CurrencyCodeContentType(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
