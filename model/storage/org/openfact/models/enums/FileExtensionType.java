package org.openfact.models.enums;

public enum FileExtensionType {
    ZIP(".zip"), GZ(".gz"), RAR(".rar"), XML(".xml");

    private final String value;

    FileExtensionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
