package org.openfact.services.util;

import org.jboss.resteasy.spi.HttpResponse;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

import javax.ws.rs.core.HttpHeaders;

public class CookieHelper {

    /**
     * Set a response cookie.  This solely exists because JAX-RS 1.1 does not support setting HttpOnly cookies
     *
     * @param name
     * @param value
     * @param path
     * @param domain
     * @param comment
     * @param maxAge
     * @param secure
     * @param httpOnly
     */
    public static void addCookie(String name, String value, String path, String domain, String comment, int maxAge, boolean secure, boolean httpOnly) {
        HttpResponse response = ResteasyProviderFactory.getContextData(HttpResponse.class);
        StringBuffer cookieBuf = new StringBuffer();
        org.openfact.common.util.ServerCookie.appendCookieValue(cookieBuf, 1, name, value, path, domain, comment, maxAge, secure, httpOnly);
        String cookie = cookieBuf.toString();
        response.getOutputHeaders().add(HttpHeaders.SET_COOKIE, cookie);
    }


}
