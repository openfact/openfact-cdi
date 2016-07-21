//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.07.20 a las 12:44:20 PM COT 
//


package org.openfact.models.ubl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the openFact package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Invoice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", "Invoice");
    private final static QName _SummaryDocumentsLine_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SummaryDocumentsLine");
    private final static QName _VoidedDocumentsLine_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "VoidedDocumentsLine");
    private final static QName _DocumentSerialID_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DocumentSerialID");
    private final static QName _DocumentNumberID_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DocumentNumberID");
    private final static QName _VoidReasonDescription_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "VoidReasonDescription");
    private final static QName _StartDocumentNumberID_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "StartDocumentNumberID");
    private final static QName _EndDocumentNumberID_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "EndDocumentNumberID");
    private final static QName _PeriodID_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "PeriodID");
    private final static QName _BillingPayment_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "BillingPayment");
    private final static QName _AdditionalInformation_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "AdditionalInformation");
    private final static QName _AdditionalMonetaryTotal_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "AdditionalMonetaryTotal");
    private final static QName _AdditionalProperty_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "AdditionalProperty");
    private final static QName _ReferenceAmount_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "ReferenceAmount");
    private final static QName _TotalAmount_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "TotalAmount");
    private final static QName _SUNATTransaction_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATTransaction");
    private final static QName _SUNATEmbededDespatchAdvice_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATEmbededDespatchAdvice");
    private final static QName _SUNATShipment_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATShipment");
    private final static QName _SUNATShipmentStage_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATShipmentStage");
    private final static QName _SUNATTransportMeans_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATTransportMeans");
    private final static QName _SUNATRoadTransport_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATRoadTransport");
    private final static QName _SUNATDespatchLine_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATDespatchLine");
    private final static QName _DriverParty_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DriverParty");
    private final static QName _SUNATCarrierParty_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATCarrierParty");
    private final static QName _TransportReasonCode_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "TransportReasonCode");
    private final static QName _SemiTrailer_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SemiTrailer");
    private final static QName _DeliveryCarrierDate_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DeliveryCarrierDate");
    private final static QName _DeliveryCarrierTime_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DeliveryCarrierTime");
    private final static QName _OriginalDespatchDocumentReference_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "OriginalDespatchDocumentReference");
    private final static QName _DespatchChangeReason_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "DespatchChangeReason");
    private final static QName _OldOriginAddress_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "OldOriginAddress");
    private final static QName _OldDeliveryAddress_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "OldDeliveryAddress");
    private final static QName _OutsourcedIndicator_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "OutsourcedIndicator");
    private final static QName _MultiStageIndicator_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "MultiStageIndicator");
    private final static QName _ShipmentStageTypeCode_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "ShipmentStageTypeCode");
    private final static QName _SUNATFiscalPath_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATFiscalPath");
    private final static QName _SUNATVerificationCode_QNAME = new QName("urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", "SUNATVerificationCode");
    private final static QName _AccessoryRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccessoryRelatedItem");
    private final static QName _AccountingContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingContact");
    private final static QName _AccountingCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingCustomerParty");
    private final static QName _AccountingSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AccountingSupplierParty");
    private final static QName _ActualPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ActualPackage");
    private final static QName _AdditionalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalDocumentReference");
    private final static QName _AdditionalItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalItemIdentification");
    private final static QName _AdditionalItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalItemProperty");
    private final static QName _AdditionalTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AdditionalTemperature");
    private final static QName _Address_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Address");
    private final static QName _AddressLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AddressLine");
    private final static QName _AgentParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AgentParty");
    private final static QName _AirTransport_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AirTransport");
    private final static QName _AllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AllowanceCharge");
    private final static QName _AlternativeConditionPrice_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AlternativeConditionPrice");
    private final static QName _AnticipatedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "AnticipatedMonetaryTotal");
    private final static QName _ApplicableAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableAddress");
    private final static QName _ApplicableTaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableTaxCategory");
    private final static QName _ApplicableTerritoryAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ApplicableTerritoryAddress");
    private final static QName _Attachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Attachment");
    private final static QName _BillingReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BillingReference");
    private final static QName _BillingReferenceLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BillingReferenceLine");
    private final static QName _Branch_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Branch");
    private final static QName _BuyerContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerContact");
    private final static QName _BuyerCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerCustomerParty");
    private final static QName _BuyerProposedSubstituteLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyerProposedSubstituteLineItem");
    private final static QName _BuyersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "BuyersItemIdentification");
    private final static QName _CardAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CardAccount");
    private final static QName _CarrierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CarrierParty");
    private final static QName _CatalogueDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueDocumentReference");
    private final static QName _CatalogueItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueItemIdentification");
    private final static QName _CatalogueItemSpecificationUpdateLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueItemSpecificationUpdateLine");
    private final static QName _CatalogueLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueLine");
    private final static QName _CatalogueLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueLineReference");
    private final static QName _CataloguePricingUpdateLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CataloguePricingUpdateLine");
    private final static QName _CatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueReference");
    private final static QName _CatalogueRequestLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CatalogueRequestLine");
    private final static QName _CategorizesClassificationCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CategorizesClassificationCategory");
    private final static QName _CertificateOfOriginApplication_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CertificateOfOriginApplication");
    private final static QName _ClassificationCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassificationCategory");
    private final static QName _ClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassificationScheme");
    private final static QName _ClassifiedTaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ClassifiedTaxCategory");
    private final static QName _CommodityClassification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CommodityClassification");
    private final static QName _Communication_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Communication");
    private final static QName _ComplementaryRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ComplementaryRelatedItem");
    private final static QName _ComponentRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ComponentRelatedItem");
    private final static QName _ConsigneeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsigneeParty");
    private final static QName _Consignment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Consignment");
    private final static QName _ConsignorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ConsignorParty");
    private final static QName _Contact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Contact");
    private final static QName _ContactParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContactParty");
    private final static QName _ContainedGoodsItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainedGoodsItem");
    private final static QName _ContainedPackage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContainedPackage");
    private final static QName _Contract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Contract");
    private final static QName _ContractDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractDocumentReference");
    private final static QName _ContractorCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ContractorCustomerParty");
    private final static QName _CorporateRegistrationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CorporateRegistrationScheme");
    private final static QName _Country_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Country");
    private final static QName _CreditAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CreditAccount");
    private final static QName _CreditNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CreditNoteDocumentReference");
    private final static QName _CreditNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CreditNoteLine");
    private final static QName _CurrentStatus_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CurrentStatus");
    private final static QName _CustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "CustomerParty");
    private final static QName _DebitNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DebitNoteDocumentReference");
    private final static QName _DebitNoteLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DebitNoteLine");
    private final static QName _DefaultLanguage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DefaultLanguage");
    private final static QName _DeletedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeletedCatalogueReference");
    private final static QName _Delivery_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Delivery");
    private final static QName _DeliveryAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryAddress");
    private final static QName _DeliveryContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryContact");
    private final static QName _DeliveryCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryCustomerParty");
    private final static QName _DeliveryLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryLocation");
    private final static QName _DeliveryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryParty");
    private final static QName _DeliveryTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryTerms");
    private final static QName _DeliveryUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DeliveryUnit");
    private final static QName _Despatch_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Despatch");
    private final static QName _DespatchAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchAddress");
    private final static QName _DespatchContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchContact");
    private final static QName _DespatchDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchDocumentReference");
    private final static QName _DespatchLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchLine");
    private final static QName _DespatchLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchLineReference");
    private final static QName _DespatchParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchParty");
    private final static QName _DespatchSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DespatchSupplierParty");
    private final static QName _DestinationCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DestinationCountry");
    private final static QName _DigitalSignatureAttachment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DigitalSignatureAttachment");
    private final static QName _Dimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Dimension");
    private final static QName _DiscrepancyResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DiscrepancyResponse");
    private final static QName _DocumentDistribution_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentDistribution");
    private final static QName _DocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentReference");
    private final static QName _DocumentResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "DocumentResponse");
    private final static QName _EmbassyEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EmbassyEndorsement");
    private final static QName _EmergencyTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EmergencyTemperature");
    private final static QName _Endorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Endorsement");
    private final static QName _EndorserParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EndorserParty");
    private final static QName _EstimatedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "EstimatedDeliveryPeriod");
    private final static QName _ExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExchangeRate");
    private final static QName _ExportCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExportCountry");
    private final static QName _ExporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExporterParty");
    private final static QName _ExternalReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ExternalReference");
    private final static QName _FinalDeliveryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDeliveryParty");
    private final static QName _FinalDeliveryTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDeliveryTransportationService");
    private final static QName _FinalDestinationCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinalDestinationCountry");
    private final static QName _FinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialAccount");
    private final static QName _FinancialInstitution_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialInstitution");
    private final static QName _FinancialInstitutionBranch_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FinancialInstitutionBranch");
    private final static QName _FirstArrivalPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FirstArrivalPortLocation");
    private final static QName _FlashpointTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FlashpointTemperature");
    private final static QName _ForeignExchangeContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ForeignExchangeContract");
    private final static QName _FreightAllowanceCharge_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FreightAllowanceCharge");
    private final static QName _FreightForwarderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "FreightForwarderParty");
    private final static QName _GoodsItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GoodsItem");
    private final static QName _GoodsItemContainer_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "GoodsItemContainer");
    private final static QName _HandlingUnitDespatchLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HandlingUnitDespatchLine");
    private final static QName _HazardousGoodsTransit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HazardousGoodsTransit");
    private final static QName _HazardousItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "HazardousItem");
    private final static QName _ImporterParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ImporterParty");
    private final static QName _InformationContentProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InformationContentProviderParty");
    private final static QName _InsuranceEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InsuranceEndorsement");
    private final static QName _InvoiceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoiceDocumentReference");
    private final static QName _InvoiceLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoiceLine");
    private final static QName _InvoicePeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "InvoicePeriod");
    private final static QName _IssuerEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuerEndorsement");
    private final static QName _IssuerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuerParty");
    private final static QName _IssuingCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "IssuingCountry");
    private final static QName _Item_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Item");
    private final static QName _ItemComparison_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemComparison");
    private final static QName _ItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemIdentification");
    private final static QName _ItemInstance_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemInstance");
    private final static QName _ItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemLocationQuantity");
    private final static QName _ItemProperty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemProperty");
    private final static QName _ItemPropertyGroup_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemPropertyGroup");
    private final static QName _ItemSpecificationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ItemSpecificationDocumentReference");
    private final static QName _JurisdictionRegionAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "JurisdictionRegionAddress");
    private final static QName _Language_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Language");
    private final static QName _LastExitPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LastExitPortLocation");
    private final static QName _LegalMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LegalMonetaryTotal");
    private final static QName _LineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineItem");
    private final static QName _LineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineReference");
    private final static QName _LineResponse_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineResponse");
    private final static QName _LineValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LineValidityPeriod");
    private final static QName _LoadingLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingLocation");
    private final static QName _LoadingPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingPortLocation");
    private final static QName _LoadingProofParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LoadingProofParty");
    private final static QName _Location_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Location");
    private final static QName _LocationCoordinate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LocationCoordinate");
    private final static QName _LotIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "LotIdentification");
    private final static QName _ManufacturerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ManufacturerParty");
    private final static QName _ManufacturersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ManufacturersItemIdentification");
    private final static QName _MaritimeTransport_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MaritimeTransport");
    private final static QName _MaximumTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MaximumTemperature");
    private final static QName _MeasurementDimension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MeasurementDimension");
    private final static QName _MinimumTemperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MinimumTemperature");
    private final static QName _MonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "MonetaryTotal");
    private final static QName _NotifyParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "NotifyParty");
    private final static QName _OrderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderDocumentReference");
    private final static QName _OrderedShipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderedShipment");
    private final static QName _OrderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderLine");
    private final static QName _OrderLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderLineReference");
    private final static QName _OrderReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OrderReference");
    private final static QName _OriginAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginAddress");
    private final static QName _OriginalDepartureCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDepartureCountry");
    private final static QName _OriginalDespatchParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDespatchParty");
    private final static QName _OriginalDespatchTransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDespatchTransportationService");
    private final static QName _OriginalDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalDocumentReference");
    private final static QName _OriginalItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginalItemLocationQuantity");
    private final static QName _OriginatorCustomerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorCustomerParty");
    private final static QName _OriginatorDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorDocumentReference");
    private final static QName _OriginatorParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginatorParty");
    private final static QName _OriginCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OriginCountry");
    private final static QName _OtherCommunication_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OtherCommunication");
    private final static QName _OwnerParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "OwnerParty");
    private final static QName _Package_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Package");
    private final static QName _Party_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Party");
    private final static QName _PartyIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyIdentification");
    private final static QName _PartyLegalEntity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyLegalEntity");
    private final static QName _PartyName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyName");
    private final static QName _PartyTaxScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PartyTaxScheme");
    private final static QName _PayeeFinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayeeFinancialAccount");
    private final static QName _PayeeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayeeParty");
    private final static QName _PayerFinancialAccount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PayerFinancialAccount");
    private final static QName _Payment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Payment");
    private final static QName _PaymentAlternativeExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentAlternativeExchangeRate");
    private final static QName _PaymentExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentExchangeRate");
    private final static QName _PaymentMeans_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentMeans");
    private final static QName _PaymentTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PaymentTerms");
    private final static QName _PenaltyPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PenaltyPeriod");
    private final static QName _Period_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Period");
    private final static QName _Person_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Person");
    private final static QName _PhysicalAttribute_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PhysicalAttribute");
    private final static QName _PhysicalLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PhysicalLocation");
    private final static QName _PostalAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PostalAddress");
    private final static QName _PrepaidPayment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PrepaidPayment");
    private final static QName _PreparationParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreparationParty");
    private final static QName _PreviousPriceList_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PreviousPriceList");
    private final static QName _Price_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Price");
    private final static QName _PriceList_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PriceList");
    private final static QName _PricingExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PricingExchangeRate");
    private final static QName _PricingReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PricingReference");
    private final static QName _PromisedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "PromisedDeliveryPeriod");
    private final static QName _ProviderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ProviderParty");
    private final static QName _QuotationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotationDocumentReference");
    private final static QName _QuotationLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotationLine");
    private final static QName _QuotationLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotationLineReference");
    private final static QName _QuotedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "QuotedMonetaryTotal");
    private final static QName _RailTransport_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RailTransport");
    private final static QName _ReceiptDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptDocumentReference");
    private final static QName _ReceiptLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptLine");
    private final static QName _ReceiptLineReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiptLineReference");
    private final static QName _ReceivedHandlingUnitReceiptLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceivedHandlingUnitReceiptLine");
    private final static QName _ReceiverParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReceiverParty");
    private final static QName _RecipientParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RecipientParty");
    private final static QName _ReferencedContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReferencedContract");
    private final static QName _RegistrationAddress_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RegistrationAddress");
    private final static QName _RelatedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RelatedCatalogueReference");
    private final static QName _RelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RelatedItem");
    private final static QName _ReminderDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReminderDocumentReference");
    private final static QName _ReminderLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReminderLine");
    private final static QName _ReminderPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReminderPeriod");
    private final static QName _RemittanceAdviceLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RemittanceAdviceLine");
    private final static QName _ReplacementRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReplacementRelatedItem");
    private final static QName _ReportedShipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ReportedShipment");
    private final static QName _RequestedCatalogueReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedCatalogueReference");
    private final static QName _RequestedClassificationScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedClassificationScheme");
    private final static QName _RequestedDeliveryPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedDeliveryPeriod");
    private final static QName _RequestedLanguage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedLanguage");
    private final static QName _RequestedMonetaryTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestedMonetaryTotal");
    private final static QName _RequestForQuotationDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestForQuotationDocumentReference");
    private final static QName _RequestForQuotationLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequestForQuotationLine");
    private final static QName _RequiredItemLocationQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredItemLocationQuantity");
    private final static QName _RequiredRelatedItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RequiredRelatedItem");
    private final static QName _Response_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Response");
    private final static QName _RoadTransport_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "RoadTransport");
    private final static QName _SecondaryHazard_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SecondaryHazard");
    private final static QName _SelfBilledCreditNoteDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SelfBilledCreditNoteDocumentReference");
    private final static QName _SelfBilledInvoiceDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SelfBilledInvoiceDocumentReference");
    private final static QName _SellerContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerContact");
    private final static QName _SellerProposedSubstituteLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerProposedSubstituteLineItem");
    private final static QName _SellersItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellersItemIdentification");
    private final static QName _SellerSubstitutedLineItem_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerSubstitutedLineItem");
    private final static QName _SellerSupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SellerSupplierParty");
    private final static QName _SenderParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SenderParty");
    private final static QName _SettlementPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SettlementPeriod");
    private final static QName _Shipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Shipment");
    private final static QName _ShipmentStage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ShipmentStage");
    private final static QName _SignatoryContact_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SignatoryContact");
    private final static QName _SignatoryParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SignatoryParty");
    private final static QName _Signature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Signature");
    private final static QName _StandardItemIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StandardItemIdentification");
    private final static QName _StatementDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatementDocumentReference");
    private final static QName _StatementLine_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatementLine");
    private final static QName _StatementPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "StatementPeriod");
    private final static QName _Status_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Status");
    private final static QName _Stowage_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Stowage");
    private final static QName _SupplierParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupplierParty");
    private final static QName _SupportingDocumentReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "SupportingDocumentReference");
    private final static QName _TaxCategory_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxCategory");
    private final static QName _TaxExchangeRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxExchangeRate");
    private final static QName _TaxRepresentativeParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxRepresentativeParty");
    private final static QName _TaxScheme_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxScheme");
    private final static QName _TaxSubtotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxSubtotal");
    private final static QName _TaxTotal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TaxTotal");
    private final static QName _Temperature_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "Temperature");
    private final static QName _TradingTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TradingTerms");
    private final static QName _TransactionConditions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransactionConditions");
    private final static QName _TransitCountry_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitCountry");
    private final static QName _TransitPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransitPeriod");
    private final static QName _TransportationService_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportationService");
    private final static QName _TransportContract_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportContract");
    private final static QName _TransportEquipment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportEquipment");
    private final static QName _TransportEquipmentSeal_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportEquipmentSeal");
    private final static QName _TransportEvent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportEvent");
    private final static QName _TransportHandlingUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportHandlingUnit");
    private final static QName _TransportMeans_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransportMeans");
    private final static QName _TransshipPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "TransshipPortLocation");
    private final static QName _UnloadingPortLocation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UnloadingPortLocation");
    private final static QName _UsabilityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "UsabilityPeriod");
    private final static QName _ValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "ValidityPeriod");
    private final static QName _WarrantyParty_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarrantyParty");
    private final static QName _WarrantyValidityPeriod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", "WarrantyValidityPeriod");
    private final static QName _AcceptedIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AcceptedIndicator");
    private final static QName _AccountID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AccountID");
    private final static QName _AccountingCost_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AccountingCost");
    private final static QName _AccountingCostCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AccountingCostCode");
    private final static QName _AccountNumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AccountNumberID");
    private final static QName _AccountTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AccountTypeCode");
    private final static QName _ActionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ActionCode");
    private final static QName _ActualDeliveryDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ActualDeliveryDate");
    private final static QName _ActualDeliveryTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ActualDeliveryTime");
    private final static QName _ActualDespatchDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ActualDespatchDate");
    private final static QName _ActualDespatchTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ActualDespatchTime");
    private final static QName _AdditionalAccountID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AdditionalAccountID");
    private final static QName _AdditionalInformationCommBas_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AdditionalInformation");
    private final static QName _AdditionalStreetName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AdditionalStreetName");
    private final static QName _AddressFormatCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AddressFormatCode");
    private final static QName _AddressTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AddressTypeCode");
    private final static QName _AdValoremIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AdValoremIndicator");
    private final static QName _AgencyID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AgencyID");
    private final static QName _AgencyName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AgencyName");
    private final static QName _AircraftID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AircraftID");
    private final static QName _AllowanceChargeReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AllowanceChargeReason");
    private final static QName _AllowanceChargeReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AllowanceChargeReasonCode");
    private final static QName _AllowanceTotalAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AllowanceTotalAmount");
    private final static QName _Amount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Amount");
    private final static QName _ApplicationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ApplicationID");
    private final static QName _ApplicationStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ApplicationStatusCode");
    private final static QName _ApprovalStatus_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ApprovalStatus");
    private final static QName _AttributeID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "AttributeID");
    private final static QName _BackOrderAllowedIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BackOrderAllowedIndicator");
    private final static QName _BackorderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BackorderQuantity");
    private final static QName _BackorderReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BackorderReason");
    private final static QName _BalanceAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BalanceAmount");
    private final static QName _BalanceBroughtForwardIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BalanceBroughtForwardIndicator");
    private final static QName _BaseAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BaseAmount");
    private final static QName _BaseQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BaseQuantity");
    private final static QName _BaseUnitMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BaseUnitMeasure");
    private final static QName _BatchQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BatchQuantity");
    private final static QName _BlockName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BlockName");
    private final static QName _BrandName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BrandName");
    private final static QName _BuildingName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BuildingName");
    private final static QName _BuildingNumber_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "BuildingNumber");
    private final static QName _CalculationRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CalculationRate");
    private final static QName _CalculationSequenceNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CalculationSequenceNumeric");
    private final static QName _CancellationNote_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CancellationNote");
    private final static QName _CanonicalizationMethod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CanonicalizationMethod");
    private final static QName _CardChipCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CardChipCode");
    private final static QName _CardTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CardTypeCode");
    private final static QName _CargoTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CargoTypeCode");
    private final static QName _CarrierAssignedID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CarrierAssignedID");
    private final static QName _CatalogueIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CatalogueIndicator");
    private final static QName _CategoryName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CategoryName");
    private final static QName _CertificateType_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CertificateType");
    private final static QName _Channel_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Channel");
    private final static QName _ChannelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ChannelCode");
    private final static QName _ChargeableWeightMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ChargeableWeightMeasure");
    private final static QName _ChargeIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ChargeIndicator");
    private final static QName _ChargeTotalAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ChargeTotalAmount");
    private final static QName _ChipApplicationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ChipApplicationID");
    private final static QName _CityName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CityName");
    private final static QName _CitySubdivisionName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CitySubdivisionName");
    private final static QName _ClassifiedIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ClassifiedIndicator");
    private final static QName _CodeValue_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CodeValue");
    private final static QName _CommodityCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CommodityCode");
    private final static QName _CompanyID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CompanyID");
    private final static QName _CompletionIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CompletionIndicator");
    private final static QName _Condition_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Condition");
    private final static QName _ConditionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ConditionCode");
    private final static QName _Conditions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Conditions");
    private final static QName _ConsumerUnitQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ConsumerUnitQuantity");
    private final static QName _ContentUnitQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ContentUnitQuantity");
    private final static QName _ContractSubdivision_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ContractSubdivision");
    private final static QName _ContractType_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ContractType");
    private final static QName _ContractTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ContractTypeCode");
    private final static QName _CoordinateSystemCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CoordinateSystemCode");
    private final static QName _CopiesNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CopiesNumeric");
    private final static QName _CopyIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CopyIndicator");
    private final static QName _CorporateRegistrationTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CorporateRegistrationTypeCode");
    private final static QName _CountrySubentity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CountrySubentity");
    private final static QName _CountrySubentityCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CountrySubentityCode");
    private final static QName _CreditAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CreditAmount");
    private final static QName _CreditedQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CreditedQuantity");
    private final static QName _CreditLineAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CreditLineAmount");
    private final static QName _CurrencyBaseRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CurrencyBaseRate");
    private final static QName _CurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CurrencyCode");
    private final static QName _CustomerAssignedAccountID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomerAssignedAccountID");
    private final static QName _CustomerReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomerReference");
    private final static QName _CustomizationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomizationID");
    private final static QName _CustomsID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomsID");
    private final static QName _CustomsImportClassifiedIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomsImportClassifiedIndicator");
    private final static QName _CustomsStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomsStatusCode");
    private final static QName _CustomsTariffQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CustomsTariffQuantity");
    private final static QName _CV2ID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "CV2ID");
    private final static QName _DamageRemarks_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DamageRemarks");
    private final static QName _DataSendingCapability_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DataSendingCapability");
    private final static QName _Date_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Date");
    private final static QName _DebitAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DebitAmount");
    private final static QName _DebitedQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DebitedQuantity");
    private final static QName _DebitLineAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DebitLineAmount");
    private final static QName _DeclaredCarriageValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeclaredCarriageValueAmount");
    private final static QName _DeclaredCustomsValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeclaredCustomsValueAmount");
    private final static QName _DeclaredForCarriageValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeclaredForCarriageValueAmount");
    private final static QName _DeclaredStatisticsValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeclaredStatisticsValueAmount");
    private final static QName _DegreesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DegreesMeasure");
    private final static QName _DeliveredQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeliveredQuantity");
    private final static QName _DeliveryDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeliveryDate");
    private final static QName _DeliveryInstructions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeliveryInstructions");
    private final static QName _DeliveryTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DeliveryTime");
    private final static QName _Department_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Department");
    private final static QName _Description_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Description");
    private final static QName _DescriptionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DescriptionCode");
    private final static QName _DespatchAdviceTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DespatchAdviceTypeCode");
    private final static QName _DespatchDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DespatchDate");
    private final static QName _DespatchTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DespatchTime");
    private final static QName _DirectionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DirectionCode");
    private final static QName _DiscountPercent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DiscountPercent");
    private final static QName _DispositionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DispositionCode");
    private final static QName _District_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "District");
    private final static QName _DocumentBinaryObject_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentBinaryObject");
    private final static QName _DocumentCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentCurrencyCode");
    private final static QName _DocumentHash_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentHash");
    private final static QName _DocumentID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentID");
    private final static QName _DocumentStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentStatusCode");
    private final static QName _DocumentType_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentType");
    private final static QName _DocumentTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DocumentTypeCode");
    private final static QName _DurationMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "DurationMeasure");
    private final static QName _ElectronicMail_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ElectronicMail");
    private final static QName _EmbeddedDocumentBinaryObject_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EmbeddedDocumentBinaryObject");
    private final static QName _EmergencyProceduresCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EmergencyProceduresCode");
    private final static QName _EndDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EndDate");
    private final static QName _EndpointID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EndpointID");
    private final static QName _EndTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EndTime");
    private final static QName _EstimatedDespatchDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EstimatedDespatchDate");
    private final static QName _EstimatedDespatchTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EstimatedDespatchTime");
    private final static QName _EventCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "EventCode");
    private final static QName _ExchangeMarketID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExchangeMarketID");
    private final static QName _ExemptionReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExemptionReason");
    private final static QName _ExemptionReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExemptionReasonCode");
    private final static QName _ExpiryDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExpiryDate");
    private final static QName _ExpiryTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExpiryTime");
    private final static QName _ExtendedID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ExtendedID");
    private final static QName _Extension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Extension");
    private final static QName _FactorNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FactorNumeric");
    private final static QName _FamilyName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FamilyName");
    private final static QName _FirstName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FirstName");
    private final static QName _Floor_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Floor");
    private final static QName _FreeOfChargeIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FreeOfChargeIndicator");
    private final static QName _FreeOnBoardValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FreeOnBoardValueAmount");
    private final static QName _FreightRateClassCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FreightRateClassCode");
    private final static QName _FullnessIndicationCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "FullnessIndicationCode");
    private final static QName _GoodsItemQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "GoodsItemQuantity");
    private final static QName _GrossVolumeMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "GrossVolumeMeasure");
    private final static QName _GrossWeightMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "GrossWeightMeasure");
    private final static QName _HandlingCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HandlingCode");
    private final static QName _HandlingInstructions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HandlingInstructions");
    private final static QName _HazardClassID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HazardClassID");
    private final static QName _HazardousCategoryCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HazardousCategoryCode");
    private final static QName _HazardousRegulationCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HazardousRegulationCode");
    private final static QName _HazardousRiskIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HazardousRiskIndicator");
    private final static QName _HolderName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "HolderName");
    private final static QName _ID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ID");
    private final static QName _IdentificationCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IdentificationCode");
    private final static QName _IdentificationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IdentificationID");
    private final static QName _IndicationIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IndicationIndicator");
    private final static QName _Indicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Indicator");
    private final static QName _Information_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Information");
    private final static QName _InhalationToxicityZoneCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InhalationToxicityZoneCode");
    private final static QName _InhouseMail_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InhouseMail");
    private final static QName _InspectionMethodCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InspectionMethodCode");
    private final static QName _Instruction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Instruction");
    private final static QName _InstructionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InstructionID");
    private final static QName _InstructionNote_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InstructionNote");
    private final static QName _Instructions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Instructions");
    private final static QName _InsurancePremiumAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InsurancePremiumAmount");
    private final static QName _InsuranceValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InsuranceValueAmount");
    private final static QName _InvoiceAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InvoiceAmount");
    private final static QName _InvoicedQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InvoicedQuantity");
    private final static QName _InvoiceTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InvoiceTypeCode");
    private final static QName _InvoicingPartyReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "InvoicingPartyReference");
    private final static QName _IssueDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IssueDate");
    private final static QName _IssueNumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IssueNumberID");
    private final static QName _IssuerID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IssuerID");
    private final static QName _IssueTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "IssueTime");
    private final static QName _ItemClassificationCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ItemClassificationCode");
    private final static QName _ItemUpdateRequestIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ItemUpdateRequestIndicator");
    private final static QName _JobID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "JobID");
    private final static QName _JobTitle_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "JobTitle");
    private final static QName _JourneyID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "JourneyID");
    private final static QName _Keyword_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Keyword");
    private final static QName _LanguageID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LanguageID");
    private final static QName _LastRevisionDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LastRevisionDate");
    private final static QName _LastRevisionTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LastRevisionTime");
    private final static QName _LatestDeliveryDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LatestDeliveryDate");
    private final static QName _LatestDeliveryTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LatestDeliveryTime");
    private final static QName _LatitudeDegreesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LatitudeDegreesMeasure");
    private final static QName _LatitudeDirectionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LatitudeDirectionCode");
    private final static QName _LatitudeMinutesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LatitudeMinutesMeasure");
    private final static QName _LeadTimeMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LeadTimeMeasure");
    private final static QName _LegalStatusIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LegalStatusIndicator");
    private final static QName _LengthMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LengthMeasure");
    private final static QName _LicensePlateID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LicensePlateID");
    private final static QName _LifeCycleStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LifeCycleStatusCode");
    private final static QName _Line_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Line");
    private final static QName _LineAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LineAmount");
    private final static QName _LineCountNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LineCountNumeric");
    private final static QName _LineExtensionAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LineExtensionAmount");
    private final static QName _LineID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LineID");
    private final static QName _LineStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LineStatusCode");
    private final static QName _LoadingLengthMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LoadingLengthMeasure");
    private final static QName _LocaleCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LocaleCode");
    private final static QName _LocationCommBas_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Location");
    private final static QName _LocationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LocationID");
    private final static QName _LogoReferenceID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LogoReferenceID");
    private final static QName _LongitudeDegreesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LongitudeDegreesMeasure");
    private final static QName _LongitudeDirectionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LongitudeDirectionCode");
    private final static QName _LongitudeMinutesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LongitudeMinutesMeasure");
    private final static QName _LossRisk_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LossRisk");
    private final static QName _LossRiskResponsibilityCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LossRiskResponsibilityCode");
    private final static QName _LotNumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LotNumberID");
    private final static QName _LowerOrangeHazardPlacardID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "LowerOrangeHazardPlacardID");
    private final static QName _Mail_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Mail");
    private final static QName _ManufactureDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ManufactureDate");
    private final static QName _ManufactureTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ManufactureTime");
    private final static QName _MarkAttention_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MarkAttention");
    private final static QName _MarkAttentionIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MarkAttentionIndicator");
    private final static QName _MarkCare_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MarkCare");
    private final static QName _MarkCareIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MarkCareIndicator");
    private final static QName _MarkingID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MarkingID");
    private final static QName _Marks_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Marks");
    private final static QName _MathematicOperatorCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MathematicOperatorCode");
    private final static QName _MaximumBackorderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MaximumBackorderQuantity");
    private final static QName _MaximumCopiesNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MaximumCopiesNumeric");
    private final static QName _MaximumMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MaximumMeasure");
    private final static QName _MaximumOrderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MaximumOrderQuantity");
    private final static QName _MaximumQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MaximumQuantity");
    private final static QName _Measure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Measure");
    private final static QName _MedicalFirstAidGuideCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MedicalFirstAidGuideCode");
    private final static QName _MiddleName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MiddleName");
    private final static QName _MinimumBackorderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MinimumBackorderQuantity");
    private final static QName _MinimumMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MinimumMeasure");
    private final static QName _MinimumOrderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MinimumOrderQuantity");
    private final static QName _MinimumQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MinimumQuantity");
    private final static QName _MinutesMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MinutesMeasure");
    private final static QName _ModelName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ModelName");
    private final static QName _MultiplierFactorNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "MultiplierFactorNumeric");
    private final static QName _Name_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Name");
    private final static QName _NameSuffix_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NameSuffix");
    private final static QName _Nationality_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Nationality");
    private final static QName _NationalityID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NationalityID");
    private final static QName _NatureCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NatureCode");
    private final static QName _NetNetWeightMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NetNetWeightMeasure");
    private final static QName _NetVolumeMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NetVolumeMeasure");
    private final static QName _NetWeightMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NetWeightMeasure");
    private final static QName _NetworkID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NetworkID");
    private final static QName _Note_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Note");
    private final static QName _NumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "NumberID");
    private final static QName _OccurrenceDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OccurrenceDate");
    private final static QName _OccurrenceTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OccurrenceTime");
    private final static QName _OnCarriageIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OnCarriageIndicator");
    private final static QName _OrangeHazardPlacardID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrangeHazardPlacardID");
    private final static QName _OrderableIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderableIndicator");
    private final static QName _OrderableUnit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderableUnit");
    private final static QName _OrderableUnitFactorRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderableUnitFactorRate");
    private final static QName _OrderID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderID");
    private final static QName _OrderQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderQuantity");
    private final static QName _OrderQuantityIncrementNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrderQuantityIncrementNumeric");
    private final static QName _OrganizationDepartment_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OrganizationDepartment");
    private final static QName _OriginalJobID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OriginalJobID");
    private final static QName _OtherInstruction_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OtherInstruction");
    private final static QName _OutstandingQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OutstandingQuantity");
    private final static QName _OutstandingReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OutstandingReason");
    private final static QName _OversupplyQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OversupplyQuantity");
    private final static QName _OwnerTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "OwnerTypeCode");
    private final static QName _PackageLevelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackageLevelCode");
    private final static QName _PackageQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackageQuantity");
    private final static QName _PackagesQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackagesQuantity");
    private final static QName _PackagingTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackagingTypeCode");
    private final static QName _PackingCriteriaCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackingCriteriaCode");
    private final static QName _PackingMaterial_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackingMaterial");
    private final static QName _PackLevelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackLevelCode");
    private final static QName _PackQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackQuantity");
    private final static QName _PackSizeNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PackSizeNumeric");
    private final static QName _PaidAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaidAmount");
    private final static QName _PaidDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaidDate");
    private final static QName _PaidTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaidTime");
    private final static QName _ParentDocumentID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ParentDocumentID");
    private final static QName _ParentDocumentTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ParentDocumentTypeCode");
    private final static QName _PartialDeliveryIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PartialDeliveryIndicator");
    private final static QName _PayableAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PayableAmount");
    private final static QName _PayableRoundingAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PayableRoundingAmount");
    private final static QName _PayerReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PayerReference");
    private final static QName _PaymentAlternativeCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentAlternativeCurrencyCode");
    private final static QName _PaymentAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentAmount");
    private final static QName _PaymentChannelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentChannelCode");
    private final static QName _PaymentCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentCurrencyCode");
    private final static QName _PaymentDueDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentDueDate");
    private final static QName _PaymentID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentID");
    private final static QName _PaymentMeansCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentMeansCode");
    private final static QName _PaymentMeansID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentMeansID");
    private final static QName _PaymentNote_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentNote");
    private final static QName _PaymentOrderReference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PaymentOrderReference");
    private final static QName _PenaltySurchargePercent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PenaltySurchargePercent");
    private final static QName _Percent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Percent");
    private final static QName _PerUnitAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PerUnitAmount");
    private final static QName _PlacardEndorsement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PlacardEndorsement");
    private final static QName _PlacardNotation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PlacardNotation");
    private final static QName _PlotIdentification_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PlotIdentification");
    private final static QName _PositionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PositionCode");
    private final static QName _PostalZone_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PostalZone");
    private final static QName _Postbox_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Postbox");
    private final static QName _PreCarriageIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PreCarriageIndicator");
    private final static QName _PreferenceCriterionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PreferenceCriterionCode");
    private final static QName _PrepaidAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PrepaidAmount");
    private final static QName _PrepaidIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PrepaidIndicator");
    private final static QName _PrepaidPaymentReferenceID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PrepaidPaymentReferenceID");
    private final static QName _PreviousJobID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PreviousJobID");
    private final static QName _PreviousVersionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PreviousVersionID");
    private final static QName _PriceAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PriceAmount");
    private final static QName _PriceChangeReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PriceChangeReason");
    private final static QName _PriceType_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PriceType");
    private final static QName _PriceTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PriceTypeCode");
    private final static QName _PricingCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PricingCurrencyCode");
    private final static QName _PricingUpdateRequestIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PricingUpdateRequestIndicator");
    private final static QName _PrimaryAccountNumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PrimaryAccountNumberID");
    private final static QName _PrintQualifier_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "PrintQualifier");
    private final static QName _Priority_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Priority");
    private final static QName _ProductTraceID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ProductTraceID");
    private final static QName _ProfileID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ProfileID");
    private final static QName _ProviderTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ProviderTypeCode");
    private final static QName _Qualifier_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Qualifier");
    private final static QName _Quantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Quantity");
    private final static QName _RailCarID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RailCarID");
    private final static QName _Reason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Reason");
    private final static QName _ReceivedDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReceivedDate");
    private final static QName _ReceivedQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReceivedQuantity");
    private final static QName _Reference_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Reference");
    private final static QName _ReferenceDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReferenceDate");
    private final static QName _ReferenceEventCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReferenceEventCode");
    private final static QName _ReferenceID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReferenceID");
    private final static QName _ReferenceTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReferenceTime");
    private final static QName _RefrigerationOnIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RefrigerationOnIndicator");
    private final static QName _Region_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Region");
    private final static QName _RegistrationID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RegistrationID");
    private final static QName _RegistrationName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RegistrationName");
    private final static QName _RegistrationNationality_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RegistrationNationality");
    private final static QName _RegistrationNationalityID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RegistrationNationalityID");
    private final static QName _RejectActionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RejectActionCode");
    private final static QName _RejectedQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RejectedQuantity");
    private final static QName _RejectionNote_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RejectionNote");
    private final static QName _RejectReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RejectReason");
    private final static QName _RejectReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RejectReasonCode");
    private final static QName _Remarks_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Remarks");
    private final static QName _ReminderSequenceNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReminderSequenceNumeric");
    private final static QName _ReminderTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReminderTypeCode");
    private final static QName _RequestedDespatchDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RequestedDespatchDate");
    private final static QName _RequestedDespatchTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RequestedDespatchTime");
    private final static QName _RequestedInvoiceCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RequestedInvoiceCurrencyCode");
    private final static QName _RequiredCustomsID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RequiredCustomsID");
    private final static QName _ResponseCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ResponseCode");
    private final static QName _ResponseDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ResponseDate");
    private final static QName _ResponseTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ResponseTime");
    private final static QName _ReturnabilityIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReturnabilityIndicator");
    private final static QName _ReturnableMaterialIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ReturnableMaterialIndicator");
    private final static QName _RevisionDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RevisionDate");
    private final static QName _RevisionTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RevisionTime");
    private final static QName _RoleCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RoleCode");
    private final static QName _Room_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Room");
    private final static QName _RoundingAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "RoundingAmount");
    private final static QName _SalesOrderID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SalesOrderID");
    private final static QName _SalesOrderLineID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SalesOrderLineID");
    private final static QName _SchemeURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SchemeURI");
    private final static QName _SealingPartyType_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SealingPartyType");
    private final static QName _SealIssuerTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SealIssuerTypeCode");
    private final static QName _SealStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SealStatusCode");
    private final static QName _SequenceID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SequenceID");
    private final static QName _SequenceNumberID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SequenceNumberID");
    private final static QName _SequenceNumeric_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SequenceNumeric");
    private final static QName _SerialID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SerialID");
    private final static QName _SettlementDiscountPercent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SettlementDiscountPercent");
    private final static QName _ShippingMarks_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ShippingMarks");
    private final static QName _ShippingOrderID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ShippingOrderID");
    private final static QName _ShippingPriorityLevelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ShippingPriorityLevelCode");
    private final static QName _ShortageActionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ShortageActionCode");
    private final static QName _ShortQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ShortQuantity");
    private final static QName _SignatureMethod_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SignatureMethod");
    private final static QName _SizeTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SizeTypeCode");
    private final static QName _SourceCurrencyBaseRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SourceCurrencyBaseRate");
    private final static QName _SourceCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SourceCurrencyCode");
    private final static QName _SpecialInstructions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SpecialInstructions");
    private final static QName _SpecialTerms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SpecialTerms");
    private final static QName _SplitConsignmentIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SplitConsignmentIndicator");
    private final static QName _StartDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StartDate");
    private final static QName _StartTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StartTime");
    private final static QName _StatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StatusCode");
    private final static QName _StatusReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StatusReason");
    private final static QName _StatusReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StatusReasonCode");
    private final static QName _StreetName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "StreetName");
    private final static QName _SubstitutionStatusCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SubstitutionStatusCode");
    private final static QName _SummaryDescription_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SummaryDescription");
    private final static QName _SupplierAssignedAccountID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SupplierAssignedAccountID");
    private final static QName _SurchargePercent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "SurchargePercent");
    private final static QName _TargetCurrencyBaseRate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TargetCurrencyBaseRate");
    private final static QName _TargetCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TargetCurrencyCode");
    private final static QName _TariffClassCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TariffClassCode");
    private final static QName _TariffCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TariffCode");
    private final static QName _TariffDescription_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TariffDescription");
    private final static QName _TaxableAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxableAmount");
    private final static QName _TaxAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxAmount");
    private final static QName _TaxCurrencyCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxCurrencyCode");
    private final static QName _TaxEvidenceIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxEvidenceIndicator");
    private final static QName _TaxExclusiveAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxExclusiveAmount");
    private final static QName _TaxExemptionReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxExemptionReason");
    private final static QName _TaxExemptionReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxExemptionReasonCode");
    private final static QName _TaxInclusiveAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxInclusiveAmount");
    private final static QName _TaxLevelCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxLevelCode");
    private final static QName _TaxPointDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxPointDate");
    private final static QName _TaxTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TaxTypeCode");
    private final static QName _TechnicalName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TechnicalName");
    private final static QName _Telefax_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Telefax");
    private final static QName _Telephone_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Telephone");
    private final static QName _Terms_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Terms");
    private final static QName _Text_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Text");
    private final static QName _TierRange_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TierRange");
    private final static QName _TierRatePercent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TierRatePercent");
    private final static QName _Time_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Time");
    private final static QName _TimezoneOffset_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TimezoneOffset");
    private final static QName _TimingComplaint_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TimingComplaint");
    private final static QName _TimingComplaintCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TimingComplaintCode");
    private final static QName _Title_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Title");
    private final static QName _ToOrderIndicator_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ToOrderIndicator");
    private final static QName _TotalBalanceAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalBalanceAmount");
    private final static QName _TotalCreditAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalCreditAmount");
    private final static QName _TotalDebitAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalDebitAmount");
    private final static QName _TotalGoodsItemQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalGoodsItemQuantity");
    private final static QName _TotalInvoiceAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalInvoiceAmount");
    private final static QName _TotalPackageQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalPackageQuantity");
    private final static QName _TotalPackagesQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalPackagesQuantity");
    private final static QName _TotalPaymentAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalPaymentAmount");
    private final static QName _TotalTaxAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalTaxAmount");
    private final static QName _TotalTransportHandlingUnitQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TotalTransportHandlingUnitQuantity");
    private final static QName _TrackingID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TrackingID");
    private final static QName _TradingRestrictions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TradingRestrictions");
    private final static QName _TrainID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TrainID");
    private final static QName _TransactionCurrencyTaxAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransactionCurrencyTaxAmount");
    private final static QName _TransitDirectionCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransitDirectionCode");
    private final static QName _TransportAuthorizationCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportAuthorizationCode");
    private final static QName _TransportEmergencyCardCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportEmergencyCardCode");
    private final static QName _TransportEquipmentTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportEquipmentTypeCode");
    private final static QName _TransportEventTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportEventTypeCode");
    private final static QName _TransportHandlingUnitQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportHandlingUnitQuantity");
    private final static QName _TransportHandlingUnitTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportHandlingUnitTypeCode");
    private final static QName _TransportMeansTypeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportMeansTypeCode");
    private final static QName _TransportModeCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportModeCode");
    private final static QName _TransportServiceCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "TransportServiceCode");
    private final static QName _UBLVersionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "UBLVersionID");
    private final static QName _UNDGCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "UNDGCode");
    private final static QName _Unit_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Unit");
    private final static QName _UnitQuantity_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "UnitQuantity");
    private final static QName _UpperOrangeHazardPlacardID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "UpperOrangeHazardPlacardID");
    private final static QName _URI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "URI");
    private final static QName _UUID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "UUID");
    private final static QName _ValidationDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ValidationDate");
    private final static QName _ValidationTime_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ValidationTime");
    private final static QName _ValidatorID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ValidatorID");
    private final static QName _ValidityStartDate_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ValidityStartDate");
    private final static QName _Value_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Value");
    private final static QName _ValueAmount_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "ValueAmount");
    private final static QName _VersionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "VersionID");
    private final static QName _VesselID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "VesselID");
    private final static QName _VesselName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "VesselName");
    private final static QName _VolumeMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "VolumeMeasure");
    private final static QName _WarrantyInformation_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "WarrantyInformation");
    private final static QName _WebsiteURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "WebsiteURI");
    private final static QName _WeightMeasure_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "WeightMeasure");
    private final static QName _XPath_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "XPath");
    private final static QName _Zone_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", "Zone");
    private final static QName _UBLExtensions_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "UBLExtensions");
    private final static QName _UBLExtension_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "UBLExtension");
    private final static QName _ExtensionAgencyID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyID");
    private final static QName _ExtensionAgencyName_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyName");
    private final static QName _ExtensionAgencyURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionAgencyURI");
    private final static QName _ExtensionContent_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionContent");
    private final static QName _ExtensionReason_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionReason");
    private final static QName _ExtensionReasonCode_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionReasonCode");
    private final static QName _ExtensionURI_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionURI");
    private final static QName _ExtensionVersionID_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", "ExtensionVersionID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.olva.sunatfe.be
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceType }
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link SummaryDocumentsLineType }
     */
    public SummaryDocumentsLineType createSummaryDocumentsLineType() {
        return new SummaryDocumentsLineType();
    }

    /**
     * Create an instance of {@link VoidedDocumentsLineType }
     */
    public VoidedDocumentsLineType createVoidedDocumentsLineType() {
        return new VoidedDocumentsLineType();
    }

    /**
     * Create an instance of {@link IdentifierType }
     */
    public IdentifierType createIdentifierType() {
        return new IdentifierType();
    }

    /**
     * Create an instance of {@link TextTypeUnqDat }
     */
    public TextTypeUnqDat createTextTypeUnqDat() {
        return new TextTypeUnqDat();
    }

    /**
     * Create an instance of {@link PaymentType }
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link AdditionalInformationTypeSunatAgg }
     */
    public AdditionalInformationTypeSunatAgg createAdditionalInformationTypeSunatAgg() {
        return new AdditionalInformationTypeSunatAgg();
    }

    /**
     * Create an instance of {@link AdditionalMonetaryTotalType }
     */
    public AdditionalMonetaryTotalType createAdditionalMonetaryTotalType() {
        return new AdditionalMonetaryTotalType();
    }

    /**
     * Create an instance of {@link AdditionalPropertyType }
     */
    public AdditionalPropertyType createAdditionalPropertyType() {
        return new AdditionalPropertyType();
    }

    /**
     * Create an instance of {@link AmountTypeCommBas }
     */
    public AmountTypeCommBas createAmountTypeCommBas() {
        return new AmountTypeCommBas();
    }

    /**
     * Create an instance of {@link SUNATTransactionType }
     */
    public SUNATTransactionType createSUNATTransactionType() {
        return new SUNATTransactionType();
    }

    /**
     * Create an instance of {@link SUNATEmbededDespatchAdviceType }
     */
    public SUNATEmbededDespatchAdviceType createSUNATEmbededDespatchAdviceType() {
        return new SUNATEmbededDespatchAdviceType();
    }

    /**
     * Create an instance of {@link SUNATShipmentType }
     */
    public SUNATShipmentType createSUNATShipmentType() {
        return new SUNATShipmentType();
    }

    /**
     * Create an instance of {@link SUNATShipmentStageType }
     */
    public SUNATShipmentStageType createSUNATShipmentStageType() {
        return new SUNATShipmentStageType();
    }

    /**
     * Create an instance of {@link SUNATTransportMeansType }
     */
    public SUNATTransportMeansType createSUNATTransportMeansType() {
        return new SUNATTransportMeansType();
    }

    /**
     * Create an instance of {@link SUNATRoadTransportType }
     */
    public SUNATRoadTransportType createSUNATRoadTransportType() {
        return new SUNATRoadTransportType();
    }

    /**
     * Create an instance of {@link SUNATDespatchLineType }
     */
    public SUNATDespatchLineType createSUNATDespatchLineType() {
        return new SUNATDespatchLineType();
    }

    /**
     * Create an instance of {@link DriverPartyType }
     */
    public DriverPartyType createDriverPartyType() {
        return new DriverPartyType();
    }

    /**
     * Create an instance of {@link SUNATCarrierPartyType }
     */
    public SUNATCarrierPartyType createSUNATCarrierPartyType() {
        return new SUNATCarrierPartyType();
    }

    /**
     * Create an instance of {@link CodeType }
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link RoadTransportType }
     */
    public RoadTransportType createRoadTransportType() {
        return new RoadTransportType();
    }

    /**
     * Create an instance of {@link DeliveryCarrierDateType }
     */
    public DeliveryCarrierDateType createDeliveryCarrierDateType() {
        return new DeliveryCarrierDateType();
    }

    /**
     * Create an instance of {@link DeliveryTimeType }
     */
    public DeliveryTimeType createDeliveryTimeType() {
        return new DeliveryTimeType();
    }

    /**
     * Create an instance of {@link DocumentReferenceType }
     */
    public DocumentReferenceType createDocumentReferenceType() {
        return new DocumentReferenceType();
    }

    /**
     * Create an instance of {@link IDType }
     */
    public IDType createIDType() {
        return new IDType();
    }

    /**
     * Create an instance of {@link AddressType }
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link IndicatorType }
     */
    public IndicatorType createIndicatorType() {
        return new IndicatorType();
    }

    /**
     * Create an instance of {@link SUNATFiscalPathType }
     */
    public SUNATFiscalPathType createSUNATFiscalPathType() {
        return new SUNATFiscalPathType();
    }

    /**
     * Create an instance of {@link RelatedItemType }
     */
    public RelatedItemType createRelatedItemType() {
        return new RelatedItemType();
    }

    /**
     * Create an instance of {@link ContactType }
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link CustomerPartyType }
     */
    public CustomerPartyType createCustomerPartyType() {
        return new CustomerPartyType();
    }

    /**
     * Create an instance of {@link SupplierPartyType }
     */
    public SupplierPartyType createSupplierPartyType() {
        return new SupplierPartyType();
    }

    /**
     * Create an instance of {@link PackageType }
     */
    public PackageType createPackageType() {
        return new PackageType();
    }

    /**
     * Create an instance of {@link ItemIdentificationType }
     */
    public ItemIdentificationType createItemIdentificationType() {
        return new ItemIdentificationType();
    }

    /**
     * Create an instance of {@link ItemPropertyType }
     */
    public ItemPropertyType createItemPropertyType() {
        return new ItemPropertyType();
    }

    /**
     * Create an instance of {@link TemperatureType }
     */
    public TemperatureType createTemperatureType() {
        return new TemperatureType();
    }

    /**
     * Create an instance of {@link AddressLineType }
     */
    public AddressLineType createAddressLineType() {
        return new AddressLineType();
    }

    /**
     * Create an instance of {@link PartyType }
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link AirTransportType }
     */
    public AirTransportType createAirTransportType() {
        return new AirTransportType();
    }

    /**
     * Create an instance of {@link AllowanceChargeType }
     */
    public AllowanceChargeType createAllowanceChargeType() {
        return new AllowanceChargeType();
    }

    /**
     * Create an instance of {@link PriceType }
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link MonetaryTotalType }
     */
    public MonetaryTotalType createMonetaryTotalType() {
        return new MonetaryTotalType();
    }

    /**
     * Create an instance of {@link TaxCategoryType }
     */
    public TaxCategoryType createTaxCategoryType() {
        return new TaxCategoryType();
    }

    /**
     * Create an instance of {@link AttachmentType }
     */
    public AttachmentType createAttachmentType() {
        return new AttachmentType();
    }

    /**
     * Create an instance of {@link BillingReferenceType }
     */
    public BillingReferenceType createBillingReferenceType() {
        return new BillingReferenceType();
    }

    /**
     * Create an instance of {@link BillingReferenceLineType }
     */
    public BillingReferenceLineType createBillingReferenceLineType() {
        return new BillingReferenceLineType();
    }

    /**
     * Create an instance of {@link BranchType }
     */
    public BranchType createBranchType() {
        return new BranchType();
    }

    /**
     * Create an instance of {@link LineItemType }
     */
    public LineItemType createLineItemType() {
        return new LineItemType();
    }

    /**
     * Create an instance of {@link CardAccountType }
     */
    public CardAccountType createCardAccountType() {
        return new CardAccountType();
    }

    /**
     * Create an instance of {@link CatalogueItemSpecificationUpdateLineType }
     */
    public CatalogueItemSpecificationUpdateLineType createCatalogueItemSpecificationUpdateLineType() {
        return new CatalogueItemSpecificationUpdateLineType();
    }

    /**
     * Create an instance of {@link CatalogueLineType }
     */
    public CatalogueLineType createCatalogueLineType() {
        return new CatalogueLineType();
    }

    /**
     * Create an instance of {@link LineReferenceType }
     */
    public LineReferenceType createLineReferenceType() {
        return new LineReferenceType();
    }

    /**
     * Create an instance of {@link CataloguePricingUpdateLineType }
     */
    public CataloguePricingUpdateLineType createCataloguePricingUpdateLineType() {
        return new CataloguePricingUpdateLineType();
    }

    /**
     * Create an instance of {@link CatalogueReferenceType }
     */
    public CatalogueReferenceType createCatalogueReferenceType() {
        return new CatalogueReferenceType();
    }

    /**
     * Create an instance of {@link CatalogueRequestLineType }
     */
    public CatalogueRequestLineType createCatalogueRequestLineType() {
        return new CatalogueRequestLineType();
    }

    /**
     * Create an instance of {@link ClassificationCategoryType }
     */
    public ClassificationCategoryType createClassificationCategoryType() {
        return new ClassificationCategoryType();
    }

    /**
     * Create an instance of {@link CertificateOfOriginApplicationType }
     */
    public CertificateOfOriginApplicationType createCertificateOfOriginApplicationType() {
        return new CertificateOfOriginApplicationType();
    }

    /**
     * Create an instance of {@link ClassificationSchemeType }
     */
    public ClassificationSchemeType createClassificationSchemeType() {
        return new ClassificationSchemeType();
    }

    /**
     * Create an instance of {@link CommodityClassificationType }
     */
    public CommodityClassificationType createCommodityClassificationType() {
        return new CommodityClassificationType();
    }

    /**
     * Create an instance of {@link CommunicationType }
     */
    public CommunicationType createCommunicationType() {
        return new CommunicationType();
    }

    /**
     * Create an instance of {@link ConsignmentType }
     */
    public ConsignmentType createConsignmentType() {
        return new ConsignmentType();
    }

    /**
     * Create an instance of {@link GoodsItemType }
     */
    public GoodsItemType createGoodsItemType() {
        return new GoodsItemType();
    }

    /**
     * Create an instance of {@link ContractType }
     */
    public ContractType createContractType() {
        return new ContractType();
    }

    /**
     * Create an instance of {@link CorporateRegistrationSchemeType }
     */
    public CorporateRegistrationSchemeType createCorporateRegistrationSchemeType() {
        return new CorporateRegistrationSchemeType();
    }

    /**
     * Create an instance of {@link CountryType }
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link CreditAccountType }
     */
    public CreditAccountType createCreditAccountType() {
        return new CreditAccountType();
    }

    /**
     * Create an instance of {@link CreditNoteLineType }
     */
    public CreditNoteLineType createCreditNoteLineType() {
        return new CreditNoteLineType();
    }

    /**
     * Create an instance of {@link StatusType }
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link DebitNoteLineType }
     */
    public DebitNoteLineType createDebitNoteLineType() {
        return new DebitNoteLineType();
    }

    /**
     * Create an instance of {@link LanguageType }
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link DeliveryType }
     */
    public DeliveryType createDeliveryType() {
        return new DeliveryType();
    }

    /**
     * Create an instance of {@link LocationTypeCommAgg }
     */
    public LocationTypeCommAgg createLocationTypeCommAgg() {
        return new LocationTypeCommAgg();
    }

    /**
     * Create an instance of {@link DeliveryTermsType }
     */
    public DeliveryTermsType createDeliveryTermsType() {
        return new DeliveryTermsType();
    }

    /**
     * Create an instance of {@link DeliveryUnitType }
     */
    public DeliveryUnitType createDeliveryUnitType() {
        return new DeliveryUnitType();
    }

    /**
     * Create an instance of {@link DespatchType }
     */
    public DespatchType createDespatchType() {
        return new DespatchType();
    }

    /**
     * Create an instance of {@link DespatchLineType }
     */
    public DespatchLineType createDespatchLineType() {
        return new DespatchLineType();
    }

    /**
     * Create an instance of {@link DimensionType }
     */
    public DimensionType createDimensionType() {
        return new DimensionType();
    }

    /**
     * Create an instance of {@link ResponseType }
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link DocumentDistributionType }
     */
    public DocumentDistributionType createDocumentDistributionType() {
        return new DocumentDistributionType();
    }

    /**
     * Create an instance of {@link DocumentResponseType }
     */
    public DocumentResponseType createDocumentResponseType() {
        return new DocumentResponseType();
    }

    /**
     * Create an instance of {@link EndorsementType }
     */
    public EndorsementType createEndorsementType() {
        return new EndorsementType();
    }

    /**
     * Create an instance of {@link EndorserPartyType }
     */
    public EndorserPartyType createEndorserPartyType() {
        return new EndorserPartyType();
    }

    /**
     * Create an instance of {@link PeriodType }
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link ExchangeRateType }
     */
    public ExchangeRateType createExchangeRateType() {
        return new ExchangeRateType();
    }

    /**
     * Create an instance of {@link ExternalReferenceType }
     */
    public ExternalReferenceType createExternalReferenceType() {
        return new ExternalReferenceType();
    }

    /**
     * Create an instance of {@link TransportationServiceType }
     */
    public TransportationServiceType createTransportationServiceType() {
        return new TransportationServiceType();
    }

    /**
     * Create an instance of {@link FinancialAccountType }
     */
    public FinancialAccountType createFinancialAccountType() {
        return new FinancialAccountType();
    }

    /**
     * Create an instance of {@link FinancialInstitutionType }
     */
    public FinancialInstitutionType createFinancialInstitutionType() {
        return new FinancialInstitutionType();
    }

    /**
     * Create an instance of {@link GoodsItemContainerType }
     */
    public GoodsItemContainerType createGoodsItemContainerType() {
        return new GoodsItemContainerType();
    }

    /**
     * Create an instance of {@link HazardousGoodsTransitType }
     */
    public HazardousGoodsTransitType createHazardousGoodsTransitType() {
        return new HazardousGoodsTransitType();
    }

    /**
     * Create an instance of {@link HazardousItemType }
     */
    public HazardousItemType createHazardousItemType() {
        return new HazardousItemType();
    }

    /**
     * Create an instance of {@link InvoiceLineType }
     */
    public InvoiceLineType createInvoiceLineType() {
        return new InvoiceLineType();
    }

    /**
     * Create an instance of {@link ItemType }
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link ItemComparisonType }
     */
    public ItemComparisonType createItemComparisonType() {
        return new ItemComparisonType();
    }

    /**
     * Create an instance of {@link ItemInstanceType }
     */
    public ItemInstanceType createItemInstanceType() {
        return new ItemInstanceType();
    }

    /**
     * Create an instance of {@link ItemLocationQuantityType }
     */
    public ItemLocationQuantityType createItemLocationQuantityType() {
        return new ItemLocationQuantityType();
    }

    /**
     * Create an instance of {@link ItemPropertyGroupType }
     */
    public ItemPropertyGroupType createItemPropertyGroupType() {
        return new ItemPropertyGroupType();
    }

    /**
     * Create an instance of {@link LineResponseType }
     */
    public LineResponseType createLineResponseType() {
        return new LineResponseType();
    }

    /**
     * Create an instance of {@link LocationCoordinateType }
     */
    public LocationCoordinateType createLocationCoordinateType() {
        return new LocationCoordinateType();
    }

    /**
     * Create an instance of {@link LotIdentificationType }
     */
    public LotIdentificationType createLotIdentificationType() {
        return new LotIdentificationType();
    }

    /**
     * Create an instance of {@link MaritimeTransportType }
     */
    public MaritimeTransportType createMaritimeTransportType() {
        return new MaritimeTransportType();
    }

    /**
     * Create an instance of {@link OrderedShipmentType }
     */
    public OrderedShipmentType createOrderedShipmentType() {
        return new OrderedShipmentType();
    }

    /**
     * Create an instance of {@link OrderLineType }
     */
    public OrderLineType createOrderLineType() {
        return new OrderLineType();
    }

    /**
     * Create an instance of {@link OrderLineReferenceType }
     */
    public OrderLineReferenceType createOrderLineReferenceType() {
        return new OrderLineReferenceType();
    }

    /**
     * Create an instance of {@link OrderReferenceType }
     */
    public OrderReferenceType createOrderReferenceType() {
        return new OrderReferenceType();
    }

    /**
     * Create an instance of {@link PartyIdentificationType }
     */
    public PartyIdentificationType createPartyIdentificationType() {
        return new PartyIdentificationType();
    }

    /**
     * Create an instance of {@link PartyLegalEntityType }
     */
    public PartyLegalEntityType createPartyLegalEntityType() {
        return new PartyLegalEntityType();
    }

    /**
     * Create an instance of {@link PartyNameType }
     */
    public PartyNameType createPartyNameType() {
        return new PartyNameType();
    }

    /**
     * Create an instance of {@link PartyTaxSchemeType }
     */
    public PartyTaxSchemeType createPartyTaxSchemeType() {
        return new PartyTaxSchemeType();
    }

    /**
     * Create an instance of {@link PaymentMeansType }
     */
    public PaymentMeansType createPaymentMeansType() {
        return new PaymentMeansType();
    }

    /**
     * Create an instance of {@link PaymentTermsType }
     */
    public PaymentTermsType createPaymentTermsType() {
        return new PaymentTermsType();
    }

    /**
     * Create an instance of {@link PersonType }
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link PhysicalAttributeType }
     */
    public PhysicalAttributeType createPhysicalAttributeType() {
        return new PhysicalAttributeType();
    }

    /**
     * Create an instance of {@link PriceListType }
     */
    public PriceListType createPriceListType() {
        return new PriceListType();
    }

    /**
     * Create an instance of {@link PricingReferenceType }
     */
    public PricingReferenceType createPricingReferenceType() {
        return new PricingReferenceType();
    }

    /**
     * Create an instance of {@link QuotationLineType }
     */
    public QuotationLineType createQuotationLineType() {
        return new QuotationLineType();
    }

    /**
     * Create an instance of {@link RailTransportType }
     */
    public RailTransportType createRailTransportType() {
        return new RailTransportType();
    }

    /**
     * Create an instance of {@link ReceiptLineType }
     */
    public ReceiptLineType createReceiptLineType() {
        return new ReceiptLineType();
    }

    /**
     * Create an instance of {@link ReminderLineType }
     */
    public ReminderLineType createReminderLineType() {
        return new ReminderLineType();
    }

    /**
     * Create an instance of {@link RemittanceAdviceLineType }
     */
    public RemittanceAdviceLineType createRemittanceAdviceLineType() {
        return new RemittanceAdviceLineType();
    }

    /**
     * Create an instance of {@link ShipmentType }
     */
    public ShipmentType createShipmentType() {
        return new ShipmentType();
    }

    /**
     * Create an instance of {@link RequestForQuotationLineType }
     */
    public RequestForQuotationLineType createRequestForQuotationLineType() {
        return new RequestForQuotationLineType();
    }

    /**
     * Create an instance of {@link SecondaryHazardType }
     */
    public SecondaryHazardType createSecondaryHazardType() {
        return new SecondaryHazardType();
    }

    /**
     * Create an instance of {@link ShipmentStageType }
     */
    public ShipmentStageType createShipmentStageType() {
        return new ShipmentStageType();
    }

    /**
     * Create an instance of {@link SignatureType }
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link StatementLineType }
     */
    public StatementLineType createStatementLineType() {
        return new StatementLineType();
    }

    /**
     * Create an instance of {@link StowageType }
     */
    public StowageType createStowageType() {
        return new StowageType();
    }

    /**
     * Create an instance of {@link TaxSchemeType }
     */
    public TaxSchemeType createTaxSchemeType() {
        return new TaxSchemeType();
    }

    /**
     * Create an instance of {@link TaxSubtotalType }
     */
    public TaxSubtotalType createTaxSubtotalType() {
        return new TaxSubtotalType();
    }

    /**
     * Create an instance of {@link TaxTotalType }
     */
    public TaxTotalType createTaxTotalType() {
        return new TaxTotalType();
    }

    /**
     * Create an instance of {@link TradingTermsType }
     */
    public TradingTermsType createTradingTermsType() {
        return new TradingTermsType();
    }

    /**
     * Create an instance of {@link TransactionConditionsType }
     */
    public TransactionConditionsType createTransactionConditionsType() {
        return new TransactionConditionsType();
    }

    /**
     * Create an instance of {@link TransportEquipmentType }
     */
    public TransportEquipmentType createTransportEquipmentType() {
        return new TransportEquipmentType();
    }

    /**
     * Create an instance of {@link TransportEquipmentSealType }
     */
    public TransportEquipmentSealType createTransportEquipmentSealType() {
        return new TransportEquipmentSealType();
    }

    /**
     * Create an instance of {@link TransportEventType }
     */
    public TransportEventType createTransportEventType() {
        return new TransportEventType();
    }

    /**
     * Create an instance of {@link TransportHandlingUnitType }
     */
    public TransportHandlingUnitType createTransportHandlingUnitType() {
        return new TransportHandlingUnitType();
    }

    /**
     * Create an instance of {@link TransportMeansType }
     */
    public TransportMeansType createTransportMeansType() {
        return new TransportMeansType();
    }

    /**
     * Create an instance of {@link AcceptedIndicatorType }
     */
    public AcceptedIndicatorType createAcceptedIndicatorType() {
        return new AcceptedIndicatorType();
    }

    /**
     * Create an instance of {@link AccountIDType }
     */
    public AccountIDType createAccountIDType() {
        return new AccountIDType();
    }

    /**
     * Create an instance of {@link AccountingCostType }
     */
    public AccountingCostType createAccountingCostType() {
        return new AccountingCostType();
    }

    /**
     * Create an instance of {@link AccountingCostCodeType }
     */
    public AccountingCostCodeType createAccountingCostCodeType() {
        return new AccountingCostCodeType();
    }

    /**
     * Create an instance of {@link AccountNumberIDType }
     */
    public AccountNumberIDType createAccountNumberIDType() {
        return new AccountNumberIDType();
    }

    /**
     * Create an instance of {@link AccountTypeCodeType }
     */
    public AccountTypeCodeType createAccountTypeCodeType() {
        return new AccountTypeCodeType();
    }

    /**
     * Create an instance of {@link ActionCodeType }
     */
    public ActionCodeType createActionCodeType() {
        return new ActionCodeType();
    }

    /**
     * Create an instance of {@link ActualDeliveryDateType }
     */
    public ActualDeliveryDateType createActualDeliveryDateType() {
        return new ActualDeliveryDateType();
    }

    /**
     * Create an instance of {@link ActualDeliveryTimeType }
     */
    public ActualDeliveryTimeType createActualDeliveryTimeType() {
        return new ActualDeliveryTimeType();
    }

    /**
     * Create an instance of {@link ActualDespatchDateType }
     */
    public ActualDespatchDateType createActualDespatchDateType() {
        return new ActualDespatchDateType();
    }

    /**
     * Create an instance of {@link ActualDespatchTimeType }
     */
    public ActualDespatchTimeType createActualDespatchTimeType() {
        return new ActualDespatchTimeType();
    }

    /**
     * Create an instance of {@link AdditionalAccountIDType }
     */
    public AdditionalAccountIDType createAdditionalAccountIDType() {
        return new AdditionalAccountIDType();
    }

    /**
     * Create an instance of {@link AdditionalInformationType }
     */
    public AdditionalInformationType createAdditionalInformationType() {
        return new AdditionalInformationType();
    }

    /**
     * Create an instance of {@link AdditionalStreetNameType }
     */
    public AdditionalStreetNameType createAdditionalStreetNameType() {
        return new AdditionalStreetNameType();
    }

    /**
     * Create an instance of {@link AddressFormatCodeType }
     */
    public AddressFormatCodeType createAddressFormatCodeType() {
        return new AddressFormatCodeType();
    }

    /**
     * Create an instance of {@link AddressTypeCodeType }
     */
    public AddressTypeCodeType createAddressTypeCodeType() {
        return new AddressTypeCodeType();
    }

    /**
     * Create an instance of {@link AdValoremIndicatorType }
     */
    public AdValoremIndicatorType createAdValoremIndicatorType() {
        return new AdValoremIndicatorType();
    }

    /**
     * Create an instance of {@link AgencyIDType }
     */
    public AgencyIDType createAgencyIDType() {
        return new AgencyIDType();
    }

    /**
     * Create an instance of {@link AgencyNameType }
     */
    public AgencyNameType createAgencyNameType() {
        return new AgencyNameType();
    }

    /**
     * Create an instance of {@link AircraftIDType }
     */
    public AircraftIDType createAircraftIDType() {
        return new AircraftIDType();
    }

    /**
     * Create an instance of {@link AllowanceChargeReasonType }
     */
    public AllowanceChargeReasonType createAllowanceChargeReasonType() {
        return new AllowanceChargeReasonType();
    }

    /**
     * Create an instance of {@link AllowanceChargeReasonCodeTypeCommBas }
     */
    public AllowanceChargeReasonCodeTypeCommBas createAllowanceChargeReasonCodeTypeCommBas() {
        return new AllowanceChargeReasonCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link AllowanceTotalAmountType }
     */
    public AllowanceTotalAmountType createAllowanceTotalAmountType() {
        return new AllowanceTotalAmountType();
    }

    /**
     * Create an instance of {@link ApplicationIDType }
     */
    public ApplicationIDType createApplicationIDType() {
        return new ApplicationIDType();
    }

    /**
     * Create an instance of {@link ApplicationStatusCodeType }
     */
    public ApplicationStatusCodeType createApplicationStatusCodeType() {
        return new ApplicationStatusCodeType();
    }

    /**
     * Create an instance of {@link ApprovalStatusType }
     */
    public ApprovalStatusType createApprovalStatusType() {
        return new ApprovalStatusType();
    }

    /**
     * Create an instance of {@link AttributeIDType }
     */
    public AttributeIDType createAttributeIDType() {
        return new AttributeIDType();
    }

    /**
     * Create an instance of {@link BackOrderAllowedIndicatorType }
     */
    public BackOrderAllowedIndicatorType createBackOrderAllowedIndicatorType() {
        return new BackOrderAllowedIndicatorType();
    }

    /**
     * Create an instance of {@link BackorderQuantityType }
     */
    public BackorderQuantityType createBackorderQuantityType() {
        return new BackorderQuantityType();
    }

    /**
     * Create an instance of {@link BackorderReasonType }
     */
    public BackorderReasonType createBackorderReasonType() {
        return new BackorderReasonType();
    }

    /**
     * Create an instance of {@link BalanceAmountType }
     */
    public BalanceAmountType createBalanceAmountType() {
        return new BalanceAmountType();
    }

    /**
     * Create an instance of {@link BalanceBroughtForwardIndicatorType }
     */
    public BalanceBroughtForwardIndicatorType createBalanceBroughtForwardIndicatorType() {
        return new BalanceBroughtForwardIndicatorType();
    }

    /**
     * Create an instance of {@link BaseAmountType }
     */
    public BaseAmountType createBaseAmountType() {
        return new BaseAmountType();
    }

    /**
     * Create an instance of {@link BaseQuantityType }
     */
    public BaseQuantityType createBaseQuantityType() {
        return new BaseQuantityType();
    }

    /**
     * Create an instance of {@link BaseUnitMeasureType }
     */
    public BaseUnitMeasureType createBaseUnitMeasureType() {
        return new BaseUnitMeasureType();
    }

    /**
     * Create an instance of {@link BatchQuantityType }
     */
    public BatchQuantityType createBatchQuantityType() {
        return new BatchQuantityType();
    }

    /**
     * Create an instance of {@link BlockNameType }
     */
    public BlockNameType createBlockNameType() {
        return new BlockNameType();
    }

    /**
     * Create an instance of {@link BrandNameType }
     */
    public BrandNameType createBrandNameType() {
        return new BrandNameType();
    }

    /**
     * Create an instance of {@link BuildingNameType }
     */
    public BuildingNameType createBuildingNameType() {
        return new BuildingNameType();
    }

    /**
     * Create an instance of {@link BuildingNumberType }
     */
    public BuildingNumberType createBuildingNumberType() {
        return new BuildingNumberType();
    }

    /**
     * Create an instance of {@link CalculationRateType }
     */
    public CalculationRateType createCalculationRateType() {
        return new CalculationRateType();
    }

    /**
     * Create an instance of {@link CalculationSequenceNumericType }
     */
    public CalculationSequenceNumericType createCalculationSequenceNumericType() {
        return new CalculationSequenceNumericType();
    }

    /**
     * Create an instance of {@link CancellationNoteType }
     */
    public CancellationNoteType createCancellationNoteType() {
        return new CancellationNoteType();
    }

    /**
     * Create an instance of {@link CanonicalizationMethodType }
     */
    public CanonicalizationMethodType createCanonicalizationMethodType() {
        return new CanonicalizationMethodType();
    }

    /**
     * Create an instance of {@link CardChipCodeType }
     */
    public CardChipCodeType createCardChipCodeType() {
        return new CardChipCodeType();
    }

    /**
     * Create an instance of {@link CardTypeCodeType }
     */
    public CardTypeCodeType createCardTypeCodeType() {
        return new CardTypeCodeType();
    }

    /**
     * Create an instance of {@link CargoTypeCodeType }
     */
    public CargoTypeCodeType createCargoTypeCodeType() {
        return new CargoTypeCodeType();
    }

    /**
     * Create an instance of {@link CarrierAssignedIDType }
     */
    public CarrierAssignedIDType createCarrierAssignedIDType() {
        return new CarrierAssignedIDType();
    }

    /**
     * Create an instance of {@link CatalogueIndicatorType }
     */
    public CatalogueIndicatorType createCatalogueIndicatorType() {
        return new CatalogueIndicatorType();
    }

    /**
     * Create an instance of {@link CategoryNameType }
     */
    public CategoryNameType createCategoryNameType() {
        return new CategoryNameType();
    }

    /**
     * Create an instance of {@link CertificateTypeType }
     */
    public CertificateTypeType createCertificateTypeType() {
        return new CertificateTypeType();
    }

    /**
     * Create an instance of {@link ChannelType }
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link ChannelCodeTypeCommBas }
     */
    public ChannelCodeTypeCommBas createChannelCodeTypeCommBas() {
        return new ChannelCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link ChargeableWeightMeasureType }
     */
    public ChargeableWeightMeasureType createChargeableWeightMeasureType() {
        return new ChargeableWeightMeasureType();
    }

    /**
     * Create an instance of {@link ChargeIndicatorType }
     */
    public ChargeIndicatorType createChargeIndicatorType() {
        return new ChargeIndicatorType();
    }

    /**
     * Create an instance of {@link ChargeTotalAmountType }
     */
    public ChargeTotalAmountType createChargeTotalAmountType() {
        return new ChargeTotalAmountType();
    }

    /**
     * Create an instance of {@link ChipApplicationIDType }
     */
    public ChipApplicationIDType createChipApplicationIDType() {
        return new ChipApplicationIDType();
    }

    /**
     * Create an instance of {@link CityNameType }
     */
    public CityNameType createCityNameType() {
        return new CityNameType();
    }

    /**
     * Create an instance of {@link CitySubdivisionNameType }
     */
    public CitySubdivisionNameType createCitySubdivisionNameType() {
        return new CitySubdivisionNameType();
    }

    /**
     * Create an instance of {@link ClassifiedIndicatorType }
     */
    public ClassifiedIndicatorType createClassifiedIndicatorType() {
        return new ClassifiedIndicatorType();
    }

    /**
     * Create an instance of {@link CodeValueType }
     */
    public CodeValueType createCodeValueType() {
        return new CodeValueType();
    }

    /**
     * Create an instance of {@link CommodityCodeType }
     */
    public CommodityCodeType createCommodityCodeType() {
        return new CommodityCodeType();
    }

    /**
     * Create an instance of {@link CompanyIDType }
     */
    public CompanyIDType createCompanyIDType() {
        return new CompanyIDType();
    }

    /**
     * Create an instance of {@link CompletionIndicatorType }
     */
    public CompletionIndicatorType createCompletionIndicatorType() {
        return new CompletionIndicatorType();
    }

    /**
     * Create an instance of {@link ConditionType }
     */
    public ConditionType createConditionType() {
        return new ConditionType();
    }

    /**
     * Create an instance of {@link ConditionCodeType }
     */
    public ConditionCodeType createConditionCodeType() {
        return new ConditionCodeType();
    }

    /**
     * Create an instance of {@link ConditionsType }
     */
    public ConditionsType createConditionsType() {
        return new ConditionsType();
    }

    /**
     * Create an instance of {@link ConsumerUnitQuantityType }
     */
    public ConsumerUnitQuantityType createConsumerUnitQuantityType() {
        return new ConsumerUnitQuantityType();
    }

    /**
     * Create an instance of {@link ContentUnitQuantityType }
     */
    public ContentUnitQuantityType createContentUnitQuantityType() {
        return new ContentUnitQuantityType();
    }

    /**
     * Create an instance of {@link ContractSubdivisionType }
     */
    public ContractSubdivisionType createContractSubdivisionType() {
        return new ContractSubdivisionType();
    }

    /**
     * Create an instance of {@link ContractTypeType }
     */
    public ContractTypeType createContractTypeType() {
        return new ContractTypeType();
    }

    /**
     * Create an instance of {@link ContractTypeCodeType }
     */
    public ContractTypeCodeType createContractTypeCodeType() {
        return new ContractTypeCodeType();
    }

    /**
     * Create an instance of {@link CoordinateSystemCodeType }
     */
    public CoordinateSystemCodeType createCoordinateSystemCodeType() {
        return new CoordinateSystemCodeType();
    }

    /**
     * Create an instance of {@link CopiesNumericType }
     */
    public CopiesNumericType createCopiesNumericType() {
        return new CopiesNumericType();
    }

    /**
     * Create an instance of {@link CopyIndicatorType }
     */
    public CopyIndicatorType createCopyIndicatorType() {
        return new CopyIndicatorType();
    }

    /**
     * Create an instance of {@link CorporateRegistrationTypeCodeType }
     */
    public CorporateRegistrationTypeCodeType createCorporateRegistrationTypeCodeType() {
        return new CorporateRegistrationTypeCodeType();
    }

    /**
     * Create an instance of {@link CountrySubentityType }
     */
    public CountrySubentityType createCountrySubentityType() {
        return new CountrySubentityType();
    }

    /**
     * Create an instance of {@link CountrySubentityCodeType }
     */
    public CountrySubentityCodeType createCountrySubentityCodeType() {
        return new CountrySubentityCodeType();
    }

    /**
     * Create an instance of {@link CreditAmountType }
     */
    public CreditAmountType createCreditAmountType() {
        return new CreditAmountType();
    }

    /**
     * Create an instance of {@link CreditedQuantityType }
     */
    public CreditedQuantityType createCreditedQuantityType() {
        return new CreditedQuantityType();
    }

    /**
     * Create an instance of {@link CreditLineAmountType }
     */
    public CreditLineAmountType createCreditLineAmountType() {
        return new CreditLineAmountType();
    }

    /**
     * Create an instance of {@link CurrencyBaseRateType }
     */
    public CurrencyBaseRateType createCurrencyBaseRateType() {
        return new CurrencyBaseRateType();
    }

    /**
     * Create an instance of {@link CurrencyCodeTypeCommBas }
     */
    public CurrencyCodeTypeCommBas createCurrencyCodeTypeCommBas() {
        return new CurrencyCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link CustomerAssignedAccountIDType }
     */
    public CustomerAssignedAccountIDType createCustomerAssignedAccountIDType() {
        return new CustomerAssignedAccountIDType();
    }

    /**
     * Create an instance of {@link CustomerReferenceType }
     */
    public CustomerReferenceType createCustomerReferenceType() {
        return new CustomerReferenceType();
    }

    /**
     * Create an instance of {@link CustomizationIDType }
     */
    public CustomizationIDType createCustomizationIDType() {
        return new CustomizationIDType();
    }

    /**
     * Create an instance of {@link CustomsIDType }
     */
    public CustomsIDType createCustomsIDType() {
        return new CustomsIDType();
    }

    /**
     * Create an instance of {@link CustomsImportClassifiedIndicatorType }
     */
    public CustomsImportClassifiedIndicatorType createCustomsImportClassifiedIndicatorType() {
        return new CustomsImportClassifiedIndicatorType();
    }

    /**
     * Create an instance of {@link CustomsStatusCodeType }
     */
    public CustomsStatusCodeType createCustomsStatusCodeType() {
        return new CustomsStatusCodeType();
    }

    /**
     * Create an instance of {@link CustomsTariffQuantityType }
     */
    public CustomsTariffQuantityType createCustomsTariffQuantityType() {
        return new CustomsTariffQuantityType();
    }

    /**
     * Create an instance of {@link CV2IDType }
     */
    public CV2IDType createCV2IDType() {
        return new CV2IDType();
    }

    /**
     * Create an instance of {@link DamageRemarksType }
     */
    public DamageRemarksType createDamageRemarksType() {
        return new DamageRemarksType();
    }

    /**
     * Create an instance of {@link DataSendingCapabilityType }
     */
    public DataSendingCapabilityType createDataSendingCapabilityType() {
        return new DataSendingCapabilityType();
    }

    /**
     * Create an instance of {@link DateType }
     */
    public DateType createDateType() {
        return new DateType();
    }

    /**
     * Create an instance of {@link DebitAmountType }
     */
    public DebitAmountType createDebitAmountType() {
        return new DebitAmountType();
    }

    /**
     * Create an instance of {@link DebitedQuantityType }
     */
    public DebitedQuantityType createDebitedQuantityType() {
        return new DebitedQuantityType();
    }

    /**
     * Create an instance of {@link DebitLineAmountType }
     */
    public DebitLineAmountType createDebitLineAmountType() {
        return new DebitLineAmountType();
    }

    /**
     * Create an instance of {@link DeclaredCarriageValueAmountType }
     */
    public DeclaredCarriageValueAmountType createDeclaredCarriageValueAmountType() {
        return new DeclaredCarriageValueAmountType();
    }

    /**
     * Create an instance of {@link DeclaredCustomsValueAmountType }
     */
    public DeclaredCustomsValueAmountType createDeclaredCustomsValueAmountType() {
        return new DeclaredCustomsValueAmountType();
    }

    /**
     * Create an instance of {@link DeclaredForCarriageValueAmountType }
     */
    public DeclaredForCarriageValueAmountType createDeclaredForCarriageValueAmountType() {
        return new DeclaredForCarriageValueAmountType();
    }

    /**
     * Create an instance of {@link DeclaredStatisticsValueAmountType }
     */
    public DeclaredStatisticsValueAmountType createDeclaredStatisticsValueAmountType() {
        return new DeclaredStatisticsValueAmountType();
    }

    /**
     * Create an instance of {@link DegreesMeasureType }
     */
    public DegreesMeasureType createDegreesMeasureType() {
        return new DegreesMeasureType();
    }

    /**
     * Create an instance of {@link DeliveredQuantityType }
     */
    public DeliveredQuantityType createDeliveredQuantityType() {
        return new DeliveredQuantityType();
    }

    /**
     * Create an instance of {@link DeliveryDateType }
     */
    public DeliveryDateType createDeliveryDateType() {
        return new DeliveryDateType();
    }

    /**
     * Create an instance of {@link DeliveryInstructionsType }
     */
    public DeliveryInstructionsType createDeliveryInstructionsType() {
        return new DeliveryInstructionsType();
    }

    /**
     * Create an instance of {@link DepartmentType }
     */
    public DepartmentType createDepartmentType() {
        return new DepartmentType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link DescriptionCodeType }
     */
    public DescriptionCodeType createDescriptionCodeType() {
        return new DescriptionCodeType();
    }

    /**
     * Create an instance of {@link DespatchAdviceTypeCodeType }
     */
    public DespatchAdviceTypeCodeType createDespatchAdviceTypeCodeType() {
        return new DespatchAdviceTypeCodeType();
    }

    /**
     * Create an instance of {@link DespatchDateType }
     */
    public DespatchDateType createDespatchDateType() {
        return new DespatchDateType();
    }

    /**
     * Create an instance of {@link DespatchTimeType }
     */
    public DespatchTimeType createDespatchTimeType() {
        return new DespatchTimeType();
    }

    /**
     * Create an instance of {@link DirectionCodeType }
     */
    public DirectionCodeType createDirectionCodeType() {
        return new DirectionCodeType();
    }

    /**
     * Create an instance of {@link DiscountPercentType }
     */
    public DiscountPercentType createDiscountPercentType() {
        return new DiscountPercentType();
    }

    /**
     * Create an instance of {@link DispositionCodeType }
     */
    public DispositionCodeType createDispositionCodeType() {
        return new DispositionCodeType();
    }

    /**
     * Create an instance of {@link DistrictType }
     */
    public DistrictType createDistrictType() {
        return new DistrictType();
    }

    /**
     * Create an instance of {@link DocumentBinaryObjectType }
     */
    public DocumentBinaryObjectType createDocumentBinaryObjectType() {
        return new DocumentBinaryObjectType();
    }

    /**
     * Create an instance of {@link DocumentCurrencyCodeType }
     */
    public DocumentCurrencyCodeType createDocumentCurrencyCodeType() {
        return new DocumentCurrencyCodeType();
    }

    /**
     * Create an instance of {@link DocumentHashType }
     */
    public DocumentHashType createDocumentHashType() {
        return new DocumentHashType();
    }

    /**
     * Create an instance of {@link DocumentIDType }
     */
    public DocumentIDType createDocumentIDType() {
        return new DocumentIDType();
    }

    /**
     * Create an instance of {@link DocumentStatusCodeTypeCommBas }
     */
    public DocumentStatusCodeTypeCommBas createDocumentStatusCodeTypeCommBas() {
        return new DocumentStatusCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link DocumentTypeType }
     */
    public DocumentTypeType createDocumentTypeType() {
        return new DocumentTypeType();
    }

    /**
     * Create an instance of {@link DocumentTypeCodeType }
     */
    public DocumentTypeCodeType createDocumentTypeCodeType() {
        return new DocumentTypeCodeType();
    }

    /**
     * Create an instance of {@link DurationMeasureType }
     */
    public DurationMeasureType createDurationMeasureType() {
        return new DurationMeasureType();
    }

    /**
     * Create an instance of {@link ElectronicMailType }
     */
    public ElectronicMailType createElectronicMailType() {
        return new ElectronicMailType();
    }

    /**
     * Create an instance of {@link EmbeddedDocumentBinaryObjectType }
     */
    public EmbeddedDocumentBinaryObjectType createEmbeddedDocumentBinaryObjectType() {
        return new EmbeddedDocumentBinaryObjectType();
    }

    /**
     * Create an instance of {@link EmergencyProceduresCodeType }
     */
    public EmergencyProceduresCodeType createEmergencyProceduresCodeType() {
        return new EmergencyProceduresCodeType();
    }

    /**
     * Create an instance of {@link EndDateType }
     */
    public EndDateType createEndDateType() {
        return new EndDateType();
    }

    /**
     * Create an instance of {@link EndpointIDType }
     */
    public EndpointIDType createEndpointIDType() {
        return new EndpointIDType();
    }

    /**
     * Create an instance of {@link EndTimeType }
     */
    public EndTimeType createEndTimeType() {
        return new EndTimeType();
    }

    /**
     * Create an instance of {@link EstimatedDespatchDateType }
     */
    public EstimatedDespatchDateType createEstimatedDespatchDateType() {
        return new EstimatedDespatchDateType();
    }

    /**
     * Create an instance of {@link EstimatedDespatchTimeType }
     */
    public EstimatedDespatchTimeType createEstimatedDespatchTimeType() {
        return new EstimatedDespatchTimeType();
    }

    /**
     * Create an instance of {@link EventCodeType }
     */
    public EventCodeType createEventCodeType() {
        return new EventCodeType();
    }

    /**
     * Create an instance of {@link ExchangeMarketIDType }
     */
    public ExchangeMarketIDType createExchangeMarketIDType() {
        return new ExchangeMarketIDType();
    }

    /**
     * Create an instance of {@link ExemptionReasonType }
     */
    public ExemptionReasonType createExemptionReasonType() {
        return new ExemptionReasonType();
    }

    /**
     * Create an instance of {@link ExemptionReasonCodeType }
     */
    public ExemptionReasonCodeType createExemptionReasonCodeType() {
        return new ExemptionReasonCodeType();
    }

    /**
     * Create an instance of {@link ExpiryDateType }
     */
    public ExpiryDateType createExpiryDateType() {
        return new ExpiryDateType();
    }

    /**
     * Create an instance of {@link ExpiryTimeType }
     */
    public ExpiryTimeType createExpiryTimeType() {
        return new ExpiryTimeType();
    }

    /**
     * Create an instance of {@link ExtendedIDType }
     */
    public ExtendedIDType createExtendedIDType() {
        return new ExtendedIDType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link FactorNumericType }
     */
    public FactorNumericType createFactorNumericType() {
        return new FactorNumericType();
    }

    /**
     * Create an instance of {@link FamilyNameType }
     */
    public FamilyNameType createFamilyNameType() {
        return new FamilyNameType();
    }

    /**
     * Create an instance of {@link FirstNameType }
     */
    public FirstNameType createFirstNameType() {
        return new FirstNameType();
    }

    /**
     * Create an instance of {@link FloorType }
     */
    public FloorType createFloorType() {
        return new FloorType();
    }

    /**
     * Create an instance of {@link FreeOfChargeIndicatorType }
     */
    public FreeOfChargeIndicatorType createFreeOfChargeIndicatorType() {
        return new FreeOfChargeIndicatorType();
    }

    /**
     * Create an instance of {@link FreeOnBoardValueAmountType }
     */
    public FreeOnBoardValueAmountType createFreeOnBoardValueAmountType() {
        return new FreeOnBoardValueAmountType();
    }

    /**
     * Create an instance of {@link FreightRateClassCodeType }
     */
    public FreightRateClassCodeType createFreightRateClassCodeType() {
        return new FreightRateClassCodeType();
    }

    /**
     * Create an instance of {@link FullnessIndicationCodeType }
     */
    public FullnessIndicationCodeType createFullnessIndicationCodeType() {
        return new FullnessIndicationCodeType();
    }

    /**
     * Create an instance of {@link GoodsItemQuantityType }
     */
    public GoodsItemQuantityType createGoodsItemQuantityType() {
        return new GoodsItemQuantityType();
    }

    /**
     * Create an instance of {@link GrossVolumeMeasureType }
     */
    public GrossVolumeMeasureType createGrossVolumeMeasureType() {
        return new GrossVolumeMeasureType();
    }

    /**
     * Create an instance of {@link GrossWeightMeasureType }
     */
    public GrossWeightMeasureType createGrossWeightMeasureType() {
        return new GrossWeightMeasureType();
    }

    /**
     * Create an instance of {@link HandlingCodeType }
     */
    public HandlingCodeType createHandlingCodeType() {
        return new HandlingCodeType();
    }

    /**
     * Create an instance of {@link HandlingInstructionsType }
     */
    public HandlingInstructionsType createHandlingInstructionsType() {
        return new HandlingInstructionsType();
    }

    /**
     * Create an instance of {@link HazardClassIDType }
     */
    public HazardClassIDType createHazardClassIDType() {
        return new HazardClassIDType();
    }

    /**
     * Create an instance of {@link HazardousCategoryCodeType }
     */
    public HazardousCategoryCodeType createHazardousCategoryCodeType() {
        return new HazardousCategoryCodeType();
    }

    /**
     * Create an instance of {@link HazardousRegulationCodeType }
     */
    public HazardousRegulationCodeType createHazardousRegulationCodeType() {
        return new HazardousRegulationCodeType();
    }

    /**
     * Create an instance of {@link HazardousRiskIndicatorType }
     */
    public HazardousRiskIndicatorType createHazardousRiskIndicatorType() {
        return new HazardousRiskIndicatorType();
    }

    /**
     * Create an instance of {@link HolderNameType }
     */
    public HolderNameType createHolderNameType() {
        return new HolderNameType();
    }

    /**
     * Create an instance of {@link IdentificationCodeType }
     */
    public IdentificationCodeType createIdentificationCodeType() {
        return new IdentificationCodeType();
    }

    /**
     * Create an instance of {@link IdentificationIDType }
     */
    public IdentificationIDType createIdentificationIDType() {
        return new IdentificationIDType();
    }

    /**
     * Create an instance of {@link IndicationIndicatorType }
     */
    public IndicationIndicatorType createIndicationIndicatorType() {
        return new IndicationIndicatorType();
    }

    /**
     * Create an instance of {@link InformationType }
     */
    public InformationType createInformationType() {
        return new InformationType();
    }

    /**
     * Create an instance of {@link InhalationToxicityZoneCodeType }
     */
    public InhalationToxicityZoneCodeType createInhalationToxicityZoneCodeType() {
        return new InhalationToxicityZoneCodeType();
    }

    /**
     * Create an instance of {@link InhouseMailType }
     */
    public InhouseMailType createInhouseMailType() {
        return new InhouseMailType();
    }

    /**
     * Create an instance of {@link InspectionMethodCodeType }
     */
    public InspectionMethodCodeType createInspectionMethodCodeType() {
        return new InspectionMethodCodeType();
    }

    /**
     * Create an instance of {@link InstructionType }
     */
    public InstructionType createInstructionType() {
        return new InstructionType();
    }

    /**
     * Create an instance of {@link InstructionIDType }
     */
    public InstructionIDType createInstructionIDType() {
        return new InstructionIDType();
    }

    /**
     * Create an instance of {@link InstructionNoteType }
     */
    public InstructionNoteType createInstructionNoteType() {
        return new InstructionNoteType();
    }

    /**
     * Create an instance of {@link InstructionsType }
     */
    public InstructionsType createInstructionsType() {
        return new InstructionsType();
    }

    /**
     * Create an instance of {@link InsurancePremiumAmountType }
     */
    public InsurancePremiumAmountType createInsurancePremiumAmountType() {
        return new InsurancePremiumAmountType();
    }

    /**
     * Create an instance of {@link InsuranceValueAmountType }
     */
    public InsuranceValueAmountType createInsuranceValueAmountType() {
        return new InsuranceValueAmountType();
    }

    /**
     * Create an instance of {@link InvoiceAmountType }
     */
    public InvoiceAmountType createInvoiceAmountType() {
        return new InvoiceAmountType();
    }

    /**
     * Create an instance of {@link InvoicedQuantityType }
     */
    public InvoicedQuantityType createInvoicedQuantityType() {
        return new InvoicedQuantityType();
    }

    /**
     * Create an instance of {@link InvoiceTypeCodeType }
     */
    public InvoiceTypeCodeType createInvoiceTypeCodeType() {
        return new InvoiceTypeCodeType();
    }

    /**
     * Create an instance of {@link InvoicingPartyReferenceType }
     */
    public InvoicingPartyReferenceType createInvoicingPartyReferenceType() {
        return new InvoicingPartyReferenceType();
    }

    /**
     * Create an instance of {@link IssueDateType }
     */
    public IssueDateType createIssueDateType() {
        return new IssueDateType();
    }

    /**
     * Create an instance of {@link IssueNumberIDType }
     */
    public IssueNumberIDType createIssueNumberIDType() {
        return new IssueNumberIDType();
    }

    /**
     * Create an instance of {@link IssuerIDType }
     */
    public IssuerIDType createIssuerIDType() {
        return new IssuerIDType();
    }

    /**
     * Create an instance of {@link IssueTimeType }
     */
    public IssueTimeType createIssueTimeType() {
        return new IssueTimeType();
    }

    /**
     * Create an instance of {@link ItemClassificationCodeType }
     */
    public ItemClassificationCodeType createItemClassificationCodeType() {
        return new ItemClassificationCodeType();
    }

    /**
     * Create an instance of {@link ItemUpdateRequestIndicatorType }
     */
    public ItemUpdateRequestIndicatorType createItemUpdateRequestIndicatorType() {
        return new ItemUpdateRequestIndicatorType();
    }

    /**
     * Create an instance of {@link JobIDType }
     */
    public JobIDType createJobIDType() {
        return new JobIDType();
    }

    /**
     * Create an instance of {@link JobTitleType }
     */
    public JobTitleType createJobTitleType() {
        return new JobTitleType();
    }

    /**
     * Create an instance of {@link JourneyIDType }
     */
    public JourneyIDType createJourneyIDType() {
        return new JourneyIDType();
    }

    /**
     * Create an instance of {@link KeywordType }
     */
    public KeywordType createKeywordType() {
        return new KeywordType();
    }

    /**
     * Create an instance of {@link LanguageIDType }
     */
    public LanguageIDType createLanguageIDType() {
        return new LanguageIDType();
    }

    /**
     * Create an instance of {@link LastRevisionDateType }
     */
    public LastRevisionDateType createLastRevisionDateType() {
        return new LastRevisionDateType();
    }

    /**
     * Create an instance of {@link LastRevisionTimeType }
     */
    public LastRevisionTimeType createLastRevisionTimeType() {
        return new LastRevisionTimeType();
    }

    /**
     * Create an instance of {@link LatestDeliveryDateType }
     */
    public LatestDeliveryDateType createLatestDeliveryDateType() {
        return new LatestDeliveryDateType();
    }

    /**
     * Create an instance of {@link LatestDeliveryTimeType }
     */
    public LatestDeliveryTimeType createLatestDeliveryTimeType() {
        return new LatestDeliveryTimeType();
    }

    /**
     * Create an instance of {@link LatitudeDegreesMeasureType }
     */
    public LatitudeDegreesMeasureType createLatitudeDegreesMeasureType() {
        return new LatitudeDegreesMeasureType();
    }

    /**
     * Create an instance of {@link LatitudeDirectionCodeTypeCommBas }
     */
    public LatitudeDirectionCodeTypeCommBas createLatitudeDirectionCodeTypeCommBas() {
        return new LatitudeDirectionCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link LatitudeMinutesMeasureType }
     */
    public LatitudeMinutesMeasureType createLatitudeMinutesMeasureType() {
        return new LatitudeMinutesMeasureType();
    }

    /**
     * Create an instance of {@link LeadTimeMeasureType }
     */
    public LeadTimeMeasureType createLeadTimeMeasureType() {
        return new LeadTimeMeasureType();
    }

    /**
     * Create an instance of {@link LegalStatusIndicatorType }
     */
    public LegalStatusIndicatorType createLegalStatusIndicatorType() {
        return new LegalStatusIndicatorType();
    }

    /**
     * Create an instance of {@link LengthMeasureType }
     */
    public LengthMeasureType createLengthMeasureType() {
        return new LengthMeasureType();
    }

    /**
     * Create an instance of {@link LicensePlateIDType }
     */
    public LicensePlateIDType createLicensePlateIDType() {
        return new LicensePlateIDType();
    }

    /**
     * Create an instance of {@link LifeCycleStatusCodeType }
     */
    public LifeCycleStatusCodeType createLifeCycleStatusCodeType() {
        return new LifeCycleStatusCodeType();
    }

    /**
     * Create an instance of {@link LineType }
     */
    public LineType createLineType() {
        return new LineType();
    }

    /**
     * Create an instance of {@link LineAmountType }
     */
    public LineAmountType createLineAmountType() {
        return new LineAmountType();
    }

    /**
     * Create an instance of {@link LineCountNumericType }
     */
    public LineCountNumericType createLineCountNumericType() {
        return new LineCountNumericType();
    }

    /**
     * Create an instance of {@link LineExtensionAmountType }
     */
    public LineExtensionAmountType createLineExtensionAmountType() {
        return new LineExtensionAmountType();
    }

    /**
     * Create an instance of {@link LineIDType }
     */
    public LineIDType createLineIDType() {
        return new LineIDType();
    }

    /**
     * Create an instance of {@link LineStatusCodeTypeCommBas }
     */
    public LineStatusCodeTypeCommBas createLineStatusCodeTypeCommBas() {
        return new LineStatusCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link LoadingLengthMeasureType }
     */
    public LoadingLengthMeasureType createLoadingLengthMeasureType() {
        return new LoadingLengthMeasureType();
    }

    /**
     * Create an instance of {@link LocaleCodeType }
     */
    public LocaleCodeType createLocaleCodeType() {
        return new LocaleCodeType();
    }

    /**
     * Create an instance of {@link LocationType }
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link LocationIDType }
     */
    public LocationIDType createLocationIDType() {
        return new LocationIDType();
    }

    /**
     * Create an instance of {@link LogoReferenceIDType }
     */
    public LogoReferenceIDType createLogoReferenceIDType() {
        return new LogoReferenceIDType();
    }

    /**
     * Create an instance of {@link LongitudeDegreesMeasureType }
     */
    public LongitudeDegreesMeasureType createLongitudeDegreesMeasureType() {
        return new LongitudeDegreesMeasureType();
    }

    /**
     * Create an instance of {@link LongitudeDirectionCodeTypeCommBas }
     */
    public LongitudeDirectionCodeTypeCommBas createLongitudeDirectionCodeTypeCommBas() {
        return new LongitudeDirectionCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link LongitudeMinutesMeasureType }
     */
    public LongitudeMinutesMeasureType createLongitudeMinutesMeasureType() {
        return new LongitudeMinutesMeasureType();
    }

    /**
     * Create an instance of {@link LossRiskType }
     */
    public LossRiskType createLossRiskType() {
        return new LossRiskType();
    }

    /**
     * Create an instance of {@link LossRiskResponsibilityCodeType }
     */
    public LossRiskResponsibilityCodeType createLossRiskResponsibilityCodeType() {
        return new LossRiskResponsibilityCodeType();
    }

    /**
     * Create an instance of {@link LotNumberIDType }
     */
    public LotNumberIDType createLotNumberIDType() {
        return new LotNumberIDType();
    }

    /**
     * Create an instance of {@link LowerOrangeHazardPlacardIDType }
     */
    public LowerOrangeHazardPlacardIDType createLowerOrangeHazardPlacardIDType() {
        return new LowerOrangeHazardPlacardIDType();
    }

    /**
     * Create an instance of {@link MailType }
     */
    public MailType createMailType() {
        return new MailType();
    }

    /**
     * Create an instance of {@link ManufactureDateType }
     */
    public ManufactureDateType createManufactureDateType() {
        return new ManufactureDateType();
    }

    /**
     * Create an instance of {@link ManufactureTimeType }
     */
    public ManufactureTimeType createManufactureTimeType() {
        return new ManufactureTimeType();
    }

    /**
     * Create an instance of {@link MarkAttentionType }
     */
    public MarkAttentionType createMarkAttentionType() {
        return new MarkAttentionType();
    }

    /**
     * Create an instance of {@link MarkAttentionIndicatorType }
     */
    public MarkAttentionIndicatorType createMarkAttentionIndicatorType() {
        return new MarkAttentionIndicatorType();
    }

    /**
     * Create an instance of {@link MarkCareType }
     */
    public MarkCareType createMarkCareType() {
        return new MarkCareType();
    }

    /**
     * Create an instance of {@link MarkCareIndicatorType }
     */
    public MarkCareIndicatorType createMarkCareIndicatorType() {
        return new MarkCareIndicatorType();
    }

    /**
     * Create an instance of {@link MarkingIDType }
     */
    public MarkingIDType createMarkingIDType() {
        return new MarkingIDType();
    }

    /**
     * Create an instance of {@link MarksType }
     */
    public MarksType createMarksType() {
        return new MarksType();
    }

    /**
     * Create an instance of {@link MathematicOperatorCodeType }
     */
    public MathematicOperatorCodeType createMathematicOperatorCodeType() {
        return new MathematicOperatorCodeType();
    }

    /**
     * Create an instance of {@link MaximumBackorderQuantityType }
     */
    public MaximumBackorderQuantityType createMaximumBackorderQuantityType() {
        return new MaximumBackorderQuantityType();
    }

    /**
     * Create an instance of {@link MaximumCopiesNumericType }
     */
    public MaximumCopiesNumericType createMaximumCopiesNumericType() {
        return new MaximumCopiesNumericType();
    }

    /**
     * Create an instance of {@link MaximumMeasureType }
     */
    public MaximumMeasureType createMaximumMeasureType() {
        return new MaximumMeasureType();
    }

    /**
     * Create an instance of {@link MaximumOrderQuantityType }
     */
    public MaximumOrderQuantityType createMaximumOrderQuantityType() {
        return new MaximumOrderQuantityType();
    }

    /**
     * Create an instance of {@link MaximumQuantityType }
     */
    public MaximumQuantityType createMaximumQuantityType() {
        return new MaximumQuantityType();
    }

    /**
     * Create an instance of {@link MeasureTypeCommBas }
     */
    public MeasureTypeCommBas createMeasureTypeCommBas() {
        return new MeasureTypeCommBas();
    }

    /**
     * Create an instance of {@link MedicalFirstAidGuideCodeType }
     */
    public MedicalFirstAidGuideCodeType createMedicalFirstAidGuideCodeType() {
        return new MedicalFirstAidGuideCodeType();
    }

    /**
     * Create an instance of {@link MiddleNameType }
     */
    public MiddleNameType createMiddleNameType() {
        return new MiddleNameType();
    }

    /**
     * Create an instance of {@link MinimumBackorderQuantityType }
     */
    public MinimumBackorderQuantityType createMinimumBackorderQuantityType() {
        return new MinimumBackorderQuantityType();
    }

    /**
     * Create an instance of {@link MinimumMeasureType }
     */
    public MinimumMeasureType createMinimumMeasureType() {
        return new MinimumMeasureType();
    }

    /**
     * Create an instance of {@link MinimumOrderQuantityType }
     */
    public MinimumOrderQuantityType createMinimumOrderQuantityType() {
        return new MinimumOrderQuantityType();
    }

    /**
     * Create an instance of {@link MinimumQuantityType }
     */
    public MinimumQuantityType createMinimumQuantityType() {
        return new MinimumQuantityType();
    }

    /**
     * Create an instance of {@link MinutesMeasureType }
     */
    public MinutesMeasureType createMinutesMeasureType() {
        return new MinutesMeasureType();
    }

    /**
     * Create an instance of {@link ModelNameType }
     */
    public ModelNameType createModelNameType() {
        return new ModelNameType();
    }

    /**
     * Create an instance of {@link MultiplierFactorNumericType }
     */
    public MultiplierFactorNumericType createMultiplierFactorNumericType() {
        return new MultiplierFactorNumericType();
    }

    /**
     * Create an instance of {@link NameTypeCommBas }
     */
    public NameTypeCommBas createNameTypeCommBas() {
        return new NameTypeCommBas();
    }

    /**
     * Create an instance of {@link NameSuffixType }
     */
    public NameSuffixType createNameSuffixType() {
        return new NameSuffixType();
    }

    /**
     * Create an instance of {@link NationalityType }
     */
    public NationalityType createNationalityType() {
        return new NationalityType();
    }

    /**
     * Create an instance of {@link NationalityIDType }
     */
    public NationalityIDType createNationalityIDType() {
        return new NationalityIDType();
    }

    /**
     * Create an instance of {@link NatureCodeType }
     */
    public NatureCodeType createNatureCodeType() {
        return new NatureCodeType();
    }

    /**
     * Create an instance of {@link NetNetWeightMeasureType }
     */
    public NetNetWeightMeasureType createNetNetWeightMeasureType() {
        return new NetNetWeightMeasureType();
    }

    /**
     * Create an instance of {@link NetVolumeMeasureType }
     */
    public NetVolumeMeasureType createNetVolumeMeasureType() {
        return new NetVolumeMeasureType();
    }

    /**
     * Create an instance of {@link NetWeightMeasureType }
     */
    public NetWeightMeasureType createNetWeightMeasureType() {
        return new NetWeightMeasureType();
    }

    /**
     * Create an instance of {@link NetworkIDType }
     */
    public NetworkIDType createNetworkIDType() {
        return new NetworkIDType();
    }

    /**
     * Create an instance of {@link NoteType }
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link NumberIDType }
     */
    public NumberIDType createNumberIDType() {
        return new NumberIDType();
    }

    /**
     * Create an instance of {@link OccurrenceDateType }
     */
    public OccurrenceDateType createOccurrenceDateType() {
        return new OccurrenceDateType();
    }

    /**
     * Create an instance of {@link OccurrenceTimeType }
     */
    public OccurrenceTimeType createOccurrenceTimeType() {
        return new OccurrenceTimeType();
    }

    /**
     * Create an instance of {@link OnCarriageIndicatorType }
     */
    public OnCarriageIndicatorType createOnCarriageIndicatorType() {
        return new OnCarriageIndicatorType();
    }

    /**
     * Create an instance of {@link OrangeHazardPlacardIDType }
     */
    public OrangeHazardPlacardIDType createOrangeHazardPlacardIDType() {
        return new OrangeHazardPlacardIDType();
    }

    /**
     * Create an instance of {@link OrderableIndicatorType }
     */
    public OrderableIndicatorType createOrderableIndicatorType() {
        return new OrderableIndicatorType();
    }

    /**
     * Create an instance of {@link OrderableUnitType }
     */
    public OrderableUnitType createOrderableUnitType() {
        return new OrderableUnitType();
    }

    /**
     * Create an instance of {@link OrderableUnitFactorRateType }
     */
    public OrderableUnitFactorRateType createOrderableUnitFactorRateType() {
        return new OrderableUnitFactorRateType();
    }

    /**
     * Create an instance of {@link OrderIDType }
     */
    public OrderIDType createOrderIDType() {
        return new OrderIDType();
    }

    /**
     * Create an instance of {@link OrderQuantityType }
     */
    public OrderQuantityType createOrderQuantityType() {
        return new OrderQuantityType();
    }

    /**
     * Create an instance of {@link OrderQuantityIncrementNumericType }
     */
    public OrderQuantityIncrementNumericType createOrderQuantityIncrementNumericType() {
        return new OrderQuantityIncrementNumericType();
    }

    /**
     * Create an instance of {@link OrganizationDepartmentType }
     */
    public OrganizationDepartmentType createOrganizationDepartmentType() {
        return new OrganizationDepartmentType();
    }

    /**
     * Create an instance of {@link OriginalJobIDType }
     */
    public OriginalJobIDType createOriginalJobIDType() {
        return new OriginalJobIDType();
    }

    /**
     * Create an instance of {@link OtherInstructionType }
     */
    public OtherInstructionType createOtherInstructionType() {
        return new OtherInstructionType();
    }

    /**
     * Create an instance of {@link OutstandingQuantityType }
     */
    public OutstandingQuantityType createOutstandingQuantityType() {
        return new OutstandingQuantityType();
    }

    /**
     * Create an instance of {@link OutstandingReasonType }
     */
    public OutstandingReasonType createOutstandingReasonType() {
        return new OutstandingReasonType();
    }

    /**
     * Create an instance of {@link OversupplyQuantityType }
     */
    public OversupplyQuantityType createOversupplyQuantityType() {
        return new OversupplyQuantityType();
    }

    /**
     * Create an instance of {@link OwnerTypeCodeType }
     */
    public OwnerTypeCodeType createOwnerTypeCodeType() {
        return new OwnerTypeCodeType();
    }

    /**
     * Create an instance of {@link PackageLevelCodeType }
     */
    public PackageLevelCodeType createPackageLevelCodeType() {
        return new PackageLevelCodeType();
    }

    /**
     * Create an instance of {@link PackageQuantityType }
     */
    public PackageQuantityType createPackageQuantityType() {
        return new PackageQuantityType();
    }

    /**
     * Create an instance of {@link PackagesQuantityType }
     */
    public PackagesQuantityType createPackagesQuantityType() {
        return new PackagesQuantityType();
    }

    /**
     * Create an instance of {@link PackagingTypeCodeTypeCommBas }
     */
    public PackagingTypeCodeTypeCommBas createPackagingTypeCodeTypeCommBas() {
        return new PackagingTypeCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link PackingCriteriaCodeType }
     */
    public PackingCriteriaCodeType createPackingCriteriaCodeType() {
        return new PackingCriteriaCodeType();
    }

    /**
     * Create an instance of {@link PackingMaterialType }
     */
    public PackingMaterialType createPackingMaterialType() {
        return new PackingMaterialType();
    }

    /**
     * Create an instance of {@link PackLevelCodeType }
     */
    public PackLevelCodeType createPackLevelCodeType() {
        return new PackLevelCodeType();
    }

    /**
     * Create an instance of {@link PackQuantityType }
     */
    public PackQuantityType createPackQuantityType() {
        return new PackQuantityType();
    }

    /**
     * Create an instance of {@link PackSizeNumericType }
     */
    public PackSizeNumericType createPackSizeNumericType() {
        return new PackSizeNumericType();
    }

    /**
     * Create an instance of {@link PaidAmountType }
     */
    public PaidAmountType createPaidAmountType() {
        return new PaidAmountType();
    }

    /**
     * Create an instance of {@link PaidDateType }
     */
    public PaidDateType createPaidDateType() {
        return new PaidDateType();
    }

    /**
     * Create an instance of {@link PaidTimeType }
     */
    public PaidTimeType createPaidTimeType() {
        return new PaidTimeType();
    }

    /**
     * Create an instance of {@link ParentDocumentIDType }
     */
    public ParentDocumentIDType createParentDocumentIDType() {
        return new ParentDocumentIDType();
    }

    /**
     * Create an instance of {@link ParentDocumentTypeCodeType }
     */
    public ParentDocumentTypeCodeType createParentDocumentTypeCodeType() {
        return new ParentDocumentTypeCodeType();
    }

    /**
     * Create an instance of {@link PartialDeliveryIndicatorType }
     */
    public PartialDeliveryIndicatorType createPartialDeliveryIndicatorType() {
        return new PartialDeliveryIndicatorType();
    }

    /**
     * Create an instance of {@link PayableAmountType }
     */
    public PayableAmountType createPayableAmountType() {
        return new PayableAmountType();
    }

    /**
     * Create an instance of {@link PayableRoundingAmountType }
     */
    public PayableRoundingAmountType createPayableRoundingAmountType() {
        return new PayableRoundingAmountType();
    }

    /**
     * Create an instance of {@link PayerReferenceType }
     */
    public PayerReferenceType createPayerReferenceType() {
        return new PayerReferenceType();
    }

    /**
     * Create an instance of {@link PaymentAlternativeCurrencyCodeType }
     */
    public PaymentAlternativeCurrencyCodeType createPaymentAlternativeCurrencyCodeType() {
        return new PaymentAlternativeCurrencyCodeType();
    }

    /**
     * Create an instance of {@link PaymentAmountType }
     */
    public PaymentAmountType createPaymentAmountType() {
        return new PaymentAmountType();
    }

    /**
     * Create an instance of {@link PaymentChannelCodeType }
     */
    public PaymentChannelCodeType createPaymentChannelCodeType() {
        return new PaymentChannelCodeType();
    }

    /**
     * Create an instance of {@link PaymentCurrencyCodeType }
     */
    public PaymentCurrencyCodeType createPaymentCurrencyCodeType() {
        return new PaymentCurrencyCodeType();
    }

    /**
     * Create an instance of {@link PaymentDueDateType }
     */
    public PaymentDueDateType createPaymentDueDateType() {
        return new PaymentDueDateType();
    }

    /**
     * Create an instance of {@link PaymentIDType }
     */
    public PaymentIDType createPaymentIDType() {
        return new PaymentIDType();
    }

    /**
     * Create an instance of {@link PaymentMeansCodeTypeCommBas }
     */
    public PaymentMeansCodeTypeCommBas createPaymentMeansCodeTypeCommBas() {
        return new PaymentMeansCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link PaymentMeansIDType }
     */
    public PaymentMeansIDType createPaymentMeansIDType() {
        return new PaymentMeansIDType();
    }

    /**
     * Create an instance of {@link PaymentNoteType }
     */
    public PaymentNoteType createPaymentNoteType() {
        return new PaymentNoteType();
    }

    /**
     * Create an instance of {@link PaymentOrderReferenceType }
     */
    public PaymentOrderReferenceType createPaymentOrderReferenceType() {
        return new PaymentOrderReferenceType();
    }

    /**
     * Create an instance of {@link PenaltySurchargePercentType }
     */
    public PenaltySurchargePercentType createPenaltySurchargePercentType() {
        return new PenaltySurchargePercentType();
    }

    /**
     * Create an instance of {@link PercentType }
     */
    public PercentType createPercentType() {
        return new PercentType();
    }

    /**
     * Create an instance of {@link PerUnitAmountType }
     */
    public PerUnitAmountType createPerUnitAmountType() {
        return new PerUnitAmountType();
    }

    /**
     * Create an instance of {@link PlacardEndorsementType }
     */
    public PlacardEndorsementType createPlacardEndorsementType() {
        return new PlacardEndorsementType();
    }

    /**
     * Create an instance of {@link PlacardNotationType }
     */
    public PlacardNotationType createPlacardNotationType() {
        return new PlacardNotationType();
    }

    /**
     * Create an instance of {@link PlotIdentificationType }
     */
    public PlotIdentificationType createPlotIdentificationType() {
        return new PlotIdentificationType();
    }

    /**
     * Create an instance of {@link PositionCodeType }
     */
    public PositionCodeType createPositionCodeType() {
        return new PositionCodeType();
    }

    /**
     * Create an instance of {@link PostalZoneType }
     */
    public PostalZoneType createPostalZoneType() {
        return new PostalZoneType();
    }

    /**
     * Create an instance of {@link PostboxType }
     */
    public PostboxType createPostboxType() {
        return new PostboxType();
    }

    /**
     * Create an instance of {@link PreCarriageIndicatorType }
     */
    public PreCarriageIndicatorType createPreCarriageIndicatorType() {
        return new PreCarriageIndicatorType();
    }

    /**
     * Create an instance of {@link PreferenceCriterionCodeType }
     */
    public PreferenceCriterionCodeType createPreferenceCriterionCodeType() {
        return new PreferenceCriterionCodeType();
    }

    /**
     * Create an instance of {@link PrepaidAmountType }
     */
    public PrepaidAmountType createPrepaidAmountType() {
        return new PrepaidAmountType();
    }

    /**
     * Create an instance of {@link PrepaidIndicatorType }
     */
    public PrepaidIndicatorType createPrepaidIndicatorType() {
        return new PrepaidIndicatorType();
    }

    /**
     * Create an instance of {@link PrepaidPaymentReferenceIDType }
     */
    public PrepaidPaymentReferenceIDType createPrepaidPaymentReferenceIDType() {
        return new PrepaidPaymentReferenceIDType();
    }

    /**
     * Create an instance of {@link PreviousJobIDType }
     */
    public PreviousJobIDType createPreviousJobIDType() {
        return new PreviousJobIDType();
    }

    /**
     * Create an instance of {@link PreviousVersionIDType }
     */
    public PreviousVersionIDType createPreviousVersionIDType() {
        return new PreviousVersionIDType();
    }

    /**
     * Create an instance of {@link PriceAmountType }
     */
    public PriceAmountType createPriceAmountType() {
        return new PriceAmountType();
    }

    /**
     * Create an instance of {@link PriceChangeReasonType }
     */
    public PriceChangeReasonType createPriceChangeReasonType() {
        return new PriceChangeReasonType();
    }

    /**
     * Create an instance of {@link PriceTypeType }
     */
    public PriceTypeType createPriceTypeType() {
        return new PriceTypeType();
    }

    /**
     * Create an instance of {@link PriceTypeCodeType }
     */
    public PriceTypeCodeType createPriceTypeCodeType() {
        return new PriceTypeCodeType();
    }

    /**
     * Create an instance of {@link PricingCurrencyCodeType }
     */
    public PricingCurrencyCodeType createPricingCurrencyCodeType() {
        return new PricingCurrencyCodeType();
    }

    /**
     * Create an instance of {@link PricingUpdateRequestIndicatorType }
     */
    public PricingUpdateRequestIndicatorType createPricingUpdateRequestIndicatorType() {
        return new PricingUpdateRequestIndicatorType();
    }

    /**
     * Create an instance of {@link PrimaryAccountNumberIDType }
     */
    public PrimaryAccountNumberIDType createPrimaryAccountNumberIDType() {
        return new PrimaryAccountNumberIDType();
    }

    /**
     * Create an instance of {@link PrintQualifierType }
     */
    public PrintQualifierType createPrintQualifierType() {
        return new PrintQualifierType();
    }

    /**
     * Create an instance of {@link PriorityType }
     */
    public PriorityType createPriorityType() {
        return new PriorityType();
    }

    /**
     * Create an instance of {@link ProductTraceIDType }
     */
    public ProductTraceIDType createProductTraceIDType() {
        return new ProductTraceIDType();
    }

    /**
     * Create an instance of {@link ProfileIDType }
     */
    public ProfileIDType createProfileIDType() {
        return new ProfileIDType();
    }

    /**
     * Create an instance of {@link ProviderTypeCodeType }
     */
    public ProviderTypeCodeType createProviderTypeCodeType() {
        return new ProviderTypeCodeType();
    }

    /**
     * Create an instance of {@link QualifierType }
     */
    public QualifierType createQualifierType() {
        return new QualifierType();
    }

    /**
     * Create an instance of {@link QuantityTypeCommBas }
     */
    public QuantityTypeCommBas createQuantityTypeCommBas() {
        return new QuantityTypeCommBas();
    }

    /**
     * Create an instance of {@link RailCarIDType }
     */
    public RailCarIDType createRailCarIDType() {
        return new RailCarIDType();
    }

    /**
     * Create an instance of {@link ReasonType }
     */
    public ReasonType createReasonType() {
        return new ReasonType();
    }

    /**
     * Create an instance of {@link ReceivedDateType }
     */
    public ReceivedDateType createReceivedDateType() {
        return new ReceivedDateType();
    }

    /**
     * Create an instance of {@link ReceivedQuantityType }
     */
    public ReceivedQuantityType createReceivedQuantityType() {
        return new ReceivedQuantityType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link ReferenceDateType }
     */
    public ReferenceDateType createReferenceDateType() {
        return new ReferenceDateType();
    }

    /**
     * Create an instance of {@link ReferenceEventCodeType }
     */
    public ReferenceEventCodeType createReferenceEventCodeType() {
        return new ReferenceEventCodeType();
    }

    /**
     * Create an instance of {@link ReferenceIDType }
     */
    public ReferenceIDType createReferenceIDType() {
        return new ReferenceIDType();
    }

    /**
     * Create an instance of {@link ReferenceTimeType }
     */
    public ReferenceTimeType createReferenceTimeType() {
        return new ReferenceTimeType();
    }

    /**
     * Create an instance of {@link RefrigerationOnIndicatorType }
     */
    public RefrigerationOnIndicatorType createRefrigerationOnIndicatorType() {
        return new RefrigerationOnIndicatorType();
    }

    /**
     * Create an instance of {@link RegionType }
     */
    public RegionType createRegionType() {
        return new RegionType();
    }

    /**
     * Create an instance of {@link RegistrationIDType }
     */
    public RegistrationIDType createRegistrationIDType() {
        return new RegistrationIDType();
    }

    /**
     * Create an instance of {@link RegistrationNameType }
     */
    public RegistrationNameType createRegistrationNameType() {
        return new RegistrationNameType();
    }

    /**
     * Create an instance of {@link RegistrationNationalityType }
     */
    public RegistrationNationalityType createRegistrationNationalityType() {
        return new RegistrationNationalityType();
    }

    /**
     * Create an instance of {@link RegistrationNationalityIDType }
     */
    public RegistrationNationalityIDType createRegistrationNationalityIDType() {
        return new RegistrationNationalityIDType();
    }

    /**
     * Create an instance of {@link RejectActionCodeType }
     */
    public RejectActionCodeType createRejectActionCodeType() {
        return new RejectActionCodeType();
    }

    /**
     * Create an instance of {@link RejectedQuantityType }
     */
    public RejectedQuantityType createRejectedQuantityType() {
        return new RejectedQuantityType();
    }

    /**
     * Create an instance of {@link RejectionNoteType }
     */
    public RejectionNoteType createRejectionNoteType() {
        return new RejectionNoteType();
    }

    /**
     * Create an instance of {@link RejectReasonType }
     */
    public RejectReasonType createRejectReasonType() {
        return new RejectReasonType();
    }

    /**
     * Create an instance of {@link RejectReasonCodeType }
     */
    public RejectReasonCodeType createRejectReasonCodeType() {
        return new RejectReasonCodeType();
    }

    /**
     * Create an instance of {@link RemarksType }
     */
    public RemarksType createRemarksType() {
        return new RemarksType();
    }

    /**
     * Create an instance of {@link ReminderSequenceNumericType }
     */
    public ReminderSequenceNumericType createReminderSequenceNumericType() {
        return new ReminderSequenceNumericType();
    }

    /**
     * Create an instance of {@link ReminderTypeCodeType }
     */
    public ReminderTypeCodeType createReminderTypeCodeType() {
        return new ReminderTypeCodeType();
    }

    /**
     * Create an instance of {@link RequestedDespatchDateType }
     */
    public RequestedDespatchDateType createRequestedDespatchDateType() {
        return new RequestedDespatchDateType();
    }

    /**
     * Create an instance of {@link RequestedDespatchTimeType }
     */
    public RequestedDespatchTimeType createRequestedDespatchTimeType() {
        return new RequestedDespatchTimeType();
    }

    /**
     * Create an instance of {@link RequestedInvoiceCurrencyCodeType }
     */
    public RequestedInvoiceCurrencyCodeType createRequestedInvoiceCurrencyCodeType() {
        return new RequestedInvoiceCurrencyCodeType();
    }

    /**
     * Create an instance of {@link RequiredCustomsIDType }
     */
    public RequiredCustomsIDType createRequiredCustomsIDType() {
        return new RequiredCustomsIDType();
    }

    /**
     * Create an instance of {@link ResponseCodeType }
     */
    public ResponseCodeType createResponseCodeType() {
        return new ResponseCodeType();
    }

    /**
     * Create an instance of {@link ResponseDateType }
     */
    public ResponseDateType createResponseDateType() {
        return new ResponseDateType();
    }

    /**
     * Create an instance of {@link ResponseTimeType }
     */
    public ResponseTimeType createResponseTimeType() {
        return new ResponseTimeType();
    }

    /**
     * Create an instance of {@link ReturnabilityIndicatorType }
     */
    public ReturnabilityIndicatorType createReturnabilityIndicatorType() {
        return new ReturnabilityIndicatorType();
    }

    /**
     * Create an instance of {@link ReturnableMaterialIndicatorType }
     */
    public ReturnableMaterialIndicatorType createReturnableMaterialIndicatorType() {
        return new ReturnableMaterialIndicatorType();
    }

    /**
     * Create an instance of {@link RevisionDateType }
     */
    public RevisionDateType createRevisionDateType() {
        return new RevisionDateType();
    }

    /**
     * Create an instance of {@link RevisionTimeType }
     */
    public RevisionTimeType createRevisionTimeType() {
        return new RevisionTimeType();
    }

    /**
     * Create an instance of {@link RoleCodeType }
     */
    public RoleCodeType createRoleCodeType() {
        return new RoleCodeType();
    }

    /**
     * Create an instance of {@link RoomType }
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link RoundingAmountType }
     */
    public RoundingAmountType createRoundingAmountType() {
        return new RoundingAmountType();
    }

    /**
     * Create an instance of {@link SalesOrderIDType }
     */
    public SalesOrderIDType createSalesOrderIDType() {
        return new SalesOrderIDType();
    }

    /**
     * Create an instance of {@link SalesOrderLineIDType }
     */
    public SalesOrderLineIDType createSalesOrderLineIDType() {
        return new SalesOrderLineIDType();
    }

    /**
     * Create an instance of {@link SchemeURIType }
     */
    public SchemeURIType createSchemeURIType() {
        return new SchemeURIType();
    }

    /**
     * Create an instance of {@link SealingPartyTypeType }
     */
    public SealingPartyTypeType createSealingPartyTypeType() {
        return new SealingPartyTypeType();
    }

    /**
     * Create an instance of {@link SealIssuerTypeCodeType }
     */
    public SealIssuerTypeCodeType createSealIssuerTypeCodeType() {
        return new SealIssuerTypeCodeType();
    }

    /**
     * Create an instance of {@link SealStatusCodeType }
     */
    public SealStatusCodeType createSealStatusCodeType() {
        return new SealStatusCodeType();
    }

    /**
     * Create an instance of {@link SequenceIDType }
     */
    public SequenceIDType createSequenceIDType() {
        return new SequenceIDType();
    }

    /**
     * Create an instance of {@link SequenceNumberIDType }
     */
    public SequenceNumberIDType createSequenceNumberIDType() {
        return new SequenceNumberIDType();
    }

    /**
     * Create an instance of {@link SequenceNumericType }
     */
    public SequenceNumericType createSequenceNumericType() {
        return new SequenceNumericType();
    }

    /**
     * Create an instance of {@link SerialIDType }
     */
    public SerialIDType createSerialIDType() {
        return new SerialIDType();
    }

    /**
     * Create an instance of {@link SettlementDiscountPercentType }
     */
    public SettlementDiscountPercentType createSettlementDiscountPercentType() {
        return new SettlementDiscountPercentType();
    }

    /**
     * Create an instance of {@link ShippingMarksType }
     */
    public ShippingMarksType createShippingMarksType() {
        return new ShippingMarksType();
    }

    /**
     * Create an instance of {@link ShippingOrderIDType }
     */
    public ShippingOrderIDType createShippingOrderIDType() {
        return new ShippingOrderIDType();
    }

    /**
     * Create an instance of {@link ShippingPriorityLevelCodeType }
     */
    public ShippingPriorityLevelCodeType createShippingPriorityLevelCodeType() {
        return new ShippingPriorityLevelCodeType();
    }

    /**
     * Create an instance of {@link ShortageActionCodeType }
     */
    public ShortageActionCodeType createShortageActionCodeType() {
        return new ShortageActionCodeType();
    }

    /**
     * Create an instance of {@link ShortQuantityType }
     */
    public ShortQuantityType createShortQuantityType() {
        return new ShortQuantityType();
    }

    /**
     * Create an instance of {@link SignatureMethodType }
     */
    public SignatureMethodType createSignatureMethodType() {
        return new SignatureMethodType();
    }

    /**
     * Create an instance of {@link SizeTypeCodeType }
     */
    public SizeTypeCodeType createSizeTypeCodeType() {
        return new SizeTypeCodeType();
    }

    /**
     * Create an instance of {@link SourceCurrencyBaseRateType }
     */
    public SourceCurrencyBaseRateType createSourceCurrencyBaseRateType() {
        return new SourceCurrencyBaseRateType();
    }

    /**
     * Create an instance of {@link SourceCurrencyCodeType }
     */
    public SourceCurrencyCodeType createSourceCurrencyCodeType() {
        return new SourceCurrencyCodeType();
    }

    /**
     * Create an instance of {@link SpecialInstructionsType }
     */
    public SpecialInstructionsType createSpecialInstructionsType() {
        return new SpecialInstructionsType();
    }

    /**
     * Create an instance of {@link SpecialTermsType }
     */
    public SpecialTermsType createSpecialTermsType() {
        return new SpecialTermsType();
    }

    /**
     * Create an instance of {@link SplitConsignmentIndicatorType }
     */
    public SplitConsignmentIndicatorType createSplitConsignmentIndicatorType() {
        return new SplitConsignmentIndicatorType();
    }

    /**
     * Create an instance of {@link StartDateType }
     */
    public StartDateType createStartDateType() {
        return new StartDateType();
    }

    /**
     * Create an instance of {@link StartTimeType }
     */
    public StartTimeType createStartTimeType() {
        return new StartTimeType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link StatusReasonType }
     */
    public StatusReasonType createStatusReasonType() {
        return new StatusReasonType();
    }

    /**
     * Create an instance of {@link StatusReasonCodeType }
     */
    public StatusReasonCodeType createStatusReasonCodeType() {
        return new StatusReasonCodeType();
    }

    /**
     * Create an instance of {@link StreetNameType }
     */
    public StreetNameType createStreetNameType() {
        return new StreetNameType();
    }

    /**
     * Create an instance of {@link SubstitutionStatusCodeTypeCommBas }
     */
    public SubstitutionStatusCodeTypeCommBas createSubstitutionStatusCodeTypeCommBas() {
        return new SubstitutionStatusCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link SummaryDescriptionType }
     */
    public SummaryDescriptionType createSummaryDescriptionType() {
        return new SummaryDescriptionType();
    }

    /**
     * Create an instance of {@link SupplierAssignedAccountIDType }
     */
    public SupplierAssignedAccountIDType createSupplierAssignedAccountIDType() {
        return new SupplierAssignedAccountIDType();
    }

    /**
     * Create an instance of {@link SurchargePercentType }
     */
    public SurchargePercentType createSurchargePercentType() {
        return new SurchargePercentType();
    }

    /**
     * Create an instance of {@link TargetCurrencyBaseRateType }
     */
    public TargetCurrencyBaseRateType createTargetCurrencyBaseRateType() {
        return new TargetCurrencyBaseRateType();
    }

    /**
     * Create an instance of {@link TargetCurrencyCodeType }
     */
    public TargetCurrencyCodeType createTargetCurrencyCodeType() {
        return new TargetCurrencyCodeType();
    }

    /**
     * Create an instance of {@link TariffClassCodeType }
     */
    public TariffClassCodeType createTariffClassCodeType() {
        return new TariffClassCodeType();
    }

    /**
     * Create an instance of {@link TariffCodeType }
     */
    public TariffCodeType createTariffCodeType() {
        return new TariffCodeType();
    }

    /**
     * Create an instance of {@link TariffDescriptionType }
     */
    public TariffDescriptionType createTariffDescriptionType() {
        return new TariffDescriptionType();
    }

    /**
     * Create an instance of {@link TaxableAmountType }
     */
    public TaxableAmountType createTaxableAmountType() {
        return new TaxableAmountType();
    }

    /**
     * Create an instance of {@link TaxAmountType }
     */
    public TaxAmountType createTaxAmountType() {
        return new TaxAmountType();
    }

    /**
     * Create an instance of {@link TaxCurrencyCodeType }
     */
    public TaxCurrencyCodeType createTaxCurrencyCodeType() {
        return new TaxCurrencyCodeType();
    }

    /**
     * Create an instance of {@link TaxEvidenceIndicatorType }
     */
    public TaxEvidenceIndicatorType createTaxEvidenceIndicatorType() {
        return new TaxEvidenceIndicatorType();
    }

    /**
     * Create an instance of {@link TaxExclusiveAmountType }
     */
    public TaxExclusiveAmountType createTaxExclusiveAmountType() {
        return new TaxExclusiveAmountType();
    }

    /**
     * Create an instance of {@link TaxExemptionReasonType }
     */
    public TaxExemptionReasonType createTaxExemptionReasonType() {
        return new TaxExemptionReasonType();
    }

    /**
     * Create an instance of {@link TaxExemptionReasonCodeType }
     */
    public TaxExemptionReasonCodeType createTaxExemptionReasonCodeType() {
        return new TaxExemptionReasonCodeType();
    }

    /**
     * Create an instance of {@link TaxInclusiveAmountType }
     */
    public TaxInclusiveAmountType createTaxInclusiveAmountType() {
        return new TaxInclusiveAmountType();
    }

    /**
     * Create an instance of {@link TaxLevelCodeType }
     */
    public TaxLevelCodeType createTaxLevelCodeType() {
        return new TaxLevelCodeType();
    }

    /**
     * Create an instance of {@link TaxPointDateType }
     */
    public TaxPointDateType createTaxPointDateType() {
        return new TaxPointDateType();
    }

    /**
     * Create an instance of {@link TaxTypeCodeType }
     */
    public TaxTypeCodeType createTaxTypeCodeType() {
        return new TaxTypeCodeType();
    }

    /**
     * Create an instance of {@link TechnicalNameType }
     */
    public TechnicalNameType createTechnicalNameType() {
        return new TechnicalNameType();
    }

    /**
     * Create an instance of {@link TelefaxType }
     */
    public TelefaxType createTelefaxType() {
        return new TelefaxType();
    }

    /**
     * Create an instance of {@link TelephoneType }
     */
    public TelephoneType createTelephoneType() {
        return new TelephoneType();
    }

    /**
     * Create an instance of {@link TermsType }
     */
    public TermsType createTermsType() {
        return new TermsType();
    }

    /**
     * Create an instance of {@link TextType }
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link TierRangeType }
     */
    public TierRangeType createTierRangeType() {
        return new TierRangeType();
    }

    /**
     * Create an instance of {@link TierRatePercentType }
     */
    public TierRatePercentType createTierRatePercentType() {
        return new TierRatePercentType();
    }

    /**
     * Create an instance of {@link TimeType }
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link TimezoneOffsetType }
     */
    public TimezoneOffsetType createTimezoneOffsetType() {
        return new TimezoneOffsetType();
    }

    /**
     * Create an instance of {@link TimingComplaintType }
     */
    public TimingComplaintType createTimingComplaintType() {
        return new TimingComplaintType();
    }

    /**
     * Create an instance of {@link TimingComplaintCodeType }
     */
    public TimingComplaintCodeType createTimingComplaintCodeType() {
        return new TimingComplaintCodeType();
    }

    /**
     * Create an instance of {@link TitleType }
     */
    public TitleType createTitleType() {
        return new TitleType();
    }

    /**
     * Create an instance of {@link ToOrderIndicatorType }
     */
    public ToOrderIndicatorType createToOrderIndicatorType() {
        return new ToOrderIndicatorType();
    }

    /**
     * Create an instance of {@link TotalBalanceAmountType }
     */
    public TotalBalanceAmountType createTotalBalanceAmountType() {
        return new TotalBalanceAmountType();
    }

    /**
     * Create an instance of {@link TotalCreditAmountType }
     */
    public TotalCreditAmountType createTotalCreditAmountType() {
        return new TotalCreditAmountType();
    }

    /**
     * Create an instance of {@link TotalDebitAmountType }
     */
    public TotalDebitAmountType createTotalDebitAmountType() {
        return new TotalDebitAmountType();
    }

    /**
     * Create an instance of {@link TotalGoodsItemQuantityType }
     */
    public TotalGoodsItemQuantityType createTotalGoodsItemQuantityType() {
        return new TotalGoodsItemQuantityType();
    }

    /**
     * Create an instance of {@link TotalInvoiceAmountType }
     */
    public TotalInvoiceAmountType createTotalInvoiceAmountType() {
        return new TotalInvoiceAmountType();
    }

    /**
     * Create an instance of {@link TotalPackageQuantityType }
     */
    public TotalPackageQuantityType createTotalPackageQuantityType() {
        return new TotalPackageQuantityType();
    }

    /**
     * Create an instance of {@link TotalPackagesQuantityType }
     */
    public TotalPackagesQuantityType createTotalPackagesQuantityType() {
        return new TotalPackagesQuantityType();
    }

    /**
     * Create an instance of {@link TotalPaymentAmountType }
     */
    public TotalPaymentAmountType createTotalPaymentAmountType() {
        return new TotalPaymentAmountType();
    }

    /**
     * Create an instance of {@link TotalTaxAmountType }
     */
    public TotalTaxAmountType createTotalTaxAmountType() {
        return new TotalTaxAmountType();
    }

    /**
     * Create an instance of {@link TotalTransportHandlingUnitQuantityType }
     */
    public TotalTransportHandlingUnitQuantityType createTotalTransportHandlingUnitQuantityType() {
        return new TotalTransportHandlingUnitQuantityType();
    }

    /**
     * Create an instance of {@link TrackingIDType }
     */
    public TrackingIDType createTrackingIDType() {
        return new TrackingIDType();
    }

    /**
     * Create an instance of {@link TradingRestrictionsType }
     */
    public TradingRestrictionsType createTradingRestrictionsType() {
        return new TradingRestrictionsType();
    }

    /**
     * Create an instance of {@link TrainIDType }
     */
    public TrainIDType createTrainIDType() {
        return new TrainIDType();
    }

    /**
     * Create an instance of {@link TransactionCurrencyTaxAmountType }
     */
    public TransactionCurrencyTaxAmountType createTransactionCurrencyTaxAmountType() {
        return new TransactionCurrencyTaxAmountType();
    }

    /**
     * Create an instance of {@link TransitDirectionCodeType }
     */
    public TransitDirectionCodeType createTransitDirectionCodeType() {
        return new TransitDirectionCodeType();
    }

    /**
     * Create an instance of {@link TransportAuthorizationCodeType }
     */
    public TransportAuthorizationCodeType createTransportAuthorizationCodeType() {
        return new TransportAuthorizationCodeType();
    }

    /**
     * Create an instance of {@link TransportEmergencyCardCodeType }
     */
    public TransportEmergencyCardCodeType createTransportEmergencyCardCodeType() {
        return new TransportEmergencyCardCodeType();
    }

    /**
     * Create an instance of {@link TransportEquipmentTypeCodeTypeCommBas }
     */
    public TransportEquipmentTypeCodeTypeCommBas createTransportEquipmentTypeCodeTypeCommBas() {
        return new TransportEquipmentTypeCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link TransportEventTypeCodeType }
     */
    public TransportEventTypeCodeType createTransportEventTypeCodeType() {
        return new TransportEventTypeCodeType();
    }

    /**
     * Create an instance of {@link TransportHandlingUnitQuantityType }
     */
    public TransportHandlingUnitQuantityType createTransportHandlingUnitQuantityType() {
        return new TransportHandlingUnitQuantityType();
    }

    /**
     * Create an instance of {@link TransportHandlingUnitTypeCodeType }
     */
    public TransportHandlingUnitTypeCodeType createTransportHandlingUnitTypeCodeType() {
        return new TransportHandlingUnitTypeCodeType();
    }

    /**
     * Create an instance of {@link TransportMeansTypeCodeType }
     */
    public TransportMeansTypeCodeType createTransportMeansTypeCodeType() {
        return new TransportMeansTypeCodeType();
    }

    /**
     * Create an instance of {@link TransportModeCodeTypeCommBas }
     */
    public TransportModeCodeTypeCommBas createTransportModeCodeTypeCommBas() {
        return new TransportModeCodeTypeCommBas();
    }

    /**
     * Create an instance of {@link TransportServiceCodeType }
     */
    public TransportServiceCodeType createTransportServiceCodeType() {
        return new TransportServiceCodeType();
    }

    /**
     * Create an instance of {@link UBLVersionIDType }
     */
    public UBLVersionIDType createUBLVersionIDType() {
        return new UBLVersionIDType();
    }

    /**
     * Create an instance of {@link UNDGCodeType }
     */
    public UNDGCodeType createUNDGCodeType() {
        return new UNDGCodeType();
    }

    /**
     * Create an instance of {@link UnitType }
     */
    public UnitType createUnitType() {
        return new UnitType();
    }

    /**
     * Create an instance of {@link UnitQuantityType }
     */
    public UnitQuantityType createUnitQuantityType() {
        return new UnitQuantityType();
    }

    /**
     * Create an instance of {@link UpperOrangeHazardPlacardIDType }
     */
    public UpperOrangeHazardPlacardIDType createUpperOrangeHazardPlacardIDType() {
        return new UpperOrangeHazardPlacardIDType();
    }

    /**
     * Create an instance of {@link URIType }
     */
    public URIType createURIType() {
        return new URIType();
    }

    /**
     * Create an instance of {@link UUIDType }
     */
    public UUIDType createUUIDType() {
        return new UUIDType();
    }

    /**
     * Create an instance of {@link ValidationDateType }
     */
    public ValidationDateType createValidationDateType() {
        return new ValidationDateType();
    }

    /**
     * Create an instance of {@link ValidationTimeType }
     */
    public ValidationTimeType createValidationTimeType() {
        return new ValidationTimeType();
    }

    /**
     * Create an instance of {@link ValidatorIDType }
     */
    public ValidatorIDType createValidatorIDType() {
        return new ValidatorIDType();
    }

    /**
     * Create an instance of {@link ValidityStartDateType }
     */
    public ValidityStartDateType createValidityStartDateType() {
        return new ValidityStartDateType();
    }

    /**
     * Create an instance of {@link ValueType }
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link ValueAmountType }
     */
    public ValueAmountType createValueAmountType() {
        return new ValueAmountType();
    }

    /**
     * Create an instance of {@link VersionIDType }
     */
    public VersionIDType createVersionIDType() {
        return new VersionIDType();
    }

    /**
     * Create an instance of {@link VesselIDType }
     */
    public VesselIDType createVesselIDType() {
        return new VesselIDType();
    }

    /**
     * Create an instance of {@link VesselNameType }
     */
    public VesselNameType createVesselNameType() {
        return new VesselNameType();
    }

    /**
     * Create an instance of {@link VolumeMeasureType }
     */
    public VolumeMeasureType createVolumeMeasureType() {
        return new VolumeMeasureType();
    }

    /**
     * Create an instance of {@link WarrantyInformationType }
     */
    public WarrantyInformationType createWarrantyInformationType() {
        return new WarrantyInformationType();
    }

    /**
     * Create an instance of {@link WebsiteURIType }
     */
    public WebsiteURIType createWebsiteURIType() {
        return new WebsiteURIType();
    }

    /**
     * Create an instance of {@link WeightMeasureType }
     */
    public WeightMeasureType createWeightMeasureType() {
        return new WeightMeasureType();
    }

    /**
     * Create an instance of {@link XPathType }
     */
    public XPathType createXPathType() {
        return new XPathType();
    }

    /**
     * Create an instance of {@link ZoneType }
     */
    public ZoneType createZoneType() {
        return new ZoneType();
    }

    /**
     * Create an instance of {@link AmountType }
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link BinaryObjectType }
     */
    public BinaryObjectType createBinaryObjectType() {
        return new BinaryObjectType();
    }

    /**
     * Create an instance of {@link GraphicType }
     */
    public GraphicType createGraphicType() {
        return new GraphicType();
    }

    /**
     * Create an instance of {@link PictureType }
     */
    public PictureType createPictureType() {
        return new PictureType();
    }

    /**
     * Create an instance of {@link SoundType }
     */
    public SoundType createSoundType() {
        return new SoundType();
    }

    /**
     * Create an instance of {@link VideoType }
     */
    public VideoType createVideoType() {
        return new VideoType();
    }

    /**
     * Create an instance of {@link MeasureType }
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link QuantityType }
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link NameType }
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link AllowanceChargeReasonCodeType }
     */
    public AllowanceChargeReasonCodeType createAllowanceChargeReasonCodeType() {
        return new AllowanceChargeReasonCodeType();
    }

    /**
     * Create an instance of {@link ChannelCodeType }
     */
    public ChannelCodeType createChannelCodeType() {
        return new ChannelCodeType();
    }

    /**
     * Create an instance of {@link ChipCodeType }
     */
    public ChipCodeType createChipCodeType() {
        return new ChipCodeType();
    }

    /**
     * Create an instance of {@link ContainerSizeTypeCodeType }
     */
    public ContainerSizeTypeCodeType createContainerSizeTypeCodeType() {
        return new ContainerSizeTypeCodeType();
    }

    /**
     * Create an instance of {@link CountryIdentificationCodeType }
     */
    public CountryIdentificationCodeType createCountryIdentificationCodeType() {
        return new CountryIdentificationCodeType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link DocumentStatusCodeType }
     */
    public DocumentStatusCodeType createDocumentStatusCodeType() {
        return new DocumentStatusCodeType();
    }

    /**
     * Create an instance of {@link LatitudeDirectionCodeType }
     */
    public LatitudeDirectionCodeType createLatitudeDirectionCodeType() {
        return new LatitudeDirectionCodeType();
    }

    /**
     * Create an instance of {@link LineStatusCodeType }
     */
    public LineStatusCodeType createLineStatusCodeType() {
        return new LineStatusCodeType();
    }

    /**
     * Create an instance of {@link LongitudeDirectionCodeType }
     */
    public LongitudeDirectionCodeType createLongitudeDirectionCodeType() {
        return new LongitudeDirectionCodeType();
    }

    /**
     * Create an instance of {@link OperatorCodeType }
     */
    public OperatorCodeType createOperatorCodeType() {
        return new OperatorCodeType();
    }

    /**
     * Create an instance of {@link PackagingTypeCodeType }
     */
    public PackagingTypeCodeType createPackagingTypeCodeType() {
        return new PackagingTypeCodeType();
    }

    /**
     * Create an instance of {@link PaymentMeansCodeType }
     */
    public PaymentMeansCodeType createPaymentMeansCodeType() {
        return new PaymentMeansCodeType();
    }

    /**
     * Create an instance of {@link PortCodeType }
     */
    public PortCodeType createPortCodeType() {
        return new PortCodeType();
    }

    /**
     * Create an instance of {@link SubstitutionStatusCodeType }
     */
    public SubstitutionStatusCodeType createSubstitutionStatusCodeType() {
        return new SubstitutionStatusCodeType();
    }

    /**
     * Create an instance of {@link TransportationStatusCodeType }
     */
    public TransportationStatusCodeType createTransportationStatusCodeType() {
        return new TransportationStatusCodeType();
    }

    /**
     * Create an instance of {@link TransportEquipmentTypeCodeType }
     */
    public TransportEquipmentTypeCodeType createTransportEquipmentTypeCodeType() {
        return new TransportEquipmentTypeCodeType();
    }

    /**
     * Create an instance of {@link TransportModeCodeType }
     */
    public TransportModeCodeType createTransportModeCodeType() {
        return new TransportModeCodeType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureCodeType }
     */
    public UnitOfMeasureCodeType createUnitOfMeasureCodeType() {
        return new UnitOfMeasureCodeType();
    }

    /**
     * Create an instance of {@link UBLExtensionsType }
     */
    public UBLExtensionsType createUBLExtensionsType() {
        return new UBLExtensionsType();
    }

    /**
     * Create an instance of {@link UBLExtensionType }
     */
    public UBLExtensionType createUBLExtensionType() {
        return new UBLExtensionType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyIDType }
     */
    public ExtensionAgencyIDType createExtensionAgencyIDType() {
        return new ExtensionAgencyIDType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyNameType }
     */
    public ExtensionAgencyNameType createExtensionAgencyNameType() {
        return new ExtensionAgencyNameType();
    }

    /**
     * Create an instance of {@link ExtensionAgencyURIType }
     */
    public ExtensionAgencyURIType createExtensionAgencyURIType() {
        return new ExtensionAgencyURIType();
    }

    /**
     * Create an instance of {@link ExtensionContentType }
     */
    public ExtensionContentType createExtensionContentType() {
        return new ExtensionContentType();
    }

    /**
     * Create an instance of {@link ExtensionReasonType }
     */
    public ExtensionReasonType createExtensionReasonType() {
        return new ExtensionReasonType();
    }

    /**
     * Create an instance of {@link ExtensionReasonCodeType }
     */
    public ExtensionReasonCodeType createExtensionReasonCodeType() {
        return new ExtensionReasonCodeType();
    }

    /**
     * Create an instance of {@link ExtensionURIType }
     */
    public ExtensionURIType createExtensionURIType() {
        return new ExtensionURIType();
    }

    /**
     * Create an instance of {@link ExtensionVersionIDType }
     */
    public ExtensionVersionIDType createExtensionVersionIDType() {
        return new ExtensionVersionIDType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", name = "Invoice")
    public JAXBElement<InvoiceType> createInvoice(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_Invoice_QNAME, InvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryDocumentsLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SummaryDocumentsLine")
    public JAXBElement<SummaryDocumentsLineType> createSummaryDocumentsLine(SummaryDocumentsLineType value) {
        return new JAXBElement<SummaryDocumentsLineType>(_SummaryDocumentsLine_QNAME, SummaryDocumentsLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoidedDocumentsLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "VoidedDocumentsLine")
    public JAXBElement<VoidedDocumentsLineType> createVoidedDocumentsLine(VoidedDocumentsLineType value) {
        return new JAXBElement<VoidedDocumentsLineType>(_VoidedDocumentsLine_QNAME, VoidedDocumentsLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DocumentSerialID")
    public JAXBElement<IdentifierType> createDocumentSerialID(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_DocumentSerialID_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DocumentNumberID")
    public JAXBElement<IdentifierType> createDocumentNumberID(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_DocumentNumberID_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextTypeUnqDat }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "VoidReasonDescription")
    public JAXBElement<TextTypeUnqDat> createVoidReasonDescription(TextTypeUnqDat value) {
        return new JAXBElement<TextTypeUnqDat>(_VoidReasonDescription_QNAME, TextTypeUnqDat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "StartDocumentNumberID")
    public JAXBElement<IdentifierType> createStartDocumentNumberID(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_StartDocumentNumberID_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "EndDocumentNumberID")
    public JAXBElement<IdentifierType> createEndDocumentNumberID(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_EndDocumentNumberID_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "PeriodID")
    public JAXBElement<IdentifierType> createPeriodID(IdentifierType value) {
        return new JAXBElement<IdentifierType>(_PeriodID_QNAME, IdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "BillingPayment")
    public JAXBElement<PaymentType> createBillingPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_BillingPayment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInformationTypeSunatAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "AdditionalInformation")
    public JAXBElement<AdditionalInformationTypeSunatAgg> createAdditionalInformation(AdditionalInformationTypeSunatAgg value) {
        return new JAXBElement<AdditionalInformationTypeSunatAgg>(_AdditionalInformation_QNAME, AdditionalInformationTypeSunatAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalMonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "AdditionalMonetaryTotal")
    public JAXBElement<AdditionalMonetaryTotalType> createAdditionalMonetaryTotal(AdditionalMonetaryTotalType value) {
        return new JAXBElement<AdditionalMonetaryTotalType>(_AdditionalMonetaryTotal_QNAME, AdditionalMonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalPropertyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "AdditionalProperty")
    public JAXBElement<AdditionalPropertyType> createAdditionalProperty(AdditionalPropertyType value) {
        return new JAXBElement<AdditionalPropertyType>(_AdditionalProperty_QNAME, AdditionalPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "ReferenceAmount")
    public JAXBElement<AmountTypeCommBas> createReferenceAmount(AmountTypeCommBas value) {
        return new JAXBElement<AmountTypeCommBas>(_ReferenceAmount_QNAME, AmountTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "TotalAmount")
    public JAXBElement<AmountTypeCommBas> createTotalAmount(AmountTypeCommBas value) {
        return new JAXBElement<AmountTypeCommBas>(_TotalAmount_QNAME, AmountTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATTransactionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATTransaction")
    public JAXBElement<SUNATTransactionType> createSUNATTransaction(SUNATTransactionType value) {
        return new JAXBElement<SUNATTransactionType>(_SUNATTransaction_QNAME, SUNATTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATEmbededDespatchAdviceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATEmbededDespatchAdvice")
    public JAXBElement<SUNATEmbededDespatchAdviceType> createSUNATEmbededDespatchAdvice(SUNATEmbededDespatchAdviceType value) {
        return new JAXBElement<SUNATEmbededDespatchAdviceType>(_SUNATEmbededDespatchAdvice_QNAME, SUNATEmbededDespatchAdviceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATShipmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATShipment")
    public JAXBElement<SUNATShipmentType> createSUNATShipment(SUNATShipmentType value) {
        return new JAXBElement<SUNATShipmentType>(_SUNATShipment_QNAME, SUNATShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATShipmentStageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATShipmentStage")
    public JAXBElement<SUNATShipmentStageType> createSUNATShipmentStage(SUNATShipmentStageType value) {
        return new JAXBElement<SUNATShipmentStageType>(_SUNATShipmentStage_QNAME, SUNATShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATTransportMeansType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATTransportMeans")
    public JAXBElement<SUNATTransportMeansType> createSUNATTransportMeans(SUNATTransportMeansType value) {
        return new JAXBElement<SUNATTransportMeansType>(_SUNATTransportMeans_QNAME, SUNATTransportMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATRoadTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATRoadTransport")
    public JAXBElement<SUNATRoadTransportType> createSUNATRoadTransport(SUNATRoadTransportType value) {
        return new JAXBElement<SUNATRoadTransportType>(_SUNATRoadTransport_QNAME, SUNATRoadTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATDespatchLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATDespatchLine")
    public JAXBElement<SUNATDespatchLineType> createSUNATDespatchLine(SUNATDespatchLineType value) {
        return new JAXBElement<SUNATDespatchLineType>(_SUNATDespatchLine_QNAME, SUNATDespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DriverParty")
    public JAXBElement<DriverPartyType> createDriverParty(DriverPartyType value) {
        return new JAXBElement<DriverPartyType>(_DriverParty_QNAME, DriverPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATCarrierPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATCarrierParty")
    public JAXBElement<SUNATCarrierPartyType> createSUNATCarrierParty(SUNATCarrierPartyType value) {
        return new JAXBElement<SUNATCarrierPartyType>(_SUNATCarrierParty_QNAME, SUNATCarrierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "TransportReasonCode")
    public JAXBElement<CodeType> createTransportReasonCode(CodeType value) {
        return new JAXBElement<CodeType>(_TransportReasonCode_QNAME, CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SemiTrailer")
    public JAXBElement<RoadTransportType> createSemiTrailer(RoadTransportType value) {
        return new JAXBElement<RoadTransportType>(_SemiTrailer_QNAME, RoadTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryCarrierDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DeliveryCarrierDate")
    public JAXBElement<DeliveryCarrierDateType> createDeliveryCarrierDate(DeliveryCarrierDateType value) {
        return new JAXBElement<DeliveryCarrierDateType>(_DeliveryCarrierDate_QNAME, DeliveryCarrierDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DeliveryCarrierTime")
    public JAXBElement<DeliveryTimeType> createDeliveryCarrierTime(DeliveryTimeType value) {
        return new JAXBElement<DeliveryTimeType>(_DeliveryCarrierTime_QNAME, DeliveryTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "OriginalDespatchDocumentReference")
    public JAXBElement<DocumentReferenceType> createOriginalDespatchDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OriginalDespatchDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "DespatchChangeReason")
    public JAXBElement<IDType> createDespatchChangeReason(IDType value) {
        return new JAXBElement<IDType>(_DespatchChangeReason_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "OldOriginAddress")
    public JAXBElement<AddressType> createOldOriginAddress(AddressType value) {
        return new JAXBElement<AddressType>(_OldOriginAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "OldDeliveryAddress")
    public JAXBElement<AddressType> createOldDeliveryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_OldDeliveryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "OutsourcedIndicator")
    public JAXBElement<IndicatorType> createOutsourcedIndicator(IndicatorType value) {
        return new JAXBElement<IndicatorType>(_OutsourcedIndicator_QNAME, IndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "MultiStageIndicator")
    public JAXBElement<IndicatorType> createMultiStageIndicator(IndicatorType value) {
        return new JAXBElement<IndicatorType>(_MultiStageIndicator_QNAME, IndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "ShipmentStageTypeCode")
    public JAXBElement<IDType> createShipmentStageTypeCode(IDType value) {
        return new JAXBElement<IDType>(_ShipmentStageTypeCode_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SUNATFiscalPathType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATFiscalPath")
    public JAXBElement<SUNATFiscalPathType> createSUNATFiscalPath(SUNATFiscalPathType value) {
        return new JAXBElement<SUNATFiscalPathType>(_SUNATFiscalPath_QNAME, SUNATFiscalPathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", name = "SUNATVerificationCode")
    public JAXBElement<IDType> createSUNATVerificationCode(IDType value) {
        return new JAXBElement<IDType>(_SUNATVerificationCode_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccessoryRelatedItem")
    public JAXBElement<RelatedItemType> createAccessoryRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_AccessoryRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingContact")
    public JAXBElement<ContactType> createAccountingContact(ContactType value) {
        return new JAXBElement<ContactType>(_AccountingContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingCustomerParty")
    public JAXBElement<CustomerPartyType> createAccountingCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_AccountingCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AccountingSupplierParty")
    public JAXBElement<SupplierPartyType> createAccountingSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_AccountingSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ActualPackage")
    public JAXBElement<PackageType> createActualPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ActualPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalDocumentReference")
    public JAXBElement<DocumentReferenceType> createAdditionalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_AdditionalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalItemIdentification")
    public JAXBElement<ItemIdentificationType> createAdditionalItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_AdditionalItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalItemProperty")
    public JAXBElement<ItemPropertyType> createAdditionalItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_AdditionalItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AdditionalTemperature")
    public JAXBElement<TemperatureType> createAdditionalTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_AdditionalTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AddressLine")
    public JAXBElement<AddressLineType> createAddressLine(AddressLineType value) {
        return new JAXBElement<AddressLineType>(_AddressLine_QNAME, AddressLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AgentParty")
    public JAXBElement<PartyType> createAgentParty(PartyType value) {
        return new JAXBElement<PartyType>(_AgentParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AirTransport")
    public JAXBElement<AirTransportType> createAirTransport(AirTransportType value) {
        return new JAXBElement<AirTransportType>(_AirTransport_QNAME, AirTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AllowanceCharge")
    public JAXBElement<AllowanceChargeType> createAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_AllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AlternativeConditionPrice")
    public JAXBElement<PriceType> createAlternativeConditionPrice(PriceType value) {
        return new JAXBElement<PriceType>(_AlternativeConditionPrice_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "AnticipatedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createAnticipatedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_AnticipatedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableAddress")
    public JAXBElement<AddressType> createApplicableAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ApplicableAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableTaxCategory")
    public JAXBElement<TaxCategoryType> createApplicableTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_ApplicableTaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ApplicableTerritoryAddress")
    public JAXBElement<AddressType> createApplicableTerritoryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ApplicableTerritoryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Attachment")
    public JAXBElement<AttachmentType> createAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_Attachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BillingReference")
    public JAXBElement<BillingReferenceType> createBillingReference(BillingReferenceType value) {
        return new JAXBElement<BillingReferenceType>(_BillingReference_QNAME, BillingReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BillingReferenceLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BillingReferenceLine")
    public JAXBElement<BillingReferenceLineType> createBillingReferenceLine(BillingReferenceLineType value) {
        return new JAXBElement<BillingReferenceLineType>(_BillingReferenceLine_QNAME, BillingReferenceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Branch")
    public JAXBElement<BranchType> createBranch(BranchType value) {
        return new JAXBElement<BranchType>(_Branch_QNAME, BranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerContact")
    public JAXBElement<ContactType> createBuyerContact(ContactType value) {
        return new JAXBElement<ContactType>(_BuyerContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerCustomerParty")
    public JAXBElement<CustomerPartyType> createBuyerCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_BuyerCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyerProposedSubstituteLineItem")
    public JAXBElement<LineItemType> createBuyerProposedSubstituteLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_BuyerProposedSubstituteLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "BuyersItemIdentification")
    public JAXBElement<ItemIdentificationType> createBuyersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_BuyersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardAccountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CardAccount")
    public JAXBElement<CardAccountType> createCardAccount(CardAccountType value) {
        return new JAXBElement<CardAccountType>(_CardAccount_QNAME, CardAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CarrierParty")
    public JAXBElement<PartyType> createCarrierParty(PartyType value) {
        return new JAXBElement<PartyType>(_CarrierParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueDocumentReference")
    public JAXBElement<DocumentReferenceType> createCatalogueDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CatalogueDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueItemIdentification")
    public JAXBElement<ItemIdentificationType> createCatalogueItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_CatalogueItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueItemSpecificationUpdateLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueItemSpecificationUpdateLine")
    public JAXBElement<CatalogueItemSpecificationUpdateLineType> createCatalogueItemSpecificationUpdateLine(CatalogueItemSpecificationUpdateLineType value) {
        return new JAXBElement<CatalogueItemSpecificationUpdateLineType>(_CatalogueItemSpecificationUpdateLine_QNAME, CatalogueItemSpecificationUpdateLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueLine")
    public JAXBElement<CatalogueLineType> createCatalogueLine(CatalogueLineType value) {
        return new JAXBElement<CatalogueLineType>(_CatalogueLine_QNAME, CatalogueLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueLineReference")
    public JAXBElement<LineReferenceType> createCatalogueLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_CatalogueLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CataloguePricingUpdateLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CataloguePricingUpdateLine")
    public JAXBElement<CataloguePricingUpdateLineType> createCataloguePricingUpdateLine(CataloguePricingUpdateLineType value) {
        return new JAXBElement<CataloguePricingUpdateLineType>(_CataloguePricingUpdateLine_QNAME, CataloguePricingUpdateLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueReference")
    public JAXBElement<CatalogueReferenceType> createCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_CatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueRequestLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CatalogueRequestLine")
    public JAXBElement<CatalogueRequestLineType> createCatalogueRequestLine(CatalogueRequestLineType value) {
        return new JAXBElement<CatalogueRequestLineType>(_CatalogueRequestLine_QNAME, CatalogueRequestLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationCategoryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CategorizesClassificationCategory")
    public JAXBElement<ClassificationCategoryType> createCategorizesClassificationCategory(ClassificationCategoryType value) {
        return new JAXBElement<ClassificationCategoryType>(_CategorizesClassificationCategory_QNAME, ClassificationCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateOfOriginApplicationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CertificateOfOriginApplication")
    public JAXBElement<CertificateOfOriginApplicationType> createCertificateOfOriginApplication(CertificateOfOriginApplicationType value) {
        return new JAXBElement<CertificateOfOriginApplicationType>(_CertificateOfOriginApplication_QNAME, CertificateOfOriginApplicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationCategoryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassificationCategory")
    public JAXBElement<ClassificationCategoryType> createClassificationCategory(ClassificationCategoryType value) {
        return new JAXBElement<ClassificationCategoryType>(_ClassificationCategory_QNAME, ClassificationCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_ClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ClassifiedTaxCategory")
    public JAXBElement<TaxCategoryType> createClassifiedTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_ClassifiedTaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityClassificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CommodityClassification")
    public JAXBElement<CommodityClassificationType> createCommodityClassification(CommodityClassificationType value) {
        return new JAXBElement<CommodityClassificationType>(_CommodityClassification_QNAME, CommodityClassificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Communication")
    public JAXBElement<CommunicationType> createCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_Communication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ComplementaryRelatedItem")
    public JAXBElement<RelatedItemType> createComplementaryRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ComplementaryRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ComponentRelatedItem")
    public JAXBElement<RelatedItemType> createComponentRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ComponentRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsigneeParty")
    public JAXBElement<PartyType> createConsigneeParty(PartyType value) {
        return new JAXBElement<PartyType>(_ConsigneeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Consignment")
    public JAXBElement<ConsignmentType> createConsignment(ConsignmentType value) {
        return new JAXBElement<ConsignmentType>(_Consignment_QNAME, ConsignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ConsignorParty")
    public JAXBElement<PartyType> createConsignorParty(PartyType value) {
        return new JAXBElement<PartyType>(_ConsignorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Contact")
    public JAXBElement<ContactType> createContact(ContactType value) {
        return new JAXBElement<ContactType>(_Contact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContactParty")
    public JAXBElement<PartyType> createContactParty(PartyType value) {
        return new JAXBElement<PartyType>(_ContactParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainedGoodsItem")
    public JAXBElement<GoodsItemType> createContainedGoodsItem(GoodsItemType value) {
        return new JAXBElement<GoodsItemType>(_ContainedGoodsItem_QNAME, GoodsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContainedPackage")
    public JAXBElement<PackageType> createContainedPackage(PackageType value) {
        return new JAXBElement<PackageType>(_ContainedPackage_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Contract")
    public JAXBElement<ContractType> createContract(ContractType value) {
        return new JAXBElement<ContractType>(_Contract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractDocumentReference")
    public JAXBElement<DocumentReferenceType> createContractDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ContractDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ContractorCustomerParty")
    public JAXBElement<CustomerPartyType> createContractorCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_ContractorCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateRegistrationSchemeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CorporateRegistrationScheme")
    public JAXBElement<CorporateRegistrationSchemeType> createCorporateRegistrationScheme(CorporateRegistrationSchemeType value) {
        return new JAXBElement<CorporateRegistrationSchemeType>(_CorporateRegistrationScheme_QNAME, CorporateRegistrationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAccountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CreditAccount")
    public JAXBElement<CreditAccountType> createCreditAccount(CreditAccountType value) {
        return new JAXBElement<CreditAccountType>(_CreditAccount_QNAME, CreditAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CreditNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createCreditNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_CreditNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditNoteLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CreditNoteLine")
    public JAXBElement<CreditNoteLineType> createCreditNoteLine(CreditNoteLineType value) {
        return new JAXBElement<CreditNoteLineType>(_CreditNoteLine_QNAME, CreditNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CurrentStatus")
    public JAXBElement<StatusType> createCurrentStatus(StatusType value) {
        return new JAXBElement<StatusType>(_CurrentStatus_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "CustomerParty")
    public JAXBElement<CustomerPartyType> createCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_CustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DebitNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createDebitNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DebitNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitNoteLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DebitNoteLine")
    public JAXBElement<DebitNoteLineType> createDebitNoteLine(DebitNoteLineType value) {
        return new JAXBElement<DebitNoteLineType>(_DebitNoteLine_QNAME, DebitNoteLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DefaultLanguage")
    public JAXBElement<LanguageType> createDefaultLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_DefaultLanguage_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeletedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createDeletedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_DeletedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Delivery")
    public JAXBElement<DeliveryType> createDelivery(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_Delivery_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryAddress")
    public JAXBElement<AddressType> createDeliveryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DeliveryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryContact")
    public JAXBElement<ContactType> createDeliveryContact(ContactType value) {
        return new JAXBElement<ContactType>(_DeliveryContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryCustomerParty")
    public JAXBElement<CustomerPartyType> createDeliveryCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_DeliveryCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryLocation")
    public JAXBElement<LocationTypeCommAgg> createDeliveryLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_DeliveryLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryParty")
    public JAXBElement<PartyType> createDeliveryParty(PartyType value) {
        return new JAXBElement<PartyType>(_DeliveryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryTerms")
    public JAXBElement<DeliveryTermsType> createDeliveryTerms(DeliveryTermsType value) {
        return new JAXBElement<DeliveryTermsType>(_DeliveryTerms_QNAME, DeliveryTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryUnitType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DeliveryUnit")
    public JAXBElement<DeliveryUnitType> createDeliveryUnit(DeliveryUnitType value) {
        return new JAXBElement<DeliveryUnitType>(_DeliveryUnit_QNAME, DeliveryUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Despatch")
    public JAXBElement<DespatchType> createDespatch(DespatchType value) {
        return new JAXBElement<DespatchType>(_Despatch_QNAME, DespatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchAddress")
    public JAXBElement<AddressType> createDespatchAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DespatchAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchContact")
    public JAXBElement<ContactType> createDespatchContact(ContactType value) {
        return new JAXBElement<ContactType>(_DespatchContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchDocumentReference")
    public JAXBElement<DocumentReferenceType> createDespatchDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DespatchDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchLine")
    public JAXBElement<DespatchLineType> createDespatchLine(DespatchLineType value) {
        return new JAXBElement<DespatchLineType>(_DespatchLine_QNAME, DespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchLineReference")
    public JAXBElement<LineReferenceType> createDespatchLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_DespatchLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchParty")
    public JAXBElement<PartyType> createDespatchParty(PartyType value) {
        return new JAXBElement<PartyType>(_DespatchParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DespatchSupplierParty")
    public JAXBElement<SupplierPartyType> createDespatchSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_DespatchSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DestinationCountry")
    public JAXBElement<CountryType> createDestinationCountry(CountryType value) {
        return new JAXBElement<CountryType>(_DestinationCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttachmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DigitalSignatureAttachment")
    public JAXBElement<AttachmentType> createDigitalSignatureAttachment(AttachmentType value) {
        return new JAXBElement<AttachmentType>(_DigitalSignatureAttachment_QNAME, AttachmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Dimension")
    public JAXBElement<DimensionType> createDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_Dimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DiscrepancyResponse")
    public JAXBElement<ResponseType> createDiscrepancyResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_DiscrepancyResponse_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentDistributionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentDistribution")
    public JAXBElement<DocumentDistributionType> createDocumentDistribution(DocumentDistributionType value) {
        return new JAXBElement<DocumentDistributionType>(_DocumentDistribution_QNAME, DocumentDistributionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentReference")
    public JAXBElement<DocumentReferenceType> createDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_DocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "DocumentResponse")
    public JAXBElement<DocumentResponseType> createDocumentResponse(DocumentResponseType value) {
        return new JAXBElement<DocumentResponseType>(_DocumentResponse_QNAME, DocumentResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EmbassyEndorsement")
    public JAXBElement<EndorsementType> createEmbassyEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_EmbassyEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EmergencyTemperature")
    public JAXBElement<TemperatureType> createEmergencyTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_EmergencyTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Endorsement")
    public JAXBElement<EndorsementType> createEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_Endorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorserPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EndorserParty")
    public JAXBElement<EndorserPartyType> createEndorserParty(EndorserPartyType value) {
        return new JAXBElement<EndorserPartyType>(_EndorserParty_QNAME, EndorserPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "EstimatedDeliveryPeriod")
    public JAXBElement<PeriodType> createEstimatedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_EstimatedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExchangeRate")
    public JAXBElement<ExchangeRateType> createExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_ExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExportCountry")
    public JAXBElement<CountryType> createExportCountry(CountryType value) {
        return new JAXBElement<CountryType>(_ExportCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExporterParty")
    public JAXBElement<PartyType> createExporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_ExporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExternalReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ExternalReference")
    public JAXBElement<ExternalReferenceType> createExternalReference(ExternalReferenceType value) {
        return new JAXBElement<ExternalReferenceType>(_ExternalReference_QNAME, ExternalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDeliveryParty")
    public JAXBElement<PartyType> createFinalDeliveryParty(PartyType value) {
        return new JAXBElement<PartyType>(_FinalDeliveryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDeliveryTransportationService")
    public JAXBElement<TransportationServiceType> createFinalDeliveryTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_FinalDeliveryTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinalDestinationCountry")
    public JAXBElement<CountryType> createFinalDestinationCountry(CountryType value) {
        return new JAXBElement<CountryType>(_FinalDestinationCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialAccount")
    public JAXBElement<FinancialAccountType> createFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_FinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialInstitutionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialInstitution")
    public JAXBElement<FinancialInstitutionType> createFinancialInstitution(FinancialInstitutionType value) {
        return new JAXBElement<FinancialInstitutionType>(_FinancialInstitution_QNAME, FinancialInstitutionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BranchType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FinancialInstitutionBranch")
    public JAXBElement<BranchType> createFinancialInstitutionBranch(BranchType value) {
        return new JAXBElement<BranchType>(_FinancialInstitutionBranch_QNAME, BranchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FirstArrivalPortLocation")
    public JAXBElement<LocationTypeCommAgg> createFirstArrivalPortLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_FirstArrivalPortLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FlashpointTemperature")
    public JAXBElement<TemperatureType> createFlashpointTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_FlashpointTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ForeignExchangeContract")
    public JAXBElement<ContractType> createForeignExchangeContract(ContractType value) {
        return new JAXBElement<ContractType>(_ForeignExchangeContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FreightAllowanceCharge")
    public JAXBElement<AllowanceChargeType> createFreightAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_FreightAllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "FreightForwarderParty")
    public JAXBElement<PartyType> createFreightForwarderParty(PartyType value) {
        return new JAXBElement<PartyType>(_FreightForwarderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GoodsItem")
    public JAXBElement<GoodsItemType> createGoodsItem(GoodsItemType value) {
        return new JAXBElement<GoodsItemType>(_GoodsItem_QNAME, GoodsItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemContainerType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "GoodsItemContainer")
    public JAXBElement<GoodsItemContainerType> createGoodsItemContainer(GoodsItemContainerType value) {
        return new JAXBElement<GoodsItemContainerType>(_GoodsItemContainer_QNAME, GoodsItemContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HandlingUnitDespatchLine")
    public JAXBElement<DespatchLineType> createHandlingUnitDespatchLine(DespatchLineType value) {
        return new JAXBElement<DespatchLineType>(_HandlingUnitDespatchLine_QNAME, DespatchLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousGoodsTransitType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HazardousGoodsTransit")
    public JAXBElement<HazardousGoodsTransitType> createHazardousGoodsTransit(HazardousGoodsTransitType value) {
        return new JAXBElement<HazardousGoodsTransitType>(_HazardousGoodsTransit_QNAME, HazardousGoodsTransitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "HazardousItem")
    public JAXBElement<HazardousItemType> createHazardousItem(HazardousItemType value) {
        return new JAXBElement<HazardousItemType>(_HazardousItem_QNAME, HazardousItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ImporterParty")
    public JAXBElement<PartyType> createImporterParty(PartyType value) {
        return new JAXBElement<PartyType>(_ImporterParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InformationContentProviderParty")
    public JAXBElement<PartyType> createInformationContentProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_InformationContentProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InsuranceEndorsement")
    public JAXBElement<EndorsementType> createInsuranceEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_InsuranceEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoiceDocumentReference")
    public JAXBElement<DocumentReferenceType> createInvoiceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_InvoiceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoiceLine")
    public JAXBElement<InvoiceLineType> createInvoiceLine(InvoiceLineType value) {
        return new JAXBElement<InvoiceLineType>(_InvoiceLine_QNAME, InvoiceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "InvoicePeriod")
    public JAXBElement<PeriodType> createInvoicePeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_InvoicePeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndorsementType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuerEndorsement")
    public JAXBElement<EndorsementType> createIssuerEndorsement(EndorsementType value) {
        return new JAXBElement<EndorsementType>(_IssuerEndorsement_QNAME, EndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuerParty")
    public JAXBElement<PartyType> createIssuerParty(PartyType value) {
        return new JAXBElement<PartyType>(_IssuerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "IssuingCountry")
    public JAXBElement<CountryType> createIssuingCountry(CountryType value) {
        return new JAXBElement<CountryType>(_IssuingCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemComparisonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemComparison")
    public JAXBElement<ItemComparisonType> createItemComparison(ItemComparisonType value) {
        return new JAXBElement<ItemComparisonType>(_ItemComparison_QNAME, ItemComparisonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemIdentification")
    public JAXBElement<ItemIdentificationType> createItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemInstanceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemInstance")
    public JAXBElement<ItemInstanceType> createItemInstance(ItemInstanceType value) {
        return new JAXBElement<ItemInstanceType>(_ItemInstance_QNAME, ItemInstanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_ItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemProperty")
    public JAXBElement<ItemPropertyType> createItemProperty(ItemPropertyType value) {
        return new JAXBElement<ItemPropertyType>(_ItemProperty_QNAME, ItemPropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemPropertyGroupType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemPropertyGroup")
    public JAXBElement<ItemPropertyGroupType> createItemPropertyGroup(ItemPropertyGroupType value) {
        return new JAXBElement<ItemPropertyGroupType>(_ItemPropertyGroup_QNAME, ItemPropertyGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ItemSpecificationDocumentReference")
    public JAXBElement<DocumentReferenceType> createItemSpecificationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ItemSpecificationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "JurisdictionRegionAddress")
    public JAXBElement<AddressType> createJurisdictionRegionAddress(AddressType value) {
        return new JAXBElement<AddressType>(_JurisdictionRegionAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Language")
    public JAXBElement<LanguageType> createLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_Language_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LastExitPortLocation")
    public JAXBElement<LocationTypeCommAgg> createLastExitPortLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_LastExitPortLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LegalMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createLegalMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_LegalMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineItem")
    public JAXBElement<LineItemType> createLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_LineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineReference")
    public JAXBElement<LineReferenceType> createLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_LineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineResponse")
    public JAXBElement<LineResponseType> createLineResponse(LineResponseType value) {
        return new JAXBElement<LineResponseType>(_LineResponse_QNAME, LineResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LineValidityPeriod")
    public JAXBElement<PeriodType> createLineValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_LineValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingLocation")
    public JAXBElement<LocationTypeCommAgg> createLoadingLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_LoadingLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingPortLocation")
    public JAXBElement<LocationTypeCommAgg> createLoadingPortLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_LoadingPortLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LoadingProofParty")
    public JAXBElement<PartyType> createLoadingProofParty(PartyType value) {
        return new JAXBElement<PartyType>(_LoadingProofParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Location")
    public JAXBElement<LocationTypeCommAgg> createLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_Location_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCoordinateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LocationCoordinate")
    public JAXBElement<LocationCoordinateType> createLocationCoordinate(LocationCoordinateType value) {
        return new JAXBElement<LocationCoordinateType>(_LocationCoordinate_QNAME, LocationCoordinateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LotIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "LotIdentification")
    public JAXBElement<LotIdentificationType> createLotIdentification(LotIdentificationType value) {
        return new JAXBElement<LotIdentificationType>(_LotIdentification_QNAME, LotIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ManufacturerParty")
    public JAXBElement<PartyType> createManufacturerParty(PartyType value) {
        return new JAXBElement<PartyType>(_ManufacturerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ManufacturersItemIdentification")
    public JAXBElement<ItemIdentificationType> createManufacturersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_ManufacturersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaritimeTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MaritimeTransport")
    public JAXBElement<MaritimeTransportType> createMaritimeTransport(MaritimeTransportType value) {
        return new JAXBElement<MaritimeTransportType>(_MaritimeTransport_QNAME, MaritimeTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MaximumTemperature")
    public JAXBElement<TemperatureType> createMaximumTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_MaximumTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DimensionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MeasurementDimension")
    public JAXBElement<DimensionType> createMeasurementDimension(DimensionType value) {
        return new JAXBElement<DimensionType>(_MeasurementDimension_QNAME, DimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MinimumTemperature")
    public JAXBElement<TemperatureType> createMinimumTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_MinimumTemperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "MonetaryTotal")
    public JAXBElement<MonetaryTotalType> createMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_MonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "NotifyParty")
    public JAXBElement<PartyType> createNotifyParty(PartyType value) {
        return new JAXBElement<PartyType>(_NotifyParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderDocumentReference")
    public JAXBElement<DocumentReferenceType> createOrderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OrderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderedShipmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderedShipment")
    public JAXBElement<OrderedShipmentType> createOrderedShipment(OrderedShipmentType value) {
        return new JAXBElement<OrderedShipmentType>(_OrderedShipment_QNAME, OrderedShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderLine")
    public JAXBElement<OrderLineType> createOrderLine(OrderLineType value) {
        return new JAXBElement<OrderLineType>(_OrderLine_QNAME, OrderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderLineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderLineReference")
    public JAXBElement<OrderLineReferenceType> createOrderLineReference(OrderLineReferenceType value) {
        return new JAXBElement<OrderLineReferenceType>(_OrderLineReference_QNAME, OrderLineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OrderReference")
    public JAXBElement<OrderReferenceType> createOrderReference(OrderReferenceType value) {
        return new JAXBElement<OrderReferenceType>(_OrderReference_QNAME, OrderReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginAddress")
    public JAXBElement<AddressType> createOriginAddress(AddressType value) {
        return new JAXBElement<AddressType>(_OriginAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDepartureCountry")
    public JAXBElement<CountryType> createOriginalDepartureCountry(CountryType value) {
        return new JAXBElement<CountryType>(_OriginalDepartureCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDespatchParty")
    public JAXBElement<PartyType> createOriginalDespatchParty(PartyType value) {
        return new JAXBElement<PartyType>(_OriginalDespatchParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDespatchTransportationService")
    public JAXBElement<TransportationServiceType> createOriginalDespatchTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_OriginalDespatchTransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalDocumentReference")
    public JAXBElement<DocumentReferenceType> createOriginalDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OriginalDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginalItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createOriginalItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_OriginalItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorCustomerParty")
    public JAXBElement<CustomerPartyType> createOriginatorCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_OriginatorCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorDocumentReference")
    public JAXBElement<DocumentReferenceType> createOriginatorDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_OriginatorDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginatorParty")
    public JAXBElement<PartyType> createOriginatorParty(PartyType value) {
        return new JAXBElement<PartyType>(_OriginatorParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OriginCountry")
    public JAXBElement<CountryType> createOriginCountry(CountryType value) {
        return new JAXBElement<CountryType>(_OriginCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommunicationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OtherCommunication")
    public JAXBElement<CommunicationType> createOtherCommunication(CommunicationType value) {
        return new JAXBElement<CommunicationType>(_OtherCommunication_QNAME, CommunicationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "OwnerParty")
    public JAXBElement<PartyType> createOwnerParty(PartyType value) {
        return new JAXBElement<PartyType>(_OwnerParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Package")
    public JAXBElement<PackageType> createPackage(PackageType value) {
        return new JAXBElement<PackageType>(_Package_QNAME, PackageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Party")
    public JAXBElement<PartyType> createParty(PartyType value) {
        return new JAXBElement<PartyType>(_Party_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyIdentification")
    public JAXBElement<PartyIdentificationType> createPartyIdentification(PartyIdentificationType value) {
        return new JAXBElement<PartyIdentificationType>(_PartyIdentification_QNAME, PartyIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyLegalEntityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyLegalEntity")
    public JAXBElement<PartyLegalEntityType> createPartyLegalEntity(PartyLegalEntityType value) {
        return new JAXBElement<PartyLegalEntityType>(_PartyLegalEntity_QNAME, PartyLegalEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyName")
    public JAXBElement<PartyNameType> createPartyName(PartyNameType value) {
        return new JAXBElement<PartyNameType>(_PartyName_QNAME, PartyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyTaxSchemeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PartyTaxScheme")
    public JAXBElement<PartyTaxSchemeType> createPartyTaxScheme(PartyTaxSchemeType value) {
        return new JAXBElement<PartyTaxSchemeType>(_PartyTaxScheme_QNAME, PartyTaxSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayeeFinancialAccount")
    public JAXBElement<FinancialAccountType> createPayeeFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_PayeeFinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayeeParty")
    public JAXBElement<PartyType> createPayeeParty(PartyType value) {
        return new JAXBElement<PartyType>(_PayeeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinancialAccountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PayerFinancialAccount")
    public JAXBElement<FinancialAccountType> createPayerFinancialAccount(FinancialAccountType value) {
        return new JAXBElement<FinancialAccountType>(_PayerFinancialAccount_QNAME, FinancialAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Payment")
    public JAXBElement<PaymentType> createPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_Payment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentAlternativeExchangeRate")
    public JAXBElement<ExchangeRateType> createPaymentAlternativeExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PaymentAlternativeExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentExchangeRate")
    public JAXBElement<ExchangeRateType> createPaymentExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PaymentExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentMeans")
    public JAXBElement<PaymentMeansType> createPaymentMeans(PaymentMeansType value) {
        return new JAXBElement<PaymentMeansType>(_PaymentMeans_QNAME, PaymentMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PaymentTerms")
    public JAXBElement<PaymentTermsType> createPaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_PaymentTerms_QNAME, PaymentTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PenaltyPeriod")
    public JAXBElement<PeriodType> createPenaltyPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PenaltyPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Period")
    public JAXBElement<PeriodType> createPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_Period_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalAttributeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PhysicalAttribute")
    public JAXBElement<PhysicalAttributeType> createPhysicalAttribute(PhysicalAttributeType value) {
        return new JAXBElement<PhysicalAttributeType>(_PhysicalAttribute_QNAME, PhysicalAttributeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PhysicalLocation")
    public JAXBElement<LocationTypeCommAgg> createPhysicalLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_PhysicalLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PostalAddress")
    public JAXBElement<AddressType> createPostalAddress(AddressType value) {
        return new JAXBElement<AddressType>(_PostalAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PrepaidPayment")
    public JAXBElement<PaymentType> createPrepaidPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_PrepaidPayment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreparationParty")
    public JAXBElement<PartyType> createPreparationParty(PartyType value) {
        return new JAXBElement<PartyType>(_PreparationParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PreviousPriceList")
    public JAXBElement<PriceListType> createPreviousPriceList(PriceListType value) {
        return new JAXBElement<PriceListType>(_PreviousPriceList_QNAME, PriceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Price")
    public JAXBElement<PriceType> createPrice(PriceType value) {
        return new JAXBElement<PriceType>(_Price_QNAME, PriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceListType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PriceList")
    public JAXBElement<PriceListType> createPriceList(PriceListType value) {
        return new JAXBElement<PriceListType>(_PriceList_QNAME, PriceListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PricingExchangeRate")
    public JAXBElement<ExchangeRateType> createPricingExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PricingExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PricingReference")
    public JAXBElement<PricingReferenceType> createPricingReference(PricingReferenceType value) {
        return new JAXBElement<PricingReferenceType>(_PricingReference_QNAME, PricingReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "PromisedDeliveryPeriod")
    public JAXBElement<PeriodType> createPromisedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_PromisedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ProviderParty")
    public JAXBElement<PartyType> createProviderParty(PartyType value) {
        return new JAXBElement<PartyType>(_ProviderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotationDocumentReference")
    public JAXBElement<DocumentReferenceType> createQuotationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_QuotationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotationLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotationLine")
    public JAXBElement<QuotationLineType> createQuotationLine(QuotationLineType value) {
        return new JAXBElement<QuotationLineType>(_QuotationLine_QNAME, QuotationLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotationLineReference")
    public JAXBElement<LineReferenceType> createQuotationLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_QuotationLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "QuotedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createQuotedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_QuotedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RailTransport")
    public JAXBElement<RailTransportType> createRailTransport(RailTransportType value) {
        return new JAXBElement<RailTransportType>(_RailTransport_QNAME, RailTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptDocumentReference")
    public JAXBElement<DocumentReferenceType> createReceiptDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReceiptDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptLine")
    public JAXBElement<ReceiptLineType> createReceiptLine(ReceiptLineType value) {
        return new JAXBElement<ReceiptLineType>(_ReceiptLine_QNAME, ReceiptLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiptLineReference")
    public JAXBElement<LineReferenceType> createReceiptLineReference(LineReferenceType value) {
        return new JAXBElement<LineReferenceType>(_ReceiptLineReference_QNAME, LineReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceiptLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceivedHandlingUnitReceiptLine")
    public JAXBElement<ReceiptLineType> createReceivedHandlingUnitReceiptLine(ReceiptLineType value) {
        return new JAXBElement<ReceiptLineType>(_ReceivedHandlingUnitReceiptLine_QNAME, ReceiptLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReceiverParty")
    public JAXBElement<PartyType> createReceiverParty(PartyType value) {
        return new JAXBElement<PartyType>(_ReceiverParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RecipientParty")
    public JAXBElement<PartyType> createRecipientParty(PartyType value) {
        return new JAXBElement<PartyType>(_RecipientParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReferencedContract")
    public JAXBElement<ContractType> createReferencedContract(ContractType value) {
        return new JAXBElement<ContractType>(_ReferencedContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RegistrationAddress")
    public JAXBElement<AddressType> createRegistrationAddress(AddressType value) {
        return new JAXBElement<AddressType>(_RegistrationAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RelatedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createRelatedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_RelatedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RelatedItem")
    public JAXBElement<RelatedItemType> createRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_RelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReminderDocumentReference")
    public JAXBElement<DocumentReferenceType> createReminderDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_ReminderDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReminderLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReminderLine")
    public JAXBElement<ReminderLineType> createReminderLine(ReminderLineType value) {
        return new JAXBElement<ReminderLineType>(_ReminderLine_QNAME, ReminderLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReminderPeriod")
    public JAXBElement<PeriodType> createReminderPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ReminderPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemittanceAdviceLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RemittanceAdviceLine")
    public JAXBElement<RemittanceAdviceLineType> createRemittanceAdviceLine(RemittanceAdviceLineType value) {
        return new JAXBElement<RemittanceAdviceLineType>(_RemittanceAdviceLine_QNAME, RemittanceAdviceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReplacementRelatedItem")
    public JAXBElement<RelatedItemType> createReplacementRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_ReplacementRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ReportedShipment")
    public JAXBElement<ShipmentType> createReportedShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_ReportedShipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedCatalogueReference")
    public JAXBElement<CatalogueReferenceType> createRequestedCatalogueReference(CatalogueReferenceType value) {
        return new JAXBElement<CatalogueReferenceType>(_RequestedCatalogueReference_QNAME, CatalogueReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassificationSchemeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedClassificationScheme")
    public JAXBElement<ClassificationSchemeType> createRequestedClassificationScheme(ClassificationSchemeType value) {
        return new JAXBElement<ClassificationSchemeType>(_RequestedClassificationScheme_QNAME, ClassificationSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedDeliveryPeriod")
    public JAXBElement<PeriodType> createRequestedDeliveryPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_RequestedDeliveryPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedLanguage")
    public JAXBElement<LanguageType> createRequestedLanguage(LanguageType value) {
        return new JAXBElement<LanguageType>(_RequestedLanguage_QNAME, LanguageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestedMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createRequestedMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_RequestedMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestForQuotationDocumentReference")
    public JAXBElement<DocumentReferenceType> createRequestForQuotationDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_RequestForQuotationDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestForQuotationLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequestForQuotationLine")
    public JAXBElement<RequestForQuotationLineType> createRequestForQuotationLine(RequestForQuotationLineType value) {
        return new JAXBElement<RequestForQuotationLineType>(_RequestForQuotationLine_QNAME, RequestForQuotationLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemLocationQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredItemLocationQuantity")
    public JAXBElement<ItemLocationQuantityType> createRequiredItemLocationQuantity(ItemLocationQuantityType value) {
        return new JAXBElement<ItemLocationQuantityType>(_RequiredItemLocationQuantity_QNAME, ItemLocationQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RequiredRelatedItem")
    public JAXBElement<RelatedItemType> createRequiredRelatedItem(RelatedItemType value) {
        return new JAXBElement<RelatedItemType>(_RequiredRelatedItem_QNAME, RelatedItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoadTransportType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "RoadTransport")
    public JAXBElement<RoadTransportType> createRoadTransport(RoadTransportType value) {
        return new JAXBElement<RoadTransportType>(_RoadTransport_QNAME, RoadTransportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecondaryHazardType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SecondaryHazard")
    public JAXBElement<SecondaryHazardType> createSecondaryHazard(SecondaryHazardType value) {
        return new JAXBElement<SecondaryHazardType>(_SecondaryHazard_QNAME, SecondaryHazardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SelfBilledCreditNoteDocumentReference")
    public JAXBElement<DocumentReferenceType> createSelfBilledCreditNoteDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SelfBilledCreditNoteDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SelfBilledInvoiceDocumentReference")
    public JAXBElement<DocumentReferenceType> createSelfBilledInvoiceDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SelfBilledInvoiceDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerContact")
    public JAXBElement<ContactType> createSellerContact(ContactType value) {
        return new JAXBElement<ContactType>(_SellerContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerProposedSubstituteLineItem")
    public JAXBElement<LineItemType> createSellerProposedSubstituteLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_SellerProposedSubstituteLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellersItemIdentification")
    public JAXBElement<ItemIdentificationType> createSellersItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_SellersItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineItemType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerSubstitutedLineItem")
    public JAXBElement<LineItemType> createSellerSubstitutedLineItem(LineItemType value) {
        return new JAXBElement<LineItemType>(_SellerSubstitutedLineItem_QNAME, LineItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SellerSupplierParty")
    public JAXBElement<SupplierPartyType> createSellerSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_SellerSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SenderParty")
    public JAXBElement<PartyType> createSenderParty(PartyType value) {
        return new JAXBElement<PartyType>(_SenderParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SettlementPeriod")
    public JAXBElement<PeriodType> createSettlementPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_SettlementPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Shipment")
    public JAXBElement<ShipmentType> createShipment(ShipmentType value) {
        return new JAXBElement<ShipmentType>(_Shipment_QNAME, ShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShipmentStageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ShipmentStage")
    public JAXBElement<ShipmentStageType> createShipmentStage(ShipmentStageType value) {
        return new JAXBElement<ShipmentStageType>(_ShipmentStage_QNAME, ShipmentStageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SignatoryContact")
    public JAXBElement<ContactType> createSignatoryContact(ContactType value) {
        return new JAXBElement<ContactType>(_SignatoryContact_QNAME, ContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SignatoryParty")
    public JAXBElement<PartyType> createSignatoryParty(PartyType value) {
        return new JAXBElement<PartyType>(_SignatoryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StandardItemIdentification")
    public JAXBElement<ItemIdentificationType> createStandardItemIdentification(ItemIdentificationType value) {
        return new JAXBElement<ItemIdentificationType>(_StandardItemIdentification_QNAME, ItemIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatementDocumentReference")
    public JAXBElement<DocumentReferenceType> createStatementDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_StatementDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatementLineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatementLine")
    public JAXBElement<StatementLineType> createStatementLine(StatementLineType value) {
        return new JAXBElement<StatementLineType>(_StatementLine_QNAME, StatementLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "StatementPeriod")
    public JAXBElement<PeriodType> createStatementPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_StatementPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Status")
    public JAXBElement<StatusType> createStatus(StatusType value) {
        return new JAXBElement<StatusType>(_Status_QNAME, StatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StowageType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Stowage")
    public JAXBElement<StowageType> createStowage(StowageType value) {
        return new JAXBElement<StowageType>(_Stowage_QNAME, StowageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupplierParty")
    public JAXBElement<SupplierPartyType> createSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_SupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "SupportingDocumentReference")
    public JAXBElement<DocumentReferenceType> createSupportingDocumentReference(DocumentReferenceType value) {
        return new JAXBElement<DocumentReferenceType>(_SupportingDocumentReference_QNAME, DocumentReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCategoryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxCategory")
    public JAXBElement<TaxCategoryType> createTaxCategory(TaxCategoryType value) {
        return new JAXBElement<TaxCategoryType>(_TaxCategory_QNAME, TaxCategoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxExchangeRate")
    public JAXBElement<ExchangeRateType> createTaxExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_TaxExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxRepresentativeParty")
    public JAXBElement<PartyType> createTaxRepresentativeParty(PartyType value) {
        return new JAXBElement<PartyType>(_TaxRepresentativeParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxSchemeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxScheme")
    public JAXBElement<TaxSchemeType> createTaxScheme(TaxSchemeType value) {
        return new JAXBElement<TaxSchemeType>(_TaxScheme_QNAME, TaxSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxSubtotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxSubtotal")
    public JAXBElement<TaxSubtotalType> createTaxSubtotal(TaxSubtotalType value) {
        return new JAXBElement<TaxSubtotalType>(_TaxSubtotal_QNAME, TaxSubtotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTotalType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TaxTotal")
    public JAXBElement<TaxTotalType> createTaxTotal(TaxTotalType value) {
        return new JAXBElement<TaxTotalType>(_TaxTotal_QNAME, TaxTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TemperatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "Temperature")
    public JAXBElement<TemperatureType> createTemperature(TemperatureType value) {
        return new JAXBElement<TemperatureType>(_Temperature_QNAME, TemperatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradingTermsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TradingTerms")
    public JAXBElement<TradingTermsType> createTradingTerms(TradingTermsType value) {
        return new JAXBElement<TradingTermsType>(_TradingTerms_QNAME, TradingTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionConditionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransactionConditions")
    public JAXBElement<TransactionConditionsType> createTransactionConditions(TransactionConditionsType value) {
        return new JAXBElement<TransactionConditionsType>(_TransactionConditions_QNAME, TransactionConditionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitCountry")
    public JAXBElement<CountryType> createTransitCountry(CountryType value) {
        return new JAXBElement<CountryType>(_TransitCountry_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransitPeriod")
    public JAXBElement<PeriodType> createTransitPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_TransitPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportationServiceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportationService")
    public JAXBElement<TransportationServiceType> createTransportationService(TransportationServiceType value) {
        return new JAXBElement<TransportationServiceType>(_TransportationService_QNAME, TransportationServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportContract")
    public JAXBElement<ContractType> createTransportContract(ContractType value) {
        return new JAXBElement<ContractType>(_TransportContract_QNAME, ContractType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportEquipment")
    public JAXBElement<TransportEquipmentType> createTransportEquipment(TransportEquipmentType value) {
        return new JAXBElement<TransportEquipmentType>(_TransportEquipment_QNAME, TransportEquipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentSealType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportEquipmentSeal")
    public JAXBElement<TransportEquipmentSealType> createTransportEquipmentSeal(TransportEquipmentSealType value) {
        return new JAXBElement<TransportEquipmentSealType>(_TransportEquipmentSeal_QNAME, TransportEquipmentSealType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportEvent")
    public JAXBElement<TransportEventType> createTransportEvent(TransportEventType value) {
        return new JAXBElement<TransportEventType>(_TransportEvent_QNAME, TransportEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportHandlingUnitType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportHandlingUnit")
    public JAXBElement<TransportHandlingUnitType> createTransportHandlingUnit(TransportHandlingUnitType value) {
        return new JAXBElement<TransportHandlingUnitType>(_TransportHandlingUnit_QNAME, TransportHandlingUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransportMeans")
    public JAXBElement<TransportMeansType> createTransportMeans(TransportMeansType value) {
        return new JAXBElement<TransportMeansType>(_TransportMeans_QNAME, TransportMeansType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "TransshipPortLocation")
    public JAXBElement<LocationTypeCommAgg> createTransshipPortLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_TransshipPortLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationTypeCommAgg }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UnloadingPortLocation")
    public JAXBElement<LocationTypeCommAgg> createUnloadingPortLocation(LocationTypeCommAgg value) {
        return new JAXBElement<LocationTypeCommAgg>(_UnloadingPortLocation_QNAME, LocationTypeCommAgg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "UsabilityPeriod")
    public JAXBElement<PeriodType> createUsabilityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_UsabilityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "ValidityPeriod")
    public JAXBElement<PeriodType> createValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_ValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarrantyParty")
    public JAXBElement<PartyType> createWarrantyParty(PartyType value) {
        return new JAXBElement<PartyType>(_WarrantyParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", name = "WarrantyValidityPeriod")
    public JAXBElement<PeriodType> createWarrantyValidityPeriod(PeriodType value) {
        return new JAXBElement<PeriodType>(_WarrantyValidityPeriod_QNAME, PeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptedIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AcceptedIndicator")
    public JAXBElement<AcceptedIndicatorType> createAcceptedIndicator(AcceptedIndicatorType value) {
        return new JAXBElement<AcceptedIndicatorType>(_AcceptedIndicator_QNAME, AcceptedIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AccountID")
    public JAXBElement<AccountIDType> createAccountID(AccountIDType value) {
        return new JAXBElement<AccountIDType>(_AccountID_QNAME, AccountIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingCostType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AccountingCost")
    public JAXBElement<AccountingCostType> createAccountingCost(AccountingCostType value) {
        return new JAXBElement<AccountingCostType>(_AccountingCost_QNAME, AccountingCostType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingCostCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AccountingCostCode")
    public JAXBElement<AccountingCostCodeType> createAccountingCostCode(AccountingCostCodeType value) {
        return new JAXBElement<AccountingCostCodeType>(_AccountingCostCode_QNAME, AccountingCostCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountNumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AccountNumberID")
    public JAXBElement<AccountNumberIDType> createAccountNumberID(AccountNumberIDType value) {
        return new JAXBElement<AccountNumberIDType>(_AccountNumberID_QNAME, AccountNumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AccountTypeCode")
    public JAXBElement<AccountTypeCodeType> createAccountTypeCode(AccountTypeCodeType value) {
        return new JAXBElement<AccountTypeCodeType>(_AccountTypeCode_QNAME, AccountTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ActionCode")
    public JAXBElement<ActionCodeType> createActionCode(ActionCodeType value) {
        return new JAXBElement<ActionCodeType>(_ActionCode_QNAME, ActionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualDeliveryDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ActualDeliveryDate")
    public JAXBElement<ActualDeliveryDateType> createActualDeliveryDate(ActualDeliveryDateType value) {
        return new JAXBElement<ActualDeliveryDateType>(_ActualDeliveryDate_QNAME, ActualDeliveryDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualDeliveryTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ActualDeliveryTime")
    public JAXBElement<ActualDeliveryTimeType> createActualDeliveryTime(ActualDeliveryTimeType value) {
        return new JAXBElement<ActualDeliveryTimeType>(_ActualDeliveryTime_QNAME, ActualDeliveryTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualDespatchDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ActualDespatchDate")
    public JAXBElement<ActualDespatchDateType> createActualDespatchDate(ActualDespatchDateType value) {
        return new JAXBElement<ActualDespatchDateType>(_ActualDespatchDate_QNAME, ActualDespatchDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualDespatchTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ActualDespatchTime")
    public JAXBElement<ActualDespatchTimeType> createActualDespatchTime(ActualDespatchTimeType value) {
        return new JAXBElement<ActualDespatchTimeType>(_ActualDespatchTime_QNAME, ActualDespatchTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalAccountIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AdditionalAccountID")
    public JAXBElement<AdditionalAccountIDType> createAdditionalAccountID(AdditionalAccountIDType value) {
        return new JAXBElement<AdditionalAccountIDType>(_AdditionalAccountID_QNAME, AdditionalAccountIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInformationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AdditionalInformation")
    public JAXBElement<AdditionalInformationType> createAdditionalInformationCommBas(AdditionalInformationType value) {
        return new JAXBElement<AdditionalInformationType>(_AdditionalInformationCommBas_QNAME, AdditionalInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalStreetNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AdditionalStreetName")
    public JAXBElement<AdditionalStreetNameType> createAdditionalStreetName(AdditionalStreetNameType value) {
        return new JAXBElement<AdditionalStreetNameType>(_AdditionalStreetName_QNAME, AdditionalStreetNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressFormatCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AddressFormatCode")
    public JAXBElement<AddressFormatCodeType> createAddressFormatCode(AddressFormatCodeType value) {
        return new JAXBElement<AddressFormatCodeType>(_AddressFormatCode_QNAME, AddressFormatCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AddressTypeCode")
    public JAXBElement<AddressTypeCodeType> createAddressTypeCode(AddressTypeCodeType value) {
        return new JAXBElement<AddressTypeCodeType>(_AddressTypeCode_QNAME, AddressTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdValoremIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AdValoremIndicator")
    public JAXBElement<AdValoremIndicatorType> createAdValoremIndicator(AdValoremIndicatorType value) {
        return new JAXBElement<AdValoremIndicatorType>(_AdValoremIndicator_QNAME, AdValoremIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AgencyID")
    public JAXBElement<AgencyIDType> createAgencyID(AgencyIDType value) {
        return new JAXBElement<AgencyIDType>(_AgencyID_QNAME, AgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AgencyName")
    public JAXBElement<AgencyNameType> createAgencyName(AgencyNameType value) {
        return new JAXBElement<AgencyNameType>(_AgencyName_QNAME, AgencyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AircraftID")
    public JAXBElement<AircraftIDType> createAircraftID(AircraftIDType value) {
        return new JAXBElement<AircraftIDType>(_AircraftID_QNAME, AircraftIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AllowanceChargeReason")
    public JAXBElement<AllowanceChargeReasonType> createAllowanceChargeReason(AllowanceChargeReasonType value) {
        return new JAXBElement<AllowanceChargeReasonType>(_AllowanceChargeReason_QNAME, AllowanceChargeReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeReasonCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AllowanceChargeReasonCode")
    public JAXBElement<AllowanceChargeReasonCodeTypeCommBas> createAllowanceChargeReasonCode(AllowanceChargeReasonCodeTypeCommBas value) {
        return new JAXBElement<AllowanceChargeReasonCodeTypeCommBas>(_AllowanceChargeReasonCode_QNAME, AllowanceChargeReasonCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceTotalAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AllowanceTotalAmount")
    public JAXBElement<AllowanceTotalAmountType> createAllowanceTotalAmount(AllowanceTotalAmountType value) {
        return new JAXBElement<AllowanceTotalAmountType>(_AllowanceTotalAmount_QNAME, AllowanceTotalAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Amount")
    public JAXBElement<AmountTypeCommBas> createAmount(AmountTypeCommBas value) {
        return new JAXBElement<AmountTypeCommBas>(_Amount_QNAME, AmountTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ApplicationID")
    public JAXBElement<ApplicationIDType> createApplicationID(ApplicationIDType value) {
        return new JAXBElement<ApplicationIDType>(_ApplicationID_QNAME, ApplicationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationStatusCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ApplicationStatusCode")
    public JAXBElement<ApplicationStatusCodeType> createApplicationStatusCode(ApplicationStatusCodeType value) {
        return new JAXBElement<ApplicationStatusCodeType>(_ApplicationStatusCode_QNAME, ApplicationStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApprovalStatusType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ApprovalStatus")
    public JAXBElement<ApprovalStatusType> createApprovalStatus(ApprovalStatusType value) {
        return new JAXBElement<ApprovalStatusType>(_ApprovalStatus_QNAME, ApprovalStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributeIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "AttributeID")
    public JAXBElement<AttributeIDType> createAttributeID(AttributeIDType value) {
        return new JAXBElement<AttributeIDType>(_AttributeID_QNAME, AttributeIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackOrderAllowedIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BackOrderAllowedIndicator")
    public JAXBElement<BackOrderAllowedIndicatorType> createBackOrderAllowedIndicator(BackOrderAllowedIndicatorType value) {
        return new JAXBElement<BackOrderAllowedIndicatorType>(_BackOrderAllowedIndicator_QNAME, BackOrderAllowedIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackorderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BackorderQuantity")
    public JAXBElement<BackorderQuantityType> createBackorderQuantity(BackorderQuantityType value) {
        return new JAXBElement<BackorderQuantityType>(_BackorderQuantity_QNAME, BackorderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BackorderReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BackorderReason")
    public JAXBElement<BackorderReasonType> createBackorderReason(BackorderReasonType value) {
        return new JAXBElement<BackorderReasonType>(_BackorderReason_QNAME, BackorderReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BalanceAmount")
    public JAXBElement<BalanceAmountType> createBalanceAmount(BalanceAmountType value) {
        return new JAXBElement<BalanceAmountType>(_BalanceAmount_QNAME, BalanceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BalanceBroughtForwardIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BalanceBroughtForwardIndicator")
    public JAXBElement<BalanceBroughtForwardIndicatorType> createBalanceBroughtForwardIndicator(BalanceBroughtForwardIndicatorType value) {
        return new JAXBElement<BalanceBroughtForwardIndicatorType>(_BalanceBroughtForwardIndicator_QNAME, BalanceBroughtForwardIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BaseAmount")
    public JAXBElement<BaseAmountType> createBaseAmount(BaseAmountType value) {
        return new JAXBElement<BaseAmountType>(_BaseAmount_QNAME, BaseAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BaseQuantity")
    public JAXBElement<BaseQuantityType> createBaseQuantity(BaseQuantityType value) {
        return new JAXBElement<BaseQuantityType>(_BaseQuantity_QNAME, BaseQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseUnitMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BaseUnitMeasure")
    public JAXBElement<BaseUnitMeasureType> createBaseUnitMeasure(BaseUnitMeasureType value) {
        return new JAXBElement<BaseUnitMeasureType>(_BaseUnitMeasure_QNAME, BaseUnitMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BatchQuantity")
    public JAXBElement<BatchQuantityType> createBatchQuantity(BatchQuantityType value) {
        return new JAXBElement<BatchQuantityType>(_BatchQuantity_QNAME, BatchQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BlockName")
    public JAXBElement<BlockNameType> createBlockName(BlockNameType value) {
        return new JAXBElement<BlockNameType>(_BlockName_QNAME, BlockNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrandNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BrandName")
    public JAXBElement<BrandNameType> createBrandName(BrandNameType value) {
        return new JAXBElement<BrandNameType>(_BrandName_QNAME, BrandNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BuildingName")
    public JAXBElement<BuildingNameType> createBuildingName(BuildingNameType value) {
        return new JAXBElement<BuildingNameType>(_BuildingName_QNAME, BuildingNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuildingNumberType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "BuildingNumber")
    public JAXBElement<BuildingNumberType> createBuildingNumber(BuildingNumberType value) {
        return new JAXBElement<BuildingNumberType>(_BuildingNumber_QNAME, BuildingNumberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CalculationRate")
    public JAXBElement<CalculationRateType> createCalculationRate(CalculationRateType value) {
        return new JAXBElement<CalculationRateType>(_CalculationRate_QNAME, CalculationRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculationSequenceNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CalculationSequenceNumeric")
    public JAXBElement<CalculationSequenceNumericType> createCalculationSequenceNumeric(CalculationSequenceNumericType value) {
        return new JAXBElement<CalculationSequenceNumericType>(_CalculationSequenceNumeric_QNAME, CalculationSequenceNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancellationNoteType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CancellationNote")
    public JAXBElement<CancellationNoteType> createCancellationNote(CancellationNoteType value) {
        return new JAXBElement<CancellationNoteType>(_CancellationNote_QNAME, CancellationNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CanonicalizationMethodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CanonicalizationMethod")
    public JAXBElement<CanonicalizationMethodType> createCanonicalizationMethod(CanonicalizationMethodType value) {
        return new JAXBElement<CanonicalizationMethodType>(_CanonicalizationMethod_QNAME, CanonicalizationMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardChipCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CardChipCode")
    public JAXBElement<CardChipCodeType> createCardChipCode(CardChipCodeType value) {
        return new JAXBElement<CardChipCodeType>(_CardChipCode_QNAME, CardChipCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CardTypeCode")
    public JAXBElement<CardTypeCodeType> createCardTypeCode(CardTypeCodeType value) {
        return new JAXBElement<CardTypeCodeType>(_CardTypeCode_QNAME, CardTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CargoTypeCode")
    public JAXBElement<CargoTypeCodeType> createCargoTypeCode(CargoTypeCodeType value) {
        return new JAXBElement<CargoTypeCodeType>(_CargoTypeCode_QNAME, CargoTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierAssignedIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CarrierAssignedID")
    public JAXBElement<CarrierAssignedIDType> createCarrierAssignedID(CarrierAssignedIDType value) {
        return new JAXBElement<CarrierAssignedIDType>(_CarrierAssignedID_QNAME, CarrierAssignedIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CatalogueIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CatalogueIndicator")
    public JAXBElement<CatalogueIndicatorType> createCatalogueIndicator(CatalogueIndicatorType value) {
        return new JAXBElement<CatalogueIndicatorType>(_CatalogueIndicator_QNAME, CatalogueIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoryNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CategoryName")
    public JAXBElement<CategoryNameType> createCategoryName(CategoryNameType value) {
        return new JAXBElement<CategoryNameType>(_CategoryName_QNAME, CategoryNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateTypeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CertificateType")
    public JAXBElement<CertificateTypeType> createCertificateType(CertificateTypeType value) {
        return new JAXBElement<CertificateTypeType>(_CertificateType_QNAME, CertificateTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Channel")
    public JAXBElement<ChannelType> createChannel(ChannelType value) {
        return new JAXBElement<ChannelType>(_Channel_QNAME, ChannelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChannelCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ChannelCode")
    public JAXBElement<ChannelCodeTypeCommBas> createChannelCode(ChannelCodeTypeCommBas value) {
        return new JAXBElement<ChannelCodeTypeCommBas>(_ChannelCode_QNAME, ChannelCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeableWeightMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ChargeableWeightMeasure")
    public JAXBElement<ChargeableWeightMeasureType> createChargeableWeightMeasure(ChargeableWeightMeasureType value) {
        return new JAXBElement<ChargeableWeightMeasureType>(_ChargeableWeightMeasure_QNAME, ChargeableWeightMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ChargeIndicator")
    public JAXBElement<ChargeIndicatorType> createChargeIndicator(ChargeIndicatorType value) {
        return new JAXBElement<ChargeIndicatorType>(_ChargeIndicator_QNAME, ChargeIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeTotalAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ChargeTotalAmount")
    public JAXBElement<ChargeTotalAmountType> createChargeTotalAmount(ChargeTotalAmountType value) {
        return new JAXBElement<ChargeTotalAmountType>(_ChargeTotalAmount_QNAME, ChargeTotalAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChipApplicationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ChipApplicationID")
    public JAXBElement<ChipApplicationIDType> createChipApplicationID(ChipApplicationIDType value) {
        return new JAXBElement<ChipApplicationIDType>(_ChipApplicationID_QNAME, ChipApplicationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CityName")
    public JAXBElement<CityNameType> createCityName(CityNameType value) {
        return new JAXBElement<CityNameType>(_CityName_QNAME, CityNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CitySubdivisionNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CitySubdivisionName")
    public JAXBElement<CitySubdivisionNameType> createCitySubdivisionName(CitySubdivisionNameType value) {
        return new JAXBElement<CitySubdivisionNameType>(_CitySubdivisionName_QNAME, CitySubdivisionNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ClassifiedIndicator")
    public JAXBElement<ClassifiedIndicatorType> createClassifiedIndicator(ClassifiedIndicatorType value) {
        return new JAXBElement<ClassifiedIndicatorType>(_ClassifiedIndicator_QNAME, ClassifiedIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeValueType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CodeValue")
    public JAXBElement<CodeValueType> createCodeValue(CodeValueType value) {
        return new JAXBElement<CodeValueType>(_CodeValue_QNAME, CodeValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CommodityCode")
    public JAXBElement<CommodityCodeType> createCommodityCode(CommodityCodeType value) {
        return new JAXBElement<CommodityCodeType>(_CommodityCode_QNAME, CommodityCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CompanyID")
    public JAXBElement<CompanyIDType> createCompanyID(CompanyIDType value) {
        return new JAXBElement<CompanyIDType>(_CompanyID_QNAME, CompanyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletionIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CompletionIndicator")
    public JAXBElement<CompletionIndicatorType> createCompletionIndicator(CompletionIndicatorType value) {
        return new JAXBElement<CompletionIndicatorType>(_CompletionIndicator_QNAME, CompletionIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Condition")
    public JAXBElement<ConditionType> createCondition(ConditionType value) {
        return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ConditionCode")
    public JAXBElement<ConditionCodeType> createConditionCode(ConditionCodeType value) {
        return new JAXBElement<ConditionCodeType>(_ConditionCode_QNAME, ConditionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Conditions")
    public JAXBElement<ConditionsType> createConditions(ConditionsType value) {
        return new JAXBElement<ConditionsType>(_Conditions_QNAME, ConditionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumerUnitQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ConsumerUnitQuantity")
    public JAXBElement<ConsumerUnitQuantityType> createConsumerUnitQuantity(ConsumerUnitQuantityType value) {
        return new JAXBElement<ConsumerUnitQuantityType>(_ConsumerUnitQuantity_QNAME, ConsumerUnitQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentUnitQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ContentUnitQuantity")
    public JAXBElement<ContentUnitQuantityType> createContentUnitQuantity(ContentUnitQuantityType value) {
        return new JAXBElement<ContentUnitQuantityType>(_ContentUnitQuantity_QNAME, ContentUnitQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractSubdivisionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ContractSubdivision")
    public JAXBElement<ContractSubdivisionType> createContractSubdivision(ContractSubdivisionType value) {
        return new JAXBElement<ContractSubdivisionType>(_ContractSubdivision_QNAME, ContractSubdivisionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractTypeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ContractType")
    public JAXBElement<ContractTypeType> createContractType(ContractTypeType value) {
        return new JAXBElement<ContractTypeType>(_ContractType_QNAME, ContractTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContractTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ContractTypeCode")
    public JAXBElement<ContractTypeCodeType> createContractTypeCode(ContractTypeCodeType value) {
        return new JAXBElement<ContractTypeCodeType>(_ContractTypeCode_QNAME, ContractTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoordinateSystemCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CoordinateSystemCode")
    public JAXBElement<CoordinateSystemCodeType> createCoordinateSystemCode(CoordinateSystemCodeType value) {
        return new JAXBElement<CoordinateSystemCodeType>(_CoordinateSystemCode_QNAME, CoordinateSystemCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopiesNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CopiesNumeric")
    public JAXBElement<CopiesNumericType> createCopiesNumeric(CopiesNumericType value) {
        return new JAXBElement<CopiesNumericType>(_CopiesNumeric_QNAME, CopiesNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CopyIndicator")
    public JAXBElement<CopyIndicatorType> createCopyIndicator(CopyIndicatorType value) {
        return new JAXBElement<CopyIndicatorType>(_CopyIndicator_QNAME, CopyIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorporateRegistrationTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CorporateRegistrationTypeCode")
    public JAXBElement<CorporateRegistrationTypeCodeType> createCorporateRegistrationTypeCode(CorporateRegistrationTypeCodeType value) {
        return new JAXBElement<CorporateRegistrationTypeCodeType>(_CorporateRegistrationTypeCode_QNAME, CorporateRegistrationTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountrySubentityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CountrySubentity")
    public JAXBElement<CountrySubentityType> createCountrySubentity(CountrySubentityType value) {
        return new JAXBElement<CountrySubentityType>(_CountrySubentity_QNAME, CountrySubentityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountrySubentityCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CountrySubentityCode")
    public JAXBElement<CountrySubentityCodeType> createCountrySubentityCode(CountrySubentityCodeType value) {
        return new JAXBElement<CountrySubentityCodeType>(_CountrySubentityCode_QNAME, CountrySubentityCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CreditAmount")
    public JAXBElement<CreditAmountType> createCreditAmount(CreditAmountType value) {
        return new JAXBElement<CreditAmountType>(_CreditAmount_QNAME, CreditAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditedQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CreditedQuantity")
    public JAXBElement<CreditedQuantityType> createCreditedQuantity(CreditedQuantityType value) {
        return new JAXBElement<CreditedQuantityType>(_CreditedQuantity_QNAME, CreditedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditLineAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CreditLineAmount")
    public JAXBElement<CreditLineAmountType> createCreditLineAmount(CreditLineAmountType value) {
        return new JAXBElement<CreditLineAmountType>(_CreditLineAmount_QNAME, CreditLineAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyBaseRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CurrencyBaseRate")
    public JAXBElement<CurrencyBaseRateType> createCurrencyBaseRate(CurrencyBaseRateType value) {
        return new JAXBElement<CurrencyBaseRateType>(_CurrencyBaseRate_QNAME, CurrencyBaseRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CurrencyCode")
    public JAXBElement<CurrencyCodeTypeCommBas> createCurrencyCode(CurrencyCodeTypeCommBas value) {
        return new JAXBElement<CurrencyCodeTypeCommBas>(_CurrencyCode_QNAME, CurrencyCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerAssignedAccountIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomerAssignedAccountID")
    public JAXBElement<CustomerAssignedAccountIDType> createCustomerAssignedAccountID(CustomerAssignedAccountIDType value) {
        return new JAXBElement<CustomerAssignedAccountIDType>(_CustomerAssignedAccountID_QNAME, CustomerAssignedAccountIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomerReference")
    public JAXBElement<CustomerReferenceType> createCustomerReference(CustomerReferenceType value) {
        return new JAXBElement<CustomerReferenceType>(_CustomerReference_QNAME, CustomerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomizationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomizationID")
    public JAXBElement<CustomizationIDType> createCustomizationID(CustomizationIDType value) {
        return new JAXBElement<CustomizationIDType>(_CustomizationID_QNAME, CustomizationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomsID")
    public JAXBElement<CustomsIDType> createCustomsID(CustomsIDType value) {
        return new JAXBElement<CustomsIDType>(_CustomsID_QNAME, CustomsIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsImportClassifiedIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomsImportClassifiedIndicator")
    public JAXBElement<CustomsImportClassifiedIndicatorType> createCustomsImportClassifiedIndicator(CustomsImportClassifiedIndicatorType value) {
        return new JAXBElement<CustomsImportClassifiedIndicatorType>(_CustomsImportClassifiedIndicator_QNAME, CustomsImportClassifiedIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsStatusCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomsStatusCode")
    public JAXBElement<CustomsStatusCodeType> createCustomsStatusCode(CustomsStatusCodeType value) {
        return new JAXBElement<CustomsStatusCodeType>(_CustomsStatusCode_QNAME, CustomsStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTariffQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CustomsTariffQuantity")
    public JAXBElement<CustomsTariffQuantityType> createCustomsTariffQuantity(CustomsTariffQuantityType value) {
        return new JAXBElement<CustomsTariffQuantityType>(_CustomsTariffQuantity_QNAME, CustomsTariffQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CV2IDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "CV2ID")
    public JAXBElement<CV2IDType> createCV2ID(CV2IDType value) {
        return new JAXBElement<CV2IDType>(_CV2ID_QNAME, CV2IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DamageRemarksType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DamageRemarks")
    public JAXBElement<DamageRemarksType> createDamageRemarks(DamageRemarksType value) {
        return new JAXBElement<DamageRemarksType>(_DamageRemarks_QNAME, DamageRemarksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataSendingCapabilityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DataSendingCapability")
    public JAXBElement<DataSendingCapabilityType> createDataSendingCapability(DataSendingCapabilityType value) {
        return new JAXBElement<DataSendingCapabilityType>(_DataSendingCapability_QNAME, DataSendingCapabilityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Date")
    public JAXBElement<DateType> createDate(DateType value) {
        return new JAXBElement<DateType>(_Date_QNAME, DateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DebitAmount")
    public JAXBElement<DebitAmountType> createDebitAmount(DebitAmountType value) {
        return new JAXBElement<DebitAmountType>(_DebitAmount_QNAME, DebitAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitedQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DebitedQuantity")
    public JAXBElement<DebitedQuantityType> createDebitedQuantity(DebitedQuantityType value) {
        return new JAXBElement<DebitedQuantityType>(_DebitedQuantity_QNAME, DebitedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitLineAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DebitLineAmount")
    public JAXBElement<DebitLineAmountType> createDebitLineAmount(DebitLineAmountType value) {
        return new JAXBElement<DebitLineAmountType>(_DebitLineAmount_QNAME, DebitLineAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclaredCarriageValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeclaredCarriageValueAmount")
    public JAXBElement<DeclaredCarriageValueAmountType> createDeclaredCarriageValueAmount(DeclaredCarriageValueAmountType value) {
        return new JAXBElement<DeclaredCarriageValueAmountType>(_DeclaredCarriageValueAmount_QNAME, DeclaredCarriageValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclaredCustomsValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeclaredCustomsValueAmount")
    public JAXBElement<DeclaredCustomsValueAmountType> createDeclaredCustomsValueAmount(DeclaredCustomsValueAmountType value) {
        return new JAXBElement<DeclaredCustomsValueAmountType>(_DeclaredCustomsValueAmount_QNAME, DeclaredCustomsValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclaredForCarriageValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeclaredForCarriageValueAmount")
    public JAXBElement<DeclaredForCarriageValueAmountType> createDeclaredForCarriageValueAmount(DeclaredForCarriageValueAmountType value) {
        return new JAXBElement<DeclaredForCarriageValueAmountType>(_DeclaredForCarriageValueAmount_QNAME, DeclaredForCarriageValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclaredStatisticsValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeclaredStatisticsValueAmount")
    public JAXBElement<DeclaredStatisticsValueAmountType> createDeclaredStatisticsValueAmount(DeclaredStatisticsValueAmountType value) {
        return new JAXBElement<DeclaredStatisticsValueAmountType>(_DeclaredStatisticsValueAmount_QNAME, DeclaredStatisticsValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DegreesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DegreesMeasure")
    public JAXBElement<DegreesMeasureType> createDegreesMeasure(DegreesMeasureType value) {
        return new JAXBElement<DegreesMeasureType>(_DegreesMeasure_QNAME, DegreesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveredQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeliveredQuantity")
    public JAXBElement<DeliveredQuantityType> createDeliveredQuantity(DeliveredQuantityType value) {
        return new JAXBElement<DeliveredQuantityType>(_DeliveredQuantity_QNAME, DeliveredQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeliveryDate")
    public JAXBElement<DeliveryDateType> createDeliveryDate(DeliveryDateType value) {
        return new JAXBElement<DeliveryDateType>(_DeliveryDate_QNAME, DeliveryDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryInstructionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeliveryInstructions")
    public JAXBElement<DeliveryInstructionsType> createDeliveryInstructions(DeliveryInstructionsType value) {
        return new JAXBElement<DeliveryInstructionsType>(_DeliveryInstructions_QNAME, DeliveryInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DeliveryTime")
    public JAXBElement<DeliveryTimeType> createDeliveryTime(DeliveryTimeType value) {
        return new JAXBElement<DeliveryTimeType>(_DeliveryTime_QNAME, DeliveryTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepartmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Department")
    public JAXBElement<DepartmentType> createDepartment(DepartmentType value) {
        return new JAXBElement<DepartmentType>(_Department_QNAME, DepartmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Description")
    public JAXBElement<DescriptionType> createDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_Description_QNAME, DescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DescriptionCode")
    public JAXBElement<DescriptionCodeType> createDescriptionCode(DescriptionCodeType value) {
        return new JAXBElement<DescriptionCodeType>(_DescriptionCode_QNAME, DescriptionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchAdviceTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DespatchAdviceTypeCode")
    public JAXBElement<DespatchAdviceTypeCodeType> createDespatchAdviceTypeCode(DespatchAdviceTypeCodeType value) {
        return new JAXBElement<DespatchAdviceTypeCodeType>(_DespatchAdviceTypeCode_QNAME, DespatchAdviceTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DespatchDate")
    public JAXBElement<DespatchDateType> createDespatchDate(DespatchDateType value) {
        return new JAXBElement<DespatchDateType>(_DespatchDate_QNAME, DespatchDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DespatchTime")
    public JAXBElement<DespatchTimeType> createDespatchTime(DespatchTimeType value) {
        return new JAXBElement<DespatchTimeType>(_DespatchTime_QNAME, DespatchTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DirectionCode")
    public JAXBElement<DirectionCodeType> createDirectionCode(DirectionCodeType value) {
        return new JAXBElement<DirectionCodeType>(_DirectionCode_QNAME, DirectionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountPercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DiscountPercent")
    public JAXBElement<DiscountPercentType> createDiscountPercent(DiscountPercentType value) {
        return new JAXBElement<DiscountPercentType>(_DiscountPercent_QNAME, DiscountPercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DispositionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DispositionCode")
    public JAXBElement<DispositionCodeType> createDispositionCode(DispositionCodeType value) {
        return new JAXBElement<DispositionCodeType>(_DispositionCode_QNAME, DispositionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DistrictType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "District")
    public JAXBElement<DistrictType> createDistrict(DistrictType value) {
        return new JAXBElement<DistrictType>(_District_QNAME, DistrictType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentBinaryObjectType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentBinaryObject")
    public JAXBElement<DocumentBinaryObjectType> createDocumentBinaryObject(DocumentBinaryObjectType value) {
        return new JAXBElement<DocumentBinaryObjectType>(_DocumentBinaryObject_QNAME, DocumentBinaryObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentCurrencyCode")
    public JAXBElement<DocumentCurrencyCodeType> createDocumentCurrencyCode(DocumentCurrencyCodeType value) {
        return new JAXBElement<DocumentCurrencyCodeType>(_DocumentCurrencyCode_QNAME, DocumentCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentHashType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentHash")
    public JAXBElement<DocumentHashType> createDocumentHash(DocumentHashType value) {
        return new JAXBElement<DocumentHashType>(_DocumentHash_QNAME, DocumentHashType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentID")
    public JAXBElement<DocumentIDType> createDocumentID(DocumentIDType value) {
        return new JAXBElement<DocumentIDType>(_DocumentID_QNAME, DocumentIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentStatusCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentStatusCode")
    public JAXBElement<DocumentStatusCodeTypeCommBas> createDocumentStatusCode(DocumentStatusCodeTypeCommBas value) {
        return new JAXBElement<DocumentStatusCodeTypeCommBas>(_DocumentStatusCode_QNAME, DocumentStatusCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentTypeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentType")
    public JAXBElement<DocumentTypeType> createDocumentType(DocumentTypeType value) {
        return new JAXBElement<DocumentTypeType>(_DocumentType_QNAME, DocumentTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DocumentTypeCode")
    public JAXBElement<DocumentTypeCodeType> createDocumentTypeCode(DocumentTypeCodeType value) {
        return new JAXBElement<DocumentTypeCodeType>(_DocumentTypeCode_QNAME, DocumentTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DurationMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "DurationMeasure")
    public JAXBElement<DurationMeasureType> createDurationMeasure(DurationMeasureType value) {
        return new JAXBElement<DurationMeasureType>(_DurationMeasure_QNAME, DurationMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectronicMailType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ElectronicMail")
    public JAXBElement<ElectronicMailType> createElectronicMail(ElectronicMailType value) {
        return new JAXBElement<ElectronicMailType>(_ElectronicMail_QNAME, ElectronicMailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbeddedDocumentBinaryObjectType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EmbeddedDocumentBinaryObject")
    public JAXBElement<EmbeddedDocumentBinaryObjectType> createEmbeddedDocumentBinaryObject(EmbeddedDocumentBinaryObjectType value) {
        return new JAXBElement<EmbeddedDocumentBinaryObjectType>(_EmbeddedDocumentBinaryObject_QNAME, EmbeddedDocumentBinaryObjectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmergencyProceduresCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EmergencyProceduresCode")
    public JAXBElement<EmergencyProceduresCodeType> createEmergencyProceduresCode(EmergencyProceduresCodeType value) {
        return new JAXBElement<EmergencyProceduresCodeType>(_EmergencyProceduresCode_QNAME, EmergencyProceduresCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EndDate")
    public JAXBElement<EndDateType> createEndDate(EndDateType value) {
        return new JAXBElement<EndDateType>(_EndDate_QNAME, EndDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndpointIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EndpointID")
    public JAXBElement<EndpointIDType> createEndpointID(EndpointIDType value) {
        return new JAXBElement<EndpointIDType>(_EndpointID_QNAME, EndpointIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EndTime")
    public JAXBElement<EndTimeType> createEndTime(EndTimeType value) {
        return new JAXBElement<EndTimeType>(_EndTime_QNAME, EndTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedDespatchDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EstimatedDespatchDate")
    public JAXBElement<EstimatedDespatchDateType> createEstimatedDespatchDate(EstimatedDespatchDateType value) {
        return new JAXBElement<EstimatedDespatchDateType>(_EstimatedDespatchDate_QNAME, EstimatedDespatchDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstimatedDespatchTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EstimatedDespatchTime")
    public JAXBElement<EstimatedDespatchTimeType> createEstimatedDespatchTime(EstimatedDespatchTimeType value) {
        return new JAXBElement<EstimatedDespatchTimeType>(_EstimatedDespatchTime_QNAME, EstimatedDespatchTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "EventCode")
    public JAXBElement<EventCodeType> createEventCode(EventCodeType value) {
        return new JAXBElement<EventCodeType>(_EventCode_QNAME, EventCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeMarketIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExchangeMarketID")
    public JAXBElement<ExchangeMarketIDType> createExchangeMarketID(ExchangeMarketIDType value) {
        return new JAXBElement<ExchangeMarketIDType>(_ExchangeMarketID_QNAME, ExchangeMarketIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExemptionReason")
    public JAXBElement<ExemptionReasonType> createExemptionReason(ExemptionReasonType value) {
        return new JAXBElement<ExemptionReasonType>(_ExemptionReason_QNAME, ExemptionReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionReasonCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExemptionReasonCode")
    public JAXBElement<ExemptionReasonCodeType> createExemptionReasonCode(ExemptionReasonCodeType value) {
        return new JAXBElement<ExemptionReasonCodeType>(_ExemptionReasonCode_QNAME, ExemptionReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpiryDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExpiryDate")
    public JAXBElement<ExpiryDateType> createExpiryDate(ExpiryDateType value) {
        return new JAXBElement<ExpiryDateType>(_ExpiryDate_QNAME, ExpiryDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpiryTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExpiryTime")
    public JAXBElement<ExpiryTimeType> createExpiryTime(ExpiryTimeType value) {
        return new JAXBElement<ExpiryTimeType>(_ExpiryTime_QNAME, ExpiryTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ExtendedID")
    public JAXBElement<ExtendedIDType> createExtendedID(ExtendedIDType value) {
        return new JAXBElement<ExtendedIDType>(_ExtendedID_QNAME, ExtendedIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Extension")
    public JAXBElement<ExtensionType> createExtension(ExtensionType value) {
        return new JAXBElement<ExtensionType>(_Extension_QNAME, ExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactorNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FactorNumeric")
    public JAXBElement<FactorNumericType> createFactorNumeric(FactorNumericType value) {
        return new JAXBElement<FactorNumericType>(_FactorNumeric_QNAME, FactorNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FamilyNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FamilyName")
    public JAXBElement<FamilyNameType> createFamilyName(FamilyNameType value) {
        return new JAXBElement<FamilyNameType>(_FamilyName_QNAME, FamilyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FirstNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FirstName")
    public JAXBElement<FirstNameType> createFirstName(FirstNameType value) {
        return new JAXBElement<FirstNameType>(_FirstName_QNAME, FirstNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FloorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Floor")
    public JAXBElement<FloorType> createFloor(FloorType value) {
        return new JAXBElement<FloorType>(_Floor_QNAME, FloorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeOfChargeIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FreeOfChargeIndicator")
    public JAXBElement<FreeOfChargeIndicatorType> createFreeOfChargeIndicator(FreeOfChargeIndicatorType value) {
        return new JAXBElement<FreeOfChargeIndicatorType>(_FreeOfChargeIndicator_QNAME, FreeOfChargeIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeOnBoardValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FreeOnBoardValueAmount")
    public JAXBElement<FreeOnBoardValueAmountType> createFreeOnBoardValueAmount(FreeOnBoardValueAmountType value) {
        return new JAXBElement<FreeOnBoardValueAmountType>(_FreeOnBoardValueAmount_QNAME, FreeOnBoardValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreightRateClassCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FreightRateClassCode")
    public JAXBElement<FreightRateClassCodeType> createFreightRateClassCode(FreightRateClassCodeType value) {
        return new JAXBElement<FreightRateClassCodeType>(_FreightRateClassCode_QNAME, FreightRateClassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullnessIndicationCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "FullnessIndicationCode")
    public JAXBElement<FullnessIndicationCodeType> createFullnessIndicationCode(FullnessIndicationCodeType value) {
        return new JAXBElement<FullnessIndicationCodeType>(_FullnessIndicationCode_QNAME, FullnessIndicationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "GoodsItemQuantity")
    public JAXBElement<GoodsItemQuantityType> createGoodsItemQuantity(GoodsItemQuantityType value) {
        return new JAXBElement<GoodsItemQuantityType>(_GoodsItemQuantity_QNAME, GoodsItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossVolumeMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "GrossVolumeMeasure")
    public JAXBElement<GrossVolumeMeasureType> createGrossVolumeMeasure(GrossVolumeMeasureType value) {
        return new JAXBElement<GrossVolumeMeasureType>(_GrossVolumeMeasure_QNAME, GrossVolumeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrossWeightMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "GrossWeightMeasure")
    public JAXBElement<GrossWeightMeasureType> createGrossWeightMeasure(GrossWeightMeasureType value) {
        return new JAXBElement<GrossWeightMeasureType>(_GrossWeightMeasure_QNAME, GrossWeightMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HandlingCode")
    public JAXBElement<HandlingCodeType> createHandlingCode(HandlingCodeType value) {
        return new JAXBElement<HandlingCodeType>(_HandlingCode_QNAME, HandlingCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HandlingInstructionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HandlingInstructions")
    public JAXBElement<HandlingInstructionsType> createHandlingInstructions(HandlingInstructionsType value) {
        return new JAXBElement<HandlingInstructionsType>(_HandlingInstructions_QNAME, HandlingInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardClassIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HazardClassID")
    public JAXBElement<HazardClassIDType> createHazardClassID(HazardClassIDType value) {
        return new JAXBElement<HazardClassIDType>(_HazardClassID_QNAME, HazardClassIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousCategoryCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HazardousCategoryCode")
    public JAXBElement<HazardousCategoryCodeType> createHazardousCategoryCode(HazardousCategoryCodeType value) {
        return new JAXBElement<HazardousCategoryCodeType>(_HazardousCategoryCode_QNAME, HazardousCategoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousRegulationCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HazardousRegulationCode")
    public JAXBElement<HazardousRegulationCodeType> createHazardousRegulationCode(HazardousRegulationCodeType value) {
        return new JAXBElement<HazardousRegulationCodeType>(_HazardousRegulationCode_QNAME, HazardousRegulationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HazardousRiskIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HazardousRiskIndicator")
    public JAXBElement<HazardousRiskIndicatorType> createHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        return new JAXBElement<HazardousRiskIndicatorType>(_HazardousRiskIndicator_QNAME, HazardousRiskIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolderNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "HolderName")
    public JAXBElement<HolderNameType> createHolderName(HolderNameType value) {
        return new JAXBElement<HolderNameType>(_HolderName_QNAME, HolderNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ID")
    public JAXBElement<IDType> createID(IDType value) {
        return new JAXBElement<IDType>(_ID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IdentificationCode")
    public JAXBElement<IdentificationCodeType> createIdentificationCode(IdentificationCodeType value) {
        return new JAXBElement<IdentificationCodeType>(_IdentificationCode_QNAME, IdentificationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IdentificationID")
    public JAXBElement<IdentificationIDType> createIdentificationID(IdentificationIDType value) {
        return new JAXBElement<IdentificationIDType>(_IdentificationID_QNAME, IdentificationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicationIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IndicationIndicator")
    public JAXBElement<IndicationIndicatorType> createIndicationIndicator(IndicationIndicatorType value) {
        return new JAXBElement<IndicationIndicatorType>(_IndicationIndicator_QNAME, IndicationIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Indicator")
    public JAXBElement<IndicatorType> createIndicator(IndicatorType value) {
        return new JAXBElement<IndicatorType>(_Indicator_QNAME, IndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Information")
    public JAXBElement<InformationType> createInformation(InformationType value) {
        return new JAXBElement<InformationType>(_Information_QNAME, InformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhalationToxicityZoneCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InhalationToxicityZoneCode")
    public JAXBElement<InhalationToxicityZoneCodeType> createInhalationToxicityZoneCode(InhalationToxicityZoneCodeType value) {
        return new JAXBElement<InhalationToxicityZoneCodeType>(_InhalationToxicityZoneCode_QNAME, InhalationToxicityZoneCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhouseMailType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InhouseMail")
    public JAXBElement<InhouseMailType> createInhouseMail(InhouseMailType value) {
        return new JAXBElement<InhouseMailType>(_InhouseMail_QNAME, InhouseMailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InspectionMethodCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InspectionMethodCode")
    public JAXBElement<InspectionMethodCodeType> createInspectionMethodCode(InspectionMethodCodeType value) {
        return new JAXBElement<InspectionMethodCodeType>(_InspectionMethodCode_QNAME, InspectionMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstructionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Instruction")
    public JAXBElement<InstructionType> createInstruction(InstructionType value) {
        return new JAXBElement<InstructionType>(_Instruction_QNAME, InstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstructionIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InstructionID")
    public JAXBElement<InstructionIDType> createInstructionID(InstructionIDType value) {
        return new JAXBElement<InstructionIDType>(_InstructionID_QNAME, InstructionIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstructionNoteType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InstructionNote")
    public JAXBElement<InstructionNoteType> createInstructionNote(InstructionNoteType value) {
        return new JAXBElement<InstructionNoteType>(_InstructionNote_QNAME, InstructionNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstructionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Instructions")
    public JAXBElement<InstructionsType> createInstructions(InstructionsType value) {
        return new JAXBElement<InstructionsType>(_Instructions_QNAME, InstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsurancePremiumAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InsurancePremiumAmount")
    public JAXBElement<InsurancePremiumAmountType> createInsurancePremiumAmount(InsurancePremiumAmountType value) {
        return new JAXBElement<InsurancePremiumAmountType>(_InsurancePremiumAmount_QNAME, InsurancePremiumAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InsuranceValueAmount")
    public JAXBElement<InsuranceValueAmountType> createInsuranceValueAmount(InsuranceValueAmountType value) {
        return new JAXBElement<InsuranceValueAmountType>(_InsuranceValueAmount_QNAME, InsuranceValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InvoiceAmount")
    public JAXBElement<InvoiceAmountType> createInvoiceAmount(InvoiceAmountType value) {
        return new JAXBElement<InvoiceAmountType>(_InvoiceAmount_QNAME, InvoiceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicedQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InvoicedQuantity")
    public JAXBElement<InvoicedQuantityType> createInvoicedQuantity(InvoicedQuantityType value) {
        return new JAXBElement<InvoicedQuantityType>(_InvoicedQuantity_QNAME, InvoicedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InvoiceTypeCode")
    public JAXBElement<InvoiceTypeCodeType> createInvoiceTypeCode(InvoiceTypeCodeType value) {
        return new JAXBElement<InvoiceTypeCodeType>(_InvoiceTypeCode_QNAME, InvoiceTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoicingPartyReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "InvoicingPartyReference")
    public JAXBElement<InvoicingPartyReferenceType> createInvoicingPartyReference(InvoicingPartyReferenceType value) {
        return new JAXBElement<InvoicingPartyReferenceType>(_InvoicingPartyReference_QNAME, InvoicingPartyReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IssueDate")
    public JAXBElement<IssueDateType> createIssueDate(IssueDateType value) {
        return new JAXBElement<IssueDateType>(_IssueDate_QNAME, IssueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueNumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IssueNumberID")
    public JAXBElement<IssueNumberIDType> createIssueNumberID(IssueNumberIDType value) {
        return new JAXBElement<IssueNumberIDType>(_IssueNumberID_QNAME, IssueNumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssuerIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IssuerID")
    public JAXBElement<IssuerIDType> createIssuerID(IssuerIDType value) {
        return new JAXBElement<IssuerIDType>(_IssuerID_QNAME, IssuerIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IssueTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "IssueTime")
    public JAXBElement<IssueTimeType> createIssueTime(IssueTimeType value) {
        return new JAXBElement<IssueTimeType>(_IssueTime_QNAME, IssueTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemClassificationCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ItemClassificationCode")
    public JAXBElement<ItemClassificationCodeType> createItemClassificationCode(ItemClassificationCodeType value) {
        return new JAXBElement<ItemClassificationCodeType>(_ItemClassificationCode_QNAME, ItemClassificationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemUpdateRequestIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ItemUpdateRequestIndicator")
    public JAXBElement<ItemUpdateRequestIndicatorType> createItemUpdateRequestIndicator(ItemUpdateRequestIndicatorType value) {
        return new JAXBElement<ItemUpdateRequestIndicatorType>(_ItemUpdateRequestIndicator_QNAME, ItemUpdateRequestIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "JobID")
    public JAXBElement<JobIDType> createJobID(JobIDType value) {
        return new JAXBElement<JobIDType>(_JobID_QNAME, JobIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JobTitleType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "JobTitle")
    public JAXBElement<JobTitleType> createJobTitle(JobTitleType value) {
        return new JAXBElement<JobTitleType>(_JobTitle_QNAME, JobTitleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JourneyIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "JourneyID")
    public JAXBElement<JourneyIDType> createJourneyID(JourneyIDType value) {
        return new JAXBElement<JourneyIDType>(_JourneyID_QNAME, JourneyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KeywordType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Keyword")
    public JAXBElement<KeywordType> createKeyword(KeywordType value) {
        return new JAXBElement<KeywordType>(_Keyword_QNAME, KeywordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LanguageID")
    public JAXBElement<LanguageIDType> createLanguageID(LanguageIDType value) {
        return new JAXBElement<LanguageIDType>(_LanguageID_QNAME, LanguageIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastRevisionDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LastRevisionDate")
    public JAXBElement<LastRevisionDateType> createLastRevisionDate(LastRevisionDateType value) {
        return new JAXBElement<LastRevisionDateType>(_LastRevisionDate_QNAME, LastRevisionDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LastRevisionTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LastRevisionTime")
    public JAXBElement<LastRevisionTimeType> createLastRevisionTime(LastRevisionTimeType value) {
        return new JAXBElement<LastRevisionTimeType>(_LastRevisionTime_QNAME, LastRevisionTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatestDeliveryDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LatestDeliveryDate")
    public JAXBElement<LatestDeliveryDateType> createLatestDeliveryDate(LatestDeliveryDateType value) {
        return new JAXBElement<LatestDeliveryDateType>(_LatestDeliveryDate_QNAME, LatestDeliveryDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatestDeliveryTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LatestDeliveryTime")
    public JAXBElement<LatestDeliveryTimeType> createLatestDeliveryTime(LatestDeliveryTimeType value) {
        return new JAXBElement<LatestDeliveryTimeType>(_LatestDeliveryTime_QNAME, LatestDeliveryTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatitudeDegreesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LatitudeDegreesMeasure")
    public JAXBElement<LatitudeDegreesMeasureType> createLatitudeDegreesMeasure(LatitudeDegreesMeasureType value) {
        return new JAXBElement<LatitudeDegreesMeasureType>(_LatitudeDegreesMeasure_QNAME, LatitudeDegreesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatitudeDirectionCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LatitudeDirectionCode")
    public JAXBElement<LatitudeDirectionCodeTypeCommBas> createLatitudeDirectionCode(LatitudeDirectionCodeTypeCommBas value) {
        return new JAXBElement<LatitudeDirectionCodeTypeCommBas>(_LatitudeDirectionCode_QNAME, LatitudeDirectionCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LatitudeMinutesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LatitudeMinutesMeasure")
    public JAXBElement<LatitudeMinutesMeasureType> createLatitudeMinutesMeasure(LatitudeMinutesMeasureType value) {
        return new JAXBElement<LatitudeMinutesMeasureType>(_LatitudeMinutesMeasure_QNAME, LatitudeMinutesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadTimeMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LeadTimeMeasure")
    public JAXBElement<LeadTimeMeasureType> createLeadTimeMeasure(LeadTimeMeasureType value) {
        return new JAXBElement<LeadTimeMeasureType>(_LeadTimeMeasure_QNAME, LeadTimeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LegalStatusIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LegalStatusIndicator")
    public JAXBElement<LegalStatusIndicatorType> createLegalStatusIndicator(LegalStatusIndicatorType value) {
        return new JAXBElement<LegalStatusIndicatorType>(_LegalStatusIndicator_QNAME, LegalStatusIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LengthMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LengthMeasure")
    public JAXBElement<LengthMeasureType> createLengthMeasure(LengthMeasureType value) {
        return new JAXBElement<LengthMeasureType>(_LengthMeasure_QNAME, LengthMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensePlateIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LicensePlateID")
    public JAXBElement<LicensePlateIDType> createLicensePlateID(LicensePlateIDType value) {
        return new JAXBElement<LicensePlateIDType>(_LicensePlateID_QNAME, LicensePlateIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LifeCycleStatusCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LifeCycleStatusCode")
    public JAXBElement<LifeCycleStatusCodeType> createLifeCycleStatusCode(LifeCycleStatusCodeType value) {
        return new JAXBElement<LifeCycleStatusCodeType>(_LifeCycleStatusCode_QNAME, LifeCycleStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Line")
    public JAXBElement<LineType> createLine(LineType value) {
        return new JAXBElement<LineType>(_Line_QNAME, LineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LineAmount")
    public JAXBElement<LineAmountType> createLineAmount(LineAmountType value) {
        return new JAXBElement<LineAmountType>(_LineAmount_QNAME, LineAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineCountNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LineCountNumeric")
    public JAXBElement<LineCountNumericType> createLineCountNumeric(LineCountNumericType value) {
        return new JAXBElement<LineCountNumericType>(_LineCountNumeric_QNAME, LineCountNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineExtensionAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LineExtensionAmount")
    public JAXBElement<LineExtensionAmountType> createLineExtensionAmount(LineExtensionAmountType value) {
        return new JAXBElement<LineExtensionAmountType>(_LineExtensionAmount_QNAME, LineExtensionAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LineID")
    public JAXBElement<LineIDType> createLineID(LineIDType value) {
        return new JAXBElement<LineIDType>(_LineID_QNAME, LineIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStatusCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LineStatusCode")
    public JAXBElement<LineStatusCodeTypeCommBas> createLineStatusCode(LineStatusCodeTypeCommBas value) {
        return new JAXBElement<LineStatusCodeTypeCommBas>(_LineStatusCode_QNAME, LineStatusCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoadingLengthMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LoadingLengthMeasure")
    public JAXBElement<LoadingLengthMeasureType> createLoadingLengthMeasure(LoadingLengthMeasureType value) {
        return new JAXBElement<LoadingLengthMeasureType>(_LoadingLengthMeasure_QNAME, LoadingLengthMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocaleCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LocaleCode")
    public JAXBElement<LocaleCodeType> createLocaleCode(LocaleCodeType value) {
        return new JAXBElement<LocaleCodeType>(_LocaleCode_QNAME, LocaleCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Location")
    public JAXBElement<LocationType> createLocationCommBas(LocationType value) {
        return new JAXBElement<LocationType>(_LocationCommBas_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LocationID")
    public JAXBElement<LocationIDType> createLocationID(LocationIDType value) {
        return new JAXBElement<LocationIDType>(_LocationID_QNAME, LocationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoReferenceIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LogoReferenceID")
    public JAXBElement<LogoReferenceIDType> createLogoReferenceID(LogoReferenceIDType value) {
        return new JAXBElement<LogoReferenceIDType>(_LogoReferenceID_QNAME, LogoReferenceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongitudeDegreesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LongitudeDegreesMeasure")
    public JAXBElement<LongitudeDegreesMeasureType> createLongitudeDegreesMeasure(LongitudeDegreesMeasureType value) {
        return new JAXBElement<LongitudeDegreesMeasureType>(_LongitudeDegreesMeasure_QNAME, LongitudeDegreesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongitudeDirectionCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LongitudeDirectionCode")
    public JAXBElement<LongitudeDirectionCodeTypeCommBas> createLongitudeDirectionCode(LongitudeDirectionCodeTypeCommBas value) {
        return new JAXBElement<LongitudeDirectionCodeTypeCommBas>(_LongitudeDirectionCode_QNAME, LongitudeDirectionCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LongitudeMinutesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LongitudeMinutesMeasure")
    public JAXBElement<LongitudeMinutesMeasureType> createLongitudeMinutesMeasure(LongitudeMinutesMeasureType value) {
        return new JAXBElement<LongitudeMinutesMeasureType>(_LongitudeMinutesMeasure_QNAME, LongitudeMinutesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LossRiskType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LossRisk")
    public JAXBElement<LossRiskType> createLossRisk(LossRiskType value) {
        return new JAXBElement<LossRiskType>(_LossRisk_QNAME, LossRiskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LossRiskResponsibilityCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LossRiskResponsibilityCode")
    public JAXBElement<LossRiskResponsibilityCodeType> createLossRiskResponsibilityCode(LossRiskResponsibilityCodeType value) {
        return new JAXBElement<LossRiskResponsibilityCodeType>(_LossRiskResponsibilityCode_QNAME, LossRiskResponsibilityCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LotNumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LotNumberID")
    public JAXBElement<LotNumberIDType> createLotNumberID(LotNumberIDType value) {
        return new JAXBElement<LotNumberIDType>(_LotNumberID_QNAME, LotNumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LowerOrangeHazardPlacardIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "LowerOrangeHazardPlacardID")
    public JAXBElement<LowerOrangeHazardPlacardIDType> createLowerOrangeHazardPlacardID(LowerOrangeHazardPlacardIDType value) {
        return new JAXBElement<LowerOrangeHazardPlacardIDType>(_LowerOrangeHazardPlacardID_QNAME, LowerOrangeHazardPlacardIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Mail")
    public JAXBElement<MailType> createMail(MailType value) {
        return new JAXBElement<MailType>(_Mail_QNAME, MailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufactureDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ManufactureDate")
    public JAXBElement<ManufactureDateType> createManufactureDate(ManufactureDateType value) {
        return new JAXBElement<ManufactureDateType>(_ManufactureDate_QNAME, ManufactureDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManufactureTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ManufactureTime")
    public JAXBElement<ManufactureTimeType> createManufactureTime(ManufactureTimeType value) {
        return new JAXBElement<ManufactureTimeType>(_ManufactureTime_QNAME, ManufactureTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAttentionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MarkAttention")
    public JAXBElement<MarkAttentionType> createMarkAttention(MarkAttentionType value) {
        return new JAXBElement<MarkAttentionType>(_MarkAttention_QNAME, MarkAttentionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkAttentionIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MarkAttentionIndicator")
    public JAXBElement<MarkAttentionIndicatorType> createMarkAttentionIndicator(MarkAttentionIndicatorType value) {
        return new JAXBElement<MarkAttentionIndicatorType>(_MarkAttentionIndicator_QNAME, MarkAttentionIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkCareType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MarkCare")
    public JAXBElement<MarkCareType> createMarkCare(MarkCareType value) {
        return new JAXBElement<MarkCareType>(_MarkCare_QNAME, MarkCareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkCareIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MarkCareIndicator")
    public JAXBElement<MarkCareIndicatorType> createMarkCareIndicator(MarkCareIndicatorType value) {
        return new JAXBElement<MarkCareIndicatorType>(_MarkCareIndicator_QNAME, MarkCareIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarkingIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MarkingID")
    public JAXBElement<MarkingIDType> createMarkingID(MarkingIDType value) {
        return new JAXBElement<MarkingIDType>(_MarkingID_QNAME, MarkingIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarksType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Marks")
    public JAXBElement<MarksType> createMarks(MarksType value) {
        return new JAXBElement<MarksType>(_Marks_QNAME, MarksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MathematicOperatorCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MathematicOperatorCode")
    public JAXBElement<MathematicOperatorCodeType> createMathematicOperatorCode(MathematicOperatorCodeType value) {
        return new JAXBElement<MathematicOperatorCodeType>(_MathematicOperatorCode_QNAME, MathematicOperatorCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumBackorderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MaximumBackorderQuantity")
    public JAXBElement<MaximumBackorderQuantityType> createMaximumBackorderQuantity(MaximumBackorderQuantityType value) {
        return new JAXBElement<MaximumBackorderQuantityType>(_MaximumBackorderQuantity_QNAME, MaximumBackorderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumCopiesNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MaximumCopiesNumeric")
    public JAXBElement<MaximumCopiesNumericType> createMaximumCopiesNumeric(MaximumCopiesNumericType value) {
        return new JAXBElement<MaximumCopiesNumericType>(_MaximumCopiesNumeric_QNAME, MaximumCopiesNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MaximumMeasure")
    public JAXBElement<MaximumMeasureType> createMaximumMeasure(MaximumMeasureType value) {
        return new JAXBElement<MaximumMeasureType>(_MaximumMeasure_QNAME, MaximumMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumOrderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MaximumOrderQuantity")
    public JAXBElement<MaximumOrderQuantityType> createMaximumOrderQuantity(MaximumOrderQuantityType value) {
        return new JAXBElement<MaximumOrderQuantityType>(_MaximumOrderQuantity_QNAME, MaximumOrderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaximumQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MaximumQuantity")
    public JAXBElement<MaximumQuantityType> createMaximumQuantity(MaximumQuantityType value) {
        return new JAXBElement<MaximumQuantityType>(_MaximumQuantity_QNAME, MaximumQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Measure")
    public JAXBElement<MeasureTypeCommBas> createMeasure(MeasureTypeCommBas value) {
        return new JAXBElement<MeasureTypeCommBas>(_Measure_QNAME, MeasureTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MedicalFirstAidGuideCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MedicalFirstAidGuideCode")
    public JAXBElement<MedicalFirstAidGuideCodeType> createMedicalFirstAidGuideCode(MedicalFirstAidGuideCodeType value) {
        return new JAXBElement<MedicalFirstAidGuideCodeType>(_MedicalFirstAidGuideCode_QNAME, MedicalFirstAidGuideCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiddleNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MiddleName")
    public JAXBElement<MiddleNameType> createMiddleName(MiddleNameType value) {
        return new JAXBElement<MiddleNameType>(_MiddleName_QNAME, MiddleNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumBackorderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MinimumBackorderQuantity")
    public JAXBElement<MinimumBackorderQuantityType> createMinimumBackorderQuantity(MinimumBackorderQuantityType value) {
        return new JAXBElement<MinimumBackorderQuantityType>(_MinimumBackorderQuantity_QNAME, MinimumBackorderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MinimumMeasure")
    public JAXBElement<MinimumMeasureType> createMinimumMeasure(MinimumMeasureType value) {
        return new JAXBElement<MinimumMeasureType>(_MinimumMeasure_QNAME, MinimumMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumOrderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MinimumOrderQuantity")
    public JAXBElement<MinimumOrderQuantityType> createMinimumOrderQuantity(MinimumOrderQuantityType value) {
        return new JAXBElement<MinimumOrderQuantityType>(_MinimumOrderQuantity_QNAME, MinimumOrderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinimumQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MinimumQuantity")
    public JAXBElement<MinimumQuantityType> createMinimumQuantity(MinimumQuantityType value) {
        return new JAXBElement<MinimumQuantityType>(_MinimumQuantity_QNAME, MinimumQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MinutesMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MinutesMeasure")
    public JAXBElement<MinutesMeasureType> createMinutesMeasure(MinutesMeasureType value) {
        return new JAXBElement<MinutesMeasureType>(_MinutesMeasure_QNAME, MinutesMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModelNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ModelName")
    public JAXBElement<ModelNameType> createModelName(ModelNameType value) {
        return new JAXBElement<ModelNameType>(_ModelName_QNAME, ModelNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplierFactorNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "MultiplierFactorNumeric")
    public JAXBElement<MultiplierFactorNumericType> createMultiplierFactorNumeric(MultiplierFactorNumericType value) {
        return new JAXBElement<MultiplierFactorNumericType>(_MultiplierFactorNumeric_QNAME, MultiplierFactorNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Name")
    public JAXBElement<NameTypeCommBas> createName(NameTypeCommBas value) {
        return new JAXBElement<NameTypeCommBas>(_Name_QNAME, NameTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameSuffixType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NameSuffix")
    public JAXBElement<NameSuffixType> createNameSuffix(NameSuffixType value) {
        return new JAXBElement<NameSuffixType>(_NameSuffix_QNAME, NameSuffixType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Nationality")
    public JAXBElement<NationalityType> createNationality(NationalityType value) {
        return new JAXBElement<NationalityType>(_Nationality_QNAME, NationalityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NationalityIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NationalityID")
    public JAXBElement<NationalityIDType> createNationalityID(NationalityIDType value) {
        return new JAXBElement<NationalityIDType>(_NationalityID_QNAME, NationalityIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NatureCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NatureCode")
    public JAXBElement<NatureCodeType> createNatureCode(NatureCodeType value) {
        return new JAXBElement<NatureCodeType>(_NatureCode_QNAME, NatureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetNetWeightMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NetNetWeightMeasure")
    public JAXBElement<NetNetWeightMeasureType> createNetNetWeightMeasure(NetNetWeightMeasureType value) {
        return new JAXBElement<NetNetWeightMeasureType>(_NetNetWeightMeasure_QNAME, NetNetWeightMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetVolumeMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NetVolumeMeasure")
    public JAXBElement<NetVolumeMeasureType> createNetVolumeMeasure(NetVolumeMeasureType value) {
        return new JAXBElement<NetVolumeMeasureType>(_NetVolumeMeasure_QNAME, NetVolumeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetWeightMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NetWeightMeasure")
    public JAXBElement<NetWeightMeasureType> createNetWeightMeasure(NetWeightMeasureType value) {
        return new JAXBElement<NetWeightMeasureType>(_NetWeightMeasure_QNAME, NetWeightMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NetworkID")
    public JAXBElement<NetworkIDType> createNetworkID(NetworkIDType value) {
        return new JAXBElement<NetworkIDType>(_NetworkID_QNAME, NetworkIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Note")
    public JAXBElement<NoteType> createNote(NoteType value) {
        return new JAXBElement<NoteType>(_Note_QNAME, NoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "NumberID")
    public JAXBElement<NumberIDType> createNumberID(NumberIDType value) {
        return new JAXBElement<NumberIDType>(_NumberID_QNAME, NumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccurrenceDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OccurrenceDate")
    public JAXBElement<OccurrenceDateType> createOccurrenceDate(OccurrenceDateType value) {
        return new JAXBElement<OccurrenceDateType>(_OccurrenceDate_QNAME, OccurrenceDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OccurrenceTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OccurrenceTime")
    public JAXBElement<OccurrenceTimeType> createOccurrenceTime(OccurrenceTimeType value) {
        return new JAXBElement<OccurrenceTimeType>(_OccurrenceTime_QNAME, OccurrenceTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OnCarriageIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OnCarriageIndicator")
    public JAXBElement<OnCarriageIndicatorType> createOnCarriageIndicator(OnCarriageIndicatorType value) {
        return new JAXBElement<OnCarriageIndicatorType>(_OnCarriageIndicator_QNAME, OnCarriageIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrangeHazardPlacardIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrangeHazardPlacardID")
    public JAXBElement<OrangeHazardPlacardIDType> createOrangeHazardPlacardID(OrangeHazardPlacardIDType value) {
        return new JAXBElement<OrangeHazardPlacardIDType>(_OrangeHazardPlacardID_QNAME, OrangeHazardPlacardIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderableIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderableIndicator")
    public JAXBElement<OrderableIndicatorType> createOrderableIndicator(OrderableIndicatorType value) {
        return new JAXBElement<OrderableIndicatorType>(_OrderableIndicator_QNAME, OrderableIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderableUnitType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderableUnit")
    public JAXBElement<OrderableUnitType> createOrderableUnit(OrderableUnitType value) {
        return new JAXBElement<OrderableUnitType>(_OrderableUnit_QNAME, OrderableUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderableUnitFactorRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderableUnitFactorRate")
    public JAXBElement<OrderableUnitFactorRateType> createOrderableUnitFactorRate(OrderableUnitFactorRateType value) {
        return new JAXBElement<OrderableUnitFactorRateType>(_OrderableUnitFactorRate_QNAME, OrderableUnitFactorRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderID")
    public JAXBElement<OrderIDType> createOrderID(OrderIDType value) {
        return new JAXBElement<OrderIDType>(_OrderID_QNAME, OrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderQuantity")
    public JAXBElement<OrderQuantityType> createOrderQuantity(OrderQuantityType value) {
        return new JAXBElement<OrderQuantityType>(_OrderQuantity_QNAME, OrderQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderQuantityIncrementNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrderQuantityIncrementNumeric")
    public JAXBElement<OrderQuantityIncrementNumericType> createOrderQuantityIncrementNumeric(OrderQuantityIncrementNumericType value) {
        return new JAXBElement<OrderQuantityIncrementNumericType>(_OrderQuantityIncrementNumeric_QNAME, OrderQuantityIncrementNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganizationDepartmentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OrganizationDepartment")
    public JAXBElement<OrganizationDepartmentType> createOrganizationDepartment(OrganizationDepartmentType value) {
        return new JAXBElement<OrganizationDepartmentType>(_OrganizationDepartment_QNAME, OrganizationDepartmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OriginalJobIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OriginalJobID")
    public JAXBElement<OriginalJobIDType> createOriginalJobID(OriginalJobIDType value) {
        return new JAXBElement<OriginalJobIDType>(_OriginalJobID_QNAME, OriginalJobIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherInstructionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OtherInstruction")
    public JAXBElement<OtherInstructionType> createOtherInstruction(OtherInstructionType value) {
        return new JAXBElement<OtherInstructionType>(_OtherInstruction_QNAME, OtherInstructionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutstandingQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OutstandingQuantity")
    public JAXBElement<OutstandingQuantityType> createOutstandingQuantity(OutstandingQuantityType value) {
        return new JAXBElement<OutstandingQuantityType>(_OutstandingQuantity_QNAME, OutstandingQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OutstandingReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OutstandingReason")
    public JAXBElement<OutstandingReasonType> createOutstandingReason(OutstandingReasonType value) {
        return new JAXBElement<OutstandingReasonType>(_OutstandingReason_QNAME, OutstandingReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OversupplyQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OversupplyQuantity")
    public JAXBElement<OversupplyQuantityType> createOversupplyQuantity(OversupplyQuantityType value) {
        return new JAXBElement<OversupplyQuantityType>(_OversupplyQuantity_QNAME, OversupplyQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OwnerTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "OwnerTypeCode")
    public JAXBElement<OwnerTypeCodeType> createOwnerTypeCode(OwnerTypeCodeType value) {
        return new JAXBElement<OwnerTypeCodeType>(_OwnerTypeCode_QNAME, OwnerTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageLevelCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackageLevelCode")
    public JAXBElement<PackageLevelCodeType> createPackageLevelCode(PackageLevelCodeType value) {
        return new JAXBElement<PackageLevelCodeType>(_PackageLevelCode_QNAME, PackageLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackageQuantity")
    public JAXBElement<PackageQuantityType> createPackageQuantity(PackageQuantityType value) {
        return new JAXBElement<PackageQuantityType>(_PackageQuantity_QNAME, PackageQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagesQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackagesQuantity")
    public JAXBElement<PackagesQuantityType> createPackagesQuantity(PackagesQuantityType value) {
        return new JAXBElement<PackagesQuantityType>(_PackagesQuantity_QNAME, PackagesQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagingTypeCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackagingTypeCode")
    public JAXBElement<PackagingTypeCodeTypeCommBas> createPackagingTypeCode(PackagingTypeCodeTypeCommBas value) {
        return new JAXBElement<PackagingTypeCodeTypeCommBas>(_PackagingTypeCode_QNAME, PackagingTypeCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackingCriteriaCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackingCriteriaCode")
    public JAXBElement<PackingCriteriaCodeType> createPackingCriteriaCode(PackingCriteriaCodeType value) {
        return new JAXBElement<PackingCriteriaCodeType>(_PackingCriteriaCode_QNAME, PackingCriteriaCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackingMaterialType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackingMaterial")
    public JAXBElement<PackingMaterialType> createPackingMaterial(PackingMaterialType value) {
        return new JAXBElement<PackingMaterialType>(_PackingMaterial_QNAME, PackingMaterialType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackLevelCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackLevelCode")
    public JAXBElement<PackLevelCodeType> createPackLevelCode(PackLevelCodeType value) {
        return new JAXBElement<PackLevelCodeType>(_PackLevelCode_QNAME, PackLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackQuantity")
    public JAXBElement<PackQuantityType> createPackQuantity(PackQuantityType value) {
        return new JAXBElement<PackQuantityType>(_PackQuantity_QNAME, PackQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackSizeNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PackSizeNumeric")
    public JAXBElement<PackSizeNumericType> createPackSizeNumeric(PackSizeNumericType value) {
        return new JAXBElement<PackSizeNumericType>(_PackSizeNumeric_QNAME, PackSizeNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaidAmount")
    public JAXBElement<PaidAmountType> createPaidAmount(PaidAmountType value) {
        return new JAXBElement<PaidAmountType>(_PaidAmount_QNAME, PaidAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaidDate")
    public JAXBElement<PaidDateType> createPaidDate(PaidDateType value) {
        return new JAXBElement<PaidDateType>(_PaidDate_QNAME, PaidDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaidTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaidTime")
    public JAXBElement<PaidTimeType> createPaidTime(PaidTimeType value) {
        return new JAXBElement<PaidTimeType>(_PaidTime_QNAME, PaidTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentDocumentIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ParentDocumentID")
    public JAXBElement<ParentDocumentIDType> createParentDocumentID(ParentDocumentIDType value) {
        return new JAXBElement<ParentDocumentIDType>(_ParentDocumentID_QNAME, ParentDocumentIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParentDocumentTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ParentDocumentTypeCode")
    public JAXBElement<ParentDocumentTypeCodeType> createParentDocumentTypeCode(ParentDocumentTypeCodeType value) {
        return new JAXBElement<ParentDocumentTypeCodeType>(_ParentDocumentTypeCode_QNAME, ParentDocumentTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartialDeliveryIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PartialDeliveryIndicator")
    public JAXBElement<PartialDeliveryIndicatorType> createPartialDeliveryIndicator(PartialDeliveryIndicatorType value) {
        return new JAXBElement<PartialDeliveryIndicatorType>(_PartialDeliveryIndicator_QNAME, PartialDeliveryIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayableAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PayableAmount")
    public JAXBElement<PayableAmountType> createPayableAmount(PayableAmountType value) {
        return new JAXBElement<PayableAmountType>(_PayableAmount_QNAME, PayableAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayableRoundingAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PayableRoundingAmount")
    public JAXBElement<PayableRoundingAmountType> createPayableRoundingAmount(PayableRoundingAmountType value) {
        return new JAXBElement<PayableRoundingAmountType>(_PayableRoundingAmount_QNAME, PayableRoundingAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayerReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PayerReference")
    public JAXBElement<PayerReferenceType> createPayerReference(PayerReferenceType value) {
        return new JAXBElement<PayerReferenceType>(_PayerReference_QNAME, PayerReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAlternativeCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentAlternativeCurrencyCode")
    public JAXBElement<PaymentAlternativeCurrencyCodeType> createPaymentAlternativeCurrencyCode(PaymentAlternativeCurrencyCodeType value) {
        return new JAXBElement<PaymentAlternativeCurrencyCodeType>(_PaymentAlternativeCurrencyCode_QNAME, PaymentAlternativeCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentAmount")
    public JAXBElement<PaymentAmountType> createPaymentAmount(PaymentAmountType value) {
        return new JAXBElement<PaymentAmountType>(_PaymentAmount_QNAME, PaymentAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentChannelCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentChannelCode")
    public JAXBElement<PaymentChannelCodeType> createPaymentChannelCode(PaymentChannelCodeType value) {
        return new JAXBElement<PaymentChannelCodeType>(_PaymentChannelCode_QNAME, PaymentChannelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentCurrencyCode")
    public JAXBElement<PaymentCurrencyCodeType> createPaymentCurrencyCode(PaymentCurrencyCodeType value) {
        return new JAXBElement<PaymentCurrencyCodeType>(_PaymentCurrencyCode_QNAME, PaymentCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDueDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentDueDate")
    public JAXBElement<PaymentDueDateType> createPaymentDueDate(PaymentDueDateType value) {
        return new JAXBElement<PaymentDueDateType>(_PaymentDueDate_QNAME, PaymentDueDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentID")
    public JAXBElement<PaymentIDType> createPaymentID(PaymentIDType value) {
        return new JAXBElement<PaymentIDType>(_PaymentID_QNAME, PaymentIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentMeansCode")
    public JAXBElement<PaymentMeansCodeTypeCommBas> createPaymentMeansCode(PaymentMeansCodeTypeCommBas value) {
        return new JAXBElement<PaymentMeansCodeTypeCommBas>(_PaymentMeansCode_QNAME, PaymentMeansCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentMeansIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentMeansID")
    public JAXBElement<PaymentMeansIDType> createPaymentMeansID(PaymentMeansIDType value) {
        return new JAXBElement<PaymentMeansIDType>(_PaymentMeansID_QNAME, PaymentMeansIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentNoteType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentNote")
    public JAXBElement<PaymentNoteType> createPaymentNote(PaymentNoteType value) {
        return new JAXBElement<PaymentNoteType>(_PaymentNote_QNAME, PaymentNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentOrderReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PaymentOrderReference")
    public JAXBElement<PaymentOrderReferenceType> createPaymentOrderReference(PaymentOrderReferenceType value) {
        return new JAXBElement<PaymentOrderReferenceType>(_PaymentOrderReference_QNAME, PaymentOrderReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltySurchargePercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PenaltySurchargePercent")
    public JAXBElement<PenaltySurchargePercentType> createPenaltySurchargePercent(PenaltySurchargePercentType value) {
        return new JAXBElement<PenaltySurchargePercentType>(_PenaltySurchargePercent_QNAME, PenaltySurchargePercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Percent")
    public JAXBElement<PercentType> createPercent(PercentType value) {
        return new JAXBElement<PercentType>(_Percent_QNAME, PercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PerUnitAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PerUnitAmount")
    public JAXBElement<PerUnitAmountType> createPerUnitAmount(PerUnitAmountType value) {
        return new JAXBElement<PerUnitAmountType>(_PerUnitAmount_QNAME, PerUnitAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacardEndorsementType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PlacardEndorsement")
    public JAXBElement<PlacardEndorsementType> createPlacardEndorsement(PlacardEndorsementType value) {
        return new JAXBElement<PlacardEndorsementType>(_PlacardEndorsement_QNAME, PlacardEndorsementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlacardNotationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PlacardNotation")
    public JAXBElement<PlacardNotationType> createPlacardNotation(PlacardNotationType value) {
        return new JAXBElement<PlacardNotationType>(_PlacardNotation_QNAME, PlacardNotationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlotIdentificationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PlotIdentification")
    public JAXBElement<PlotIdentificationType> createPlotIdentification(PlotIdentificationType value) {
        return new JAXBElement<PlotIdentificationType>(_PlotIdentification_QNAME, PlotIdentificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PositionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PositionCode")
    public JAXBElement<PositionCodeType> createPositionCode(PositionCodeType value) {
        return new JAXBElement<PositionCodeType>(_PositionCode_QNAME, PositionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalZoneType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PostalZone")
    public JAXBElement<PostalZoneType> createPostalZone(PostalZoneType value) {
        return new JAXBElement<PostalZoneType>(_PostalZone_QNAME, PostalZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostboxType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Postbox")
    public JAXBElement<PostboxType> createPostbox(PostboxType value) {
        return new JAXBElement<PostboxType>(_Postbox_QNAME, PostboxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreCarriageIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PreCarriageIndicator")
    public JAXBElement<PreCarriageIndicatorType> createPreCarriageIndicator(PreCarriageIndicatorType value) {
        return new JAXBElement<PreCarriageIndicatorType>(_PreCarriageIndicator_QNAME, PreCarriageIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreferenceCriterionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PreferenceCriterionCode")
    public JAXBElement<PreferenceCriterionCodeType> createPreferenceCriterionCode(PreferenceCriterionCodeType value) {
        return new JAXBElement<PreferenceCriterionCodeType>(_PreferenceCriterionCode_QNAME, PreferenceCriterionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepaidAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PrepaidAmount")
    public JAXBElement<PrepaidAmountType> createPrepaidAmount(PrepaidAmountType value) {
        return new JAXBElement<PrepaidAmountType>(_PrepaidAmount_QNAME, PrepaidAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepaidIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PrepaidIndicator")
    public JAXBElement<PrepaidIndicatorType> createPrepaidIndicator(PrepaidIndicatorType value) {
        return new JAXBElement<PrepaidIndicatorType>(_PrepaidIndicator_QNAME, PrepaidIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrepaidPaymentReferenceIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PrepaidPaymentReferenceID")
    public JAXBElement<PrepaidPaymentReferenceIDType> createPrepaidPaymentReferenceID(PrepaidPaymentReferenceIDType value) {
        return new JAXBElement<PrepaidPaymentReferenceIDType>(_PrepaidPaymentReferenceID_QNAME, PrepaidPaymentReferenceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviousJobIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PreviousJobID")
    public JAXBElement<PreviousJobIDType> createPreviousJobID(PreviousJobIDType value) {
        return new JAXBElement<PreviousJobIDType>(_PreviousJobID_QNAME, PreviousJobIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreviousVersionIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PreviousVersionID")
    public JAXBElement<PreviousVersionIDType> createPreviousVersionID(PreviousVersionIDType value) {
        return new JAXBElement<PreviousVersionIDType>(_PreviousVersionID_QNAME, PreviousVersionIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PriceAmount")
    public JAXBElement<PriceAmountType> createPriceAmount(PriceAmountType value) {
        return new JAXBElement<PriceAmountType>(_PriceAmount_QNAME, PriceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceChangeReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PriceChangeReason")
    public JAXBElement<PriceChangeReasonType> createPriceChangeReason(PriceChangeReasonType value) {
        return new JAXBElement<PriceChangeReasonType>(_PriceChangeReason_QNAME, PriceChangeReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceTypeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PriceType")
    public JAXBElement<PriceTypeType> createPriceType(PriceTypeType value) {
        return new JAXBElement<PriceTypeType>(_PriceType_QNAME, PriceTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PriceTypeCode")
    public JAXBElement<PriceTypeCodeType> createPriceTypeCode(PriceTypeCodeType value) {
        return new JAXBElement<PriceTypeCodeType>(_PriceTypeCode_QNAME, PriceTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PricingCurrencyCode")
    public JAXBElement<PricingCurrencyCodeType> createPricingCurrencyCode(PricingCurrencyCodeType value) {
        return new JAXBElement<PricingCurrencyCodeType>(_PricingCurrencyCode_QNAME, PricingCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingUpdateRequestIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PricingUpdateRequestIndicator")
    public JAXBElement<PricingUpdateRequestIndicatorType> createPricingUpdateRequestIndicator(PricingUpdateRequestIndicatorType value) {
        return new JAXBElement<PricingUpdateRequestIndicatorType>(_PricingUpdateRequestIndicator_QNAME, PricingUpdateRequestIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryAccountNumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PrimaryAccountNumberID")
    public JAXBElement<PrimaryAccountNumberIDType> createPrimaryAccountNumberID(PrimaryAccountNumberIDType value) {
        return new JAXBElement<PrimaryAccountNumberIDType>(_PrimaryAccountNumberID_QNAME, PrimaryAccountNumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrintQualifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "PrintQualifier")
    public JAXBElement<PrintQualifierType> createPrintQualifier(PrintQualifierType value) {
        return new JAXBElement<PrintQualifierType>(_PrintQualifier_QNAME, PrintQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Priority")
    public JAXBElement<PriorityType> createPriority(PriorityType value) {
        return new JAXBElement<PriorityType>(_Priority_QNAME, PriorityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductTraceIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ProductTraceID")
    public JAXBElement<ProductTraceIDType> createProductTraceID(ProductTraceIDType value) {
        return new JAXBElement<ProductTraceIDType>(_ProductTraceID_QNAME, ProductTraceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfileIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ProfileID")
    public JAXBElement<ProfileIDType> createProfileID(ProfileIDType value) {
        return new JAXBElement<ProfileIDType>(_ProfileID_QNAME, ProfileIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ProviderTypeCode")
    public JAXBElement<ProviderTypeCodeType> createProviderTypeCode(ProviderTypeCodeType value) {
        return new JAXBElement<ProviderTypeCodeType>(_ProviderTypeCode_QNAME, ProviderTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifierType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Qualifier")
    public JAXBElement<QualifierType> createQualifier(QualifierType value) {
        return new JAXBElement<QualifierType>(_Qualifier_QNAME, QualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuantityTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Quantity")
    public JAXBElement<QuantityTypeCommBas> createQuantity(QuantityTypeCommBas value) {
        return new JAXBElement<QuantityTypeCommBas>(_Quantity_QNAME, QuantityTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailCarIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RailCarID")
    public JAXBElement<RailCarIDType> createRailCarID(RailCarIDType value) {
        return new JAXBElement<RailCarIDType>(_RailCarID_QNAME, RailCarIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Reason")
    public JAXBElement<ReasonType> createReason(ReasonType value) {
        return new JAXBElement<ReasonType>(_Reason_QNAME, ReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReceivedDate")
    public JAXBElement<ReceivedDateType> createReceivedDate(ReceivedDateType value) {
        return new JAXBElement<ReceivedDateType>(_ReceivedDate_QNAME, ReceivedDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReceivedQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReceivedQuantity")
    public JAXBElement<ReceivedQuantityType> createReceivedQuantity(ReceivedQuantityType value) {
        return new JAXBElement<ReceivedQuantityType>(_ReceivedQuantity_QNAME, ReceivedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Reference")
    public JAXBElement<ReferenceType> createReference(ReferenceType value) {
        return new JAXBElement<ReferenceType>(_Reference_QNAME, ReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReferenceDate")
    public JAXBElement<ReferenceDateType> createReferenceDate(ReferenceDateType value) {
        return new JAXBElement<ReferenceDateType>(_ReferenceDate_QNAME, ReferenceDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceEventCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReferenceEventCode")
    public JAXBElement<ReferenceEventCodeType> createReferenceEventCode(ReferenceEventCodeType value) {
        return new JAXBElement<ReferenceEventCodeType>(_ReferenceEventCode_QNAME, ReferenceEventCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReferenceID")
    public JAXBElement<ReferenceIDType> createReferenceID(ReferenceIDType value) {
        return new JAXBElement<ReferenceIDType>(_ReferenceID_QNAME, ReferenceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReferenceTime")
    public JAXBElement<ReferenceTimeType> createReferenceTime(ReferenceTimeType value) {
        return new JAXBElement<ReferenceTimeType>(_ReferenceTime_QNAME, ReferenceTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefrigerationOnIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RefrigerationOnIndicator")
    public JAXBElement<RefrigerationOnIndicatorType> createRefrigerationOnIndicator(RefrigerationOnIndicatorType value) {
        return new JAXBElement<RefrigerationOnIndicatorType>(_RefrigerationOnIndicator_QNAME, RefrigerationOnIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Region")
    public JAXBElement<RegionType> createRegion(RegionType value) {
        return new JAXBElement<RegionType>(_Region_QNAME, RegionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RegistrationID")
    public JAXBElement<RegistrationIDType> createRegistrationID(RegistrationIDType value) {
        return new JAXBElement<RegistrationIDType>(_RegistrationID_QNAME, RegistrationIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RegistrationName")
    public JAXBElement<RegistrationNameType> createRegistrationName(RegistrationNameType value) {
        return new JAXBElement<RegistrationNameType>(_RegistrationName_QNAME, RegistrationNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationNationalityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RegistrationNationality")
    public JAXBElement<RegistrationNationalityType> createRegistrationNationality(RegistrationNationalityType value) {
        return new JAXBElement<RegistrationNationalityType>(_RegistrationNationality_QNAME, RegistrationNationalityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrationNationalityIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RegistrationNationalityID")
    public JAXBElement<RegistrationNationalityIDType> createRegistrationNationalityID(RegistrationNationalityIDType value) {
        return new JAXBElement<RegistrationNationalityIDType>(_RegistrationNationalityID_QNAME, RegistrationNationalityIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectActionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RejectActionCode")
    public JAXBElement<RejectActionCodeType> createRejectActionCode(RejectActionCodeType value) {
        return new JAXBElement<RejectActionCodeType>(_RejectActionCode_QNAME, RejectActionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectedQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RejectedQuantity")
    public JAXBElement<RejectedQuantityType> createRejectedQuantity(RejectedQuantityType value) {
        return new JAXBElement<RejectedQuantityType>(_RejectedQuantity_QNAME, RejectedQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectionNoteType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RejectionNote")
    public JAXBElement<RejectionNoteType> createRejectionNote(RejectionNoteType value) {
        return new JAXBElement<RejectionNoteType>(_RejectionNote_QNAME, RejectionNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RejectReason")
    public JAXBElement<RejectReasonType> createRejectReason(RejectReasonType value) {
        return new JAXBElement<RejectReasonType>(_RejectReason_QNAME, RejectReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectReasonCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RejectReasonCode")
    public JAXBElement<RejectReasonCodeType> createRejectReasonCode(RejectReasonCodeType value) {
        return new JAXBElement<RejectReasonCodeType>(_RejectReasonCode_QNAME, RejectReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemarksType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Remarks")
    public JAXBElement<RemarksType> createRemarks(RemarksType value) {
        return new JAXBElement<RemarksType>(_Remarks_QNAME, RemarksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReminderSequenceNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReminderSequenceNumeric")
    public JAXBElement<ReminderSequenceNumericType> createReminderSequenceNumeric(ReminderSequenceNumericType value) {
        return new JAXBElement<ReminderSequenceNumericType>(_ReminderSequenceNumeric_QNAME, ReminderSequenceNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReminderTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReminderTypeCode")
    public JAXBElement<ReminderTypeCodeType> createReminderTypeCode(ReminderTypeCodeType value) {
        return new JAXBElement<ReminderTypeCodeType>(_ReminderTypeCode_QNAME, ReminderTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedDespatchDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RequestedDespatchDate")
    public JAXBElement<RequestedDespatchDateType> createRequestedDespatchDate(RequestedDespatchDateType value) {
        return new JAXBElement<RequestedDespatchDateType>(_RequestedDespatchDate_QNAME, RequestedDespatchDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedDespatchTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RequestedDespatchTime")
    public JAXBElement<RequestedDespatchTimeType> createRequestedDespatchTime(RequestedDespatchTimeType value) {
        return new JAXBElement<RequestedDespatchTimeType>(_RequestedDespatchTime_QNAME, RequestedDespatchTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestedInvoiceCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RequestedInvoiceCurrencyCode")
    public JAXBElement<RequestedInvoiceCurrencyCodeType> createRequestedInvoiceCurrencyCode(RequestedInvoiceCurrencyCodeType value) {
        return new JAXBElement<RequestedInvoiceCurrencyCodeType>(_RequestedInvoiceCurrencyCode_QNAME, RequestedInvoiceCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequiredCustomsIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RequiredCustomsID")
    public JAXBElement<RequiredCustomsIDType> createRequiredCustomsID(RequiredCustomsIDType value) {
        return new JAXBElement<RequiredCustomsIDType>(_RequiredCustomsID_QNAME, RequiredCustomsIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ResponseCode")
    public JAXBElement<ResponseCodeType> createResponseCode(ResponseCodeType value) {
        return new JAXBElement<ResponseCodeType>(_ResponseCode_QNAME, ResponseCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ResponseDate")
    public JAXBElement<ResponseDateType> createResponseDate(ResponseDateType value) {
        return new JAXBElement<ResponseDateType>(_ResponseDate_QNAME, ResponseDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ResponseTime")
    public JAXBElement<ResponseTimeType> createResponseTime(ResponseTimeType value) {
        return new JAXBElement<ResponseTimeType>(_ResponseTime_QNAME, ResponseTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnabilityIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReturnabilityIndicator")
    public JAXBElement<ReturnabilityIndicatorType> createReturnabilityIndicator(ReturnabilityIndicatorType value) {
        return new JAXBElement<ReturnabilityIndicatorType>(_ReturnabilityIndicator_QNAME, ReturnabilityIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReturnableMaterialIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ReturnableMaterialIndicator")
    public JAXBElement<ReturnableMaterialIndicatorType> createReturnableMaterialIndicator(ReturnableMaterialIndicatorType value) {
        return new JAXBElement<ReturnableMaterialIndicatorType>(_ReturnableMaterialIndicator_QNAME, ReturnableMaterialIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RevisionDate")
    public JAXBElement<RevisionDateType> createRevisionDate(RevisionDateType value) {
        return new JAXBElement<RevisionDateType>(_RevisionDate_QNAME, RevisionDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevisionTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RevisionTime")
    public JAXBElement<RevisionTimeType> createRevisionTime(RevisionTimeType value) {
        return new JAXBElement<RevisionTimeType>(_RevisionTime_QNAME, RevisionTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RoleCode")
    public JAXBElement<RoleCodeType> createRoleCode(RoleCodeType value) {
        return new JAXBElement<RoleCodeType>(_RoleCode_QNAME, RoleCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoomType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Room")
    public JAXBElement<RoomType> createRoom(RoomType value) {
        return new JAXBElement<RoomType>(_Room_QNAME, RoomType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoundingAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "RoundingAmount")
    public JAXBElement<RoundingAmountType> createRoundingAmount(RoundingAmountType value) {
        return new JAXBElement<RoundingAmountType>(_RoundingAmount_QNAME, RoundingAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SalesOrderID")
    public JAXBElement<SalesOrderIDType> createSalesOrderID(SalesOrderIDType value) {
        return new JAXBElement<SalesOrderIDType>(_SalesOrderID_QNAME, SalesOrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalesOrderLineIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SalesOrderLineID")
    public JAXBElement<SalesOrderLineIDType> createSalesOrderLineID(SalesOrderLineIDType value) {
        return new JAXBElement<SalesOrderLineIDType>(_SalesOrderLineID_QNAME, SalesOrderLineIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchemeURIType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SchemeURI")
    public JAXBElement<SchemeURIType> createSchemeURI(SchemeURIType value) {
        return new JAXBElement<SchemeURIType>(_SchemeURI_QNAME, SchemeURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SealingPartyTypeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SealingPartyType")
    public JAXBElement<SealingPartyTypeType> createSealingPartyType(SealingPartyTypeType value) {
        return new JAXBElement<SealingPartyTypeType>(_SealingPartyType_QNAME, SealingPartyTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SealIssuerTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SealIssuerTypeCode")
    public JAXBElement<SealIssuerTypeCodeType> createSealIssuerTypeCode(SealIssuerTypeCodeType value) {
        return new JAXBElement<SealIssuerTypeCodeType>(_SealIssuerTypeCode_QNAME, SealIssuerTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SealStatusCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SealStatusCode")
    public JAXBElement<SealStatusCodeType> createSealStatusCode(SealStatusCodeType value) {
        return new JAXBElement<SealStatusCodeType>(_SealStatusCode_QNAME, SealStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SequenceID")
    public JAXBElement<SequenceIDType> createSequenceID(SequenceIDType value) {
        return new JAXBElement<SequenceIDType>(_SequenceID_QNAME, SequenceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceNumberIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SequenceNumberID")
    public JAXBElement<SequenceNumberIDType> createSequenceNumberID(SequenceNumberIDType value) {
        return new JAXBElement<SequenceNumberIDType>(_SequenceNumberID_QNAME, SequenceNumberIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SequenceNumericType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SequenceNumeric")
    public JAXBElement<SequenceNumericType> createSequenceNumeric(SequenceNumericType value) {
        return new JAXBElement<SequenceNumericType>(_SequenceNumeric_QNAME, SequenceNumericType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerialIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SerialID")
    public JAXBElement<SerialIDType> createSerialID(SerialIDType value) {
        return new JAXBElement<SerialIDType>(_SerialID_QNAME, SerialIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SettlementDiscountPercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SettlementDiscountPercent")
    public JAXBElement<SettlementDiscountPercentType> createSettlementDiscountPercent(SettlementDiscountPercentType value) {
        return new JAXBElement<SettlementDiscountPercentType>(_SettlementDiscountPercent_QNAME, SettlementDiscountPercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingMarksType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ShippingMarks")
    public JAXBElement<ShippingMarksType> createShippingMarks(ShippingMarksType value) {
        return new JAXBElement<ShippingMarksType>(_ShippingMarks_QNAME, ShippingMarksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingOrderIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ShippingOrderID")
    public JAXBElement<ShippingOrderIDType> createShippingOrderID(ShippingOrderIDType value) {
        return new JAXBElement<ShippingOrderIDType>(_ShippingOrderID_QNAME, ShippingOrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShippingPriorityLevelCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ShippingPriorityLevelCode")
    public JAXBElement<ShippingPriorityLevelCodeType> createShippingPriorityLevelCode(ShippingPriorityLevelCodeType value) {
        return new JAXBElement<ShippingPriorityLevelCodeType>(_ShippingPriorityLevelCode_QNAME, ShippingPriorityLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShortageActionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ShortageActionCode")
    public JAXBElement<ShortageActionCodeType> createShortageActionCode(ShortageActionCodeType value) {
        return new JAXBElement<ShortageActionCodeType>(_ShortageActionCode_QNAME, ShortageActionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShortQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ShortQuantity")
    public JAXBElement<ShortQuantityType> createShortQuantity(ShortQuantityType value) {
        return new JAXBElement<ShortQuantityType>(_ShortQuantity_QNAME, ShortQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureMethodType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SignatureMethod")
    public JAXBElement<SignatureMethodType> createSignatureMethod(SignatureMethodType value) {
        return new JAXBElement<SignatureMethodType>(_SignatureMethod_QNAME, SignatureMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SizeTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SizeTypeCode")
    public JAXBElement<SizeTypeCodeType> createSizeTypeCode(SizeTypeCodeType value) {
        return new JAXBElement<SizeTypeCodeType>(_SizeTypeCode_QNAME, SizeTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceCurrencyBaseRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SourceCurrencyBaseRate")
    public JAXBElement<SourceCurrencyBaseRateType> createSourceCurrencyBaseRate(SourceCurrencyBaseRateType value) {
        return new JAXBElement<SourceCurrencyBaseRateType>(_SourceCurrencyBaseRate_QNAME, SourceCurrencyBaseRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SourceCurrencyCode")
    public JAXBElement<SourceCurrencyCodeType> createSourceCurrencyCode(SourceCurrencyCodeType value) {
        return new JAXBElement<SourceCurrencyCodeType>(_SourceCurrencyCode_QNAME, SourceCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialInstructionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SpecialInstructions")
    public JAXBElement<SpecialInstructionsType> createSpecialInstructions(SpecialInstructionsType value) {
        return new JAXBElement<SpecialInstructionsType>(_SpecialInstructions_QNAME, SpecialInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialTermsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SpecialTerms")
    public JAXBElement<SpecialTermsType> createSpecialTerms(SpecialTermsType value) {
        return new JAXBElement<SpecialTermsType>(_SpecialTerms_QNAME, SpecialTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitConsignmentIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SplitConsignmentIndicator")
    public JAXBElement<SplitConsignmentIndicatorType> createSplitConsignmentIndicator(SplitConsignmentIndicatorType value) {
        return new JAXBElement<SplitConsignmentIndicatorType>(_SplitConsignmentIndicator_QNAME, SplitConsignmentIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StartDate")
    public JAXBElement<StartDateType> createStartDate(StartDateType value) {
        return new JAXBElement<StartDateType>(_StartDate_QNAME, StartDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StartTime")
    public JAXBElement<StartTimeType> createStartTime(StartTimeType value) {
        return new JAXBElement<StartTimeType>(_StartTime_QNAME, StartTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StatusCode")
    public JAXBElement<StatusCodeType> createStatusCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_StatusCode_QNAME, StatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StatusReason")
    public JAXBElement<StatusReasonType> createStatusReason(StatusReasonType value) {
        return new JAXBElement<StatusReasonType>(_StatusReason_QNAME, StatusReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusReasonCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StatusReasonCode")
    public JAXBElement<StatusReasonCodeType> createStatusReasonCode(StatusReasonCodeType value) {
        return new JAXBElement<StatusReasonCodeType>(_StatusReasonCode_QNAME, StatusReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "StreetName")
    public JAXBElement<StreetNameType> createStreetName(StreetNameType value) {
        return new JAXBElement<StreetNameType>(_StreetName_QNAME, StreetNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubstitutionStatusCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SubstitutionStatusCode")
    public JAXBElement<SubstitutionStatusCodeTypeCommBas> createSubstitutionStatusCode(SubstitutionStatusCodeTypeCommBas value) {
        return new JAXBElement<SubstitutionStatusCodeTypeCommBas>(_SubstitutionStatusCode_QNAME, SubstitutionStatusCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SummaryDescriptionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SummaryDescription")
    public JAXBElement<SummaryDescriptionType> createSummaryDescription(SummaryDescriptionType value) {
        return new JAXBElement<SummaryDescriptionType>(_SummaryDescription_QNAME, SummaryDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierAssignedAccountIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SupplierAssignedAccountID")
    public JAXBElement<SupplierAssignedAccountIDType> createSupplierAssignedAccountID(SupplierAssignedAccountIDType value) {
        return new JAXBElement<SupplierAssignedAccountIDType>(_SupplierAssignedAccountID_QNAME, SupplierAssignedAccountIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SurchargePercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "SurchargePercent")
    public JAXBElement<SurchargePercentType> createSurchargePercent(SurchargePercentType value) {
        return new JAXBElement<SurchargePercentType>(_SurchargePercent_QNAME, SurchargePercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCurrencyBaseRateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TargetCurrencyBaseRate")
    public JAXBElement<TargetCurrencyBaseRateType> createTargetCurrencyBaseRate(TargetCurrencyBaseRateType value) {
        return new JAXBElement<TargetCurrencyBaseRateType>(_TargetCurrencyBaseRate_QNAME, TargetCurrencyBaseRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TargetCurrencyCode")
    public JAXBElement<TargetCurrencyCodeType> createTargetCurrencyCode(TargetCurrencyCodeType value) {
        return new JAXBElement<TargetCurrencyCodeType>(_TargetCurrencyCode_QNAME, TargetCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffClassCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TariffClassCode")
    public JAXBElement<TariffClassCodeType> createTariffClassCode(TariffClassCodeType value) {
        return new JAXBElement<TariffClassCodeType>(_TariffClassCode_QNAME, TariffClassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TariffCode")
    public JAXBElement<TariffCodeType> createTariffCode(TariffCodeType value) {
        return new JAXBElement<TariffCodeType>(_TariffCode_QNAME, TariffCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TariffDescriptionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TariffDescription")
    public JAXBElement<TariffDescriptionType> createTariffDescription(TariffDescriptionType value) {
        return new JAXBElement<TariffDescriptionType>(_TariffDescription_QNAME, TariffDescriptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxableAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxableAmount")
    public JAXBElement<TaxableAmountType> createTaxableAmount(TaxableAmountType value) {
        return new JAXBElement<TaxableAmountType>(_TaxableAmount_QNAME, TaxableAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxAmount")
    public JAXBElement<TaxAmountType> createTaxAmount(TaxAmountType value) {
        return new JAXBElement<TaxAmountType>(_TaxAmount_QNAME, TaxAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxCurrencyCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxCurrencyCode")
    public JAXBElement<TaxCurrencyCodeType> createTaxCurrencyCode(TaxCurrencyCodeType value) {
        return new JAXBElement<TaxCurrencyCodeType>(_TaxCurrencyCode_QNAME, TaxCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxEvidenceIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxEvidenceIndicator")
    public JAXBElement<TaxEvidenceIndicatorType> createTaxEvidenceIndicator(TaxEvidenceIndicatorType value) {
        return new JAXBElement<TaxEvidenceIndicatorType>(_TaxEvidenceIndicator_QNAME, TaxEvidenceIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExclusiveAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxExclusiveAmount")
    public JAXBElement<TaxExclusiveAmountType> createTaxExclusiveAmount(TaxExclusiveAmountType value) {
        return new JAXBElement<TaxExclusiveAmountType>(_TaxExclusiveAmount_QNAME, TaxExclusiveAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxExemptionReason")
    public JAXBElement<TaxExemptionReasonType> createTaxExemptionReason(TaxExemptionReasonType value) {
        return new JAXBElement<TaxExemptionReasonType>(_TaxExemptionReason_QNAME, TaxExemptionReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionReasonCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxExemptionReasonCode")
    public JAXBElement<TaxExemptionReasonCodeType> createTaxExemptionReasonCode(TaxExemptionReasonCodeType value) {
        return new JAXBElement<TaxExemptionReasonCodeType>(_TaxExemptionReasonCode_QNAME, TaxExemptionReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxInclusiveAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxInclusiveAmount")
    public JAXBElement<TaxInclusiveAmountType> createTaxInclusiveAmount(TaxInclusiveAmountType value) {
        return new JAXBElement<TaxInclusiveAmountType>(_TaxInclusiveAmount_QNAME, TaxInclusiveAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxLevelCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxLevelCode")
    public JAXBElement<TaxLevelCodeType> createTaxLevelCode(TaxLevelCodeType value) {
        return new JAXBElement<TaxLevelCodeType>(_TaxLevelCode_QNAME, TaxLevelCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxPointDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxPointDate")
    public JAXBElement<TaxPointDateType> createTaxPointDate(TaxPointDateType value) {
        return new JAXBElement<TaxPointDateType>(_TaxPointDate_QNAME, TaxPointDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TaxTypeCode")
    public JAXBElement<TaxTypeCodeType> createTaxTypeCode(TaxTypeCodeType value) {
        return new JAXBElement<TaxTypeCodeType>(_TaxTypeCode_QNAME, TaxTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TechnicalNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TechnicalName")
    public JAXBElement<TechnicalNameType> createTechnicalName(TechnicalNameType value) {
        return new JAXBElement<TechnicalNameType>(_TechnicalName_QNAME, TechnicalNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelefaxType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Telefax")
    public JAXBElement<TelefaxType> createTelefax(TelefaxType value) {
        return new JAXBElement<TelefaxType>(_Telefax_QNAME, TelefaxType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelephoneType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Telephone")
    public JAXBElement<TelephoneType> createTelephone(TelephoneType value) {
        return new JAXBElement<TelephoneType>(_Telephone_QNAME, TelephoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TermsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Terms")
    public JAXBElement<TermsType> createTerms(TermsType value) {
        return new JAXBElement<TermsType>(_Terms_QNAME, TermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Text")
    public JAXBElement<TextType> createText(TextType value) {
        return new JAXBElement<TextType>(_Text_QNAME, TextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierRangeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TierRange")
    public JAXBElement<TierRangeType> createTierRange(TierRangeType value) {
        return new JAXBElement<TierRangeType>(_TierRange_QNAME, TierRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TierRatePercentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TierRatePercent")
    public JAXBElement<TierRatePercentType> createTierRatePercent(TierRatePercentType value) {
        return new JAXBElement<TierRatePercentType>(_TierRatePercent_QNAME, TierRatePercentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Time")
    public JAXBElement<TimeType> createTime(TimeType value) {
        return new JAXBElement<TimeType>(_Time_QNAME, TimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimezoneOffsetType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TimezoneOffset")
    public JAXBElement<TimezoneOffsetType> createTimezoneOffset(TimezoneOffsetType value) {
        return new JAXBElement<TimezoneOffsetType>(_TimezoneOffset_QNAME, TimezoneOffsetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimingComplaintType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TimingComplaint")
    public JAXBElement<TimingComplaintType> createTimingComplaint(TimingComplaintType value) {
        return new JAXBElement<TimingComplaintType>(_TimingComplaint_QNAME, TimingComplaintType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimingComplaintCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TimingComplaintCode")
    public JAXBElement<TimingComplaintCodeType> createTimingComplaintCode(TimingComplaintCodeType value) {
        return new JAXBElement<TimingComplaintCodeType>(_TimingComplaintCode_QNAME, TimingComplaintCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Title")
    public JAXBElement<TitleType> createTitle(TitleType value) {
        return new JAXBElement<TitleType>(_Title_QNAME, TitleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToOrderIndicatorType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ToOrderIndicator")
    public JAXBElement<ToOrderIndicatorType> createToOrderIndicator(ToOrderIndicatorType value) {
        return new JAXBElement<ToOrderIndicatorType>(_ToOrderIndicator_QNAME, ToOrderIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalBalanceAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalBalanceAmount")
    public JAXBElement<TotalBalanceAmountType> createTotalBalanceAmount(TotalBalanceAmountType value) {
        return new JAXBElement<TotalBalanceAmountType>(_TotalBalanceAmount_QNAME, TotalBalanceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalCreditAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalCreditAmount")
    public JAXBElement<TotalCreditAmountType> createTotalCreditAmount(TotalCreditAmountType value) {
        return new JAXBElement<TotalCreditAmountType>(_TotalCreditAmount_QNAME, TotalCreditAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalDebitAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalDebitAmount")
    public JAXBElement<TotalDebitAmountType> createTotalDebitAmount(TotalDebitAmountType value) {
        return new JAXBElement<TotalDebitAmountType>(_TotalDebitAmount_QNAME, TotalDebitAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalGoodsItemQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalGoodsItemQuantity")
    public JAXBElement<TotalGoodsItemQuantityType> createTotalGoodsItemQuantity(TotalGoodsItemQuantityType value) {
        return new JAXBElement<TotalGoodsItemQuantityType>(_TotalGoodsItemQuantity_QNAME, TotalGoodsItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalInvoiceAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalInvoiceAmount")
    public JAXBElement<TotalInvoiceAmountType> createTotalInvoiceAmount(TotalInvoiceAmountType value) {
        return new JAXBElement<TotalInvoiceAmountType>(_TotalInvoiceAmount_QNAME, TotalInvoiceAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPackageQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalPackageQuantity")
    public JAXBElement<TotalPackageQuantityType> createTotalPackageQuantity(TotalPackageQuantityType value) {
        return new JAXBElement<TotalPackageQuantityType>(_TotalPackageQuantity_QNAME, TotalPackageQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPackagesQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalPackagesQuantity")
    public JAXBElement<TotalPackagesQuantityType> createTotalPackagesQuantity(TotalPackagesQuantityType value) {
        return new JAXBElement<TotalPackagesQuantityType>(_TotalPackagesQuantity_QNAME, TotalPackagesQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalPaymentAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalPaymentAmount")
    public JAXBElement<TotalPaymentAmountType> createTotalPaymentAmount(TotalPaymentAmountType value) {
        return new JAXBElement<TotalPaymentAmountType>(_TotalPaymentAmount_QNAME, TotalPaymentAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalTaxAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalTaxAmount")
    public JAXBElement<TotalTaxAmountType> createTotalTaxAmount(TotalTaxAmountType value) {
        return new JAXBElement<TotalTaxAmountType>(_TotalTaxAmount_QNAME, TotalTaxAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalTransportHandlingUnitQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TotalTransportHandlingUnitQuantity")
    public JAXBElement<TotalTransportHandlingUnitQuantityType> createTotalTransportHandlingUnitQuantity(TotalTransportHandlingUnitQuantityType value) {
        return new JAXBElement<TotalTransportHandlingUnitQuantityType>(_TotalTransportHandlingUnitQuantity_QNAME, TotalTransportHandlingUnitQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrackingIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TrackingID")
    public JAXBElement<TrackingIDType> createTrackingID(TrackingIDType value) {
        return new JAXBElement<TrackingIDType>(_TrackingID_QNAME, TrackingIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradingRestrictionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TradingRestrictions")
    public JAXBElement<TradingRestrictionsType> createTradingRestrictions(TradingRestrictionsType value) {
        return new JAXBElement<TradingRestrictionsType>(_TradingRestrictions_QNAME, TradingRestrictionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrainIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TrainID")
    public JAXBElement<TrainIDType> createTrainID(TrainIDType value) {
        return new JAXBElement<TrainIDType>(_TrainID_QNAME, TrainIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionCurrencyTaxAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransactionCurrencyTaxAmount")
    public JAXBElement<TransactionCurrencyTaxAmountType> createTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmountType value) {
        return new JAXBElement<TransactionCurrencyTaxAmountType>(_TransactionCurrencyTaxAmount_QNAME, TransactionCurrencyTaxAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitDirectionCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransitDirectionCode")
    public JAXBElement<TransitDirectionCodeType> createTransitDirectionCode(TransitDirectionCodeType value) {
        return new JAXBElement<TransitDirectionCodeType>(_TransitDirectionCode_QNAME, TransitDirectionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportAuthorizationCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportAuthorizationCode")
    public JAXBElement<TransportAuthorizationCodeType> createTransportAuthorizationCode(TransportAuthorizationCodeType value) {
        return new JAXBElement<TransportAuthorizationCodeType>(_TransportAuthorizationCode_QNAME, TransportAuthorizationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEmergencyCardCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportEmergencyCardCode")
    public JAXBElement<TransportEmergencyCardCodeType> createTransportEmergencyCardCode(TransportEmergencyCardCodeType value) {
        return new JAXBElement<TransportEmergencyCardCodeType>(_TransportEmergencyCardCode_QNAME, TransportEmergencyCardCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEquipmentTypeCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportEquipmentTypeCode")
    public JAXBElement<TransportEquipmentTypeCodeTypeCommBas> createTransportEquipmentTypeCode(TransportEquipmentTypeCodeTypeCommBas value) {
        return new JAXBElement<TransportEquipmentTypeCodeTypeCommBas>(_TransportEquipmentTypeCode_QNAME, TransportEquipmentTypeCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportEventTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportEventTypeCode")
    public JAXBElement<TransportEventTypeCodeType> createTransportEventTypeCode(TransportEventTypeCodeType value) {
        return new JAXBElement<TransportEventTypeCodeType>(_TransportEventTypeCode_QNAME, TransportEventTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportHandlingUnitQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportHandlingUnitQuantity")
    public JAXBElement<TransportHandlingUnitQuantityType> createTransportHandlingUnitQuantity(TransportHandlingUnitQuantityType value) {
        return new JAXBElement<TransportHandlingUnitQuantityType>(_TransportHandlingUnitQuantity_QNAME, TransportHandlingUnitQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportHandlingUnitTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportHandlingUnitTypeCode")
    public JAXBElement<TransportHandlingUnitTypeCodeType> createTransportHandlingUnitTypeCode(TransportHandlingUnitTypeCodeType value) {
        return new JAXBElement<TransportHandlingUnitTypeCodeType>(_TransportHandlingUnitTypeCode_QNAME, TransportHandlingUnitTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansTypeCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportMeansTypeCode")
    public JAXBElement<TransportMeansTypeCodeType> createTransportMeansTypeCode(TransportMeansTypeCodeType value) {
        return new JAXBElement<TransportMeansTypeCodeType>(_TransportMeansTypeCode_QNAME, TransportMeansTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportModeCodeTypeCommBas }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportModeCode")
    public JAXBElement<TransportModeCodeTypeCommBas> createTransportModeCode(TransportModeCodeTypeCommBas value) {
        return new JAXBElement<TransportModeCodeTypeCommBas>(_TransportModeCode_QNAME, TransportModeCodeTypeCommBas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportServiceCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "TransportServiceCode")
    public JAXBElement<TransportServiceCodeType> createTransportServiceCode(TransportServiceCodeType value) {
        return new JAXBElement<TransportServiceCodeType>(_TransportServiceCode_QNAME, TransportServiceCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBLVersionIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "UBLVersionID")
    public JAXBElement<UBLVersionIDType> createUBLVersionID(UBLVersionIDType value) {
        return new JAXBElement<UBLVersionIDType>(_UBLVersionID_QNAME, UBLVersionIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UNDGCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "UNDGCode")
    public JAXBElement<UNDGCodeType> createUNDGCode(UNDGCodeType value) {
        return new JAXBElement<UNDGCodeType>(_UNDGCode_QNAME, UNDGCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Unit")
    public JAXBElement<UnitType> createUnit(UnitType value) {
        return new JAXBElement<UnitType>(_Unit_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitQuantityType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "UnitQuantity")
    public JAXBElement<UnitQuantityType> createUnitQuantity(UnitQuantityType value) {
        return new JAXBElement<UnitQuantityType>(_UnitQuantity_QNAME, UnitQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperOrangeHazardPlacardIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "UpperOrangeHazardPlacardID")
    public JAXBElement<UpperOrangeHazardPlacardIDType> createUpperOrangeHazardPlacardID(UpperOrangeHazardPlacardIDType value) {
        return new JAXBElement<UpperOrangeHazardPlacardIDType>(_UpperOrangeHazardPlacardID_QNAME, UpperOrangeHazardPlacardIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link URIType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "URI")
    public JAXBElement<URIType> createURI(URIType value) {
        return new JAXBElement<URIType>(_URI_QNAME, URIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UUIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "UUID")
    public JAXBElement<UUIDType> createUUID(UUIDType value) {
        return new JAXBElement<UUIDType>(_UUID_QNAME, UUIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ValidationDate")
    public JAXBElement<ValidationDateType> createValidationDate(ValidationDateType value) {
        return new JAXBElement<ValidationDateType>(_ValidationDate_QNAME, ValidationDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationTimeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ValidationTime")
    public JAXBElement<ValidationTimeType> createValidationTime(ValidationTimeType value) {
        return new JAXBElement<ValidationTimeType>(_ValidationTime_QNAME, ValidationTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidatorIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ValidatorID")
    public JAXBElement<ValidatorIDType> createValidatorID(ValidatorIDType value) {
        return new JAXBElement<ValidatorIDType>(_ValidatorID_QNAME, ValidatorIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidityStartDateType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ValidityStartDate")
    public JAXBElement<ValidityStartDateType> createValidityStartDate(ValidityStartDateType value) {
        return new JAXBElement<ValidityStartDateType>(_ValidityStartDate_QNAME, ValidityStartDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Value")
    public JAXBElement<ValueType> createValue(ValueType value) {
        return new JAXBElement<ValueType>(_Value_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueAmountType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "ValueAmount")
    public JAXBElement<ValueAmountType> createValueAmount(ValueAmountType value) {
        return new JAXBElement<ValueAmountType>(_ValueAmount_QNAME, ValueAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "VersionID")
    public JAXBElement<VersionIDType> createVersionID(VersionIDType value) {
        return new JAXBElement<VersionIDType>(_VersionID_QNAME, VersionIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "VesselID")
    public JAXBElement<VesselIDType> createVesselID(VesselIDType value) {
        return new JAXBElement<VesselIDType>(_VesselID_QNAME, VesselIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "VesselName")
    public JAXBElement<VesselNameType> createVesselName(VesselNameType value) {
        return new JAXBElement<VesselNameType>(_VesselName_QNAME, VesselNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VolumeMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "VolumeMeasure")
    public JAXBElement<VolumeMeasureType> createVolumeMeasure(VolumeMeasureType value) {
        return new JAXBElement<VolumeMeasureType>(_VolumeMeasure_QNAME, VolumeMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarrantyInformationType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "WarrantyInformation")
    public JAXBElement<WarrantyInformationType> createWarrantyInformation(WarrantyInformationType value) {
        return new JAXBElement<WarrantyInformationType>(_WarrantyInformation_QNAME, WarrantyInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebsiteURIType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "WebsiteURI")
    public JAXBElement<WebsiteURIType> createWebsiteURI(WebsiteURIType value) {
        return new JAXBElement<WebsiteURIType>(_WebsiteURI_QNAME, WebsiteURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WeightMeasureType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "WeightMeasure")
    public JAXBElement<WeightMeasureType> createWeightMeasure(WeightMeasureType value) {
        return new JAXBElement<WeightMeasureType>(_WeightMeasure_QNAME, WeightMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XPathType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "XPath")
    public JAXBElement<XPathType> createXPath(XPathType value) {
        return new JAXBElement<XPathType>(_XPath_QNAME, XPathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", name = "Zone")
    public JAXBElement<ZoneType> createZone(ZoneType value) {
        return new JAXBElement<ZoneType>(_Zone_QNAME, ZoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBLExtensionsType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "UBLExtensions")
    public JAXBElement<UBLExtensionsType> createUBLExtensions(UBLExtensionsType value) {
        return new JAXBElement<UBLExtensionsType>(_UBLExtensions_QNAME, UBLExtensionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UBLExtensionType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "UBLExtension")
    public JAXBElement<UBLExtensionType> createUBLExtension(UBLExtensionType value) {
        return new JAXBElement<UBLExtensionType>(_UBLExtension_QNAME, UBLExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyID")
    public JAXBElement<ExtensionAgencyIDType> createExtensionAgencyID(ExtensionAgencyIDType value) {
        return new JAXBElement<ExtensionAgencyIDType>(_ExtensionAgencyID_QNAME, ExtensionAgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyNameType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyName")
    public JAXBElement<ExtensionAgencyNameType> createExtensionAgencyName(ExtensionAgencyNameType value) {
        return new JAXBElement<ExtensionAgencyNameType>(_ExtensionAgencyName_QNAME, ExtensionAgencyNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionAgencyURIType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionAgencyURI")
    public JAXBElement<ExtensionAgencyURIType> createExtensionAgencyURI(ExtensionAgencyURIType value) {
        return new JAXBElement<ExtensionAgencyURIType>(_ExtensionAgencyURI_QNAME, ExtensionAgencyURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionContentType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionContent")
    public JAXBElement<ExtensionContentType> createExtensionContent(ExtensionContentType value) {
        return new JAXBElement<ExtensionContentType>(_ExtensionContent_QNAME, ExtensionContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionReasonType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionReason")
    public JAXBElement<ExtensionReasonType> createExtensionReason(ExtensionReasonType value) {
        return new JAXBElement<ExtensionReasonType>(_ExtensionReason_QNAME, ExtensionReasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionReasonCodeType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionReasonCode")
    public JAXBElement<ExtensionReasonCodeType> createExtensionReasonCode(ExtensionReasonCodeType value) {
        return new JAXBElement<ExtensionReasonCodeType>(_ExtensionReasonCode_QNAME, ExtensionReasonCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionURIType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionURI")
    public JAXBElement<ExtensionURIType> createExtensionURI(ExtensionURIType value) {
        return new JAXBElement<ExtensionURIType>(_ExtensionURI_QNAME, ExtensionURIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionVersionIDType }{@code >}}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", name = "ExtensionVersionID")
    public JAXBElement<ExtensionVersionIDType> createExtensionVersionID(ExtensionVersionIDType value) {
        return new JAXBElement<ExtensionVersionIDType>(_ExtensionVersionID_QNAME, ExtensionVersionIDType.class, null, value);
    }

}
