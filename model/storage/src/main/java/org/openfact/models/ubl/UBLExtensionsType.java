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
 * A container for all extensions present in the document.
 * <p>
 * <p>
 * <p>Clase Java para UBLExtensionsType complex type.
 * <p>
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;complexType name="UBLExtensionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2}UBLExtension" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UBLExtensionsType", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonExtensionComponents-2", propOrder = {
        "ublExtension"
})
public class UBLExtensionsType {

    @XmlElement(name = "UBLExtension", required = true)
    protected List<UBLExtensionType> ublExtension;

    /**
     * A single extension for private use.
     * Gets the value of the ublExtension property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ublExtension property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUBLExtension().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UBLExtensionType }
     */
    public List<UBLExtensionType> getUBLExtension() {
        if (ublExtension == null) {
            ublExtension = new ArrayList<UBLExtensionType>();
        }
        return this.ublExtension;
    }

}
