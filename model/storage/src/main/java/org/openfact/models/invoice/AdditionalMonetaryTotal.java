package org.openfact.models.invoice;

import com.helger.commons.annotation.CodingStyleguideUnaware;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_21.PayableAmountType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 20/07/2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalMonetaryTotal")
@CodingStyleguideUnaware
public class AdditionalMonetaryTotal implements Serializable {
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private IDType ID;
    @XmlElement(name = "PayableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    private PayableAmountType payableAmount;


    public IDType getID() {
        return ID;
    }

    public void setID(IDType ID) {
        this.ID = ID;
    }

    public PayableAmountType getPayableAmount() {
        return payableAmount;
    }


    public void setPayableAmount(PayableAmountType payableAmount) {
        this.payableAmount = payableAmount;
    }

}
