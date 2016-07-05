package org.openfact.models.jpa.entities;

public class ResumenDiarioEntity {

    String TipoDocumento;

    String NumeroSerie;
    String NumeroCorrelativoInicio;
    String NumeroCorrelativoFin;

    Double TotalValorVentaOpeGrabadas;
    Double TotalValorVentaOpeExoneradas;

    Double TotalValorVentaOpeInafectas;
    Double ImporteTotalOtrosCargos;

    Double TotalISC;
    Double TotalIGV;
    Double TotalOtrosTributos;

    Double ImporteTotalVenta;



    double totalValorVentaOperacionesGratuitas;
}
