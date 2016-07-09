package org.openfact.services.resources;

import org.openfact.utils.MediaType;

import javax.ws.rs.*;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import java.net.URISyntaxException;

@Path("/")
public interface WelcomeResource {

    /**
     * Welcome page of Openfact
     *
     * @return
     * @throws URISyntaxException
     */
    @GET
    @Produces(MediaType.TEXT_HTML_UTF_8)
    public Response getWelcomePage() throws URISyntaxException;

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response createUser(final MultivaluedMap<String, String> formData);

}
