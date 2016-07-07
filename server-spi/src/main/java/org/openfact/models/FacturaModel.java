package org.openfact.models;

import java.util.Set;

import org.openfact.models.enums.TipoDocumentoRelacionadoType;

public interface FacturaModel extends ComprobantePagoModel {

	TipoDocumentoRelacionadoType getTipoDocumentoRelacionadoType();

	void setTipoDocumentoRelacionadoType(TipoDocumentoRelacionadoType type);

	EnvioModel getEnvio();

	Set<DetalleFacturaModel> getDetalle();

}
