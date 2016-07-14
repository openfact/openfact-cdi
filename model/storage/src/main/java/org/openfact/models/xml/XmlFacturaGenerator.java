package org.openfact.models.xml;

import oasis.names.specification.ubl.schema.xsd.applicationresponse_21.ObjectFactory;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.*;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.ExtensionContentType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionType;
import oasis.names.specification.ubl.schema.xsd.commonextensioncomponents_21.UBLExtensionsType;
import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;
import org.openfact.models.FacturaModel;
import org.openfact.models.utils.XmlSpaceNames;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.dom.DOMResult;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import oasis.names.specification.ubl.schema.xsd.applicationresponse_21.ObjectFactory;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 14/07/2016.
 */
public class XmlFacturaGenerator {
    private static final ObjectFactory FACTORIA = new ObjectFactory();

    private final static GregorianCalendar c = new GregorianCalendar();
    private static JAXBContext context;
    private static Marshaller marshallerElement, marshallerInvoice;
    private final String REGION = "PEN";
    private InvoiceType invoiceType;
    private UBLExtensionsType extensiones;
    private UBLExtensionType extensionInfAdicional, extensionSignAdicional;
    private ExtensionContentType contenidoDeExtension, contenidoSign;
    private AdditionalInformationType informacionAdicional;//Aditional information sunat
    private SupplierPartyType supplierPartyType;
    private PartyType partyTypeSupplier, partyTypeCustomer;
    private AddressType addressType;
    private CountryType countryType;
    private PartyLegalEntityType partyLegalEntityTypeSupplier, partyLegalEntityTypeCustomer;
    private CustomerPartyType customerPartyType;
    private TaxTotalType taxTotalType;
    private TaxSubtotalType taxSubtotalType;
    private TaxCategoryType taxCategoryType;
    private TaxSchemeType taxSchemeType;
    private MonetaryTotalType monetaryTotalType;
    private SignatureType signatureType;
    private PartyType partyTypeSignature;
    private PartyIdentificationType identificationType;
    private PartyNameType partyNameType;
    private AttachmentType attachmentType;
    private ExternalReferenceType ert;


    public XmlFacturaGenerator() throws JAXBException {
        if (context == null) {
            context = JAXBContext.newInstance(ObjectFactory.class);
        }
        if (marshallerElement == null) {
            marshallerElement = context.createMarshaller();
        }
        if (marshallerInvoice == null) {
            marshallerInvoice = context.createMarshaller();
            marshallerInvoice.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshallerInvoice.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
        }
        inicializarElementosBasicos();
        invoiceType.setUBLExtensions(extensiones);
        extensiones.getUBLExtension().add(extensionInfAdicional);
        extensionInfAdicional.setExtensionContent(contenidoDeExtension);
        extensiones.getUBLExtension().add(extensionSignAdicional);
        extensionSignAdicional.setExtensionContent(contenidoSign);
        invoiceType.getSignature().add(signatureType);
        signatureType.setSignatoryParty(partyTypeSignature);
        partyTypeSignature.getPartyIdentification().add(identificationType);
        partyTypeSignature.getPartyName().add(partyNameType);
        signatureType.setDigitalSignatureAttachment(attachmentType);
        attachmentType.setExternalReference(ert);
        invoiceType.setAccountingSupplierParty(supplierPartyType);
        supplierPartyType.setParty(partyTypeSupplier);
        partyTypeSupplier.setPostalAddress(addressType);
        addressType.setCountry(countryType);
        partyTypeSupplier.getPartyLegalEntity().add(partyLegalEntityTypeSupplier);
        invoiceType.setAccountingCustomerParty(customerPartyType);
        customerPartyType.setParty(partyTypeCustomer);
        partyTypeCustomer.getPartyLegalEntity().add(partyLegalEntityTypeCustomer);
        invoiceType.getTaxTotal().add(taxTotalType);
        taxTotalType.getTaxSubtotal().add(taxSubtotalType);
        taxSubtotalType.setTaxCategory(taxCategoryType);
        taxCategoryType.setTaxScheme(taxSchemeType);
        invoiceType.setLegalMonetaryTotal(monetaryTotalType);
    }

