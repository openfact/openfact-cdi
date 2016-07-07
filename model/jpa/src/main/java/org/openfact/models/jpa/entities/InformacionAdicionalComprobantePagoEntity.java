package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.openfact.models.enums.TipoGuiaRemisionType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INFORMACION_ADICIONAL_COMPROBANTE_PAGO")
public class InformacionAdicionalComprobantePagoEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_DOCUMENTO")
	private TipoGuiaRemisionType tipoGuiaRemision;

	@Column(name = "NUMERO_GUIA_REMISION")
	private String numeroGuiaRemision;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoGuiaRemisionType getTipoGuiaRemision() {
		return tipoGuiaRemision;
	}

	public void setTipoGuiaRemision(TipoGuiaRemisionType tipoGuiaRemision) {
		this.tipoGuiaRemision = tipoGuiaRemision;
	}

	public String getNumeroGuiaRemision() {
		return numeroGuiaRemision;
	}

	public void setNumeroGuiaRemision(String numeroGuiaRemision) {
		this.numeroGuiaRemision = numeroGuiaRemision;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InformacionAdicionalComprobantePagoEntity other = (InformacionAdicionalComprobantePagoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
