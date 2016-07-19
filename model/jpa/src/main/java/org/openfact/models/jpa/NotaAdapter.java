package org.openfact.models.jpa;

import org.openfact.models.*;
import org.openfact.models.enums.TipoDocumentoRelacionadoType;
import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.jpa.entities.NotaEntity;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by Gissela-Sistemas on 8/07/2016.
 */
public class NotaAdapter implements NotaModel, JpaModel<NotaEntity> {
   private EntityManager em;
    private NotaEntity notaEntity;

    public NotaAdapter(EntityManager em, NotaEntity notaEntity) {
        this.em = em;
        this.notaEntity=notaEntity;
    }
    public  static NotaEntity toEmisorEntity(EmisorModel model, EntityManager em){
        if (model instanceof NotaAdapter){
            return ((NotaAdapter)model).getEntity();
        }
        return em.getReference(NotaEntity.class, model.getId());
    }

    @Override
    public void commit(){em.merge(notaEntity);

    }
    @Override
    public NotaEntity getEntity() {
        return  notaEntity;
    }
    @Override
    public String getId() {
        return null;
    }

    @Override
    public TipoDocumentoRelacionadoType getTipoDocumentoRelacionadoType() {
        return null;
    }

    @Override
    public void setTipoDocumentoRelacionadoType(TipoDocumentoRelacionadoType type) {

    }

    @Override
    public NumeracionComprobantePagoModel getNumeraccion() {
        return null;
    }

    @Override
    public TipoDocumentoType getTipoDocumento() {
        return null;
    }

    @Override
    public LocalDate getFechaEmision() {
        return null;
    }

    @Override
    public EmisorModel getEmisor() {
        return null;
    }

    @Override
    public AdquirienteModel getAdquiriente() {
        return null;
    }

    @Override
    public ResumenNotaModel getResumen() {
        return null;
    }

    @Override
    public EnvioModel getEnvio() {
        return null;
    }

    @Override
    public ComprobantePagoModel getComprobantePago() {
        return null;
    }

    @Override
    public Set<DetalleNotaModel> getDetalle() {
        return null;
    }


}
