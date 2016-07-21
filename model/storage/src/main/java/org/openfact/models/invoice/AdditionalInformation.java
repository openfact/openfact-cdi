package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.AdditionalInformationType;

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
public class AdditionalInformation extends AdditionalInformationType implements Serializable, Cloneable {
    @XmlElement(name = "AdditionalMonetaryTotal")
    private List<AdditionalMonetaryTotal> AdditionalMonetaryTotal;
    @XmlElement(name = "AdditionalProperty")
    private List<AdditionalProperty> AdditionalProperty;


    public List<AdditionalMonetaryTotal> getAdditionalMonetaryTotal() {
        if (AdditionalMonetaryTotal == null) {
            AdditionalMonetaryTotal = new ArrayList<AdditionalMonetaryTotal>();
        }
        return this.AdditionalMonetaryTotal;
    }


    public List<AdditionalProperty> getAdditionalProperty() {
        if (AdditionalProperty == null) {
            AdditionalProperty = new ArrayList<AdditionalProperty>();
        }
        return this.AdditionalProperty;
    }


}
