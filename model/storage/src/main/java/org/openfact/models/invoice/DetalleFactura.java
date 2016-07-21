package org.openfact.models.invoice;

import org.openfact.models.enums.CodigoTipoAfectacionIgv;
import org.openfact.models.enums.CodigoTipoPrecioVentaUnit;
import org.openfact.models.enums.CodigoTipoTributo;
import org.openfact.models.enums.CurrencyCodeContentTypeFact;

import java.math.BigDecimal;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
public class DetalleFactura {
    private String id;
    private String invoicedQuantityUnitCode;
    private BigDecimal invoicedQuantityMonto;
    private CurrencyCodeContentTypeFact lineExtensionAmountCurrencyCode;
    private BigDecimal lineExtensionAmountMonto;
    private CurrencyCodeContentTypeFact priceAmountCurrencyCode;
    private BigDecimal priceAmountMonto;
    private CodigoTipoPrecioVentaUnit priceTypeCode;
    private BigDecimal taxTotalTaxAmountMonto;
    private CurrencyCodeContentTypeFact taxTotalTaxAmountCodigo;
    private BigDecimal taxTotalTaxSubtotalTaxAmountMonto;
    private CurrencyCodeContentTypeFact taxTotalTaxSubtotalTaxAmountCodigo;
    private CodigoTipoTributo categoryTaxScheme;
    private CodigoTipoAfectacionIgv taxExemptionReasonCode;
    private String ItemDescription;
    private String ItemDescriptionSellersItemIdentificationId;
    private BigDecimal pricePriceAmountMonto;
    private CurrencyCodeContentTypeFact PricePriceAmountCodigo;

    public void setInvoicedQuantity(String codigo, BigDecimal monto) {
        invoicedQuantityUnitCode = codigo;
        invoicedQuantityMonto = monto;
    }

    public void setLineExtensionAmount(CurrencyCodeContentTypeFact codigo, BigDecimal monto) {
        lineExtensionAmountCurrencyCode = codigo;
        lineExtensionAmountMonto = monto;
    }

    public void setPricingReferenceAlternativeConditionPricePriceAmount(CurrencyCodeContentTypeFact codigo, BigDecimal monto) {
        priceAmountCurrencyCode = codigo;
        priceAmountMonto = monto;
    }

    public void setPricingReferenceAlternativeConditionPricePriceTypeCode(CodigoTipoPrecioVentaUnit codigo) {
        priceTypeCode = codigo;
    }

    public void setTaxTotalTaxAmount(BigDecimal monto, CurrencyCodeContentTypeFact codigo) {
        taxTotalTaxAmountMonto = monto;
        taxTotalTaxAmountCodigo = codigo;
    }

    public void setTaxTotalTaxSubtotalTaxAmount(BigDecimal monto, CurrencyCodeContentTypeFact codigo) {
        taxTotalTaxSubtotalTaxAmountMonto = monto;
        taxTotalTaxSubtotalTaxAmountCodigo = codigo;
    }

    public void setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo codigo) {
        categoryTaxScheme = codigo;
    }

    public void setTaxTotalTaxSubtotalTaxCategoryTaxExemptionReasonCode(CodigoTipoAfectacionIgv codigo) {
        taxExemptionReasonCode = codigo;
    }

    public void setPricePriceAmount(BigDecimal monto, CurrencyCodeContentTypeFact codigo) {
        pricePriceAmountMonto = monto;
        PricePriceAmountCodigo = codigo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInvoicedQuantityUnitCode() {
        return invoicedQuantityUnitCode;
    }

    public BigDecimal getInvoicedQuantityMonto() {
        return invoicedQuantityMonto;
    }

    public CurrencyCodeContentTypeFact getLineExtensionAmountCurrencyCode() {
        return lineExtensionAmountCurrencyCode;
    }

    public BigDecimal getLineExtensionAmountMonto() {
        return lineExtensionAmountMonto;
    }

    public CurrencyCodeContentTypeFact getPriceAmountCurrencyCode() {
        return priceAmountCurrencyCode;
    }

    public BigDecimal getPriceAmountMonto() {
        return priceAmountMonto;
    }

    public CodigoTipoPrecioVentaUnit getPriceTypeCode() {
        return priceTypeCode;
    }

    public BigDecimal getTaxTotalTaxAmountMonto() {
        return taxTotalTaxAmountMonto;
    }

    public CurrencyCodeContentTypeFact getTaxTotalTaxAmountCodigo() {
        return taxTotalTaxAmountCodigo;
    }

    public BigDecimal getTaxTotalTaxSubtotalTaxAmountMonto() {
        return taxTotalTaxSubtotalTaxAmountMonto;
    }

    public CurrencyCodeContentTypeFact getTaxTotalTaxSubtotalTaxAmountCodigo() {
        return taxTotalTaxSubtotalTaxAmountCodigo;
    }

    public CodigoTipoTributo getCategoryTaxScheme() {
        return categoryTaxScheme;
    }

    public CodigoTipoAfectacionIgv getTaxExemptionReasonCode() {
        return taxExemptionReasonCode;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public void setItemDescription(String descripcion) {
        ItemDescription = descripcion;
    }

    public String getItemDescriptionSellersItemIdentificationId() {
        return ItemDescriptionSellersItemIdentificationId;
    }

    public void setItemDescriptionSellersItemIdentificationId(String codigoProducto) {
        ItemDescriptionSellersItemIdentificationId = codigoProducto;
    }

    public BigDecimal getPricePriceAmountMonto() {
        return pricePriceAmountMonto;
    }

    public CurrencyCodeContentTypeFact getPricePriceAmountCodigo() {
        return PricePriceAmountCodigo;
    }
}
