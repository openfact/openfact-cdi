package org.openfact.models;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

import org.openfact.common.ClientConnection;

import java.net.URI;
import java.util.Locale;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public interface KeycloakContext {

    URI getAuthServerUrl();

    String getContextPath();

    UriInfo getUri();

    HttpHeaders getRequestHeaders();

    <T> T getContextObject(Class<T> clazz);

    RealmModel getRealm();

    void setRealm(RealmModel realm);

    ClientModel getClient();

    void setClient(ClientModel client);

    ClientConnection getConnection();

    void setConnection(ClientConnection connection);

    RealmImporter getRealmManager();

    Locale resolveLocale(UserModel user);

}
