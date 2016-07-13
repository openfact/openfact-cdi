package org.openfact.models.jpa.entities;

import java.time.LocalDate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name = "ENVIO")
@Entity
public class EnvioEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ID", length = 36)
    private String id;

    @Column(name = "VERSION_UBL")
    private String versionUbl;

    @Column(name = "VERSION_DOCUMENTO")
    private String versionDocumento;

    @Column(name = "FIRMA_DIGITAL")
    private String firmaDigital;

    @Column(name = "FECHA_ENVIO")
    private LocalDate fechaEnvio;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersionUbl() {
        return versionUbl;
    }

    public void setVersionUbl(String versionUbl) {
        this.versionUbl = versionUbl;
    }

    public String getVersionDocumento() {
        return versionDocumento;
    }

    public void setVersionDocumento(String versionDocumento) {
        this.versionDocumento = versionDocumento;
    }

    public String getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(String firmaDigital) {
        this.firmaDigital = firmaDigital;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

}
