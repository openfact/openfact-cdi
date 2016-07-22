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
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about a structured address.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 *
 * 
 * <p>Clase Java para AddressType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AddressFormatCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Postbox" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Floor" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Room" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}StreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalStreetName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BlockName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BuildingNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}InhouseMail" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Department" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkAttention" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}MarkCare" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PlotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CitySubdivisionName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PostalZone" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CountrySubentityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Region" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}District" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TimezoneOffset" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AddressLine" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}LocationCoordinate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
        "id",
        "addressTypeCode",
        "addressFormatCode",
        "postbox",
        "floor",
        "room",
        "streetName",
        "additionalStreetName",
        "blockName",
        "buildingName",
        "buildingNumber",
        "inhouseMail",
        "department",
        "markAttention",
        "markCare",
        "plotIdentification",
        "citySubdivisionName",
        "cityName",
        "postalZone",
        "countrySubentity",
        "countrySubentityCode",
        "region",
        "district",
        "timezoneOffset",
        "addressLine",
        "country",
        "locationCoordinate"
})
public class AddressType {

    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "AddressTypeCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressTypeCodeType addressTypeCode;
    @XmlElement(name = "AddressFormatCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AddressFormatCodeType addressFormatCode;
    @XmlElement(name = "Postbox", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostboxType postbox;
    @XmlElement(name = "Floor", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected FloorType floor;
    @XmlElement(name = "Room", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RoomType room;
    @XmlElement(name = "StreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected StreetNameType streetName;
    @XmlElement(name = "AdditionalStreetName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdditionalStreetNameType additionalStreetName;
    @XmlElement(name = "BlockName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BlockNameType blockName;
    @XmlElement(name = "BuildingName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingNameType buildingName;
    @XmlElement(name = "BuildingNumber", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BuildingNumberType buildingNumber;
    @XmlElement(name = "InhouseMail", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected InhouseMailType inhouseMail;
    @XmlElement(name = "Department", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DepartmentType department;
    @XmlElement(name = "MarkAttention", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkAttentionType markAttention;
    @XmlElement(name = "MarkCare", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected MarkCareType markCare;
    @XmlElement(name = "PlotIdentification", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PlotIdentificationType plotIdentification;
    @XmlElement(name = "CitySubdivisionName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CitySubdivisionNameType citySubdivisionName;
    @XmlElement(name = "CityName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CityNameType cityName;
    @XmlElement(name = "PostalZone", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PostalZoneType postalZone;
    @XmlElement(name = "CountrySubentity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityType countrySubentity;
    @XmlElement(name = "CountrySubentityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CountrySubentityCodeType countrySubentityCode;
    @XmlElement(name = "Region", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected RegionType region;
    @XmlElement(name = "District", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected DistrictType district;
    @XmlElement(name = "TimezoneOffset", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TimezoneOffsetType timezoneOffset;
    @XmlElement(name = "AddressLine")
    protected List<AddressLineType> addressLine;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "LocationCoordinate")
    protected LocationCoordinateType locationCoordinate;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Identifier&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for a specific address within a scheme of registered addresses.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;DetailsKey&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Address Type Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code specifying the type of this address, such as business address or home address.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Address Type Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public AddressTypeCodeType getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Define el valor de la propiedad addressTypeCode.
     *
     * @param value
     *     allowed object is
     *     {@link AddressTypeCodeType }
     *     
     */
    public void setAddressTypeCode(AddressTypeCodeType value) {
        this.addressTypeCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Address Format Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A code specifying the format of this address.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Address Format Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link AddressFormatCodeType }
     *     
     */
    public AddressFormatCodeType getAddressFormatCode() {
        return addressFormatCode;
    }

    /**
     * Define el valor de la propiedad addressFormatCode.
     *
     * @param value
     *     allowed object is
     *     {@link AddressFormatCodeType }
     *     
     */
    public void setAddressFormatCode(AddressFormatCodeType value) {
        this.addressFormatCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Postbox. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A post office box number.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Postbox&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;PostBox, PO Box&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"123"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link PostboxType }
     *     
     */
    public PostboxType getPostbox() {
        return postbox;
    }

    /**
     * Define el valor de la propiedad postbox.
     *
     * @param value
     *     allowed object is
     *     {@link PostboxType }
     *     
     */
    public void setPostbox(PostboxType value) {
        this.postbox = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Floor. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An addressable floor of a building.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Floor&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;SubPremiseNumber&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"30"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link FloorType }
     *     
     */
    public FloorType getFloor() {
        return floor;
    }

    /**
     * Define el valor de la propiedad floor.
     *
     * @param value
     *     allowed object is
     *     {@link FloorType }
     *     
     */
    public void setFloor(FloorType value) {
        this.floor = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Room. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A room, suite, or apartment of a building.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Room&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;SubPremiseNumber&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Reception"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link RoomType }
     *     
     */
    public RoomType getRoom() {
        return room;
    }

    /**
     * Define el valor de la propiedad room.
     *
     * @param value
     *     allowed object is
     *     {@link RoomType }
     *     
     */
    public void setRoom(RoomType value) {
        this.room = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Street Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The name of a street.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Street Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Thoroughfare&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Kwun Tong Road"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link StreetNameType }
     *     
     */
    public StreetNameType getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     *
     * @param value
     *     allowed object is
     *     {@link StreetNameType }
     *     
     */
    public void setStreetName(StreetNameType value) {
        this.streetName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Additional_ Street Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An additional name of a street used to further specify the street name.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Additional&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Street Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Thoroughfare&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Cnr Aberdeen Road"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link AdditionalStreetNameType }
     *     
     */
    public AdditionalStreetNameType getAdditionalStreetName() {
        return additionalStreetName;
    }

    /**
     * Define el valor de la propiedad additionalStreetName.
     *
     * @param value
     *     allowed object is
     *     {@link AdditionalStreetNameType }
     *     
     */
    public void setAdditionalStreetName(AdditionalStreetNameType value) {
        this.additionalStreetName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Block Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The block name, expressed as text, for an area surrounded by streets and usually containing several buildings for this address.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Block Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;Seabird&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link BlockNameType }
     *     
     */
    public BlockNameType getBlockName() {
        return blockName;
    }

    /**
     * Define el valor de la propiedad blockName.
     *
     * @param value
     *     allowed object is
     *     {@link BlockNameType }
     *     
     */
    public void setBlockName(BlockNameType value) {
        this.blockName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Building Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The name of a building.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Building Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;BuildingName&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Plot 421"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link BuildingNameType }
     *     
     */
    public BuildingNameType getBuildingName() {
        return buildingName;
    }

    /**
     * Define el valor de la propiedad buildingName.
     *
     * @param value
     *     allowed object is
     *     {@link BuildingNameType }
     *     
     */
    public void setBuildingName(BuildingNameType value) {
        this.buildingName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Building Number. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The number of a building.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Building Number&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;PremiseNumber&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"388"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link BuildingNumberType }
     *     
     */
    public BuildingNumberType getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Define el valor de la propiedad buildingNumber.
     *
     * @param value
     *     allowed object is
     *     {@link BuildingNumberType }
     *     
     */
    public void setBuildingNumber(BuildingNumberType value) {
        this.buildingNumber = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Inhouse_ Mail. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A specific location within a building.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Inhouse&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Mail&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;MailStop&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link InhouseMailType }
     *     
     */
    public InhouseMailType getInhouseMail() {
        return inhouseMail;
    }

    /**
     * Define el valor de la propiedad inhouseMail.
     *
     * @param value
     *     allowed object is
     *     {@link InhouseMailType }
     *     
     */
    public void setInhouseMail(InhouseMailType value) {
        this.inhouseMail = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Department. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An addressable department of an organization.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Department&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;Department&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Accounts Payable"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link DepartmentType }
     *     
     */
    public DepartmentType getDepartment() {
        return department;
    }

    /**
     * Define el valor de la propiedad department.
     *
     * @param value
     *     allowed object is
     *     {@link DepartmentType }
     *     
     */
    public void setDepartment(DepartmentType value) {
        this.department = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Mark Attention. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The name, expressed as text, of a person or department in the organization to whom incoming mail is marked with words such as 'for the attention of' or 'FAO' or 'ATTN' for this address.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Mark Attention&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link MarkAttentionType }
     *     
     */
    public MarkAttentionType getMarkAttention() {
        return markAttention;
    }

    /**
     * Define el valor de la propiedad markAttention.
     *
     * @param value
     *     allowed object is
     *     {@link MarkAttentionType }
     *     
     */
    public void setMarkAttention(MarkAttentionType value) {
        this.markAttention = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Mark Care. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The name, expressed as text, of a person or organization at this address to whom incoming mail is marked with words such as 'care of' or 'C/O'.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Mark Care&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link MarkCareType }
     *     
     */
    public MarkCareType getMarkCare() {
        return markCare;
    }

    /**
     * Define el valor de la propiedad markCare.
     *
     * @param value
     *     allowed object is
     *     {@link MarkCareType }
     *     
     */
    public void setMarkCare(MarkCareType value) {
        this.markCare = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Plot Identification. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The textual expression of the unique identifier for the piece of land on which this address is located such as a plot number.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Plot Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link PlotIdentificationType }
     *     
     */
    public PlotIdentificationType getPlotIdentification() {
        return plotIdentification;
    }

    /**
     * Define el valor de la propiedad plotIdentification.
     *
     * @param value
     *     allowed object is
     *     {@link PlotIdentificationType }
     *     
     */
    public void setPlotIdentification(PlotIdentificationType value) {
        this.plotIdentification = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. City Subdivision Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A name, expressed as text, of a subdivision of a city for this address, for example, a district or borough.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;City Subdivision Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link CitySubdivisionNameType }
     *     
     */
    public CitySubdivisionNameType getCitySubdivisionName() {
        return citySubdivisionName;
    }

    /**
     * Define el valor de la propiedad citySubdivisionName.
     *
     * @param value
     *     allowed object is
     *     {@link CitySubdivisionNameType }
     *     
     */
    public void setCitySubdivisionName(CitySubdivisionNameType value) {
        this.citySubdivisionName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. City Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The name of a city, town, or village.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;City Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;LocalityName&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Hong Kong"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link CityNameType }
     *     
     */
    public CityNameType getCityName() {
        return cityName;
    }

    /**
     * Define el valor de la propiedad cityName.
     *
     * @param value
     *     allowed object is
     *     {@link CityNameType }
     *     
     */
    public void setCityName(CityNameType value) {
        this.cityName = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Postal_ Zone. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The identifier for an addressable group of properties according to the relevant national postal service, such as a ZIP code or Post Code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Postal&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Zone&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;PostalCodeNumber&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"SW11 4EW" "2500 GG"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link PostalZoneType }
     *     
     */
    public PostalZoneType getPostalZone() {
        return postalZone;
    }

    /**
     * Define el valor de la propiedad postalZone.
     *
     * @param value
     *     allowed object is
     *     {@link PostalZoneType }
     *     
     */
    public void setPostalZone(PostalZoneType value) {
        this.postalZone = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Country Subentity. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A territorial division of a country, such as a county or state.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Country Subentity&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;AdministrativeArea, State, Country, Shire, Canton&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"Florida","Tamilnadu"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link CountrySubentityType }
     *     
     */
    public CountrySubentityType getCountrySubentity() {
        return countrySubentity;
    }

    /**
     * Define el valor de la propiedad countrySubentity.
     *
     * @param value
     *     allowed object is
     *     {@link CountrySubentityType }
     *     
     */
    public void setCountrySubentity(CountrySubentityType value) {
        this.countrySubentity = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Country Subentity Code. Code&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A territorial division of a country, such as a county or state, expressed as a code.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Country Subentity Code&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Code&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Code. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;AdministrativeAreaCode, State Code&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link CountrySubentityCodeType }
     *     
     */
    public CountrySubentityCodeType getCountrySubentityCode() {
        return countrySubentityCode;
    }

    /**
     * Define el valor de la propiedad countrySubentityCode.
     *
     * @param value
     *     allowed object is
     *     {@link CountrySubentityCodeType }
     *     
     */
    public void setCountrySubentityCode(CountrySubentityCodeType value) {
        this.countrySubentityCode = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Region. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An addressable region or group of countries.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Region&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;LocalityName, Economic Zone&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"European Union"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link RegionType }
     *     
     */
    public RegionType getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     *
     * @param value
     *     allowed object is
     *     {@link RegionType }
     *     
     */
    public void setRegion(RegionType value) {
        this.region = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. District. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A geographical division of a country.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;District&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:AlternativeBusinessTerms&gt;LocalityName, Area&lt;/ccts:AlternativeBusinessTerms&gt;&lt;ccts:Examples&gt;"East Coast"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link DistrictType }
     *     
     */
    public DistrictType getDistrict() {
        return district;
    }

    /**
     * Define el valor de la propiedad district.
     *
     * @param value
     *     allowed object is
     *     {@link DistrictType }
     *     
     */
    public void setDistrict(DistrictType value) {
        this.district = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Timezone Offset. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;For the time zone in which the address is situated, the measure of time offset from Universal Coordinated Time (UTC).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Timezone Offset&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"+8:00" "-3:00"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link TimezoneOffsetType }
     *     
     */
    public TimezoneOffsetType getTimezoneOffset() {
        return timezoneOffset;
    }

    /**
     * Define el valor de la propiedad timezoneOffset.
     *
     * @param value
     *     allowed object is
     *     {@link TimezoneOffsetType }
     *     
     */
    public void setTimezoneOffset(TimezoneOffsetType value) {
        this.timezoneOffset = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Address Line&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Address Line.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Address Line&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Address Line&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the addressLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressLine().add(newItem);
     * </pre>
     *
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressLineType }
     *
     * 
     */
    public List<AddressLineType> getAddressLine() {
        if (addressLine == null) {
            addressLine = new ArrayList<AddressLineType>();
        }
        return this.addressLine;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Country&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Country.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Country&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Country&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Define el valor de la propiedad country.
     *
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Address. Location Coordinate&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Location Coordinate.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Address&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Location Coordinate&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Location Coordinate&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     *
     * @return
     *     possible object is
     *     {@link LocationCoordinateType }
     *     
     */
    public LocationCoordinateType getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * Define el valor de la propiedad locationCoordinate.
     *
     * @param value
     *     allowed object is
     *     {@link LocationCoordinateType }
     *     
     */
    public void setLocationCoordinate(LocationCoordinateType value) {
        this.locationCoordinate = value;
    }

}
