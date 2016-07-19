package org.openfact.models.utils;

import org.openfact.models.*;
import org.openfact.representations.idm.*;

import java.util.ArrayList;
import java.util.List;

public class ModelToRepresentation {

    /*public static DireccionRegionalRepresentation toRepresentation(DireccionRegionalModel model) {
        if (model == null)
            return null;

        DireccionRegionalRepresentation rep = new DireccionRegionalRepresentation();
        rep.setId(model.getId());
        rep.setDenominacion(model.getDenominacion());
        rep.setEstado(model.getEstado());
        return rep;
    }*/

    public static AdquirienteRepresentation toRepresentation(AdquirienteModel model) {
        if (model == null)
            return null;

        AdquirienteRepresentation rep = new AdquirienteRepresentation();
        //seters and geters
        return rep;
    }

    public static DetalleFacturaRepresentation toRepresentation(DetalleFacturaModel model) {
        if (model == null)
            return null;

        DetalleFacturaRepresentation rep = new DetalleFacturaRepresentation();
        //seters and geters
        return rep;
    }

    public static EmisorRepresentation toRepresentation(EmisorModel model) {
        if (model == null)
            return null;
        EmisorRepresentation rep = new EmisorRepresentation();
        rep.setId(model.getId());
        rep.setRuc(model.getRuc());
        rep.setRazonSocial(model.getRazonSocial());
        rep.setNombreComercial(rep.getNombreComercial());
        rep.setDomicilioFiscal(rep.getDomicilioFiscal());
        return rep;
    }

    public static FacturaRepresentation toRepresentation(FacturaModel model) {
        if (model == null)
            return null;
        FacturaRepresentation rep = new FacturaRepresentation();
        rep.setIsc(model.getResumen().getIsc());
        rep.setIgv(model.getResumen().getIgv());
        rep.setNumero(model.getNumeracion().getNumero());
        rep.setSerie(model.getNumeracion().getSerie());
        rep.setNumeroDocumentoRelacionado(model.getTipoDocumentoRelacionadoType().getCodigo());
        rep.setAdquiriente(toRepresentation(model.getAdquiriente()));
        rep.setCargos(model.getResumen().getCargos());
        rep.setDescuentos(model.getResumen().getDescuentos());
        rep.setFechaEmision(model.getFechaEmision());
        rep.setImporteTotal(model.getResumen().getImporteTotal());
        rep.setMoneda(model.getResumen().getMoneda());
        rep.setTributos(model.getResumen().getTributos());
        rep.setTotalOperacionesGravadas(model.getResumen().getTotalGravado());
        rep.setTotalOperacionesInafectas(model.getResumen().getTotalInafecto());
        rep.setTotalOperacionesExoneradas(model.getResumen().getTotalExonerado());
        rep.setNumeroGuiaRemision(model.getInformacionAdicional().getNumeroGuiaRemision());
        rep.setEmisor(toRepresentation(model.getEmisor()));
        rep.setTotalIgv(model.getResumen().getIgv());
        rep.setTotalIsc(model.getResumen().getIsc());
        List<DetalleFacturaRepresentation> detalle = new ArrayList<>();
        model.getDetalle().forEach(d -> detalle.add(toRepresentation(d)));
        rep.setDetalle(detalle);
        rep.setTotalValorVentaOperacionesGratuitas(model.getResumen().getTotalValorVentaOperacionesGratuitas());
        return rep;
    }

    public static DetalleBoletaRepresentation toRepresentation(DetalleBoletaModel model) {
        if (model == null)
            return null;

        DetalleBoletaRepresentation rep = new DetalleBoletaRepresentation();
        //seters and geters
        return rep;
    }

    public static BoletaRepresentation toRepresentation(BoletaModel model) {
        if (model == null)
            return null;
        BoletaRepresentation rep = new BoletaRepresentation();
        rep.setNumero(model.getNumeracion().getNumero());
        rep.setSerie(model.getNumeracion().getSerie());
        rep.setNumeroDocumentoRelacionado(model.getTipoDocumento().getCodigo());
        rep.setAdquiriente(toRepresentation(model.getAdquiriente()));
        rep.setCargos(model.getResumen().getCargos());
        rep.setDescuentos(model.getResumen().getDescuentos());
        rep.setFechaEmision(model.getFechaEmision());
        rep.setImporteTotal(model.getResumen().getImporteTotal());
        rep.setMoneda(model.getResumen().getMoneda());
        rep.setTributos(model.getResumen().getTributos());
        rep.setTotalOperacionesGravadas(model.getResumen().getTotalGravado());
        rep.setTotalOperacionesInafectas(model.getResumen().getTotalInafecto());
        rep.setTotalOperacionesExoneradas(model.getResumen().getTotalExonerado());
        rep.setNumeroGuiaRemision(model.getInformacionAdicional().getNumeroGuiaRemision());
        rep.setEmisor(toRepresentation(model.getEmisor()));
        rep.setTotalIgv(model.getResumen().getIgv());
        rep.setTotalIsc(model.getResumen().getIsc());
        List<DetalleBoletaRepresentation> detalle = new ArrayList<>();
        model.getDetalle().forEach(d -> detalle.add(toRepresentation(d)));
        rep.setDetalle(detalle);
        rep.setTotalValorVentaOperacionesGratuitas(model.getResumen().getTotalValorVentaOperacionesGratuitas());
        return rep;

    }

    public static DetalleNotaRepresentation toRepresentation(DetalleNotaModel model) {
        if (model == null)
            return null;

        DetalleNotaRepresentation rep = new DetalleNotaRepresentation();
        //seters and geters
        return rep;
    }

    public static NotaRepresentation toRepresentacion(NotaModel model) {
        if (model == null)
            return null;
        NotaRepresentation rep = new NotaRepresentation();
        rep.setEmisor(toRepresentation(model.getEmisor()));
        rep.setNumero(model.getNumeraccion().getNumero());
        rep.setSerie(model.getNumeraccion().getSerie());
        rep.setAdquiriente(toRepresentation(model.getAdquiriente()));
        rep.setCargos(model.getResumen().getCargos());
        rep.setFechaEmision(model.getFechaEmision());
        rep.setImporteTotal(model.getResumen().getImporteTotal());
        rep.setMoneda(model.getResumen().getMoneda());
        rep.setTributos(model.getResumen().getTributos());
        rep.setTotalOperacionesGravadas(model.getResumen().getTotalGravado());
        rep.setTotalOperacionesInafectas(model.getResumen().getTotalInafecto());
        rep.setTotalOperacionesExoneradas(model.getResumen().getTotalExonerado());
        rep.setEmisor(toRepresentation(model.getEmisor()));
        rep.setTotalIgv(model.getResumen().getIgvTotal());
        rep.setTotalIsc(model.getResumen().getIscTotal());
        List<DetalleNotaRepresentation> detalle = new ArrayList<>();
        model.getDetalle().forEach(d -> detalle.add(toRepresentation(d)));
        rep.setDetalle(detalle);
        return rep;
    }

}


