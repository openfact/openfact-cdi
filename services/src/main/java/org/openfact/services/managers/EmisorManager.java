package org.openfact.services.managers;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.EmisorModel;
import org.openfact.representations.idm.EmisorRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class EmisorManager {
	public boolean update(EmisorModel emisor, EmisorRepresentation rep) {
		emisor.setNombreComercial(rep.getNombreComercial());
		emisor.setDomicilioFiscal(rep.getDomicilioFiscal());
		emisor.commit();
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
