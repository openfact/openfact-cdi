package org.openfact.models.jpa.entities;

import org.openfact.models.enums.TipoDocumentoRelacionadoType;

import javax.persistence.*;

@Entity
@Table(name = "FACTURA")
public class FacturaEntity extends ComprobantePagoEntity {

	@Enumerated(EnumType.STRING)
	@Column(name="TIPO_DOCUMENTO_RELACIONADO")
	private TipoDocumentoRelacionadoType documentoRelacionado;

	@Enumerated(EnumType.STRING)
	@Column(name="NUMERO_DOCUMENTO_RELACIONADO")
	private String numeroDocumentoRelacionado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey = @ForeignKey)
	private EnvioEntity envio;

	public TipoDocumentoRelacionadoType getDocumentoRelacionado() {
		return documentoRelacionado;
	}

	public void setDocumentoRelacionado(TipoDocumentoRelacionadoType documentoRelacionado) {
		this.documentoRelacionado = documentoRelacionado;
	}

	public String getNumeroDocumentoRelacionado() {
		return numeroDocumentoRelacionado;
	}

	public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
		this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
	}

	public EnvioEntity getEnvio() {
		return envio;
	}

	public void setEnvio(EnvioEntity envio) {
		this.envio = envio;
	}

}
