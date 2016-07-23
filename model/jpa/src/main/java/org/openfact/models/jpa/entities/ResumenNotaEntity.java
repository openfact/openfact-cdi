package org.openfact.models.jpa.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Entity
@Table(name = "RESUMEN_NOTA")
public class ResumenNotaEntity {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "ID")
    private String id;

    @NotNull
    @NotBlank
    @Column(name = "MONEDA")
    private String moneda;

    @NotNull
    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "IMPORTE_TOTAL")
    private BigDecimal importeTotal;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "CARGOS")
    private BigDecimal cargos;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TRIBUTOS")
    private BigDecimal tributos;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_GRAVADO")
    private BigDecimal totalOperacionesGravadas;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_INAFECTO")
    private BigDecimal totalOperacionesInafectas;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "TOTAL_EXONERADO")
    private BigDecimal totalOperacionesExoneradas;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "IGV")
    private BigDecimal totalIgv;

    @Min(value = 0)
    @Digits(integer = 18, fraction = 2)
    @Column(name = "ISC")
    private BigDecimal totalIsc;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(BigDecimal importeTotal) {
        this.importeTotal = importeTotal;
    }

    public BigDecimal getCargos() {
        return cargos;
    }

    public void setCargos(BigDecimal cargos) {
        this.cargos = cargos;
    }

    public BigDecimal getTributos() {
        return tributos;
    }

    public void setTributos(BigDecimal tributos) {
        this.tributos = tributos;
    }

    public BigDecimal getTotalOperacionesGravadas() {
        return totalOperacionesGravadas;
    }

    public void setTotalOperacionesGravadas(BigDecimal totalOperacionesGravadas) {
        this.totalOperacionesGravadas = totalOperacionesGravadas;
    }

    public BigDecimal getTotalOperacionesInafectas() {
        return totalOperacionesInafectas;
    }

    public void setTotalOperacionesInafectas(BigDecimal totalOperacionesInafectas) {
        this.totalOperacionesInafectas = totalOperacionesInafectas;
    }

    public BigDecimal getTotalOperacionesExoneradas() {
        return totalOperacionesExoneradas;
    }

    public void setTotalOperacionesExoneradas(BigDecimal totalOperacionesExoneradas) {
        this.totalOperacionesExoneradas = totalOperacionesExoneradas;
    }

    public BigDecimal getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(BigDecimal totalIgv) {
        this.totalIgv = totalIgv;
    }

    public BigDecimal getTotalIsc() {
        return totalIsc;
    }

    public void setTotalIsc(BigDecimal totalIsc) {
        this.totalIsc = totalIsc;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ResumenNotaEntity other = (ResumenNotaEntity) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
