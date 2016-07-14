package org.openfact.models.jpa;

import javax.persistence.EntityManager;

import org.openfact.models.EmisorModel;
import org.openfact.models.jpa.entities.EmisorEntity;

public class EmisorAdapter implements EmisorModel, JpaModel<EmisorEntity> {

    private EntityManager em;
    private EmisorEntity emisorEntity;

    public EmisorAdapter(EntityManager em, EmisorEntity emisorEntity) {
        this.em = em;
        this.emisorEntity = emisorEntity;
    }

    public static EmisorEntity toEmisorEntity(EmisorModel model, EntityManager em) {
        if (model instanceof EmisorAdapter) {
            return ((EmisorAdapter) model).getEntity();
        }
        return em.getReference(EmisorEntity.class, model.getId());
    }

    @Override
    public void commit() {
        em.merge(emisorEntity);
    }

    @Override
    public EmisorEntity getEntity() {
        return emisorEntity;
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

    @Override
    public String getPais() {
        return emisorEntity.getPais();
    }

    @Override
    public void setPais(String pais) {
        emisorEntity.setPais(pais);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((emisorEntity == null) ? 0 : emisorEntity.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmisorAdapter other = (EmisorAdapter) obj;
        if (emisorEntity == null) {
            if (other.emisorEntity != null)
                return false;
        } else if (!emisorEntity.equals(other.emisorEntity))
            return false;
        return true;
    }

}
