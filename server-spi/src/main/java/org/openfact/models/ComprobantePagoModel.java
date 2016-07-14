package org.openfact.models;

import java.time.LocalDate;

import org.openfact.models.enums.TipoDocumentoType;

public interface ComprobantePagoModel extends Model {

    String getId();

    TipoDocumentoType getTipoDocumento();

    LocalDate getFechaEmision();

    NumeracionComprobantePagoModel getNumeracion();

    EmisorModel getEmisor();

    AdquirienteModel getAdquiriente();

    ResumenComprobantePagoModel getResumen();

    InformacionAdicionalComprobantePagoModel getInformacionAdicional();

    void setInformacionAdicional(InformacionAdicionalComprobantePagoModel informacionAdicional);

}
