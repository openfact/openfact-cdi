package org.openfact.services.resources.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.openfact.services.resources.admin.info.ServerInfoAdminResource;

@Path("/admin")
public interface AdminRoot {

    /**
     * Convenience path to master emisor admin console
     *
     * @return
     * @exclude
     */
    @GET
    Response masterEmisorAdminConsoleRedirect();

    /**
     * Convenience path to master emisor admin console
     *
     * @return
     * @exclude
     */
    @Path("index.{html:html}") // expression is actually "index.html" but this
                               // is a hack to get around jax-doclet bug
    @GET
    Response masterEmisorAdminConsoleRedirectHtml();

    /**
     * path to emisor admin console ui
     *
     * @param name
     *            Emisor name (not id!)
     * @return
     * @exclude
     */
    @Path("{codigoPais}-{razonSocial}/console")
    AdminConsole getAdminConsole(final @PathParam("codigoPais") String codigoPais,
            final @PathParam("razonSocial") String razonSocial);

    /**
     * Base Path to emisor admin REST interface
     *
     * @param headers
     * @return
     */
    @Path("emisores")
    EmisoresAdminResource getEmidoresAdmin(@Context final HttpHeaders headers);

    /**
     * Base Path to commons admin REST interface
     *
     * @param headers
     * @return
     */
    @Path("commons")
    CommonsAdminResource getCommonsResource(@Context final HttpHeaders headers);

    /**
     * General information about the server
     *
     * @param headers
     * @return
     */
    @Path("gika")
    public ServerInfoAdminResource getServerInfo(@Context final HttpHeaders headers);

}
