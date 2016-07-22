package org.openfact.models.sign;

import org.openfact.models.enums.FileLocation;
import org.openfact.models.key.KeyEncriptation;

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
public class TestAllInOne {
    public static void main(String[] args) {
        //Generate the keys
        String keysDirPath = FileLocation.UrlKey.getLocation();
        KeyEncriptation util = new KeyEncriptation();
        util.storeKeyPairs(keysDirPath);
        System.out.println("Private and Public Keys generated successfully ...");
        //Sign the XML Dcouments
        String xmlFilePath = FileLocation.XmlInvoice.getLocation() + "10428482072-01-F001-1.xml";
        String signedXmlFilePath = FileLocation.XmlSignature.getLocation() + "10428482072-01-F001-1.xml";
        String privateKeyFilePath = keysDirPath + "private.key";
        String publicKeyFilePath = keysDirPath + "public.key";
        SignatureXmlDocument xmlSig = new SignatureXmlDocument();
        try {
            xmlSig.generateXMLDigitalSignature(xmlFilePath, signedXmlFilePath, privateKeyFilePath, publicKeyFilePath);
        } catch (KeyStoreException ex) {
            Logger.getLogger(TestAllInOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestAllInOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(TestAllInOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CertificateException ex) {
            Logger.getLogger(TestAllInOne.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnrecoverableEntryException ex) {
            Logger.getLogger(TestAllInOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Verify the signed XML Document
        try {
            boolean validFlag = SignatureXmlDocumentVerifier.
                    isXmlDigitalSignatureValid(signedXmlFilePath, publicKeyFilePath);
            System.out.println("Validity of XML Digital Signature : " + validFlag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
