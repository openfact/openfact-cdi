package org.openfact.models;

import org.openfact.models.enums.TipoDocumentoType;
import org.openfact.models.enums.TipoGuiaRemisionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ComprobantePagoModel extends  Model {

     String getId();

     TipoDocumentoType getTipoDocumento();
    
     LocalDate getFechaEmision();

     String getSerie();

     String getNumero();

     String getMoneda();

     BigDecimal getImporteTotal();

     void setImporteTotal(BigDecimal importeTotal);

     double getIgv();

     void setIgv(double igv);

     double getIsc();

     void setIsc(double isc);

     double getCargos();

     void setCargos(double cargos);

     double getTributos();

     void setTributos(double tributos);

     double getDescuentos();

     void setDescuentos(double descuentos);

     double getTotalGravado();

     void setTotalGravado(double totalGravado);

     double getTotalInafecto();

     void setTotalInafecto(double totalInafecto);

     double getTotalExonerado();

     void setTotalExonerado(double totalExonerado);

     TipoGuiaRemisionType getTipoGuiaRemision();

     void setTipoGuiaRemision(TipoGuiaRemisionType tipoGuiaRemision);

     String getNumeroGuiaRemision();

     void setNumeroGuiaRemision(String numeroGuiaRemision);

     EmisorModel getEmisor();

     AdquirienteModel getAdquiriente();

}
