package org.openfact.models.jpa;

import javax.persistence.EntityManager;

import org.openfact.models.EmisorModel;
import org.openfact.models.jpa.entities.EmisorEntity;

public class EmisorAdapter implements EmisorModel {
    private static final long serialVersionUID = 1L;
    private EmisorEntity emisorEntity;
    private EntityManager em;

    public EmisorAdapter(EntityManager em, EmisorEntity emisorEntity) {
        this.em = em;
        this.emisorEntity = emisorEntity;
    }

    public EmisorEntity getEmisorEntity() {
        return emisorEntity;
    }

    public static EmisorEntity toEmisorEntity(EmisorModel model, EntityManager em) {
        if (model instanceof EmisorAdapter) {
            return ((EmisorAdapter) model).getEmisorEntity();
        }
        return em.getReference(EmisorEntity.class, model.getId());
    }

    @Override
    public void commit() {
        em.merge(emisorEntity);
    }

    @Override
    public String getId() {

        return emisorEntity.getId();
    }

    @Override
    public String getRuc() {
        return emisorEntity.getRuc();
    }

    @Override
    public String getRazonSocial() {
        return emisorEntity.getRazonSocial();
    }

    @Override
    public void setRazonSocial(String razonSocial) {
        emisorEntity.setRazonSocial(razonSocial);
    }

    @Override
    public String getNombreComercial() {
        return emisorEntity.getNombreComercial();
    }

    @Override
    public void setNombreComercial(String nombreComercial) {
        emisorEntity.setNombreComercial(nombreComercial);
    }

    @Override
    public String getDomicilioFiscal() {
        return emisorEntity.getDomicilioFiscal();
    }

    @Override
    public void setDomicilioFiscal(String domicilioFiscal) {
        emisorEntity.setDomicilioFiscal(domicilioFiscal);
    }

    @Override
    public boolean getEstado() {
        return emisorEntity.isEstado();
    }

    @Override
    public void setEstado(boolean estado) {
        emisorEntity.setEstado(estado);
    }

}