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
        return notaEntity.getGetId();
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
        return notaEntity.getFechaEmision();
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((notaEntity == null) ? 0 : notaEntity.hashCode());
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
        NotaAdapter other = (NotaAdapter) obj;
        if (notaEntity == null) {
            if (other.notaEntity != null)
                return false;
        } else if (!notaEntity.equals(other.notaEntity))
            return false;
        return true;
    }
}
