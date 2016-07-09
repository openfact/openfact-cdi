package org.openfact.services.util;

import javax.ws.rs.core.CacheControl;

import org.jboss.resteasy.spi.HttpResponse;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class CacheControlUtil {

    public static void noBackButtonCacheControlHeader() {
        HttpResponse response = ResteasyProviderFactory.getContextData(HttpResponse.class);
        response.getOutputHeaders().putSingle("Cache-Control", "no-store, must-revalidate, max-age=0");
    }

    public static CacheControl getDefaultCacheControl() {
        CacheControl cacheControl = new CacheControl();
        cacheControl.setNoTransform(false);
        //Integer maxAge = Config.scope("theme").getInt("staticMaxAge");
        //if (maxAge != null && maxAge > 0) {
        //    cacheControl.setMaxAge(maxAge);
        //} else {
            cacheControl.setNoCache(true);
        //}
        return cacheControl;
    }

    public static CacheControl noCache() {

        CacheControl cacheControl = new CacheControl();
        cacheControl.setMustRevalidate(true);
        cacheControl.setNoCache(true);
        cacheControl.setNoStore(true);

        return cacheControl;
    }


}
