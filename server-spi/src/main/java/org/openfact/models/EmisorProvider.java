package org.openfact.models;

import java.util.List;

import javax.ejb.Local;

import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

@Local
public interface EmisorProvider extends Provider {

	EmisorModel create(String ruc, String razonSocial);

	EmisorModel findById(int id);

	EmisorModel findByRuc(String ruc);

	EmisorModel findByRazonSocial(String razonSocial);

	List<EmisorModel> getAll();

	SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria);

	SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText);

}

/*
*  ProcedimientoRepresentation procedimientoRepresentation = rep.getProcedimiento();
        ProcedimientoModel procedimientoModel = estadoProcedimientoProvider
                .findById(procedimientoRepresentation.getId());
        try {
            HistorialProyectoModel direccionRegionalModel = representationToModel.createHistorialProyecto(rep,
                    getProyectoModel(), procedimientoModel, historialProyectoProvider,
                    sessionResource.getTrabajador());
            return Response
                    .created(uriInfo.getAbsolutePathBuilder().path(direccionRegionalModel.getId()).build())
                    .header("Access-Control-Expose-Headers", "Location")
                    .entity(ModelToRepresentation.toRepresentation(direccionRegionalModel)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Historial existe con la misma denominacion");
        } catch (ModelReadOnlyException e) {
            return ErrorResponse.exists("Proyecto de solo lectura");
        }
* */

