package org.openfact.models.jpa;

import org.openfact.models.*;
import org.openfact.models.jpa.entities.NotaEntity;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gissela-Sistemas on 20/07/2016.
 */
@Named
@Stateless
@Local(NotaProvider.class)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaNotaProvider extends AbstractHibernateStorage implements NotaProvider {
    @PersistenceContext
    private EntityManager em;


    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public void close() {

    }

    @Override
    public NotaModel create(EmisorModel emisor, AdquirienteModel adquiriente, LocalDate fechaEmision, NumeracionComprobantePagoModel numeracion, ResumenNotaModel resumen) {
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
    public ResumenNotaModel createResumenGravado(BigDecimal totalGravado, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public ResumenNotaModel createResumenInafecto(BigDecimal totalInafecto, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public ResumenNotaModel createResumenExonerado(BigDecimal totalExonerado, String moneda, BigDecimal importeTotal) {
        return null;
    }

    @Override
    public NotaModel findById(String id) {
        NotaEntity entity = this.em.find(NotaEntity.class, id);
        return entity != null ? new NotaAdapter(em, entity) : null;
    }

    @Override
    public NotaModel findByNumeracion(String serie, String numero) {
        TypedQuery<NotaEntity> query = em.createNamedQuery("NotaEntity.findByNumeracion", NotaEntity.class);
        query.setParameter("serie", serie);
        query.setParameter("numero", numero);
        List<NotaEntity> results = query.getResultList();
        if (results.isEmpty()) {

            return null;
        } else if (results.size() > 1) {
            throw new IllegalStateException("Mas de una Nota con SERIE=" + serie + ", results" + results);
        } else {
            return new NotaAdapter(em, results.get(0));
        }
    }


    @Override
    public List<NotaModel> getAll(EmisorModel emisorModel) {
        TypedQuery<NotaEntity> query = em.createNamedQuery("NotaEntity.findAll", NotaEntity.class);
        query.setParameter("ruc", emisorModel.getRuc());
        query.setParameter("razonSocial", emisorModel.getRazonSocial());
        List<NotaEntity> entities = query.getResultList();
        List<NotaModel> result = new ArrayList<>();
        entities.forEach(n -> result.add(new NotaAdapter(em, n)));
        return result;

    }

    @Override
    public SearchResultsModel<NotaModel> search(SearchCriteriaModel criteria) {
        SearchResultsModel<NotaEntity> entityResult = find(criteria, NotaEntity.class);
        List<NotaEntity> entities = entityResult.getModels();

        SearchResultsModel<NotaModel> searchResults = new SearchResultsModel<>();
        List<NotaModel> models = searchResults.getModels();

        entities.forEach(n -> models.add(new NotaAdapter(em, n)));
        searchResults.setTotalSize(entityResult.getTotalSize());
        return searchResults;
    }

    @Override
    public SearchResultsModel<NotaModel> search(SearchCriteriaModel criteria, String filterText) {
        SearchResultsModel<NotaEntity> entityResult = findFullText(criteria, NotaEntity.class, filterText,
                "serie");
        List<NotaEntity> entities=entityResult.getModels();

        SearchResultsModel<NotaModel> searchResults=new SearchResultsModel<>();
        List<NotaModel> models=searchResults.getModels();
        entities.forEach(n-> models.add(new NotaAdapter(em, n)));
        searchResults.setTotalSize(entityResult.getTotalSize());

        return searchResults;
    }

    @Override
    public SearchResultsModel<NotaModel> search(NotaModel notaModel, SearchCriteriaModel criteria) {
        return null;
    }

    @Override
    public SearchResultsModel<NotaModel> search(NotaModel notaModel, SearchCriteriaModel criteria, String filterText) {
        return null;
    }

}
