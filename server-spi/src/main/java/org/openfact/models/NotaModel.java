package org.openfact.models;

import java.time.LocalDate;
import java.util.Date;

public class NotaModel {

    private String serie;
    private String numero;
    private LocalDate fechaEmision;

    private String moneda;
    private double importeTotal;

    private double cargos;
    private double tributos;

    private double totalOperacionesGravadas;
    private double totalOperacionesInafectas;
    private double totalOperacionesExoneradas;

    private double totalIgv;
    private double totalIsc;

    private TipoNotaModel tipoNota;

    private AdquirienteModel adquiriente;

    private HistorialEmisorModel historialEmisor;

    private ComprobantePagoModel comprobante;
    private String DocumentoReferencia;
}
