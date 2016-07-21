package org.openfact.models.invoice;

import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.ExtensionContentType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionsType;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
public class ObjectFactorySunat {
    /*
    * @XmlElement(name = "UBLExtensions", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2")
        private UBLExtensionsType ublExtensions;
        @XmlElement(name = "UBLVersionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private UBLVersionIDType ublVersionID;
        @XmlElement(name = "CustomizationID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private CustomizationIDType customizationID;
        @XmlElement(name = "ProfileID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private ProfileIDType profileID;
        @XmlElement(name = "ProfileExecutionID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private ProfileExecutionIDType profileExecutionID;
        @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
        private IDType id;
        @XmlElement(name = "CopyIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private CopyIndicatorType copyIndicator;
        @XmlElement(name = "UUID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private UUIDType uuid;
        @XmlElement(name = "IssueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
        private IssueDateType issueDate;
        @XmlElement(name = "IssueTime", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private IssueTimeType issueTime;
        @XmlElement(name = "DueDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private DueDateType dueDate;
        @XmlElement(name = "InvoiceTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private InvoiceTypeCodeType invoiceTypeCode;
        @XmlElement(name = "Note", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private List<NoteType> note;
        @XmlElement(name = "TaxPointDate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private TaxPointDateType taxPointDate;
        @XmlElement(name = "DocumentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private DocumentCurrencyCodeType documentCurrencyCode;
        @XmlElement(name = "TaxCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private TaxCurrencyCodeType taxCurrencyCode;
        @XmlElement(name = "PricingCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private PricingCurrencyCodeType pricingCurrencyCode;
        @XmlElement(name = "PaymentCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private PaymentCurrencyCodeType paymentCurrencyCode;
        @XmlElement(name = "PaymentAlternativeCurrencyCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private PaymentAlternativeCurrencyCodeType paymentAlternativeCurrencyCode;
        @XmlElement(name = "AccountingCostCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private AccountingCostCodeType accountingCostCode;
        @XmlElement(name = "AccountingCost", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private AccountingCostType accountingCost;
        @XmlElement(name = "LineCountNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private LineCountNumericType lineCountNumeric;
        @XmlElement(name = "BuyerReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
        private BuyerReferenceType buyerReference;
        @XmlElement(name = "InvoicePeriod", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<PeriodType> invoicePeriod;
        @XmlElement(name = "OrderReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private OrderReferenceType orderReference;
        @XmlElement(name = "BillingReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<BillingReferenceType> billingReference;
        @XmlElement(name = "DespatchDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> despatchDocumentReference;
        @XmlElement(name = "ReceiptDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> receiptDocumentReference;
        @XmlElement(name = "StatementDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> statementDocumentReference;
        @XmlElement(name = "OriginatorDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> originatorDocumentReference;
        @XmlElement(name = "ContractDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> contractDocumentReference;
        @XmlElement(name = "AdditionalDocumentReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DocumentReferenceType> additionalDocumentReference;
        @XmlElement(name = "ProjectReference", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<ProjectReferenceType> projectReference;
        @XmlElement(name = "Signature", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<SignatureType> signature;
        @XmlElement(name = "AccountingSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
        private SupplierPartyType accountingSupplierParty;
        @XmlElement(name = "AccountingCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
        private CustomerPartyType accountingCustomerParty;
        @XmlElement(name = "PayeeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private PartyType payeeParty;
        @XmlElement(name = "BuyerCustomerParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private CustomerPartyType buyerCustomerParty;
        @XmlElement(name = "SellerSupplierParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private SupplierPartyType sellerSupplierParty;
        @XmlElement(name = "TaxRepresentativeParty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private PartyType taxRepresentativeParty;
        @XmlElement(name = "Delivery", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<DeliveryType> delivery;
        @XmlElement(name = "DeliveryTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private DeliveryTermsType deliveryTerms;
        @XmlElement(name = "PaymentMeans", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<PaymentMeansType> paymentMeans;
        @XmlElement(name = "PaymentTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<PaymentTermsType> paymentTerms;
        @XmlElement(name = "PrepaidPayment", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<PaymentType> prepaidPayment;
        @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<AllowanceChargeType> allowanceCharge;
        @XmlElement(name = "TaxExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private ExchangeRateType taxExchangeRate;
        @XmlElement(name = "PricingExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private ExchangeRateType pricingExchangeRate;
        @XmlElement(name = "PaymentExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private ExchangeRateType paymentExchangeRate;
        @XmlElement(name = "PaymentAlternativeExchangeRate", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private ExchangeRateType paymentAlternativeExchangeRate;
        @XmlElement(name = "TaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<TaxTotalType> taxTotal;
        @XmlElement(name = "WithholdingTaxTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
        private List<TaxTotalType> withholdingTaxTotal;
        @XmlElement(name = "LegalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
        private MonetaryTotalType legalMonetaryTotal;
        @XmlElement(name = "InvoiceLine", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", required = true)
        private List<InvoiceLineType> invoiceLine;
    * */
    private InvoiceType Invoice;
    private UBLExtensionsType UBLExtensions;

    public ObjectFactorySunat() {
    }
    public InvoiceType createInvoiceType() {
        Invoice = new InvoiceType();
        return Invoice;
    }

    public UBLExtensionsType createUBLExtensionsType() {
        UBLExtensions = new UBLExtensionsType();
        return UBLExtensions;
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
