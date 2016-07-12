package org.openfact.models;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

import org.openfact.common.ClientConnection;
import org.openfact.models.utils.EmisorImporter;

import java.net.URI;
import java.util.Locale;

public interface OpenfactContext {

    URI getAuthServerUrl();

    String getContextPath();

    UriInfo getUri();

    HttpHeaders getRequestHeaders();

    <T> T getContextObject(Class<T> clazz);

    EmisorModel getEmisor();

    void setEmisor(EmisorModel emisor);

    ClientConnection getConnection();

    void setConnection(ClientConnection connection);

    EmisorImporter getEmisorManager();

    Locale resolveLocale(EmisorModel emisor);

}
