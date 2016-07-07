package org.openfact.models.utils;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import org.openfact.models.AdquirienteModel;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.FacturaModel;
import org.openfact.models.FacturaProvider;
import org.openfact.models.ModelException;
import org.openfact.models.NumeracionComprobantePagoModel;
import org.openfact.models.ResumenComprobantePagoModel;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.representations.idm.FacturaRepresentation;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class RepresentationToModel {

	public EmisorModel createEmisor(EmisorRepresentation rep, EmisorProvider provider) {
		EmisorModel model = provider.create(rep.getRuc(), rep.getRazonSocial());
		model.setNombreComercial(rep.getNombreComercial());
		model.setDomicilioFiscal(rep.getDomicilioFiscal());
		model.commit();
		return model;
	}

	public FacturaModel createFactura(FacturaRepresentation rep, EmisorModel emisor, FacturaProvider provider) {
		AdquirienteModel adquiriente = null;
		//provider.createAdquiriente(numeroDocumento);
		
		// Crear numeracion
		NumeracionComprobantePagoModel numeracion = provider.createNumeracion(rep.getSerie(), rep.getNumero());
		
		// Create resumen
		ResumenComprobantePagoModel resumen;
		if (rep.getTotalOperacionesExoneradas() != null) {
			resumen = provider.createResumenExonerado(rep.getTotalOperacionesExoneradas(), rep.getMoneda(), rep.getImporteTotal());
			resumen.setTotalGravado(rep.getTotalOperacionesGravadas());
			resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
		} else if (rep.getTotalOperacionesGravadas() != null) {
			resumen = provider.createResumenGravado(rep.getTotalOperacionesGravadas(), rep.getMoneda(), rep.getImporteTotal());
			resumen.setTotalExonerado(rep.getTotalOperacionesGravadas());
			resumen.setTotalInafecto(rep.getTotalOperacionesInafectas());
		} else if (rep.getTotalOperacionesInafectas() != null) {
			resumen = provider.createResumenInafecto(rep.getTotalOperacionesInafectas(), rep.getMoneda(), rep.getImporteTotal());
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
		//model.setTipoDocumentoRelacionadoType(type);
		//model.setInformacionAdicional(informacionAdicional);
		model.commit();
		return model;
	}

}
