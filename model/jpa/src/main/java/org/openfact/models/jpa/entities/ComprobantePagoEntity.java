package org.openfact.models.jpa.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.openfact.models.enums.TipoDocumentoType;

@Entity(name = "COMPROBANTE_PAGO")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
public class ComprobantePagoEntity {

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	@Column(name = "ID")
	private String id;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO_DOCUMENTO")
	private TipoDocumentoType tipoDocumento;

	@NotNull
	@Column(name = "FECHA_EMISION")
	private LocalDate fechaEmision;

	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NUMERACION", foreignKey = @ForeignKey)
	private NumeracionComprobantePagoEntity numeracion;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMISOR", foreignKey = @ForeignKey)
	private EmisorEntity emisor;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADQUIRIENTE", foreignKey = @ForeignKey)
	private AdquirienteEntity adquiriente;

	
	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RESUMEN", foreignKey = @ForeignKey)
	private ResumenComprobantePagoEntity resumen;


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INFORMACION_ADICIONAL", foreignKey = @ForeignKey)
	private InformacionAdicionalComprobantePagoEntity informacionAdicional;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TipoDocumentoType getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoType tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public NumeracionComprobantePagoEntity getNumeracion() {
		return numeracion;
	}

	public void setNumeracion(NumeracionComprobantePagoEntity numeracion) {
		this.numeracion = numeracion;
	}

	public EmisorEntity getEmisor() {
		return emisor;
	}

	public void setEmisor(EmisorEntity emisor) {
		this.emisor = emisor;
	}

	public AdquirienteEntity getAdquiriente() {
		return adquiriente;
	}

	public void setAdquiriente(AdquirienteEntity adquiriente) {
		this.adquiriente = adquiriente;
	}

	public ResumenComprobantePagoEntity getResumen() {
		return resumen;
	}

	public void setResumen(ResumenComprobantePagoEntity resumen) {
		this.resumen = resumen;
	}

	public InformacionAdicionalComprobantePagoEntity getInformacionAdicional() {
		return informacionAdicional;
	}

	public void setInformacionAdicional(InformacionAdicionalComprobantePagoEntity informacionAdicional) {
		this.informacionAdicional = informacionAdicional;
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
		ComprobantePagoEntity other = (ComprobantePagoEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
