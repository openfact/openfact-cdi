package org.openfact.models.xml;


import org.openfact.models.FacturaModel;
import org.openfact.models.utils.XmlSpaceNames;

import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.math.BigDecimal;


/**
 * Created by Alex Pariona-"alexpariona@openfact.com" on 14/07/2016.
 */
public class XmlFacturaGenerator {

    private final String REGION = "PEN";

    public void createFacturaXml(FacturaModel model, String Path) throws XMLStreamException, IOException {

        StringBuilder builder = new StringBuilder();
        builder.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?><Invoice \n");
        builder.append("xmlns=\"" + XmlSpaceNames.xmlnsInvoice + "\"");
        builder.append("xmlns:cac=\"" + XmlSpaceNames.cac + "\"");
        builder.append("xmlns:cbc=\"" + XmlSpaceNames.cbc + "\"");
        builder.append("xmlns:ccts=\"" + XmlSpaceNames.ccts + "\"");
        builder.append("xmlns:ds=\"" + XmlSpaceNames.ds + "\"");
        builder.append("xmlns:ext=\"" + XmlSpaceNames.ext + "\"");
        builder.append("xmlns:qdt=\"" + XmlSpaceNames.qdt + "\"");
        builder.append("xmlns:sac=\"" + XmlSpaceNames.sac + "\"");
        builder.append("xmlns:udt=\"" + XmlSpaceNames.udt + "\"");
        builder.append("xmlns:xsi=\"" + XmlSpaceNames.xsi + "\"");

        // <editor-fold defaultstate="collapsed" desc="UBLExtensions">

        builder.append("<ext:UBLExtensions>\n");
        builder.append("<ext:UBLExtension>\n");
        builder.append("<ext:ExtensionContent>\n");
        builder.append("<sac:AdditionalInformation>\n");

        if (model.getResumen().getTotalGravado() != null
                && model.getResumen().getTotalGravado() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1001 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalGravado() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalInafecto() != null
                && model.getResumen().getTotalInafecto() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1002 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalInafecto() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalExonerado() != null
                && model.getResumen().getTotalExonerado() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1003 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalExonerado() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getTotalValorVentaOperacionesGratuitas() != null
                && model.getResumen().getTotalValorVentaOperacionesGratuitas() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 1004 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getTotalValorVentaOperacionesGratuitas()
                    + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        if (model.getResumen().getDescuentos() != null
                && model.getResumen().getDescuentos() != new BigDecimal(0)) {

            builder.append("<sac:AdditionalMonetaryTotal>\n");
            builder.append("<cbc:ID>" + 2005 + "</cbc:ID>\n");
            builder.append("<cbc:PayableAmount currencyID=\"" + REGION + "\">"
                    + model.getResumen().getDescuentos() + "</cbc:PayableAmount>\n ");
            builder.append("</sac:AdditionalMonetaryTotal>\n");
        }
        builder.append("<sac:AdditionalProperty>\n");
        builder.append("<cbc:ID>" + 1000 + "</cbc:ID>\n");
        builder.append("<cbc:Value>" + "son 4cuado mil 500" + "</cbc:Value>\n ");// importante
        // obtener
        // descripcion
        // en
        // texto
        builder.append("</sac:AdditionalProperty>\n");
        builder.append("sac:AdditionalInformation");
        builder.append("ext:ExtensionContent");
        builder.append("ext:UBLExtension");

        String fin = "Repository";
        String s = "";
        if (!(new File(Path + fin).exists())) {
            File directorio = new File(Path + fin);
            directorio.mkdir();
        }
        BufferedReader leer = new BufferedReader(new StringReader(builder.toString()));
        PrintWriter escribir = new PrintWriter(
                new BufferedWriter(new FileWriter(Path + fin + "\\" + "nombre_archivo" + ".xml")));
        while ((s = leer.readLine()) != null) {
            escribir.println(s);
        }
        escribir.close();

        // endregion
        // </editor-fold>

    }

}
