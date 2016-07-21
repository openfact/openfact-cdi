package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.ValueType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProperty")
@CodingStyleguideUnaware
public class AdditionalProperty implements Serializable {
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private IDType ID;
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private ValueType value;

    public IDType getID() {
        return ID;
    }

    public void setID(IDType ID) {
        this.ID = ID;
    }

    public ValueType getValue() {
        return value;
    }

    public void setValue(ValueType value) {
        this.value = value;
    }

}
