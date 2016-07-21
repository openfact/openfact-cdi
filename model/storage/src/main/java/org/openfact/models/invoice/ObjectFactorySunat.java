package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.ExtensionContentType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionsType;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice")
@CodingStyleguideUnaware
public class ObjectFactorySunat {

    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    public UBLExtensionsType createUBLExtensionsType() {
        return new UBLExtensionsType();
    }

    public UBLExtensionType createUBLExtensionType() {
        return new UBLExtensionType();
    }

    public ExtensionContentType createExtensionContentType() {
        return new ExtensionContentType();
    }

    public AdditionalInformation createAdditionalInformationTypeSunatAgg() {
        return new AdditionalInformation();
    }

    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    public PartyType createPartyType() {
        return new PartyType();
    }

    public PartyIdentificationType createPartyIdentificationType() {
        return new PartyIdentificationType();
    }

    public SupplierPartyType createSupplierPartyType() {
        return new SupplierPartyType();
    }

    public AddressType createAddressType() {
        return new AddressType();
    }

    public CountryType createCountryType() {
        return new CountryType();
    }

    public PartyLegalEntityType createPartyLegalEntityType() {
        return new PartyLegalEntityType();
    }

    public CustomerPartyType createCustomerPartyType() {
        return new CustomerPartyType();
    }

    public TaxTotalType createTaxTotalType() {
        return new TaxTotalType();
    }

    public TaxSubtotalType createTaxSubtotalType() {
        return new TaxSubtotalType();
    }

    public TaxCategoryType createTaxCategoryType() {
        return new TaxCategoryType();
    }

    public TaxSchemeType createTaxSchemeType() {
        return new TaxSchemeType();
    }

    public MonetaryTotalType createMonetaryTotalType() {
        return new MonetaryTotalType();
    }

    public PartyNameType createPartyNameType() {
        return new PartyNameType();
    }

    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    public ExternalReferenceType createExternalReferenceType() {
        return new ExternalReferenceType();
    }


    public JAXBElement<InvoiceType> createInvoice(InvoiceType invoiceType) {
        return new JAXBElement<InvoiceType>(new QName("Invoice"), InvoiceType.class, null, invoiceType);
    }

    public JAXBElement<AdditionalInformation> createAdditionalInformation(
            AdditionalInformation informacionAdicional) {
        return new JAXBElement<AdditionalInformation>(new QName(AdditionalInformation.class.getSimpleName()), AdditionalInformation.class, null, informacionAdicional);
    }

    public IDType createIDType() {
        return new IDType();
    }

    public PayableAmountType createPayableAmountType() {
        return new PayableAmountType();
    }

    public AdditionalMonetaryTotal createAdditionalMonetaryTotalType() {
        return new AdditionalMonetaryTotal();
    }

    public ValueType createValueType() {
        return new ValueType();
    }

    public AdditionalProperty createAdditionalPropertyType() {
        return new AdditionalProperty();
    }

    public UBLVersionIDType createUBLVersionIDType() {
        return new UBLVersionIDType();
    }

    public CustomizationIDType createCustomizationIDType() {
        return new CustomizationIDType();
    }

    public IssueDateType createIssueDateType() {
        return new IssueDateType();
    }

    public InvoiceTypeCodeType createInvoiceTypeCodeType() {
        return new InvoiceTypeCodeType();
    }

    public DocumentCurrencyCodeType createDocumentCurrencyCodeType() {
        return new DocumentCurrencyCodeType();
    }

    public NameTypeCommBas createNameTypeCommBas() {
        return new NameTypeCommBas();
    }

    public URIType createURIType() {
        return new URIType();
    }

    public CustomerAssignedAccountIDType createCustomerAssignedAccountIDType() {
        return new CustomerAssignedAccountIDType();
    }

    public AdditionalAccountIDType createAdditionalAccountIDType() {
        return new AdditionalAccountIDType();
    }

    public StreetNameType createStreetNameType() {
        return new StreetNameType();
    }

    public CitySubdivisionNameType createCitySubdivisionNameType() {
        return new CitySubdivisionNameType();
    }

    public CityNameType createCityNameType() {
        return new CityNameType();
    }

    public CountrySubentityType createCountrySubentityType() {
        return new CountrySubentityType();
    }

    public DistrictType createDistrictType() {
        return new DistrictType();
    }

    public IdentificationCodeType createIdentificationCodeType() {
        return new IdentificationCodeType();
    }

    public RegistrationNameType createRegistrationNameType() {
        return new RegistrationNameType();
    }

    public TaxAmountType createTaxAmountType() {
        return new TaxAmountType();
    }

    public TaxTypeCodeType createTaxTypeCodeType() {
        return new TaxTypeCodeType();
    }

    public InvoiceLineType createInvoiceLineType() {
        return new InvoiceLineType();
    }

    public InvoicedQuantityType createInvoicedQuantityType() {
        return new InvoicedQuantityType();
    }

    public LineExtensionAmountType createLineExtensionAmountType() {
        return new LineExtensionAmountType();
    }

    public PricingReferenceType createPricingReferenceType() {
        return new PricingReferenceType();
    }

    public PriceType createPriceType() {
        return new PriceType();
    }

    public PriceAmountType createPriceAmountType() {
        return new PriceAmountType();
    }

    public PriceTypeCodeType createPriceTypeCodeType() {
        return new PriceTypeCodeType();
    }

    public TaxExemptionReasonCodeType createTaxExemptionReasonCodeType() {
        return new TaxExemptionReasonCodeType();
    }

    public ItemType createItemType() {
        return new ItemType();
    }

    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    public ItemIdentificationType createItemIdentificationType() {
        return new ItemIdentificationType();
    }
}
