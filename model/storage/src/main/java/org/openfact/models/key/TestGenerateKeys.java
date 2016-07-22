package org.openfact.models.key;

import org.openfact.models.enums.FileLocation;

/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 22/07/2016.
 */
public class TestGenerateKeys {
    public static void main(String[] args) {
        String keysDirPath = FileLocation.UrlKey.getLocation();
        KeyEncriptation util = new KeyEncriptation();
        util.storeKeyPairs(keysDirPath);
        System.out.println("Private and Public Keys generated successfully ...");
    }
}
