package org.openfact.models;

public interface OpenfactSession {

    OpenfactContext getContext();

    /**
     * Returns a managed provider instance.  Will start a provider transaction.  This transaction is managed by the KeycloakSession
     * transaction.
     *
     * @return
     * @throws IllegalStateException if transaction is not active
     */
    EmisorProvider emisores();
    FacturaProvider facturas();
    BoletaProvider boletas();

    void close();
}
