package org.openfact.models;

import java.util.Date;

/**
 * Created by ahren-dev01 on 1/07/2016.
 */
public class NotaModel {
    Date FechaEmision;
    String RazonSocial;
    String NombreComercial;
    String DomicilioFiscal;
    String NumeroRUC;
    String TipoNumeroDocumento;
    /*----RESUMEN venta-*/
    double TotalValorGravada;
    double TotalValorInafecta;
    double TotalvalorExonerada;
    double ValorVenta;
    double TotalIGV;
    double TotalISC;
    double TotalOtrosTributos;
    double TotalOtrosCargos;
    double ImporteTotal;
    String TipoMoneda;
}
