package org.openfact.services.managers;

import org.openfact.models.BoletaModel;
import org.openfact.representations.idm.BoletaRepresentation;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
@Stateless
@TransactionAttribute (TransactionAttributeType.REQUIRED)
public class BoletaManager {
    public boolean saveBaleta(BoletaModel boleta, BoletaRepresentation rep) {
        return false;
    }
}
