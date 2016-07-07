package org.openfact.models.jpa.entities;

import java.time.LocalDate;

public class BajaEntity {

    private LocalDate fechaEmision;
    //private TipoDocumentoEntity tipoDocumento;

    private String motivoBaja;

    private ComprobantePagoEntity comprobante;
}
