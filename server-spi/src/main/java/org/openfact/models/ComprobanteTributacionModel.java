package org.openfact.models;

import java.time.LocalDate;
import java.util.Date;

public class ComprobanteTributacionModel {

    // Datos de la percepcion
    private String regimen;
    private String tasa;
    private String observaciones;
    private String importeTotalPercibido;
    private String monedaImporteTotalPercibido;
    private String importeTotalCobrado;
    private String monedaImporteTotalCobrado;

    // tipo de cambio
    private String monedaReferencia;
    private String monedaObjetivo;
    private String tipoCambio;
    private Date fechaCambio;

    // datos del pago/Cobro
    private LocalDate fechaPagoCobro;
    private String numeroPagoCobro;
    private double importePagoCobro;
    private String monedaPagoCobro;

    // Comprobante relacionado
    private ComprobantePagoElectronicoModel comprobantePago;

    // Datos de la percepcionRetencion
    private double importeRetenidoPercibido;
    private String monedaImporteRetenidoPercibido;
    private LocalDate fechaRetencionPercepcion;
    private double montoTotalPagarCobrar;
    private String monedaMontoTotalPagarCobrar;

    // Informacion del cliente
    private String numeroDocumentoIdentidad;
    private int tipoDocumentoIdentidad;
    private String nombreComercial;

    // domicilio fiscal del cliente o proveedor
    private String ubigeo;
    private String direccion;
    private String urbanizacion;
    private String departamento;
    private String provincia;
    private String distrito;
    private String codigoPais;
    private String denominacion; // apellidos y nombres, denominacion o razon social

}
