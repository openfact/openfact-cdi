package org.openfact.models.invoice;

import java.io.Serializable;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 21/07/2016.
 */

public class NameTypeCommBas implements Serializable {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
