package org.openfact.services.managers;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.DireccionRegionalModel;
import org.openfact.representations.idm.DireccionRegionalRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class DireccionRegionalManager {

    public boolean update(DireccionRegionalModel caja, DireccionRegionalRepresentation rep) {
        caja.setDenominacion(rep.getDenominacion());
        caja.commit();
        return true;
    }

    public boolean enable(DireccionRegionalModel model) {
        model.setEstado(true);
        model.commit();
        return true;
    }

    public boolean disable(DireccionRegionalModel model) {
        model.setEstado(false);
        model.commit();
        return true;
    }

}
