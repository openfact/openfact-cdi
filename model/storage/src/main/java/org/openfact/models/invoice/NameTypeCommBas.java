package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 21/07/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType")
@CodingStyleguideUnaware
public class NameTypeCommBas implements Serializable {
    @XmlElement(name = "Value", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
