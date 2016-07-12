package org.openfact.services.resources;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;

import org.openfact.models.EmisorModel;
import org.openfact.models.OpenfactSession;
import org.openfact.services.managers.EmisorManager;

@Stateless
public class EmisoresResourceImpl implements EmisoresResource {

    @Inject
    private EmisorManager emisorManager;

    @Inject
    private PublicEmisorResource emisorResource;

    @Inject
    private OpenfactSession session;

    @Override
    public PublicEmisorResource getEmisorResource(String pais, String razonSocial) {
        EmisorModel realm = init(pais, razonSocial);
        return emisorResource;
    }

    private EmisorModel init(String pais, String razonSocial) {
        EmisorModel emisor = emisorManager.getEmisorByPaisRazonSocial(pais, razonSocial);
        if (emisor == null) {
            throw new NotFoundException("Emisor no existente");
        }
        session.getContext().setEmisor(emisor);
        return emisor;
    }

}
