package org.openfact.models.xml;

import org.junit.*;
import org.openfact.models.enums.*;
import org.openfact.models.ubl.CurrencyCodeContentType;
import org.openfact.models.ubl.InvoiceType;
import org.openfact.models.ubl.ObjectFactory;

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
 * Created by Alex Pariona-"alexpariona@openfact.com" on 21/07/2016.
 */
public class FacturaTest {

    public FacturaTest() {
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
            Factura factura = new Factura();
            factura.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalTotalMonetario(CodigoConceptosTributarios.TOTAL_VALO_VENTA_OPERACIONES_GRABADAS, new BigDecimal("348199.15"));
            factura.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalTotalMonetario(CodigoConceptosTributarios.TOTAL_VALO_VENTA_OPERACIONES_EXONERADAS, new BigDecimal("12350.00"));
            factura.addFacturaExtensionesExtensionContenidoDeExtensionInformacionAdicionalPropiedadAdicional(CodigoElementosAdicionalesComprobante.MONTO_EN_LETRAS, "CUATROCIENTOS VEINTITRES MIL DOSCIENTOS VEINTICINCO Y 00/100");
            factura.setUBLIdVersion("2.0");
            factura.setCustomizationId("1.0");
            factura.setId("F001-4355");
            factura.setIssueDate(new Date());
            factura.setInvoiceTypeCode(CodigoTipoDocumento.FACTURA);
            factura.setDocumentCurrencyCode("PEN");

            factura.setSignatureId("IDSignOlva");
            factura.setSignatureSignatoryPartyPartyIdentificationId("10428482072");
            factura.setSignatureSignatoryPartyPartyNameName("OLVA COURIER SAC");
            factura.setSignatureDigitalSignatureAttachmentExternalReferenceURI("#SignatureOlva");

            factura.setAccountingSupplierPartyCustomerAssignedAccountID("10428482072");
            factura.setAccountingSupplierPartyAdditionalAccountID(CodTipDocIdentidad.RUC);
            factura.setAccountingSupplierPartyPartyPostalAddressId("150111");
            factura.setAccountingSupplierPartyPartyPostalAddressStreetName("AV. LOS PRECURSORES #1245");
            factura.setAccountingSupplierPartyPartyPostalAddressCitySubdivisionName("URB. MIGUEL GRAU");
            factura.setAccountingSupplierPartyPartyPostalAddressCityName("LIMA");
            factura.setAccountingSupplierPartyPartyPostalAddressCountrySubentity("LIMA");
            factura.setAccountingSupplierPartyPartyPostalAddressDistrict("EL AGUSTINO");
            factura.setAccountingSupplierPartyPartyPostalAddressCountryIdentificationCode("PE");
            factura.setAccountingSupplierPartyPartyPartyLegalEntityRegistrationName("SOPORTE TECNOLOGICOS EIRL");
            factura.setAccountingCustomerPartyCustomerAssignedAccountID("20587896411");
            factura.setAccountingCustomerPartyAdditionalAccountID(CodTipDocIdentidad.RUC);
            factura.setAccountingCustomerPartyPartyPartyLegalEntityRegistrationName("SERVICABINAS S.A.");
            factura.setTaxTotalTaxAmount(new BigDecimal("62675.85"), CurrencyCodeContentType.PEN);
            factura.setTaxTotalTaxSubtotalTaxAmount(new BigDecimal("62675.85"), CurrencyCodeContentType.PEN);
            factura.setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo.IGV);
            factura.setLegalMonetaryTotalPayableAmount(new BigDecimal("423225.00"), CurrencyCodeContentType.PEN);

            DetalleFactura det1 = new DetalleFactura();
            det1.setId("1");
            det1.setInvoicedQuantity("NIU", new BigDecimal("2000"));
            det1.setLineExtensionAmount(CurrencyCodeContentType.PEN, new BigDecimal("149491.53"));
            det1.setPricingReferenceAlternativeConditionPricePriceAmount(CurrencyCodeContentType.PEN, new BigDecimal("98.00"));
            det1.setPricingReferenceAlternativeConditionPricePriceTypeCode(CodigoTipoPrecioVentaUnit.PRECIO_UNITARIO); //cambiar
            det1.setTaxTotalTaxAmount(new BigDecimal("26908.47"), CurrencyCodeContentType.PEN);
            det1.setTaxTotalTaxSubtotalTaxAmount(new BigDecimal("26908.47"), CurrencyCodeContentType.PEN);
            det1.setTaxTotalTaxSubtotalTaxCategoryTaxExemptionReasonCode(CodigoTipoAfectacionIgv.GRABADO_OPERACION_ONEROSA);
            det1.setTaxTotalTaxSubtotalTaxCategoryTaxScheme(CodigoTipoTributo.IGV);
            det1.setItemDescription("Grabadora LG Externo Modelo: GE20LU10");
            det1.setItemDescriptionSellersItemIdentificationId("GLG199");
            det1.setPricePriceAmount(new BigDecimal("83.05"), CurrencyCodeContentType.PEN);
            factura.addInvoiceLine(det1);

            factura.generar(FileLocation.XmlInvoice.getLocation() + "10428482072-01-F001-1.xml");
            factura.validar(FileLocation.XmlValidator.getLocation() + "UBLPE-Invoice-1.0.xsd");

        } catch (JAXBException ex) {
            Logger.getLogger(FacturaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            Logger.getLogger(FacturaTest.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Test
    public void unMarshallFacturaElectronica() {
        try {

            File file = new File(FileLocation.XmlInvoice.getLocation() + "10428482072-01-F001-1.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

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

   /* @Test
    public void sendBill() {

        try { // Call Web Service Operation
            BillService_Service service = new BillService_Service();
            service.setHandlerResolver(new HeaderHandlerResolver());
            BillService port = service.getBillServicePort();
            // TODO initialize WS operation arguments here
            java.lang.String fileName = "10428482072-01-F001-1.zip";
            DataSource fds = new FileDataSource(FileLocation.XmlSignature.getLocation() + "10428482072-01-F001-1.zip");
            javax.activation.DataHandler contentFile = new javax.activation.DataHandler(fds);
            // TODO process result here
            byte[] result = port.sendBill(fileName, contentFile);
            FileOutputStream fileOuputStream = new FileOutputStream(FileLocation.XmlResponse.getLocation() + "10428482072-01-F001-1.zip");
            fileOuputStream.write(result);
            fileOuputStream.close();
            System.out.println("Result = " + result);
        } catch (SOAPFaultException ex) {
            System.out.println(ex.getFault().getFaultCode());
            System.out.println(ex.getFault().getFaultString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }*/
}
