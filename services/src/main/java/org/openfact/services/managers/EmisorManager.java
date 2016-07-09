package org.openfact.services.managers;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.representations.idm.EmisorRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EmisorManager {

    @Inject
    private EmisorProvider emisorProvider;

    public EmisorModel getOpenfactAdminstrationEmisor() {
        return getEmisor("master");
    }

    public EmisorModel getEmisor(String id) {
        return emisorProvider.findById(id);
    }

    public EmisorModel getEmisorByPaisRazonSocial(String pais, String razonSocial) {
        return emisorProvider.findByPaisRazonSocial(pais, razonSocial);
    }
    
    public boolean update(EmisorModel model, EmisorRepresentation rep) {
        model.setNombreComercial(rep.getNombreComercial());
        model.setDomicilioFiscal(rep.getDomicilioFiscal());
        model.commit();
        return true;
    }

    public boolean enable(EmisorModel model) {
        model.setEstado(true);
        model.commit();
        return true;
    }

    public boolean disable(EmisorModel model) {
        model.setEstado(false);
        model.commit();
        return true;
    }
}
