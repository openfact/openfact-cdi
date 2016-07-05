package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Table(name="ADQUIRIENTE")
@Entity
public class AdquirienteEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name="id", length = 36)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "documento", foreignKey = @ForeignKey)
    private DocumentoIdentidadEntity documento;

    @Column(name="numero_documento")
    private String numeroDocumento;

    @Column(name="nombre")
    private String nombre;

    @Column(name="direccion")
    private String direccion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DocumentoIdentidadEntity getDocumento() {
        return documento;
    }

    public void setDocumento(DocumentoIdentidadEntity documento) {
        this.documento = documento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
