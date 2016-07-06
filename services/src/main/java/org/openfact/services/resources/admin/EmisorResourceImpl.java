package org.openfact.services.resources.admin;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.services.managers.EmisorManager;

@Stateless
public class EmisorResourceImpl implements EmisorResource {
	   
	@PathParam("idEmisor")
	private int idEmisor;	

	@Inject
	private EmisorManager emisorManager;

	@Inject
	private EmisorProvider emisorProvider;

	private EmisorModel getEmisorModel() {
		return emisorProvider.findById(idEmisor);
	}

	@Override
	public EmisorRepresentation toRepresentation() {
		EmisorRepresentation rep = ModelToRepresentation.toRepresentation(getEmisorModel());
		if (rep != null) {
			return rep;
		} else {
			throw new NotFoundException("Emisor Sunat no encontrada");
		}
	}

	@Override
	public void update(EmisorRepresentation rep) {
		EmisorModel emisor = getEmisorModel();
		emisor.setNombreComercial(rep.getNombreComercial());
		emisor.setDomicilioFiscal(rep.getDomicilioFiscal());
		emisor.commit();
		
		//emisorManager.update(getEmisorModel(), rep);
	}

	@Override
	public Response enable() {
		EmisorModel emisorModel = getEmisorModel();
		boolean result = emisorManager.enable(emisorModel);
		if (result) {
			return Response.noContent().build();
		} else {
			return null; // ErrorResponse.error("Emisor no pudo ser
							// desactivada", Response.Status.BAD_REQUEST);
		}
	}

	@Override
	public Response disable() {
		EmisorModel emisorModel = getEmisorModel();
		boolean result = emisorManager.enable(emisorModel);
		if (result) {
			return Response.noContent().build();
		} else {
			return null;
		}
	}

}
