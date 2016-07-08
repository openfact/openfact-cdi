package org.openfact.models.jpa;

import org.openfact.models.*;
import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.jpa.entities.BoletaEntity;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
public class BoletaAdapter implements BoletaModel, JpaModel<BoletaEntity> {
   private EntityManager em;
    private BoletaEntity boletaEntity;

    public BoletaAdapter(EntityManager em, BoletaEntity boletaEntity) {
        this.em = em;
        this.boletaEntity=boletaEntity;
    }
    public  static BoletaEntity toEmisorEntity(EmisorModel model, EntityManager em){
        if (model instanceof BoletaAdapter){
            return ((BoletaAdapter)model).getEntity();
        }
        return em.getReference(BoletaEntity.class, model.getId());
    }
    @Override public void commit() {em.merge(boletaEntity);

    }

    @Override public BoletaEntity getEntity() {
        return boletaEntity;
    }

    @Override public Set<DetalleBoletaModel> getDetalle() {
        return null;
    }

    @Override public String getId() {
        return null;
    }

    @Override public TipoDocumentoType getTipoDocumento() {
        return null;
    }

    @Override public LocalDate getFechaEmision() {
        return null;
    }

    @Override public NumeracionComprobantePagoModel getNumeracion() {
        return null;
    }

    @Override public EmisorModel getEmisor() {
        return null;
    }

    @Override public AdquirienteModel getAdquiriente() {
        return null;
    }

    @Override public ResumenComprobantePagoModel getResumen() {
        return null;
    }

    @Override public InformacionAdicionalComprobantePagoModel getInformacionAdicional() {
        return null;
    }

    @Override public void setInformacionAdicional(
            InformacionAdicionalComprobantePagoModel informacionAdicional) {

    }


}
