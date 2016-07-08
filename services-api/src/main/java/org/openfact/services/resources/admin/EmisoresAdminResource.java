package org.openfact.services.resources.admin;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.openfact.representations.idm.EmisorRepresentation;

@Consumes(MediaType.APPLICATION_JSON)
public interface EmisoresAdminResource {

	@Path("{idEmisor}")
	EmisorAdminResource emisor(@PathParam("idEmisor") String idEmisor);
	
	@POST 
    @Produces(MediaType.APPLICATION_JSON)
    Response create(EmisorRepresentation rep);
    
   
    @GET    
    @Produces(MediaType.APPLICATION_JSON)
    List<EmisorRepresentation> getAll();

    @Path("comprobantes")
    ComprobantesPagoResource comprobantesPago();

}
