package org.openfact.models.utils;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.DireccionRegionalModel;
import org.openfact.models.DireccionRegionalProvider;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.enums.TipoProyecto;
import org.openfact.representations.idm.DireccionRegionalRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;

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

}
