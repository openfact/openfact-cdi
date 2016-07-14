package org.openfact.representations.idm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Gissela-Sistemas on 6/07/2016.
 */
public class ComprobantePagoRepresentation implements Serializable {
	private String serie;
	private String numero;
	private LocalDate fechaEmision;

	private String moneda;
	private BigDecimal importeTotal;

	private BigDecimal cargos;
	private BigDecimal tributos;
	private BigDecimal descuentos;

	private BigDecimal totalOperacionesGravadas;
	private BigDecimal totalOperacionesInafectas;
	private BigDecimal totalOperacionesExoneradas;

	private BigDecimal totalValorVentaOperacionesGratuitas;

	private BigDecimal totalIgv;
	private BigDecimal totalIsc;

	private AdquirienteRepresentation adquiriente;

	// Catalogo 01

	private String numeroGuiaRemision;

	private EmisorRepresentation emisor;

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public BigDecimal getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(BigDecimal importeTotal) {
		this.importeTotal = importeTotal;
	}

	public BigDecimal getCargos() {
		return cargos;
	}

	public void setCargos(BigDecimal cargos) {
		this.cargos = cargos;
	}

	public BigDecimal getTributos() {
		return tributos;
	}

	public void setTributos(BigDecimal tributos) {
		this.tributos = tributos;
	}

	public BigDecimal getDescuentos() {
		return descuentos;
	}

	public void setDescuentos(BigDecimal descuentos) {
		this.descuentos = descuentos;
	}

	public BigDecimal getTotalOperacionesGravadas() {
		return totalOperacionesGravadas;
	}

	public void setTotalOperacionesGravadas(BigDecimal totalOperacionesGravadas) {
		this.totalOperacionesGravadas = totalOperacionesGravadas;
	}

	public BigDecimal getTotalOperacionesInafectas() {
		return totalOperacionesInafectas;
	}

	public void setTotalOperacionesInafectas(BigDecimal totalOperacionesInafectas) {
		this.totalOperacionesInafectas = totalOperacionesInafectas;
	}

	public BigDecimal getTotalOperacionesExoneradas() {
		return totalOperacionesExoneradas;
	}

	public void setTotalOperacionesExoneradas(BigDecimal totalOperacionesExoneradas) {
		this.totalOperacionesExoneradas = totalOperacionesExoneradas;
	}

	public BigDecimal getTotalValorVentaOperacionesGratuitas() {
		return totalValorVentaOperacionesGratuitas;
	}

	public void setTotalValorVentaOperacionesGratuitas(BigDecimal totalValorVentaOperacionesGratuitas) {
		this.totalValorVentaOperacionesGratuitas = totalValorVentaOperacionesGratuitas;
	}

	public BigDecimal getTotalIgv() {
		return totalIgv;
	}

	public void setTotalIgv(BigDecimal totalIgv) {
		this.totalIgv = totalIgv;
	}

	public BigDecimal getTotalIsc() {
		return totalIsc;
	}

	public void setTotalIsc(BigDecimal totalIsc) {
		this.totalIsc = totalIsc;
	}

	public AdquirienteRepresentation getAdquiriente() {
		return adquiriente;
	}

	public void setAdquiriente(AdquirienteRepresentation adquiriente) {
		this.adquiriente = adquiriente;
	}

	public String getNumeroGuiaRemision() {
		return numeroGuiaRemision;
	}

	public void setNumeroGuiaRemision(String numeroGuiaRemision) {
		this.numeroGuiaRemision = numeroGuiaRemision;
	}

	public EmisorRepresentation getEmisor() {
		return emisor;
	}

	public void setEmisor(EmisorRepresentation emisor) {
		this.emisor = emisor;
	}
}
