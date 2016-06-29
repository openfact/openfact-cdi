package org.openfact.models.utils;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.DireccionRegionalModel;
import org.openfact.models.DireccionRegionalProvider;
import org.openfact.models.enums.TipoProyecto;
import org.openfact.representations.idm.DireccionRegionalRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RepresentationToModel {

    public DireccionRegionalModel createDireccionRegional(DireccionRegionalRepresentation rep,
            DireccionRegionalProvider provider) {
        return provider.create(rep.getDenominacion());
    }

}
