package org.openfact.models.jpa.entities;

import org.openfact.models.enums.TipoNotaType;

import java.time.LocalDate;

public class NotaEntity {

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

    private TipoNotaEntity tipoNota;

    private AdquirienteEntity adquiriente;

    private HistorialEmisorEntity historialEmisor;

    private ComprobantePagoEntity comprobante;
    private String DocumentoReferencia;
}
