package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import com.helger.commons.annotation.ReturnsMutableObject;

import javax.annotation.Nonnull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation", propOrder = {
        "AdditionalMonetaryTotal",
        "AdditionalProperty"
})
@CodingStyleguideUnaware
public class AdditionalInformation implements Serializable, Cloneable {
    @XmlElement(name = "AdditionalMonetaryTotal", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private List<AdditionalMonetaryTotal> AdditionalMonetaryTotal;
    @XmlElement(name = "AdditionalProperty", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private List<AdditionalProperty> AdditionalProperty;

    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<AdditionalMonetaryTotal> getAdditionalMonetaryTotal() {
        if (AdditionalMonetaryTotal == null) {
            AdditionalMonetaryTotal = new ArrayList<AdditionalMonetaryTotal>();
        }
        return this.AdditionalMonetaryTotal;
    }

    @Nonnull
    @ReturnsMutableObject("JAXB implementation style")
    public List<AdditionalProperty> getAdditionalProperty() {
        if (AdditionalProperty == null) {
            AdditionalProperty = new ArrayList<AdditionalProperty>();
        }
        return this.AdditionalProperty;
    }


}
