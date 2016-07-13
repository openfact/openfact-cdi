package org.openfact.models.jpa.entities;

import org.openfact.models.enums.TipoDocumentoRelacionadoType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "FACTURA")
@DiscriminatorValue(value = "FACTURA")
public class FacturaEntity extends ComprobantePagoEntity {

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_DOCUMENTO_RELACIONADO")
    private TipoDocumentoRelacionadoType documentoRelacionado;

    @Column(name = "NUMERO_DOCUMENTO_RELACIONADO")
    private String numeroDocumentoRelacionado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey)
    private EnvioEntity envio;

    @OneToMany(cascade = {CascadeType.REMOVE}, orphanRemoval = true, mappedBy = "factura")
    private Set<DetalleFacturaEntity> detalle = new HashSet<>();

    public TipoDocumentoRelacionadoType getDocumentoRelacionado() {
        return documentoRelacionado;
    }

    public void setDocumentoRelacionado(TipoDocumentoRelacionadoType documentoRelacionado) {
        this.documentoRelacionado = documentoRelacionado;
    }

    public String getNumeroDocumentoRelacionado() {
        return numeroDocumentoRelacionado;
    }

    public void setNumeroDocumentoRelacionado(String numeroDocumentoRelacionado) {
        this.numeroDocumentoRelacionado = numeroDocumentoRelacionado;
    }

    public EnvioEntity getEnvio() {
        return envio;
    }

    public void setEnvio(EnvioEntity envio) {
        this.envio = envio;
    }

}
