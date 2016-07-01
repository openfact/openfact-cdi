package org.openfact.models;

import java.util.Date;

/**
 * Created by ahren-dev01 on 1/07/2016.
 */
public class NotaModel {
    /* emisor electronico*/
    Date FechaEmision;
    String FirmaDigital;
    String RazonSocial;
    String NombreComercial;
    String DomicilioFiscal;
    String NumeroRUC;
    String serieComprobante;
    String NumeroComprobante;

    /*-- ADQUIRIENTE O USUARIO-*/
    String TipoDocumento;
    String NumeroDocumento;
    String ApellidoNombre;
    String RazonSocialUsuario;

    /*----RESUMEN venta-*/
    String MotivoSustento;
    double TotalValorGravada;
    double TotalValorInafecta;
    double TotalvalorExonerada;
    double ValorVenta;
    double TotalIGV;
    double TotalISC;
    double TotalOtrosTributos;
    double TotalOtrosCargos;
    double ImporteTotal;

    /*-- Informe adicional*/
    String TipoMoneda;
    String SerieDocumentoModifica;
    String NumeroDocumentoModifica;
    String TipoDocumentoModifica;
    String DocumentoReferencia;
    String LeyendaRepresentacion;
    String AutirizadoResulucion;


}
