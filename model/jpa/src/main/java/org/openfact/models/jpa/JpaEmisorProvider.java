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
import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.enums.TipoNotaType;
import org.openfact.models.jpa.entities.EmisorEntity;
import org.openfact.models.jpa.entities.TipoNotaEntity;
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
    public EmisorModel create(String ruc, String razonSocial) {
        if (findByRuc(ruc) != null) {
            throw new ModelDuplicateException("El emisor sunat debe ser unico, se encontro otra entidad con el mismo RUC: " + ruc);
        }
        EmisorEntity emisorEntity = new EmisorEntity();
        emisorEntity.setRuc(ruc);
        emisorEntity.setRazonSocial(razonSocial);
        emisorEntity.setEstado(true);
        em.persist(emisorEntity);
        return new EmisorAdapter(em, emisorEntity);
    }

    @Override
    public EmisorModel findById(int id) {
        EmisorEntity emisorEntity = this.em.find(EmisorEntity.class, id);
        return emisorEntity != null ? new EmisorAdapter(em, emisorEntity) : null;
    }

    @Override
    public EmisorModel findByRuc(String ruc) {
        TypedQuery<EmisorEntity> query = em.createNamedQuery("EmisorEntity.findByRuc", EmisorEntity.class);
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
    public EmisorModel findByRazonSocial(String razonSocial) {
        TypedQuery<EmisorEntity> query = em.createNamedQuery("EmisorEntity.findByRazonSocial",
                EmisorEntity.class);
        query.setParameter("razonSocial", razonSocial);

        List<EmisorEntity> results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        } else if (results.size() > 1) {
            throw new IllegalStateException("Mas de un Emisor con RAZON SOCIAL=" + razonSocial + ", results=" + results);
        } else {
            return new EmisorAdapter(em, results.get(0));
        }
    }

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

        entities.forEach(f -> models.add(new EmisorAdapter(em, f) ));
        searchResult.setTotalSize(entityResult.getTotalSize());
        return searchResult;
    }

    @Override
    public SearchResultsModel<EmisorModel> search(SearchCriteriaModel criteria, String filterText) {
        SearchResultsModel<EmisorEntity> entityResult = findFullText(criteria, EmisorEntity.class, filterText, "razonSocial");
        List<EmisorEntity> entities = entityResult.getModels();

        SearchResultsModel<EmisorModel> searchResult = new SearchResultsModel<>();
        List<EmisorModel> models = searchResult.getModels();

        entities.forEach(f -> models.add(new EmisorAdapter(em, f) ));
        searchResult.setTotalSize(entityResult.getTotalSize());
        return searchResult;
    }

}
