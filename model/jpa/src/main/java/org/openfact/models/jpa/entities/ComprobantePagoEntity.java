package org.openfact.models.jpa.entities;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class ComprobantePagoEntity {

	// Catalogo 01
	private TipoDocumentoEntity tipoDocumento;

	@Column(name="serie")
	private String serie;

	@Column(name="numero")
	private String numero;

	@Column(name="fecha_emision")
	private LocalDate fechaEmision;

	@Column(name="moneda")
	private String moneda;

	@Column(name="importe_total")
	private double importeTotal;

	@Column(name="cargos")
	private double cargos;

	@Column(name="tributos")
	private double tributos;

	@Column(name="descuentos")
	private double descuentos;

	@Column(name="total_operaciones")
	private double totalOperaciones;

	@Column(name="total_operaciones_inacfectas")
	private double totalOperacionesInafectas;

	@Column(name="total_operaciones_exoneradas")
	private double totalOperacionesExoneradas;

	@Column(name="total_valor_venta_operaciones_gratuitas")
	private double totalValorVentaOperacionesGratuitas;

	@Column(name="total_igv")
	private double totalIgv;

	@Column(name="total_isc")
	private double totalIsc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "adquiriente", foreignKey = @ForeignKey)
	private AdquirienteEntity adquiriente;

	// Catalogo 01
	private TipoDocumentoEntity tipoDocumentoGuiaRemision;

	@Column(name="numero_guia_remision")
	private String numeroGuiaRemision;

	private HistorialEmisorEntity historialEmisor;
}
