//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.07.20 a las 12:44:20 PM COT 
//


package org.openfact.models.ubl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about Delivery Terms.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 *
 * 
 * <p>Clase Java para DeliveryTermsType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRiskResponsibilityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRisk" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTermsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
        "id",
        "specialTerms",
        "lossRiskResponsibilityCode",
        "lossRisk",
        "deliveryLocation",
        "allowanceCharge"
})
public class DeliveryTermsType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "SpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecialTermsType specialTerms;
    @XmlElement(name = "LossRiskResponsibilityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LossRiskResponsibilityCodeType lossRiskResponsibilityCode;
    @XmlElement(name = "LossRisk", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LossRiskType lossRisk;
    @XmlElement(name = "DeliveryLocation")
    protected LocationTypeCommAgg deliveryLocation;
    @XmlElement(name = "AllowanceCharge")
    protected AllowanceChargeType allowanceCharge;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Identifies the Delivery Terms.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;CIF, FOB, or EXW from the INCOTERMS Terms of Delivery. (2000 version preferred.)&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     *
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Special_ Terms. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A description of special conditions relating to the Delivery Terms.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Special&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Terms&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link SpecialTermsType }
     *     
     */
    public SpecialTermsType getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Define el valor de la propiedad specialTerms.
     *
     * @param value
     *     allowed object is
     *     {@link SpecialTermsType }
     *     
     */
    public void setSpecialTerms(SpecialTermsType value) {
        this.specialTerms = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Loss Risk Responsibility Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for the responsibility for loss risk in the context of the Delivery Terms, expressed as a code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Loss Risk Responsibility Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public LossRiskResponsibilityCodeType getLossRiskResponsibilityCode() {
        return lossRiskResponsibilityCode;
    }

    /**
     * Define el valor de la propiedad lossRiskResponsibilityCode.
     *
     * @param value
     *     allowed object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public void setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType value) {
        this.lossRiskResponsibilityCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Loss Risk. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A description of the loss risk in the context of the Delivery Terms.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Loss Risk&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link LossRiskType }
     *     
     */
    public LossRiskType getLossRisk() {
        return lossRisk;
    }

    /**
     * Define el valor de la propiedad lossRisk.
     *
     * @param value
     *     allowed object is
     *     {@link LossRiskType }
     *     
     */
    public void setLossRisk(LossRiskType value) {
        this.lossRisk = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Delivery_ Location. Location&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Location, e.g., a port.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Delivery&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Location&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Location&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link LocationTypeCommAgg }
     *     
     */
    public LocationTypeCommAgg getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Define el valor de la propiedad deliveryLocation.
     *
     * @param value
     *     allowed object is
     *     {@link LocationTypeCommAgg }
     *     
     */
    public void setDeliveryLocation(LocationTypeCommAgg value) {
        this.deliveryLocation = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Delivery Terms. Allowance Charge&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Allowance Charge.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Delivery Terms&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Allowance Charge&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Allowance Charge&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link AllowanceChargeType }
     *     
     */
    public AllowanceChargeType getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Define el valor de la propiedad allowanceCharge.
     *
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeType }
     *     
     */
    public void setAllowanceCharge(AllowanceChargeType value) {
        this.allowanceCharge = value;
    }

}
