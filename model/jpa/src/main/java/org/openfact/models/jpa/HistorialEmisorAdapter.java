package org.openfact.models.jpa;

import org.openfact.models.EmisorModel;
import org.openfact.models.HistorialEmisorModel;
import org.openfact.models.jpa.entities.EmisorEntity;
import org.openfact.models.jpa.entities.HistorialEmisorEntity;

import javax.persistence.EntityManager;

/**
 * Created by AHREN on 08/07/2016.
 */
public class HistorialEmisorAdapter implements HistorialEmisorModel, JpaModel<HistorialEmisorEntity> {
    private EntityManager em;
    private HistorialEmisorEntity historialEmisorEntity;

    public HistorialEmisorAdapter(EntityManager em, HistorialEmisorEntity historialEmisorEntity) {
        this.em = em;
        this.historialEmisorEntity = historialEmisorEntity;
    }

    public static HistorialEmisorEntity toHistorialEmisorEntity(HistorialEmisorModel model, EntityManager em) {
        if (model instanceof EmisorAdapter) {
            return ((HistorialEmisorAdapter) model).getEntity();
        }
        return em.getReference(HistorialEmisorEntity.class, model.getId());
    }
     public void commit() {
        em.merge(historialEmisorEntity);
    }

    @Override public String getId() {
        return historialEmisorEntity.getId();
    }

    @Override public String getResolucionAutorizacion() {
        return historialEmisorEntity.getResolucionAutorizacion();
    }

    @Override public void setResolucionAutorizacion(String resolucionAutorizacion) {
        historialEmisorEntity.setResolucionAutorizacion(resolucionAutorizacion);
    }

    @Override public String getMensajeRepresentacionImpresa() {
        return historialEmisorEntity.getMensajeRepresentacionImpresa();
    }

    @Override public void setMensajeRepresentacionImpresa(String mensajeRepresentacionImpresa) {
        historialEmisorEntity.setMensajeRepresentacionImpresa(mensajeRepresentacionImpresa);
    }

    @Override public String getMensajeServicioGratuito() {
        return historialEmisorEntity.getMensajeServicioGratuito();
    }

    @Override public void setMensajeServicioGratuito(String mensajeServicioGratuito) {
        historialEmisorEntity.setMensajeServicioGratuito(mensajeServicioGratuito);
    }

    @Override public boolean isEstado() {
        return historialEmisorEntity.isEstado();
    }

    @Override public void setEstado(boolean estado) {
        historialEmisorEntity.setEstado(estado);
    }

    @Override public EmisorModel getEmisor() {
        return null;
    }

    @Override public void setEmisor(EmisorModel emisor) {

    }

    @Override public HistorialEmisorEntity getEntity() {
        return historialEmisorEntity;
    }
}
