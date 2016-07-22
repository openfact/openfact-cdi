package org.openfact.models.sign;

import org.junit.*;
import org.openfact.models.enums.FileLocation;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 22/07/2016.
 */
public class TestFirma {
    public TestFirma() {
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
    public void firmar() {
        String xmlFilePath = FileLocation.XmlInvoice.getLocation() + "10428482072-01-F001-1.xml";
        String signedXmlFilePath = FileLocation.XmlSignature.getLocation() + "10428482072-01-F001-1.xml";
        String privateKeyFilePath = FileLocation.UrlKey.getLocation() + "private.key";
        String publicKeyFilePath = FileLocation.UrlKey.getLocation() + "public.key";
        SignatureXmlDocument xmlSig = new SignatureXmlDocument();
        try {
            xmlSig.generateXMLDigitalSignature(xmlFilePath, signedXmlFilePath, privateKeyFilePath, publicKeyFilePath);
        } catch (KeyStoreException ex) {
            Logger.getLogger(TestFirma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestFirma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TestFirma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CertificateException ex) {
            Logger.getLogger(TestFirma.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnrecoverableEntryException ex) {
            Logger.getLogger(TestFirma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
