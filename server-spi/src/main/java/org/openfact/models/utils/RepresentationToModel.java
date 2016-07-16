package org.openfact.models.utils;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.*;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;
import org.openfact.representations.idm.NotaRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RepresentationToModel {

    public EmisorModel createEmisor(EmisorRepresentation rep, EmisorProvider provider) {
        //EmisorModel model = provider.create(rep.getRuc(), rep.getRazonSocial());
        //HistorialEmisorModel historialEmisorModel = provider.createHistorial(model,
        //        rep.getResolucionAutorizacion(), rep.getMensajeRepresentacionImpresa());
        /*historialEmisorModel.setMensajeServicioGratuito(rep.getMensajeServicioGratuito());
        model.setNombreComercial(rep.getNombreComercial());
        model.setDomicilioFiscal(rep.getDomicilioFiscal());
        model.commit();
        return model;*/
        return null;
    }

    public HistorialEmisorModel createHistorial(EmisorRepresentation rep, EmisorProvider provider) {
        //EmisorModel model = provider.findById(rep.getId());
        //HistorialEmisorModel historialEmisorModel = provider.createHistorial(model,
        //        rep.getResolucionAutorizacion(), rep.getMensajeRepresentacionImpresa());
        /*historialEmisorModel.setMensajeServicioGratuito(rep.getMensajeServicioGratuito());
        historialEmisorModel.commit();
        return historialEmisorModel;*/
        return null;
    }

    public FacturaModel createFactura(FacturaRepresentation rep, EmisorModel emisor,
            FacturaProvider provider) {
        AdquirienteModel adquiriente = null;
        // provider.createAdquiriente(numeroDocumento);

        // Crear numeracion
        NumeracionComprobantePagoModel numeracion = provider.createNumeracion(rep.getSerie(),
                rep.getNumero());

        // Create resumen
        ResumenComprobantePagoModel resumen;
        if (rep.getTotalOperacionesExoneradas() != null) {
            resumen = provider.createResumenExonerado(rep.getTotalOperacionesExoneradas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        } else if (rep.getTotalOperacionesGravadas() != null) {
            resumen = provider.createResumenGravado(rep.getTotalOperacionesGravadas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalExonerado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        } else if (rep.getTotalOperacionesInafectas() != null) {
            resumen = provider.createResumenInafecto(rep.getTotalOperacionesInafectas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalExonerado(rep.getTotalOperacionesInafectas());
        } else {
            throw new ModelException("La factura no tiene operaciones gravadas, inafectas y/o exoneradas");
        }
        resumen.setCargos(rep.getCargos());
        resumen.setDescuentos(rep.getDescuentos());
        resumen.setTributos(rep.getTributos());
        resumen.setIgv(rep.getTotalIgv());
        resumen.setIsc(rep.getTotalIsc());

        FacturaModel model = provider.create(emisor, adquiriente, rep.getFechaEmision(), numeracion, resumen);
        // model.setTipoDocumentoRelacionadoType(type);
        // model.setInformacionAdicional(informacionAdicional);
        model.commit();
        return model;
    }

    public BoletaModel createBoleta(BoletaRepresentation rep, EmisorModel emisor, BoletaProvider provider) {
        AdquirienteModel adquiriente = null;

        // crear numeracion boleta
        NumeracionComprobantePagoModel numeracion = provider.createNumeracion(rep.getSerie(),
                rep.getNumero());

        // crear resumen boleta
        ResumenComprobantePagoModel resumen;
        if (rep.getTotalOperacionesExoneradas() != null) {

            resumen = provider.createResumenExonerado(rep.getTotalOperacionesExoneradas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        } else if (rep.getTotalOperacionesGravadas() != null) {
            resumen = provider.createResumenGravado(rep.getTotalOperacionesGravadas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalExonerado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        } else if (rep.getTotalOperacionesInafectas() != null) {
            resumen = provider.createResumenInafecto(rep.getTotalOperacionesInafectas(), rep.getMoneda(),
                    rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalExonerado(rep.getTotalOperacionesInafectas());
        } else {
            throw new ModelException("La boleta no tiene operaciones gravadas, inafectas y/o exoneradas");
        }
        resumen.setCargos(rep.getCargos());
        resumen.setDescuentos(rep.getDescuentos());
        resumen.setTributos(rep.getTributos());
        resumen.setIgv(rep.getTotalIgv());
        resumen.setIsc(rep.getTotalIsc());

        BoletaModel model = provider.create(emisor, adquiriente, rep.getFechaEmision(), numeracion, resumen);
        model.commit();
        return model;

    }

    public NotaModel createNota(NotaRepresentation rep, EmisorModel emisor,NotaProvider provider){
        AdquirienteModel adquiriente=null;
        //crear numeracion nota
        NumeracionComprobantePagoModel numeracion=provider.createNumeracion(rep.getSerie(),rep.getNumero());
        //crear resumen notas
        ResumenNotaModel resumen;
        if (rep.getTotalOperacionesExoneradas()!= null){
            resumen=provider.createResumenExonerado(rep.getTotalOperacionesExoneradas(),rep.getMoneda(),rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        }else if (rep.getTotalOperacionesGravadas()!=null){
            resumen=provider.createResumenGravado(rep.getTotalOperacionesGravadas(),rep.getMoneda(),rep.getImporteTotal());
            resumen.setTotalExonerado(rep.getTotalOperacionesGravadas());
            resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
        }else if (rep.getTotalOperacionesInafectas()!=null){
            resumen=provider.createResumenInafecto(rep.getTotalOperacionesInafectas(),rep.getMoneda(),rep.getImporteTotal());
            resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
            resumen.setTotalExonerado(rep.getTotalOperacionesInafectas());
        }else {
            throw  new ModelException("la nota no tiene operaciones gravadas, ifafectas y exoneradas");
        }
        resumen.setCargos(rep.getCargos());
        resumen.setTributos(rep.getTributos());
        resumen.setIgvTotal(rep.getImporteTotal());
        resumen.setIscTotal(rep.getTotalIsc());
        NotaModel model=provider.create(emisor,adquiriente,rep.getFechaEmision(),numeracion,resumen);
        model.commit();
        return model;

    }

}
