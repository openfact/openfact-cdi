package org.openfact.models.utils;

import org.openfact.models.DireccionRegionalModel;
import org.openfact.models.EmisorModel;
import org.openfact.models.FacturaModel;
import org.openfact.representations.idm.DireccionRegionalRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

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

    public static EmisorRepresentation toRepresentation(EmisorModel model) {
        if (model == null)
            return null;
        EmisorRepresentation rep = new EmisorRepresentation();
        rep.setId(model.getId());
        rep.setRuc(model.getRuc());
        rep.setRazonSocial(model.getRazonSocial());
        rep.setNombreComercial(rep.getNombreComercial());
        rep.setDomicilioFiscal(rep.getDomicilioFiscal());
        return rep;
    }

    public static FacturaRepresentation toRepresentation(FacturaModel model) {
        if (model == null)
            return null;
        FacturaRepresentation rep = new FacturaRepresentation();
        rep.setIgv(model.getIgv());
        rep.setSerie(model.getSerie());
        rep.setNumero(model.getNumero());
        rep.setIsc(model.getIsc());

        return rep;
    }

}
