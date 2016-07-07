package org.openfact.models;

import org.openfact.models.enums.TipoGuiaRemisionType;

public interface InformacionAdicionalComprobantePagoModel extends Model {

	String getId();

	TipoGuiaRemisionType getTipoGuiaRemisionType();

	void setTipoGuiaRemisionType(TipoGuiaRemisionType type);

	String getNumeroGuiaRemision();

	void setNumeroGuiaRemision();

}