    private void inicializarElementosBasicos() {
        invoiceType = FACTORIA.createInvoiceType();
 /*    //  extensiones = //
        extensionInfAdicional = FACTORIA.createUBLExtensionType();
        extensionSignAdicional = FACTORIA.createUBLExtensionType();
        contenidoDeExtension = FACTORIA.createExtensionContentType();
        contenidoSign = FACTORIA.createExtensionContentType();
      //  informacionAdicional = FACTORIA.createAdditionalInformationTypeSunatAgg();
        signatureType = FACTORIA.createSignatureType();
        partyTypeSignature = FACTORIA.createPartyType();
        identificationType = FACTORIA.createPartyIdentificationType();
        supplierPartyType = FACTORIA.createSupplierPartyType();
        partyTypeSupplier = FACTORIA.createPartyType();
        addressType = FACTORIA.createAddressType();
        countryType = FACTORIA.createCountryType();
        partyLegalEntityTypeSupplier = FACTORIA.createPartyLegalEntityType();
        customerPartyType = FACTORIA.createCustomerPartyType();
        partyTypeCustomer = FACTORIA.createPartyType();
        partyLegalEntityTypeCustomer = FACTORIA.createPartyLegalEntityType();
        taxTotalType = FACTORIA.createTaxTotalType();
        taxSubtotalType = FACTORIA.createTaxSubtotalType();
        taxCategoryType = FACTORIA.createTaxCategoryType();
        taxSchemeType = FACTORIA.createTaxSchemeType();
        monetaryTotalType = FACTORIA.createMonetaryTotalType();
        partyNameType = FACTORIA.createPartyNameType();
        attachmentType = FACTORIA.createAttachmentType();
        ert = FACTORIA.createExternalReferenceType();
        */
    }

    public void validar() throws JAXBException, SAXException {
        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File("C:\\Users\\Ahren\\Downloads\\FacturaElectronica\\XSD_FE23122014\\UBLPE-Invoice-1.0.xsd"));

