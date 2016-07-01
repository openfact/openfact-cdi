package org.openfact.models;

import java.util.Date;

public class RetencionModel {

    String ublVersion;
    String documentVersion;
    String firmaDigital;

    String numeracion;
    String fechaEmision;

    // Datos del emisor electronico
    String numeroDocumentoEmisor;
    String tipoDocumentoIdentidad;
    String nombreComercialEmisor;

    // Docmicilio fiscal del emisor electronico
    String ubigeo;
    String direccion;
    String urbanizacion;
    String provincia;
    String departamento;
    String distrito;
    String codigoPaisDireccion;
    String nombresORazonSocial;

    //Informacion del proveedor
    String numeroDocumentoIdentidad;
    String tipoDocumentoIdentidadProveedor;
    String nombreComercial;

    // Docmicilio fiscal proveedor
    String ubigeoProveedor;
    String direccionProveedor;
    String urbanizacionProveedor;
    String provinciaProveedor;
    String departamentoProveedor;
    String distritoProveedor;
    String codigoPaisProveedor;
    String nombresORazonSocialProveedor;


    // Datos de la retencion
    String regimenRetencion;
    double tasaRetencion;
    String observaciones;
    double importeTotal;
    String monedaRetenido;
    double importeTotalPagado;
    String monedaPagado;




    // Datos del comprobante relacionado
    String tipoDocumentoRelacionado;
    String numeroDocumentoRelacioado;
    String fechaEmisionDocumentoRelacionado;
    double importeTotalDocumentoRelacionado;
    String tipoMonedaDocumentoRelacionado;

    // datos del pago
   Date fechaPago;
    String numeroPago;
    double importePagoSinRetencion;
    String monedaPago;

    // Datos de la retencion
    double importeRetenido;
    String monedaImporteRetenido;
    Date fechaRetencion;
    double importeTotalPagarNeto;
    String monedaMontoNetoPagado;

    // Tipo Cambio
    String monedaReferenciaParaTipoCambio;
    String monedaObjetivoParaTasaCambio;

    String factorAplicadoAMoneda;
    Date fechaCambio;
}
