package org.openfact.models.sign;

import org.openfact.models.enums.FileLocation;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 22/07/2016.
 */
public class TestVerifyXmlSignature {

    /**
     * Method used to validate an actual signed XML document
     */
    public static void testSignedXMLDoc() {
        String signedXmlFilePath = FileLocation.XmlSignature.getLocation() + "10428482072-01-F001-1.xml";
        String publicKeyFilePath = FileLocation.UrlKey.getLocation() + "public.key";
        try {
            boolean validFlag = SignatureXmlDocumentVerifier.
                    isXmlDigitalSignatureValid(signedXmlFilePath, publicKeyFilePath);
            System.out.println("Validity of XML Digital Signature : " + validFlag);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //Test for Valid one
        testSignedXMLDoc();
    }
}
