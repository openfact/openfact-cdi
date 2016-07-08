package org.openfact.services.resources.admin;

import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by AHREN on 07/07/2016.
 */
@Consumes(MediaType.APPLICATION_JSON)
public interface EnviosResource {
    @Path("{idEnvio}") FacturaResource factura(@PathParam("idEnvio") String idEnvio);

}
