package org.openfact.services.managers;

import org.openfact.models.BoletaModel;
import org.openfact.models.NotaModel;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.NotaRepresentation;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
@Stateless
@TransactionAttribute (TransactionAttributeType.REQUIRED)
public class NotaManager {
    public boolean saveNota(NotaModel boleta, NotaRepresentation rep) {
        return false;
    }
}
