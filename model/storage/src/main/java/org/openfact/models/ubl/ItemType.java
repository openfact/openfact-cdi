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
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ABIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Details&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information directly relating to an item.&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:AlternativeBusinessTerms&gt;article, product, goods item&lt;/ccts:AlternativeBusinessTerms&gt;&lt;/ccts:Component&gt;
 * </pre>
 * <p>
 * <p>
 * <p>Clase Java para ItemType complex type.
 * <p>
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="ItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Description" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PackSizeNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CatalogueIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Name" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}HazardousRiskIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}AdditionalInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Keyword" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BrandName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ModelName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}BuyersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}SellersItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturersItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}StandardItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueItemIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CatalogueDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemSpecificationDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginCountry" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}CommodityClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TransactionConditions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}HazardousItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ClassifiedTaxCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AdditionalItemProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ManufacturerParty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}InformationContentProviderParty" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}OriginAddress" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}ItemInstance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2", propOrder = {
        "description",
        "packQuantity",
        "packSizeNumeric",
        "catalogueIndicator",
        "name",
        "hazardousRiskIndicator",
        "additionalInformation",
        "keyword",
        "brandName",
        "modelName",
        "buyersItemIdentification",
        "sellersItemIdentification",
        "manufacturersItemIdentification",
        "standardItemIdentification",
        "catalogueItemIdentification",
        "additionalItemIdentification",
        "catalogueDocumentReference",
        "itemSpecificationDocumentReference",
        "originCountry",
        "commodityClassification",
        "transactionConditions",
        "hazardousItem",
        "classifiedTaxCategory",
        "additionalItemProperty",
        "manufacturerParty",
        "informationContentProviderParty",
        "originAddress",
        "itemInstance"
})
public class ItemType {

