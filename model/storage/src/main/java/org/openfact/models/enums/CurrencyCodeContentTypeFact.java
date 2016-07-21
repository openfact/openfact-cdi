package org.openfact.models.enums;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 21/07/2016.
 */
public enum CurrencyCodeContentTypeFact {
    PERU("PEN");

    private final String codigo;

    CurrencyCodeContentTypeFact(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
