package org.openfact.models.utils;

import org.openfact.models.*;
import org.openfact.representations.idm.DireccionRegionalRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RepresentationToModel {

	public DireccionRegionalModel createDireccionRegional(DireccionRegionalRepresentation rep,
			DireccionRegionalProvider provider) {
		return provider.create(rep.getDenominacion());
	}

	public EmisorModel createEmisor(EmisorRepresentation rep, EmisorProvider provider) {
		EmisorModel model = provider.create(rep.getRuc(), rep.getRazonSocial());
		model.setNombreComercial(rep.getNombreComercial());
		model.setDomicilioFiscal(rep.getDomicilioFiscal());
		model.commit();
		return model;
	}

	public FacturaModel createFactura(FacturaRepresentation rep, FacturaProvider provider) {
		// FacturaModel model = provider.create(rep.getIgv());
		// model.commit();
		// return model;
		return null;
	}
	
}
