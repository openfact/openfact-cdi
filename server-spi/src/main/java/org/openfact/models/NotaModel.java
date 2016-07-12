package org.openfact.models;

import org.openfact.models.enums.TipoDocumentoRelacionadoType;
import org.openfact.models.enums.TipoDocumentoType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public interface NotaModel extends Model {
    //
//    private String serie;
//    private String numero;
//    private LocalDate fechaEmision;
//
//    private String moneda;
//    private double importeTotal;
//
//    private double cargos;
//    private double tributos;
//
//    private double totalOperacionesGravadas;
//    private double totalOperacionesInafectas;
//    private double totalOperacionesExoneradas;
//
//    private double totalIgv;
//    private double totalIsc;
//
//    private TipoNotaModel tipoNota;
//
//    private AdquirienteModel adquiriente;
//
//    private HistorialEmisorModel historialEmisor;
//
//    private ComprobantePagoModel comprobante;
//    private String DocumentoReferencia;

    TipoDocumentoRelacionadoType getTipoDocumentoRelacionadoType();

    NumeracionComprobantePagoModel getNumeraccion();

    TipoDocumentoType getTipoDocumento();

    LocalDate getFechaEmision();

    EmisorModel getEmisor();

    AdquirienteModel getAdquiriente();

    ResumenNotaModel getResumen();
    EnvioModel getEnvio();

    Set<DetalleNotaModel> getDetalle();


}
