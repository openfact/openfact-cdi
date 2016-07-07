package org.openfact.models;

import java.util.Set;

public interface BoletaModel extends ComprobantePagoModel {

	Set<DetalleBoletaModel> getDetalle();

}
