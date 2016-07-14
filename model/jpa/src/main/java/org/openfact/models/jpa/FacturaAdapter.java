package org.openfact.models.jpa;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.EntityManager;

import org.openfact.models.AdquirienteModel;
import org.openfact.models.DetalleFacturaModel;
import org.openfact.models.EmisorModel;
import org.openfact.models.EnvioModel;
import org.openfact.models.FacturaModel;
import org.openfact.models.InformacionAdicionalComprobantePagoModel;
import org.openfact.models.NumeracionComprobantePagoModel;
import org.openfact.models.ResumenComprobantePagoModel;
import org.openfact.models.enums.TipoDocumentoRelacionadoType;
import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.jpa.entities.FacturaEntity;

public class FacturaAdapter implements FacturaModel, JpaModel<FacturaEntity> {

    private EntityManager em;
    private FacturaEntity facturaEntity;

    public FacturaAdapter(EntityManager em, FacturaEntity facturaEntity) {
        this.em = em;
        this.facturaEntity = facturaEntity;
    }

    public static FacturaEntity toEmisorEntity(EmisorModel model, EntityManager em) {
        if (model instanceof FacturaAdapter) {
            return ((FacturaAdapter) model).getEntity();
        }
        return em.getReference(FacturaEntity.class, model.getId());
    }

    @Override
    public void commit() {
        em.merge(facturaEntity);
    }

    @Override
    public FacturaEntity getEntity() {
        return facturaEntity;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public TipoDocumentoType getTipoDocumento() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LocalDate getFechaEmision() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NumeracionComprobantePagoModel getNumeracion() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EmisorModel getEmisor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdquirienteModel getAdquiriente() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ResumenComprobantePagoModel getResumen() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public InformacionAdicionalComprobantePagoModel getInformacionAdicional() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setInformacionAdicional(InformacionAdicionalComprobantePagoModel informacionAdicional) {
        // TODO Auto-generated method stub

    }

    @Override
    public TipoDocumentoRelacionadoType getTipoDocumentoRelacionadoType() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setTipoDocumentoRelacionadoType(TipoDocumentoRelacionadoType type) {
        // TODO Auto-generated method stub

    }

    @Override
    public EnvioModel getEnvio() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<DetalleFacturaModel> getDetalle() {
        // TODO Auto-generated method stub
        return null;
    }

}
