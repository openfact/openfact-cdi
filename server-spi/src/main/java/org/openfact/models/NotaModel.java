package org.openfact.models;

import org.openfact.models.enums.TipoDocumentoRelacionadoType;
import org.openfact.models.enums.TipoDocumentoType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

public interface NotaModel extends Model {

    String getId();

    TipoDocumentoRelacionadoType getTipoDocumentoRelacionadoType();

    void setTipoDocumentoRelacionadoType(TipoDocumentoRelacionadoType type);

    NumeracionComprobantePagoModel getNumeraccion();

    TipoDocumentoType getTipoDocumento();

    LocalDate getFechaEmision();

    EmisorModel getEmisor();

    AdquirienteModel getAdquiriente();

    ResumenNotaModel getResumen();

    EnvioModel getEnvio();

    ComprobantePagoModel getComprobantePago();

    Set<DetalleNotaModel> getDetalle();


}
