package org.openfact.theme;

import java.util.Map;

import javax.ws.rs.core.Response;

import org.openfact.models.BrowserSecurityHeaders;

public class BrowserSecurityHeaderSetup {

    /*public static Response.ResponseBuilder headers(Response.ResponseBuilder builder, RealmModel realm) {
        return headers(builder, realm.getBrowserSecurityHeaders());
    }*/

    public static Response.ResponseBuilder headers(Response.ResponseBuilder builder,
            Map<String, String> headers) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String headerName = BrowserSecurityHeaders.headerAttributeMap.get(entry.getKey());
            if (headerName != null && entry.getValue() != null && entry.getValue().length() > 0) {
                builder.header(headerName, entry.getValue());
            }
        }
        return builder;
    }

}
