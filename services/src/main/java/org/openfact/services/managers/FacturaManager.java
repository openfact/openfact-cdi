package org.openfact.services.managers;

import org.openfact.models.EmisorModel;
import org.openfact.models.FacturaModel;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.services.ErrorResponse;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ws.rs.core.Response;

/**
 * Created by Alex Pariona on 06/07/2016.
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FacturaManager {
    public boolean saveFactura(FacturaModel factura, FacturaRepresentation rep) {


        return true;
    }
}
