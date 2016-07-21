package org.openfact.models.jpa;

import org.openfact.models.*;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 19/07/2016.
 */
public class JpaFacturaProvider extends AbstractHibernateStorage implements FacturaProvider{
 @PersistenceContext
 private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return  this.em;
    }

    @Override
    public void close() {

    }

    @Override
    public FacturaModel create(EmisorModel emisor, AdquirienteModel adquiriente, LocalDate fechaEmision, NumeracionComprobantePagoModel numeracion, ResumenComprobantePagoModel resumen) {



        return null;
    }

    @Override
    public AdquirienteModel createAdquiriente(DocumentoIdentidadModel documento, String numeroDocumento, String razonSocial) {
        return null;
    }

    @Override
    public NumeracionComprobantePagoModel createNumeracion(String serie, String numero) {
        return null;
    }

    @Override
    public ResumenComprobantePagoModel createResumenGravado(BigDecimal totalGravado, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public ResumenComprobantePagoModel createResumenInafecto(BigDecimal totalInafecto, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public ResumenComprobantePagoModel createResumenExonerado(BigDecimal totalExonerado, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public FacturaModel findById(String id) {
        return null;
    }

    @Override
    public List<FacturaModel> getAll(EmisorModel emisorModel) {
        return null;
    }

    @Override
    public SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria) {
        return null;
    }

    @Override
    public SearchResultsModel<FacturaModel> search(SearchCriteriaModel criteria, String filterText) {
        return null;
    }

    @Override
    public SearchResultsModel<FacturaModel> search(FacturaModel facturaModel, SearchCriteriaModel criteria) {
        return null;
    }

    @Override
    public SearchResultsModel<FacturaModel> search(FacturaModel facturaModel, SearchCriteriaModel criteria, String filterText) {
        return null;
    }

}
