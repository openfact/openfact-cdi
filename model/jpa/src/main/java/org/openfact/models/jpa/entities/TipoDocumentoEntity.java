package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.openfact.models.enums.TipoDocumentoType;

import javax.persistence.*;


@Entity
@Table(name = "TIPO_DOCUMENTO")
public class TipoDocumentoEntity {

    @Id
    @Access(AccessType.PROPERTY)
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name="id", length = 36)
    private String id;

    @Column(name="codigo")
    private String codigo;

    @Column(name="descripcion")
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name="tipo")
    private TipoDocumentoType tipo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoDocumentoType getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumentoType tipo) {
        this.tipo = tipo;
    }
}