        Marshaller marshaller = context.createMarshaller();
        marshaller.setSchema(schema);
        marshaller.marshal(FACTORIA.createInvoice(invoiceType), new DefaultHandler());
    }

    public void generar() throws JAXBException {
        JAXBElement<AdditionalInformationType> jeAits = FACTORIA.createAdditionalInformation(informacionAdicional);
        DOMResult res = new DOMResult();
        marshallerElement.marshal(jeAits, res);
        Element elem = ((Document) res.getNode()).getDocumentElement();
        contenidoDeExtension.setAny(elem);
        marshallerInvoice.marshal(FACTORIA.createInvoice(invoiceType), System.out);
    }

    public void addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalTotalMonetario(CodigoConceptosTributarios cod, BigDecimal monto) {
        IDType idAMonetaryTotal = FACTORIA.createIDType();
        idAMonetaryTotal.setValue(cod.getCodigo());
        PayableAmountType pa = FACTORIA.createPayableAmountType();
        pa.setCurrencyID(CurrencyCodeContentType.PEN);
        pa.setValue(monto);
        AdditionalMonetaryTotalType amtt = FACTORIA.createAdditionalMonetaryTotalType();
        amtt.setID(idAMonetaryTotal);
        amtt.setPayableAmount(pa);
        informacionAdicional.getAdditionalMonetaryTotal().add(amtt);
    }

    public void addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalPropiedadAdicional(CodigoElementosAdicionalesComprobante cod, String valor) {
        IDType IdPropiedadAdicional = FACTORIA.createIDType();
        IdPropiedadAdicional.setValue(cod.getCodigo());
        ValueType valorDePropiedad = FACTORIA.createValueType();
        valorDePropiedad.setValue(valor);
        AdditionalPropertyType propiedadAdicional = FACTORIA.createAdditionalPropertyType();
        propiedadAdicional.setID(IdPropiedadAdicional);
        propiedadAdicional.setValue(valorDePropiedad);
        informacionAdicional.getAdditionalProperty().add(propiedadAdicional);
    }

    public void setUBLIdVersion(String version) {
        UBLVersionIDType ublIdVersion = FACTORIA.createUBLVersionIDType();
        ublIdVersion.setValue(version);
        invoiceType.setUBLVersionID(ublIdVersion);
    }

    public void setCustomizationId(String id) {
        CustomizationIDType cidt = FACTORIA.createCustomizationIDType();
        cidt.setValue(id);
        invoiceType.setCustomizationID(cidt);
    }

    public void setId(String id) {
        IDType invoiceId = FACTORIA.createIDType();
        invoiceId.setValue(id);
        invoiceType.setID(invoiceId);
    }

    public void setIssueDate(Date fecha) throws DatatypeConfigurationException {
        IssueDateType issueDate = FACTORIA.createIssueDateType();
        c.setTime(fecha);
        issueDate.setValue(DatatypeFactory.newInstance().newXMLGregorianCalendarDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), DatatypeConstants.FIELD_UNDEFINED));
        invoiceType.setIssueDate(issueDate);
    }

    public void setInvoiceTypeCode(CodigoTipoDocumento codigo) {
        InvoiceTypeCodeType invoiceTypeCod = FACTORIA.createInvoiceTypeCodeType();
        invoiceTypeCod.setValue(codigo.getCodigo());
        invoiceType.setInvoiceTypeCode(invoiceTypeCod);
    }

    public void setDocumentCurrencyCode(String codigo) {
        DocumentCurrencyCodeType currencyCode = FACTORIA.createDocumentCurrencyCodeType();
        currencyCode.setValue(codigo);
        invoiceType.setDocumentCurrencyCode(currencyCode);
    }

    public void setSignatureId(String id) {
        IDType dType = FACTORIA.createIDType();
        dType.setValue(id);
        signatureType.setID(dType);
    }

    public void setSignatureSignatoryPartyPartyIdentificationId(String id) {
        IDType dType = FACTORIA.createIDType();
        dType.setValue(id);
        identificationType.setID(dType);
    }

    public void setSignatureSignatoryPartyPartyNameName(String nombre) {
        NameTypeCommBase bas = FACTORIA.createNameTypeCommBas();
        bas.setValue(nombre);
        partyNameType.setName(bas);
    }

    public void setSignatureDigitalSignatureAttachmentExternalReferenceURI(String uri) {
        URIType uRIType = FACTORIA.createURIType();
        uRIType.setValue(uri);
        ert.setURI(uRIType);
    }

    public void setAccountingSupplierPartyCustomerAssignedAccountID(String rucProveedor) {
        CustomerAssignedAccountIDType customerRuc = FACTORIA.createCustomerAssignedAccountIDType();
        customerRuc.setValue(rucProveedor);
        supplierPartyType.setCustomerAssignedAccountID(customerRuc);
    }

    public void setAccountingSupplierPartyAdditionalAccountID(CodTipDocIdentidad codigo) {
        AdditionalAccountIDType tipDoc = FACTORIA.createAdditionalAccountIDType();
        tipDoc.setValue(codigo.getCodigo());
        supplierPartyType.getAdditionalAccountID().add(tipDoc);
    }

    public void setAccountingSupplierPartyPartyPostalAddressId(String id) {
        IDType idType = FACTORIA.createIDType();
        idType.setValue(id);
        addressType.setID(idType);
    }

    public void setAccountingSupplierPartyPartyPostalAddressStreetName(String direccion) {
        StreetNameType nombreDireccion = FACTORIA.createStreetNameType();
        nombreDireccion.setValue(direccion);
        addressType.setStreetName(nombreDireccion);
    }

    public void setAccountingSupplierPartyPartyPostalAddressCitySubdivisionName(String nombre) {
        CitySubdivisionNameType nameType = FACTORIA.createCitySubdivisionNameType();
        nameType.setValue(nombre);
        addressType.setCitySubdivisionName(nameType);
    }

    public void setAccountingSupplierPartyPartyPostalAddressCityName(String nombre) {
        CityNameType cityNameType = FACTORIA.createCityNameType();
        cityNameType.setValue(nombre);
        addressType.setCityName(cityNameType);
    }

    public void setAccountingSupplierPartyPartyPostalAddressCountrySubentity(String nombre) {
        CountrySubentityType countrySubentityType = FACTORIA.createCountrySubentityType();
        countrySubentityType.setValue(nombre);
        addressType.setCountrySubentity(countrySubentityType);
    }

    public void setAccountingSupplierPartyPartyPostalAddressDistrict(String nombre) {
        DistrictType districtType = FACTORIA.createDistrictType();
        districtType.setValue(nombre);
        addressType.setDistrict(districtType);
    }

    public void setAccountingSupplierPartyPartyPostalAddressCountryIdentificationCode(String codigo) {
        IdentificationCodeType codeType = FACTORIA.createIdentificationCodeType();
        codeType.setValue(codigo);
        countryType.setIdentificationCode(codeType);
    }

    public void setAccountingSupplierPartyPartyPartyLegalEntityRegistrationName(String nombre) {
        RegistrationNameType nameType = FACTORIA.createRegistrationNameType();
        nameType.setValue(nombre);
        partyLegalEntityTypeSupplier.setRegistrationName(nameType);
    }

    public void setAccountingCustomerPartyCustomerAssignedAccountID(String rucCliente) {
        CustomerAssignedAccountIDType customerRuc = new CustomerAssignedAccountIDType();
        customerRuc.setValue(rucCliente);
        customerPartyType.setCustomerAssignedAccountID(customerRuc);
    }

    public void setAccountingCustomerPartyAdditionalAccountID(CodTipDocIdentidad codigo) {
        AdditionalAccountIDType tipDoc = FACTORIA.createAdditionalAccountIDType();
        tipDoc.setValue(codigo.getCodigo());
        customerPartyType.getAdditionalAccountID().add(tipDoc);
    }

    public void setAccountingCustomerPartyPartyPartyLegalEntityRegistrationName(String nombre) {
        RegistrationNameType nameType = FACTORIA.createRegistrationNameType();
        nameType.setValue(nombre);
        partyLegalEntityTypeCustomer.setRegistrationName(nameType);
    }

    public void setTaxTotalTaxAmount(BigDecimal monto, CurrencyCodeContentType codigo) {
        TaxAmountType taxAmountType = FACTORIA.createTaxAmountType();
        taxAmountType.setValue(monto);
        taxAmountType.setCurrencyID(codigo);
        taxTotalType.setTaxAmount(taxAmountType);
    }

    public void setTaxTotalTaxSubtotalTaxAmount(BigDecimal monto, CurrencyCodeContentType codigo) {
        TaxAmountType taxAmountType = FACTORIA.createTaxAmountType();
        taxAmountType.setValue(monto);
        taxAmountType.setCurrencyID(codigo);
        taxSubtotalType.setTaxAmount(taxAmountType);
    }

    public void setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo codigo) {
        IDType iDType = FACTORIA.createIDType();
        NameTypeCommBas nameTypeCommBas = FACTORIA.createNameTypeCommBas();
        TaxTypeCodeType taxTypeCodeType = FACTORIA.createTaxTypeCodeType();
        iDType.setValue(codigo.getId());
        nameTypeCommBas.setValue(codigo.name());
        taxTypeCodeType.setValue(codigo.getCodigo());
        taxSchemeType.setID(iDType);
        taxSchemeType.setName(nameTypeCommBas);
        taxSchemeType.setTaxTypeCode(taxTypeCodeType);
    }

    public void setLegalMonetaryTotalPayableAmount(BigDecimal monto, CurrencyCodeContentType codigo) {
        PayableAmountType payableAmountType = FACTORIA.createPayableAmountType();
        payableAmountType.setCurrencyID(codigo);
        payableAmountType.setValue(monto);
        monetaryTotalType.setPayableAmount(payableAmountType);
    }

    public void addInvoiceLine(InvoiceDetail det) {
        InvoiceLineType ilt = FACTORIA.createInvoiceLineType();
        IDType iDType = FACTORIA.createIDType();
        iDType.setValue(det.getId());
        ilt.setID(iDType);
        InvoicedQuantityType iqt = FACTORIA.createInvoicedQuantityType();
        iqt.setValue(det.getInvoicedQuantityMonto());
        iqt.setUnitCode(det.getInvoicedQuantityUnitCode());
        ilt.setInvoicedQuantity(iqt);
        LineExtensionAmountType leat = FACTORIA.createLineExtensionAmountType();
        leat.setCurrencyID(det.getLineExtensionAmountCurrencyCode());
        leat.setValue(det.getLineExtensionAmountMonto());
        ilt.setLineExtensionAmount(leat);
        PricingReferenceType prt = FACTORIA.createPricingReferenceType();
        PriceType priceType = FACTORIA.createPriceType();
        PriceAmountType amountType = FACTORIA.createPriceAmountType();
        amountType.setValue(det.getPriceAmountMonto());
        amountType.setCurrencyID(det.getPriceAmountCurrencyCode());
        priceType.setPriceAmount(amountType);
        PriceTypeCodeType priceTypeCodeType = FACTORIA.createPriceTypeCodeType();
        priceTypeCodeType.setValue(det.getPriceTypeCode().getCodigo());
        priceType.setPriceTypeCode(priceTypeCodeType);
        prt.getAlternativeConditionPrice().add(priceType);
        ilt.setPricingReference(prt);
        TaxTotalType ttt = FACTORIA.createTaxTotalType();
        TaxAmountType tat = FACTORIA.createTaxAmountType();
        tat.setValue(det.getTaxTotalTaxAmountMonto());
        tat.setCurrencyID(det.getTaxTotalTaxAmountCodigo());
        ttt.setTaxAmount(tat);
        TaxSubtotalType tst = FACTORIA.createTaxSubtotalType();
        TaxAmountType taxAmountSub = FACTORIA.createTaxAmountType();
        taxAmountSub.setValue(det.getTaxTotalTaxSubtotalTaxAmountMonto());
        taxAmountSub.setCurrencyID(det.getTaxTotalTaxSubtotalTaxAmountCodigo());
        tst.setTaxAmount(taxAmountSub);
        TaxCategoryType tct = FACTORIA.createTaxCategoryType();
        TaxExemptionReasonCodeType terct = FACTORIA.createTaxExemptionReasonCodeType();
        terct.setValue(det.getTaxExemptionReasonCode().getCodigo());
        tct.setTaxExemptionReasonCode(terct);
        TaxSchemeType taxSchemeType2 = FACTORIA.createTaxSchemeType();
        IDType iDType2 = FACTORIA.createIDType();
        NameTypeCommBas nameTypeCommBas = FACTORIA.createNameTypeCommBas();
        TaxTypeCodeType taxTypeCodeType = FACTORIA.createTaxTypeCodeType();
        iDType2.setValue(det.getCategoryTaxScheme().getId());
        nameTypeCommBas.setValue(det.getCategoryTaxScheme().name());
        taxTypeCodeType.setValue(det.getCategoryTaxScheme().getCodigo());
        taxSchemeType2.setID(iDType2);
        taxSchemeType2.setName(nameTypeCommBas);
        taxSchemeType2.setTaxTypeCode(taxTypeCodeType);
        tct.setTaxScheme(taxSchemeType2);
        tst.setTaxCategory(tct);
        ttt.getTaxSubtotal().add(tst);
        ilt.getTaxTotal().add(ttt);
        ItemType itemType = FACTORIA.createItemType();
        DescriptionType descriptionType = FACTORIA.createDescriptionType();
        descriptionType.setValue(det.getItemDescription());
        itemType.getDescription().add(descriptionType);
        ItemIdentificationType identificationType = FACTORIA.createItemIdentificationType();
        IDType dTypeItem = FACTORIA.createIDType();
        dTypeItem.setValue(det.getItemDescriptionSellersItemIdentificationId());
        identificationType.setID(dTypeItem);
        itemType.setSellersItemIdentification(identificationType);
        ilt.setItem(itemType);
        PriceType priceTypeDet = FACTORIA.createPriceType();
        PriceAmountType amountTypeDet = FACTORIA.createPriceAmountType();
        amountTypeDet.setCurrencyID(det.getPricePriceAmountCodigo());
        amountTypeDet.setValue(det.getPricePriceAmountMonto());
        priceTypeDet.setPriceAmount(amountTypeDet);
        ilt.setPrice(priceTypeDet);
        invoiceType.getInvoiceLine().add(ilt);
    }

    public void createFacturaXml(FacturaModel model, String Path) throws XMLStreamException, IOException {

        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?><Invoice \n");
        builder.append("xmlns=\"" + XmlSpaceNames.xmlnsInvoice + "\"");
        builder.append("xmlns:cac=\"" + XmlSpaceNames.cac + "\"");
        builder.append("xmlns:cbc=\"" + XmlSpaceNames.cbc + "\"");
        builder.append("xmlns:ccts=\"" + XmlSpaceNames.ccts + "\"");
        builder.append("xmlns:ds=\"" + XmlSpaceNames.ds + "\"");
        builder.append("xmlns:ext=\"" + XmlSpaceNames.ext + "\"");
        builder.append("xmlns:qdt=\"" + XmlSpaceNames.qdt + "\"");
        builder.append("xmlns:sac=\"" + XmlSpaceNames.sac + "\"");
        builder.append("xmlns:udt=\"" + XmlSpaceNames.udt + "\"");
        builder.append("xmlns:xsi=\"" + XmlSpaceNames.xsi + "\"");

        // <editor-fold defaultstate="collapsed" desc="UBLExtensions">

        builder.append("<ext:UBLExtensions>\n");
        builder.append("<ext:UBLExtension>\n");
        builder.append("<ext:ExtensionContent>\n");
        builder.append("<sac:AdditionalInformation>\n");

        if (model.getResumen().getTotalGravado() != null
                && model.getResumen().getTotalGravado() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1001 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalGravado() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalInafecto() != null
                && model.getResumen().getTotalInafecto() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1002 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalInafecto() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalExonerado() != null
                && model.getResumen().getTotalExonerado() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1003 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalExonerado() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalValorVentaOperacionesGratuitas() != null
                && model.getResumen().getTotalValorVentaOperacionesGratuitas() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1004 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalValorVentaOperacionesGratuitas()
                    + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getDescuentos() != null
                && model.getResumen().getDescuentos() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 2005 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getDescuentos() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        builder.append("<sac:AdditionalProperty>\n");
        builder.append("<cbc:ID>" + 1000 + "</cbc:ID>\n");
        builder.append("<cbc:Value>" + "son 4cuado mil 500" + "</cbc:Value>\n ");// importante
        // obtener
        // descripcion
        // en
        // texto
        builder.append("</sac:AdditionalProperty>\n");
        builder.append("sac:AdditionalInformation");
        builder.append("ext:ExtensionContent");
        builder.append("ext:UBLExtension");

        String fin = "Repository";
        String s = "";
        if (!(new File(Path + fin).exists())) {
            File directorio = new File(Path + fin);
            directorio.mkdir();
        }
        BufferedReader leer = new BufferedReader(new StringReader(builder.toString()));
        PrintWriter escribir = new PrintWriter(
                new BufferedWriter(new FileWriter(Path + fin + "\\" + "nombre_archivo" + ".xml")));
        while ((s = leer.readLine()) != null) {
            escribir.println(s);
        }
        escribir.close();

        // endregion
        // </editor-fold>

    }

}
