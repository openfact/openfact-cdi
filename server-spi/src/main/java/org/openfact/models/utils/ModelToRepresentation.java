package org.openfact.models.utils;

import org.openfact.models.DireccionRegionalModel;
import org.openfact.representations.idm.DireccionRegionalRepresentation;

public class ModelToRepresentation {

    public static DireccionRegionalRepresentation toRepresentation(DireccionRegionalModel model) {
        if (model == null)
            return null;

        DireccionRegionalRepresentation rep = new DireccionRegionalRepresentation();
        rep.setId(model.getId());
        rep.setDenominacion(model.getDenominacion());
        rep.setEstado(model.getEstado());
        return rep;
    }

}
