package org.openfact.models.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.jpa.entities.EmisorEntity;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;

@Named
@Stateless
@Local(EmisorProvider.class)
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class JpaEmisorProvider extends AbstractHibernateStorage implements EmisorProvider {

    @PersistenceContext
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return this.em;
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
    }

    @Override
    public EmisorModel create(String pais, String ruc, String razonSocial) {
        if (findByRuc(pais, ruc) != null) {
            throw new ModelDuplicateException("Emisor existente, RUC: " + ruc);
        }
        EmisorEntity entity = new EmisorEntity();
        entity.setPais(pais);
        entity.setRuc(ruc);
        entity.setRazonSocial(razonSocial);
        entity.setEstado(true);
        em.persist(entity);
        return new EmisorAdapter(em, entity);
    }

    @Override
    public EmisorModel findById(String id) {
        EmisorEntity entity = this.em.find(EmisorEntity.class, id);
        return entity != null ? new EmisorAdapter(em, entity) : null;
    }
    
    @Override
    public EmisorModel findByRuc(String pais, String ruc) {
        TypedQuery<EmisorEntity> query = em.createNamedQuery("EmisorEntity.findByPaisRuc", EmisorEntity.class);
        query.setParameter("pais", pais);
        query.setParameter("ruc", ruc);

        List<EmisorEntity> results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() > 1) {
            throw new IllegalStateException("Mas de un Emisor con RUC=" + ruc + ", results=" + results);
        } else {
            return new EmisorAdapter(em, results.get(0));
        }
    }

    @Override
    public EmisorModel findByRazonSocial(String pais, String razonSocial) {
        TypedQuery<EmisorEntity> query = em.createNamedQuery("EmisorEntity.findByPaisRazonSocial",
                EmisorEntity.class);
        query.setParameter("pais", pais);
        query.setParameter("razonSocial", razonSocial);

        List<EmisorEntity> results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() > 1) {
            throw new IllegalStateException(
                    "Mas de un Emisor con RAZON SOCIAL=" + razonSocial + ", results=" + results);
        } else {
            return new EmisorAdapter(em, results.get(0));
        }
    }
    
    /*@Override
    public HistorialEmisorModel createHistorial(EmisorModel emisorModel, String resolucionAutorizacion,
            String mensajeRepresentacionImpresa) {
        HistorialEmisorModel historialEmisorModel = findByEstado(true);
        if (historialEmisorModel != null) {
            if (historialEmisorModel.isEstado()) {
                desactivar(historialEmisorModel);
            }
        }
        HistorialEmisorEntity entity = new HistorialEmisorEntity();
        entity.setEstado(true);
        entity.setResolucionAutorizacion(resolucionAutorizacion);
        entity.setMensajeRepresentacionImpresa(mensajeRepresentacionImpresa);
        entity.setEmisor(EmisorAdapter.toEmisorEntity(emisorModel, em));
        em.persist(entity);
        return new HistorialEmisorAdapter(em, entity);
    }*/

   

    /*@Override
    public boolean desactivar(HistorialEmisorModel historialEmisorModel) {
        HistorialEmisorEntity entity = this.em.find(HistorialEmisorEntity.class,
                historialEmisorModel.getId());
        entity.setEstado(false);
        em.persist(entity);
        return true;
    }*/

    /*@Override
    public HistorialEmisorModel findByEstado(boolean status) {
        TypedQuery<HistorialEmisorEntity> query = em.createNamedQuery("EmisorEntity.findByEstado",
                HistorialEmisorEntity.class);
        query.setParameter("estado", status);
        List<HistorialEmisorEntity> results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() > 1) {
            throw new IllegalStateException(
                    "Mas de un historial con Estado=" + status + ", results=" + results);
        } else {
            return new HistorialEmisorAdapter(em, results.get(0));
        }
    }*/  

    @Override
    public List<EmisorModel> getAll() {
        TypedQuery<EmisorEntity> query = em.createNamedQuery("EmisorEntity.findAll", EmisorEntity.class);
        List<EmisorEntity> entities = query.getResultList();
        List<EmisorModel> result = new ArrayList<>();
        entities.forEach(f -> result.add(new EmisorAdapter(em, f)));
        return result;
    }

    @Override
    public SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria) {
        SearchResultsModel<EmisorEntity> entityResult = find(criteria, EmisorEntity.class);
        List<EmisorEntity> entities = entityResult.getModels();

        SearchResultsModel<EmisorModel> searchResult = new SearchResultsModel<>();
        List<EmisorModel> models = searchResult.getModels();

        entities.forEach(f -> models.add(new EmisorAdapter(em, f)));
        searchResult.setTotalSize(entityResult.getTotalSize());
        return searchResult;
    }

    @Override
    public SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText) {
        SearchResultsModel<EmisorEntity> entityResult = findFullText(criteria, EmisorEntity.class, filterText,
                "razonSocial");
        List<EmisorEntity> entities = entityResult.getModels();

        SearchResultsModel<EmisorModel> searchResult = new SearchResultsModel<>();
        List<EmisorModel> models = searchResult.getModels();

        entities.forEach(f -> models.add(new EmisorAdapter(em, f)));
        searchResult.setTotalSize(entityResult.getTotalSize());
        return searchResult;
    }

}
