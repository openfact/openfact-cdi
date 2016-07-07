package org.openfact.services.managers;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.FacturaModel;
import org.openfact.representations.idm.FacturaRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class FacturaManager {

	public boolean saveFactura(FacturaModel factura, FacturaRepresentation rep) {
		return false;
	}

}