    @XmlElement(name = "Description", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<DescriptionType> description;
    @XmlElement(name = "PackQuantity", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackQuantityType packQuantity;
    @XmlElement(name = "PackSizeNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PackSizeNumericType packSizeNumeric;
    @XmlElement(name = "CatalogueIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CatalogueIndicatorType catalogueIndicator;
    @XmlElement(name = "Name", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected NameTypeCommBas name;
    @XmlElement(name = "HazardousRiskIndicator", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected HazardousRiskIndicatorType hazardousRiskIndicator;
    @XmlElement(name = "AdditionalInformation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected AdditionalInformationType additionalInformation;
    @XmlElement(name = "Keyword", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<KeywordType> keyword;
    @XmlElement(name = "BrandName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<BrandNameType> brandName;
    @XmlElement(name = "ModelName", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected List<ModelNameType> modelName;
    @XmlElement(name = "BuyersItemIdentification")
    protected ItemIdentificationType buyersItemIdentification;
    @XmlElement(name = "SellersItemIdentification")
    protected ItemIdentificationType sellersItemIdentification;
    @XmlElement(name = "ManufacturersItemIdentification")
    protected List<ItemIdentificationType> manufacturersItemIdentification;
    @XmlElement(name = "StandardItemIdentification")
    protected ItemIdentificationType standardItemIdentification;
    @XmlElement(name = "CatalogueItemIdentification")
    protected ItemIdentificationType catalogueItemIdentification;
    @XmlElement(name = "AdditionalItemIdentification")
    protected List<ItemIdentificationType> additionalItemIdentification;
    @XmlElement(name = "CatalogueDocumentReference")
    protected DocumentReferenceType catalogueDocumentReference;
    @XmlElement(name = "ItemSpecificationDocumentReference")
    protected List<DocumentReferenceType> itemSpecificationDocumentReference;
    @XmlElement(name = "OriginCountry")
    protected CountryType originCountry;
    @XmlElement(name = "CommodityClassification")
    protected List<CommodityClassificationType> commodityClassification;
    @XmlElement(name = "TransactionConditions")
    protected List<TransactionConditionsType> transactionConditions;
    @XmlElement(name = "HazardousItem")
    protected List<HazardousItemType> hazardousItem;
    @XmlElement(name = "ClassifiedTaxCategory")
    protected List<TaxCategoryType> classifiedTaxCategory;
    @XmlElement(name = "AdditionalItemProperty")
    protected List<ItemPropertyType> additionalItemProperty;
    @XmlElement(name = "ManufacturerParty")
    protected List<PartyType> manufacturerParty;
    @XmlElement(name = "InformationContentProviderParty")
    protected PartyType informationContentProviderParty;
    @XmlElement(name = "OriginAddress")
    protected List<AddressType> originAddress;
    @XmlElement(name = "ItemInstance")
    protected List<ItemInstanceType> itemInstance;

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Description. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Free-form field that can be used to give a text description of the item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Description&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the description property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescriptionType }
     */
    public List<DescriptionType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescriptionType>();
        }
        return this.description;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Pack Quantity. Quantity&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The unit packaging quantity.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Pack Quantity&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Quantity&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Quantity. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link PackQuantityType }
     */
    public PackQuantityType getPackQuantity() {
        return packQuantity;
    }

    /**
     * Define el valor de la propiedad packQuantity.
     *
     * @param value allowed object is
     *              {@link PackQuantityType }
     */
    public void setPackQuantity(PackQuantityType value) {
        this.packQuantity = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Pack Size. Numeric&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;The number of items in a pack.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Pack Size&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Numeric&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Numeric. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link PackSizeNumericType }
     */
    public PackSizeNumericType getPackSizeNumeric() {
        return packSizeNumeric;
    }

    /**
     * Define el valor de la propiedad packSizeNumeric.
     *
     * @param value allowed object is
     *              {@link PackSizeNumericType }
     */
    public void setPackSizeNumeric(PackSizeNumericType value) {
        this.packSizeNumeric = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Catalogue_ Indicator. Indicator&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Indicates whether the item was ordered from a Catalogue (true) or not (false).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Catalogue&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Indicator&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Indicator&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Indicator. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link CatalogueIndicatorType }
     */
    public CatalogueIndicatorType getCatalogueIndicator() {
        return catalogueIndicator;
    }

    /**
     * Define el valor de la propiedad catalogueIndicator.
     *
     * @param value allowed object is
     *              {@link CatalogueIndicatorType }
     */
    public void setCatalogueIndicator(CatalogueIndicatorType value) {
        this.catalogueIndicator = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A short name optionally given to an item, such as a name from a Catalogue, as distinct from a description.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link NameTypeCommBas }
     */
    public NameTypeCommBas getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     *
     * @param value allowed object is
     *              {@link NameTypeCommBas }
     */
    public void setName(NameTypeCommBas value) {
        this.name = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Hazardous Risk_ Indicator. Indicator&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Indicates whether the item as delivered is hazardous.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Hazardous Risk&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Indicator&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Indicator&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Indicator. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;Default is negative&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link HazardousRiskIndicatorType }
     */
    public HazardousRiskIndicatorType getHazardousRiskIndicator() {
        return hazardousRiskIndicator;
    }

    /**
     * Define el valor de la propiedad hazardousRiskIndicator.
     *
     * @param value allowed object is
     *              {@link HazardousRiskIndicatorType }
     */
    public void setHazardousRiskIndicator(HazardousRiskIndicatorType value) {
        this.hazardousRiskIndicator = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Additional_ Information. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Provides more details of the item (e.g., the URL of a relevant web page).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Additional&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Information&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link AdditionalInformationType }
     */
    public AdditionalInformationType getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Define el valor de la propiedad additionalInformation.
     *
     * @param value allowed object is
     *              {@link AdditionalInformationType }
     */
    public void setAdditionalInformation(AdditionalInformationType value) {
        this.additionalInformation = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Keyword. Text&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;A Seller Party-defined search string for the item. Also could be synonyms for identifying the item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Keyword&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Text&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Text. Type&lt;/ccts:DataType&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the keyword property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyword property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyword().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeywordType }
     */
    public List<KeywordType> getKeyword() {
        if (keyword == null) {
            keyword = new ArrayList<KeywordType>();
        }
        return this.keyword;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Brand Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Brand name for the item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Brand Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;Coca-Cola&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the brandName property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandName property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandName().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrandNameType }
     */
    public List<BrandNameType> getBrandName() {
        if (brandName == null) {
            brandName = new ArrayList<BrandNameType>();
        }
        return this.brandName;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Model Name. Name&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Model name for the item.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Model Name&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Name&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Name. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"VW Beetle"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the modelName property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modelName property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModelName().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModelNameType }
     */
    public List<ModelNameType> getModelName() {
        if (modelName == null) {
            modelName = new ArrayList<ModelNameType>();
        }
        return this.modelName;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Buyers_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its identification according to the buyer's system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Buyers&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link ItemIdentificationType }
     */
    public ItemIdentificationType getBuyersItemIdentification() {
        return buyersItemIdentification;
    }

    /**
     * Define el valor de la propiedad buyersItemIdentification.
     *
     * @param value allowed object is
     *              {@link ItemIdentificationType }
     */
    public void setBuyersItemIdentification(ItemIdentificationType value) {
        this.buyersItemIdentification = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Sellers_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its identification according to the seller's system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Sellers&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link ItemIdentificationType }
     */
    public ItemIdentificationType getSellersItemIdentification() {
        return sellersItemIdentification;
    }

    /**
     * Define el valor de la propiedad sellersItemIdentification.
     *
     * @param value allowed object is
     *              {@link ItemIdentificationType }
     */
    public void setSellersItemIdentification(ItemIdentificationType value) {
        this.sellersItemIdentification = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Manufacturers_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its identification according to the manufacturer's system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Manufacturers&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the manufacturersItemIdentification property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturersItemIdentification property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturersItemIdentification().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     */
    public List<ItemIdentificationType> getManufacturersItemIdentification() {
        if (manufacturersItemIdentification == null) {
            manufacturersItemIdentification = new ArrayList<ItemIdentificationType>();
        }
        return this.manufacturersItemIdentification;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Standard_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its identification according to a standard system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Standard&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link ItemIdentificationType }
     */
    public ItemIdentificationType getStandardItemIdentification() {
        return standardItemIdentification;
    }

    /**
     * Define el valor de la propiedad standardItemIdentification.
     *
     * @param value allowed object is
     *              {@link ItemIdentificationType }
     */
    public void setStandardItemIdentification(ItemIdentificationType value) {
        this.standardItemIdentification = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Catalogue_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its identification according to a cataloguing system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Catalogue&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link ItemIdentificationType }
     */
    public ItemIdentificationType getCatalogueItemIdentification() {
        return catalogueItemIdentification;
    }

    /**
     * Define el valor de la propiedad catalogueItemIdentification.
     *
     * @param value allowed object is
     *              {@link ItemIdentificationType }
     */
    public void setCatalogueItemIdentification(ItemIdentificationType value) {
        this.catalogueItemIdentification = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Additional_ Item Identification. Item Identification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with other identification means.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Additional&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Identification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Identification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the additionalItemIdentification property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemIdentification property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemIdentification().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemIdentificationType }
     */
    public List<ItemIdentificationType> getAdditionalItemIdentification() {
        if (additionalItemIdentification == null) {
            additionalItemIdentification = new ArrayList<ItemIdentificationType>();
        }
        return this.additionalItemIdentification;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Catalogue_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An associative reference to Catalogue.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Catalogue&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link DocumentReferenceType }
     */
    public DocumentReferenceType getCatalogueDocumentReference() {
        return catalogueDocumentReference;
    }

    /**
     * Define el valor de la propiedad catalogueDocumentReference.
     *
     * @param value allowed object is
     *              {@link DocumentReferenceType }
     */
    public void setCatalogueDocumentReference(DocumentReferenceType value) {
        this.catalogueDocumentReference = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Item Specification_ Document Reference. Document Reference&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An associative reference to a document providing Item specification.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Item Specification&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Document Reference&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Document Reference&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the itemSpecificationDocumentReference property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemSpecificationDocumentReference property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemSpecificationDocumentReference().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceType }
     */
    public List<DocumentReferenceType> getItemSpecificationDocumentReference() {
        if (itemSpecificationDocumentReference == null) {
            itemSpecificationDocumentReference = new ArrayList<DocumentReferenceType>();
        }
        return this.itemSpecificationDocumentReference;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Origin_ Country. Country&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its country of origin.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Origin&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Country&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Country&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link CountryType }
     */
    public CountryType getOriginCountry() {
        return originCountry;
    }

    /**
     * Define el valor de la propiedad originCountry.
     *
     * @param value allowed object is
     *              {@link CountryType }
     */
    public void setOriginCountry(CountryType value) {
        this.originCountry = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Commodity Classification&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its classification(s) according to a commodity classifying system.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Commodity Classification&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Commodity Classification&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the commodityClassification property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commodityClassification property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityClassification().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommodityClassificationType }
     */
    public List<CommodityClassificationType> getCommodityClassification() {
        if (commodityClassification == null) {
            commodityClassification = new ArrayList<CommodityClassificationType>();
        }
        return this.commodityClassification;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Transaction Conditions&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with sales conditions appertaining to it.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Transaction Conditions&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Transaction Conditions&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the transactionConditions property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionConditions property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionConditions().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionConditionsType }
     */
    public List<TransactionConditionsType> getTransactionConditions() {
        if (transactionConditions == null) {
            transactionConditions = new ArrayList<TransactionConditionsType>();
        }
        return this.transactionConditions;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Hazardous Item&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its hazardous item information.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Hazardous Item&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Hazardous Item&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the hazardousItem property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousItem property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousItem().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousItemType }
     */
    public List<HazardousItemType> getHazardousItem() {
        if (hazardousItem == null) {
            hazardousItem = new ArrayList<HazardousItemType>();
        }
        return this.hazardousItem;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Classified_ Tax Category. Tax Category&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Classifies the item using one or more categories of taxes.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Classified&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Tax Category&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Tax Category&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the classifiedTaxCategory property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classifiedTaxCategory property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassifiedTaxCategory().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCategoryType }
     */
    public List<TaxCategoryType> getClassifiedTaxCategory() {
        if (classifiedTaxCategory == null) {
            classifiedTaxCategory = new ArrayList<TaxCategoryType>();
        }
        return this.classifiedTaxCategory;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Additional_ Item Property. Item Property&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with a set of additional properties.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Additional&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Item Property&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Property&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the additionalItemProperty property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalItemProperty property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalItemProperty().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemPropertyType }
     */
    public List<ItemPropertyType> getAdditionalItemProperty() {
        if (additionalItemProperty == null) {
            additionalItemProperty = new ArrayList<ItemPropertyType>();
        }
        return this.additionalItemProperty;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Manufacturer_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with its manufacturer.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Manufacturer&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the manufacturerParty property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerParty property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerParty().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyType }
     */
    public List<PartyType> getManufacturerParty() {
        if (manufacturerParty == null) {
            manufacturerParty = new ArrayList<PartyType>();
        }
        return this.manufacturerParty;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Information Content Provider_ Party. Party&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with the party responsible for the its specification.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Information Content Provider&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Party&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Party&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     *
     * @return possible object is
     * {@link PartyType }
     */
    public PartyType getInformationContentProviderParty() {
        return informationContentProviderParty;
    }

    /**
     * Define el valor de la propiedad informationContentProviderParty.
     *
     * @param value allowed object is
     *              {@link PartyType }
     */
    public void setInformationContentProviderParty(PartyType value) {
        this.informationContentProviderParty = value;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Origin_ Address. Address&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Associates the item with the region of origin (not the country).&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTermQualifier&gt;Origin&lt;/ccts:PropertyTermQualifier&gt;&lt;ccts:PropertyTerm&gt;Address&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Address&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the originAddress property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originAddress property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginAddress().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressType }
     */
    public List<AddressType> getOriginAddress() {
        if (originAddress == null) {
            originAddress = new ArrayList<AddressType>();
        }
        return this.originAddress;
    }

    /**
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" xmlns:qdt="urn:oasis:names:specification:ubl:schema:xsd:QualifiedDatatypes-2" xmlns:udt="urn:un:unece:uncefact:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ASBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;Item. Item Instance&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An association to Item Instance.&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..n&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;Item&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Item Instance&lt;/ccts:PropertyTerm&gt;&lt;ccts:AssociatedObjectClass&gt;Item Instance&lt;/ccts:AssociatedObjectClass&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the itemInstance property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemInstance property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemInstance().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemInstanceType }
     */
    public List<ItemInstanceType> getItemInstance() {
        if (itemInstance == null) {
            itemInstance = new ArrayList<ItemInstanceType>();
        }
        return this.itemInstance;
    }

}
