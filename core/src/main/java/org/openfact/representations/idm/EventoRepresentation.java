package org.openfact.representations.idm;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by Alex Pariona on 07/07/2016.
 */
public class EventoRepresentation implements Serializable {

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    private LocalDate Fecha;
}
