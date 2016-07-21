/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 21/07/2016.
 */

/*
@XmlSchema(
        xmlns = {
                @XmlNs(prefix = "xmlnsRetention", namespaceURI = "urn:sunat:names:specification:ubl:peru:schema:xsd:Retention-1"),
                @XmlNs(prefix = "xmlnsInvoice", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:UblGenerator-2"),
                @XmlNs(prefix = "xmlnsCreditNote", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CreditNote-2"),
                @XmlNs(prefix = "xmlnsDebitNote", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:DebitNote-2"),
                @XmlNs(prefix = "xmlnsVoidedDocuments", namespaceURI = "urn:sunat:names:specification:ubl:peru:schema:xsd:VoidedDocuments-1"),
                @XmlNs(prefix = "xmlnsSummaryDocuments", namespaceURI = "urn:sunat:names:specification:ubl:peru:schema:xsd:SummaryDocuments-1"),
                @XmlNs(prefix = "sac", namespaceURI = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1"),
                @XmlNs(prefix = "cac", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"),
                @XmlNs(prefix = "cbc", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2"),
                @XmlNs(prefix = "udt", namespaceURI = "urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2"),
                @XmlNs(prefix = "ccts", namespaceURI = "urn:un:unece:uncefact:documentation:2"),
                @XmlNs(prefix = "ext", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2"),
                @XmlNs(prefix = "qdt", namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2"),
                @XmlNs(prefix = "ds", namespaceURI = "http://www.w3.org/2000/09/xmldsig#"),
                @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance")
        }
)*/
@javax.xml.bind.annotation.XmlSchema(namespace = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(namespaceURI = "urn:sunat:names:specification:ubl:peru:schema:xsd:SunatAggregateComponents-1", prefix = "sac"),
                @XmlNs(namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", prefix = "cac"),
                @XmlNs(namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", prefix = "cbc"),
                @XmlNs(namespaceURI = "urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2", prefix = "udt"),
                @XmlNs(namespaceURI = "urn:un:unece:uncefact:documentation:2", prefix = "ccts"),
                @XmlNs(namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", prefix = "ext"),
                @XmlNs(namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2", prefix = "qdt"),
                @XmlNs(namespaceURI = "http://www.w3.org/2000/09/xmldsig#", prefix = "ds"),
                @XmlNs(namespaceURI = "urn:oasis:names:specification:ubl:schema:xsd:Invoice-2", prefix = "")

        })
package org.openfact.models.invoice;

import javax.xml.bind.annotation.XmlNs;
