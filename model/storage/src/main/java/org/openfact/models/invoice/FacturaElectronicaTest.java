package org.openfact.models.invoice;


import oasis.names.specification.ubl.schema.xsd.invoice_21.InvoiceType;
import org.junit.*;
import org.openfact.models.enums.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.math.BigDecimal;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
public class FacturaElectronicaTest {
    public FacturaElectronicaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void marshallFacturaElectronica() {
        try {
            UblGenerator ublGenerator = new UblGenerator();
            ublGenerator.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalTotalMonetario(CodigoConceptosTributarios.TOTAL_VALO_VENTA_OPERACIONES_GRABADAS, new BigDecimal("348199.15"));
            ublGenerator.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalTotalMonetario(CodigoConceptosTributarios.TOTAL_VALO_VENTA_OPERACIONES_EXONERADAS, new BigDecimal("12350.00"));
            ublGenerator.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalPropiedadAdicional(CodigoElementosAdicionalesComprobante.MONTO_EN_LETRAS, "CUATROCIENTOS VEINTITRES MIL DOSCIENTOS VEINTICINCO Y 00/100");
            ublGenerator.setUBLIdVersion("2.0");
            ublGenerator.setCustomizationId("1.0");
            ublGenerator.setId("F001-4355");
            ublGenerator.setIssueDate(new Date());
            ublGenerator.setInvoiceTypeCode(CodigoTipoDocumento.FACTURA);
            ublGenerator.setDocumentCurrencyCode("PEN");

            ublGenerator.setSignatureId("IDSignOpenFact");
            ublGenerator.setSignatureSignatoryPartyPartyIdentificationId("10428482072");
            ublGenerator.setSignatureSignatoryPartyPartyNameName("OLVA COURIER SAC");
            ublGenerator.setSignatureDigitalSignatureAttachmentExternalReferenceURI("#SignatureOpenFact");

            ublGenerator.setAccountingSupplierPartyCustomerAssignedAccountID("10428482072");
            ublGenerator.setAccountingSupplierPartyAdditionalAccountID(CodTipDocIdentidad.RUC);
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressId("150111");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressStreetName("AV. LOS PRECURSORES #1245");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressCitySubdivisionName("URB. MIGUEL GRAU");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressCityName("LIMA");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressCountrySubentity("LIMA");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressDistrict("EL AGUSTINO");
            ublGenerator.setAccountingSupplierPartyPartyPostalAddressCountryIdentificationCode("PE");
            ublGenerator.setAccountingSupplierPartyPartyPartyLegalEntityRegistrationName("SOPORTE TECNOLOGICOS EIRL");
            ublGenerator.setAccountingCustomerPartyCustomerAssignedAccountID("20587896411");
            ublGenerator.setAccountingCustomerPartyAdditionalAccountID(CodTipDocIdentidad.RUC);
            ublGenerator.setAccountingCustomerPartyPartyPartyLegalEntityRegistrationName("SERVICABINAS S.A.");
            ublGenerator.setTaxTotalTaxAmount(new BigDecimal("62675.85"), CurrencyCodeContentType.PERU);
            ublGenerator.setTaxTotalTaxSubtotalTaxAmount(new BigDecimal("62675.85"), CurrencyCodeContentType.PERU);
            ublGenerator.setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo.IGV);
            ublGenerator.setLegalMonetaryTotalPayableAmount(new BigDecimal("423225.00"), CurrencyCodeContentType.PERU);

            InvoiceDetail det1 = new InvoiceDetail();
            det1.setId("1");
            det1.setInvoicedQuantity("NIU", new BigDecimal("2000"));
            det1.setLineExtensionAmount(CurrencyCodeContentType.PERU, new BigDecimal("149491.53"));
            det1.setPricingReferenceAlternativeConditionPricePriceAmount(CurrencyCodeContentType.PERU, new BigDecimal("98.00"));
            det1.setPricingReferenceAlternativeConditionPricePriceTypeCode(CodigoTipoPrecioVentaUnit.PRECIO_UNITARIO); //cambiar
            det1.setTaxTotalTaxAmount(new BigDecimal("26908.47"), CurrencyCodeContentType.PERU);
            det1.setTaxTotalTaxSubtotalTaxAmount(new BigDecimal("26908.47"), CurrencyCodeContentType.PERU);
            det1.setTaxTotalTaxSubtotalTaxCategoryTaxExemptionReasonCode(CodigoTipoAfectacionIgv.GRABADO_OPERACION_ONEROSA);
            det1.setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo.IGV);
            det1.setItemDescription("Grabadora LG Externo Modelo: GE20LU10");
            det1.setItemDescriptionSellersItemIdentificationId("GLG199");
            det1.setPricePriceAmount(new BigDecimal("83.05"), CurrencyCodeContentType.PERU);
            ublGenerator.addInvoiceLine(det1);

            ublGenerator.generar();
            ublGenerator.validar();

        } catch (JAXBException ex) {
            Logger.getLogger(FacturaElectronicaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FacturaElectronicaTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Test
    public void unMarshallFacturaElectronica() {
        try {

            File file = new File("D:\\Factura\\10428482072-01-F001-1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(AdditionalInformation.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement<InvoiceType> invoice = (JAXBElement<InvoiceType>) jaxbUnmarshaller.unmarshal(file);
            System.out.println(invoice.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateSchema() {

    }

//    @Test
//    public void sendBill() {
//
//        try { // Call Web Service Operation
//            BillService_Service service = new BillService_Service();
//            service.setHandlerResolver(new HeaderHandlerResolver());
//            BillService port = service.getBillServicePort();
//            // TODO initialize WS operation arguments here
//            java.lang.String fileName = "10428482072-01-F001-1.zip";
//            DataSource fds = new FileDataSource("D:\\Factura\\10428482072-01-F001-1.zip");
//            javax.activation.DataHandler contentFile = new javax.activation.DataHandler(fds);
//            // TODO process result here
//            byte[] result = port.sendBill(fileName, contentFile);
//            FileOutputStream fileOuputStream = new FileOutputStream("D:\\Factura\\respuesta.zip");
//            fileOuputStream.write(result);
//            fileOuputStream.close();
//            System.out.println("Result = " + result);
//        } catch (SOAPFaultException ex) {
//            System.out.println(ex.getFault().getFaultCode());
//            System.out.println(ex.getFault().getFaultString());
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }
}
