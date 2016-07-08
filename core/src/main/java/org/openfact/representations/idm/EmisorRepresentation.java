package org.openfact.representations.idm;

import java.io.Serializable;

public class EmisorRepresentation implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;
	private String ruc;
	private String razonSocial;
	private String nombreComercial;
	private String domicilioFiscal;
	private String resolucionAutorizacion;
	private String mensajeRepresentacionImpresa;

	public String getMensajeServicioGratuito() {
		return mensajeServicioGratuito;
	}

	public void setMensajeServicioGratuito(String mensajeServicioGratuito) {
		this.mensajeServicioGratuito = mensajeServicioGratuito;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getDomicilioFiscal() {
		return domicilioFiscal;
	}

	public void setDomicilioFiscal(String domicilioFiscal) {
		this.domicilioFiscal = domicilioFiscal;
	}

	public String getResolucionAutorizacion() {
		return resolucionAutorizacion;
	}

	public void setResolucionAutorizacion(String resolucionAutorizacion) {
		this.resolucionAutorizacion = resolucionAutorizacion;
	}

	public String getMensajeRepresentacionImpresa() {
		return mensajeRepresentacionImpresa;
	}

	public void setMensajeRepresentacionImpresa(String mensajeRepresentacionImpresa) {
		this.mensajeRepresentacionImpresa = mensajeRepresentacionImpresa;
	}

	private String mensajeServicioGratuito;



}
