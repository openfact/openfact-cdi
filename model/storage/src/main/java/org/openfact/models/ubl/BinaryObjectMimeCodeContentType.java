//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.07.20 a las 12:44:20 PM COT 
//


package org.openfact.models.ubl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para BinaryObjectMimeCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="BinaryObjectMimeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="application/CSTAdata+xml"/&gt;
 *     &lt;enumeration value="application/EDI-Consent"/&gt;
 *     &lt;enumeration value="application/EDI-X12"/&gt;
 *     &lt;enumeration value="application/EDIFACT"/&gt;
 *     &lt;enumeration value="application/activemessage"/&gt;
 *     &lt;enumeration value="application/andrew-inset"/&gt;
 *     &lt;enumeration value="application/applefile"/&gt;
 *     &lt;enumeration value="application/atomicmail"/&gt;
 *     &lt;enumeration value="application/batch-SMTP"/&gt;
 *     &lt;enumeration value="application/beep+xml"/&gt;
 *     &lt;enumeration value="application/cals-1840"/&gt;
 *     &lt;enumeration value="application/cnrp+xml"/&gt;
 *     &lt;enumeration value="application/commonground"/&gt;
 *     &lt;enumeration value="application/cpl+xml"/&gt;
 *     &lt;enumeration value="application/csta+xml"/&gt;
 *     &lt;enumeration value="application/cybercash"/&gt;
 *     &lt;enumeration value="application/dca-rft"/&gt;
 *     &lt;enumeration value="application/dec-dx"/&gt;
 *     &lt;enumeration value="application/dialog-info+xml"/&gt;
 *     &lt;enumeration value="application/dicom"/&gt;
 *     &lt;enumeration value="application/dns"/&gt;
 *     &lt;enumeration value="application/dvcs"/&gt;
 *     &lt;enumeration value="application/epp+xml"/&gt;
 *     &lt;enumeration value="application/eshop"/&gt;
 *     &lt;enumeration value="application/fits"/&gt;
 *     &lt;enumeration value="application/font-tdpfr"/&gt;
 *     &lt;enumeration value="application/http"/&gt;
 *     &lt;enumeration value="application/hyperstudio"/&gt;
 *     &lt;enumeration value="application/iges"/&gt;
 *     &lt;enumeration value="application/im-iscomposing+xml"/&gt;
 *     &lt;enumeration value="application/index"/&gt;
 *     &lt;enumeration value="application/index.cmd"/&gt;
 *     &lt;enumeration value="application/index.obj"/&gt;
 *     &lt;enumeration value="application/index.response"/&gt;
 *     &lt;enumeration value="application/index.vnd"/&gt;
 *     &lt;enumeration value="application/iotp"/&gt;
 *     &lt;enumeration value="application/ipp"/&gt;
 *     &lt;enumeration value="application/isup"/&gt;
 *     &lt;enumeration value="application/kpml-request+xml"/&gt;
 *     &lt;enumeration value="application/kpml-response+xml"/&gt;
 *     &lt;enumeration value="application/mac-binhex40"/&gt;
 *     &lt;enumeration value="application/macwriteii"/&gt;
 *     &lt;enumeration value="application/marc"/&gt;
 *     &lt;enumeration value="application/mathematica"/&gt;
 *     &lt;enumeration value="application/mbox"/&gt;
 *     &lt;enumeration value="application/mikey"/&gt;
 *     &lt;enumeration value="application/mpeg4-generic"/&gt;
 *     &lt;enumeration value="application/msword"/&gt;
 *     &lt;enumeration value="application/news-message-id"/&gt;
 *     &lt;enumeration value="application/news-transmission"/&gt;
 *     &lt;enumeration value="application/ocsp-request"/&gt;
 *     &lt;enumeration value="application/ocsp-response"/&gt;
 *     &lt;enumeration value="application/octet-stream"/&gt;
 *     &lt;enumeration value="application/oda"/&gt;
 *     &lt;enumeration value="application/ogg"/&gt;
 *     &lt;enumeration value="application/parityfec"/&gt;
 *     &lt;enumeration value="application/pdf"/&gt;
 *     &lt;enumeration value="application/pgp-encrypted"/&gt;
 *     &lt;enumeration value="application/pgp-keys"/&gt;
 *     &lt;enumeration value="application/pgp-signature"/&gt;
 *     &lt;enumeration value="application/pidf+xml"/&gt;
 *     &lt;enumeration value="application/pkcs10"/&gt;
 *     &lt;enumeration value="application/pkcs7-mime"/&gt;
 *     &lt;enumeration value="application/pkcs7-signature"/&gt;
 *     &lt;enumeration value="application/pkix-cert"/&gt;
 *     &lt;enumeration value="application/pkix-crl"/&gt;
 *     &lt;enumeration value="application/pkix-pkipath"/&gt;
 *     &lt;enumeration value="application/pkixcmp"/&gt;
 *     &lt;enumeration value="application/postscript"/&gt;
 *     &lt;enumeration value="application/prs.alvestrand.titrax-sheet"/&gt;
 *     &lt;enumeration value="application/prs.cww"/&gt;
 *     &lt;enumeration value="application/prs.nprend"/&gt;
 *     &lt;enumeration value="application/prs.plucker"/&gt;
 *     &lt;enumeration value="application/qsig"/&gt;
 *     &lt;enumeration value="application/rdf+xml"/&gt;
 *     &lt;enumeration value="application/reginfo+xml"/&gt;
 *     &lt;enumeration value="application/remote-printing"/&gt;
 *     &lt;enumeration value="application/resource-lists+xml"/&gt;
 *     &lt;enumeration value="application/riscos"/&gt;
 *     &lt;enumeration value="application/rls-services+xml"/&gt;
 *     &lt;enumeration value="application/rtf"/&gt;
 *     &lt;enumeration value="application/samlassertion+xml"/&gt;
 *     &lt;enumeration value="application/samlmetadata+xml"/&gt;
 *     &lt;enumeration value="application/sbml+xml"/&gt;
 *     &lt;enumeration value="application/sdp"/&gt;
 *     &lt;enumeration value="application/set-payment"/&gt;
 *     &lt;enumeration value="application/set-payment-initiation"/&gt;
 *     &lt;enumeration value="application/set-registration"/&gt;
 *     &lt;enumeration value="application/set-registration-initiation"/&gt;
 *     &lt;enumeration value="application/sgml"/&gt;
 *     &lt;enumeration value="application/sgml-open-catalog"/&gt;
 *     &lt;enumeration value="application/shf+xml"/&gt;
 *     &lt;enumeration value="application/sieve"/&gt;
 *     &lt;enumeration value="application/simple-filter+xml"/&gt;
 *     &lt;enumeration value="application/simple-message-summary"/&gt;
 *     &lt;enumeration value="application/slate"/&gt;
 *     &lt;enumeration value="application/soap+xml"/&gt;
 *     &lt;enumeration value="application/spirits-event+xml"/&gt;
 *     &lt;enumeration value="application/timestamp-query"/&gt;
 *     &lt;enumeration value="application/timestamp-reply"/&gt;
 *     &lt;enumeration value="application/tve-trigger"/&gt;
 *     &lt;enumeration value="application/vemmi"/&gt;
 *     &lt;enumeration value="application/vnd.3M.Post-it-Notes"/&gt;
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-large"/&gt;
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-small"/&gt;
 *     &lt;enumeration value="application/vnd.3gpp.pic-bw-var"/&gt;
 *     &lt;enumeration value="application/vnd.3gpp.sms"/&gt;
 *     &lt;enumeration value="application/vnd.FloGraphIt"/&gt;
 *     &lt;enumeration value="application/vnd.Kinar"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.DAF"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.DIS"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.MBK"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.MQY"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.MSL"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.PLC"/&gt;
 *     &lt;enumeration value="application/vnd.Mobius.TXF"/&gt;
 *     &lt;enumeration value="application/vnd.Quark.QuarkXPress"/&gt;
 *     &lt;enumeration value="application/vnd.RenLearn.rlprint"/&gt;
 *     &lt;enumeration value="application/vnd.accpac.simply.aso"/&gt;
 *     &lt;enumeration value="application/vnd.accpac.simply.imp"/&gt;
 *     &lt;enumeration value="application/vnd.acucobol"/&gt;
 *     &lt;enumeration value="application/vnd.acucorp"/&gt;
 *     &lt;enumeration value="application/vnd.adobe.xfdf"/&gt;
 *     &lt;enumeration value="application/vnd.aether.imp"/&gt;
 *     &lt;enumeration value="application/vnd.amiga.ami"/&gt;
 *     &lt;enumeration value="application/vnd.anser-web-certificate-issue-initiation"/&gt;
 *     &lt;enumeration value="application/vnd.anser-web-funds-transfer-initiation"/&gt;
 *     &lt;enumeration value="application/vnd.audiograph"/&gt;
 *     &lt;enumeration value="application/vnd.blueice.multipass"/&gt;
 *     &lt;enumeration value="application/vnd.bmi"/&gt;
 *     &lt;enumeration value="application/vnd.businessobjects"/&gt;
 *     &lt;enumeration value="application/vnd.canon-cpdl"/&gt;
 *     &lt;enumeration value="application/vnd.canon-lips"/&gt;
 *     &lt;enumeration value="application/vnd.cinderella"/&gt;
 *     &lt;enumeration value="application/vnd.claymore"/&gt;
 *     &lt;enumeration value="application/vnd.commerce-battelle"/&gt;
 *     &lt;enumeration value="application/vnd.commonspace"/&gt;
 *     &lt;enumeration value="application/vnd.contact.cmsg"/&gt;
 *     &lt;enumeration value="application/vnd.cosmocaller"/&gt;
 *     &lt;enumeration value="application/vnd.criticaltools.wbs+xml"/&gt;
 *     &lt;enumeration value="application/vnd.ctc-posml"/&gt;
 *     &lt;enumeration value="application/vnd.cups-postscript"/&gt;
 *     &lt;enumeration value="application/vnd.cups-raster"/&gt;
 *     &lt;enumeration value="application/vnd.cups-raw"/&gt;
 *     &lt;enumeration value="application/vnd.curl"/&gt;
 *     &lt;enumeration value="application/vnd.cybank"/&gt;
 *     &lt;enumeration value="application/vnd.data-vision.rdz"/&gt;
 *     &lt;enumeration value="application/vnd.dna"/&gt;
 *     &lt;enumeration value="application/vnd.dpgraph"/&gt;
 *     &lt;enumeration value="application/vnd.dreamfactory"/&gt;
 *     &lt;enumeration value="application/vnd.dxr"/&gt;
 *     &lt;enumeration value="application/vnd.ecdis-update"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.chart"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.filerequest"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.fileupdate"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.series"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.seriesrequest"/&gt;
 *     &lt;enumeration value="application/vnd.ecowin.seriesupdate"/&gt;
 *     &lt;enumeration value="application/vnd.enliven"/&gt;
 *     &lt;enumeration value="application/vnd.epson.esf"/&gt;
 *     &lt;enumeration value="application/vnd.epson.msf"/&gt;
 *     &lt;enumeration value="application/vnd.epson.quickanime"/&gt;
 *     &lt;enumeration value="application/vnd.epson.salt"/&gt;
 *     &lt;enumeration value="application/vnd.epson.ssf"/&gt;
 *     &lt;enumeration value="application/vnd.ericsson.quickcall"/&gt;
 *     &lt;enumeration value="application/vnd.eudora.data"/&gt;
 *     &lt;enumeration value="application/vnd.fdf"/&gt;
 *     &lt;enumeration value="application/vnd.ffsns"/&gt;
 *     &lt;enumeration value="application/vnd.fints"/&gt;
 *     &lt;enumeration value="application/vnd.framemaker"/&gt;
 *     &lt;enumeration value="application/vnd.fsc.weblaunch"/&gt;
 *     &lt;enumeration value="application/vnd.fujitsu.oasys"/&gt;
 *     &lt;enumeration value="application/vnd.fujitsu.oasys2"/&gt;
 *     &lt;enumeration value="application/vnd.fujitsu.oasys3"/&gt;
 *     &lt;enumeration value="application/vnd.fujitsu.oasysgp"/&gt;
 *     &lt;enumeration value="application/vnd.fujitsu.oasysprs"/&gt;
 *     &lt;enumeration value="application/vnd.fujixerox.ddd"/&gt;
 *     &lt;enumeration value="application/vnd.fujixerox.docuworks"/&gt;
 *     &lt;enumeration value="application/vnd.fujixerox.docuworks.binder"/&gt;
 *     &lt;enumeration value="application/vnd.fut-misnet"/&gt;
 *     &lt;enumeration value="application/vnd.genomatix.tuxedo"/&gt;
 *     &lt;enumeration value="application/vnd.grafeq"/&gt;
 *     &lt;enumeration value="application/vnd.groove-account"/&gt;
 *     &lt;enumeration value="application/vnd.groove-help"/&gt;
 *     &lt;enumeration value="application/vnd.groove-identity-message"/&gt;
 *     &lt;enumeration value="application/vnd.groove-injector"/&gt;
 *     &lt;enumeration value="application/vnd.groove-tool-message"/&gt;
 *     &lt;enumeration value="application/vnd.groove-tool-template"/&gt;
 *     &lt;enumeration value="application/vnd.groove-vcard"/&gt;
 *     &lt;enumeration value="application/vnd.hbci"/&gt;
 *     &lt;enumeration value="application/vnd.hcl-bireports"/&gt;
 *     &lt;enumeration value="application/vnd.hhe.lesson-player"/&gt;
 *     &lt;enumeration value="application/vnd.hp-HPGL"/&gt;
 *     &lt;enumeration value="application/vnd.hp-PCL"/&gt;
 *     &lt;enumeration value="application/vnd.hp-PCLXL"/&gt;
 *     &lt;enumeration value="application/vnd.hp-hpid"/&gt;
 *     &lt;enumeration value="application/vnd.hp-hps"/&gt;
 *     &lt;enumeration value="application/vnd.httphone"/&gt;
 *     &lt;enumeration value="application/vnd.hzn-3d-crossword"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.MiniPay"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.afplinedata"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.electronic-media"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.modcap"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.rights-management"/&gt;
 *     &lt;enumeration value="application/vnd.ibm.secure-container"/&gt;
 *     &lt;enumeration value="application/vnd.informix-visionary"/&gt;
 *     &lt;enumeration value="application/vnd.intercon.formnet"/&gt;
 *     &lt;enumeration value="application/vnd.intertrust.digibox"/&gt;
 *     &lt;enumeration value="application/vnd.intertrust.nncp"/&gt;
 *     &lt;enumeration value="application/vnd.intu.qbo"/&gt;
 *     &lt;enumeration value="application/vnd.intu.qfx"/&gt;
 *     &lt;enumeration value="application/vnd.ipunplugged.rcprofile"/&gt;
 *     &lt;enumeration value="application/vnd.irepository.package+xml"/&gt;
 *     &lt;enumeration value="application/vnd.is-xpr"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-directory-service"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-jpnstore-wakeup"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-payment-wakeup"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-registration"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-registration-wakeup"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-setstore-wakeup"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-verification"/&gt;
 *     &lt;enumeration value="application/vnd.japannet-verification-wakeup"/&gt;
 *     &lt;enumeration value="application/vnd.jisp"/&gt;
 *     &lt;enumeration value="application/vnd.kde.karbon"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kchart"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kformula"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kivio"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kontour"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kpresenter"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kspread"/&gt;
 *     &lt;enumeration value="application/vnd.kde.kword"/&gt;
 *     &lt;enumeration value="application/vnd.kenameaapp"/&gt;
 *     &lt;enumeration value="application/vnd.kidspiration"/&gt;
 *     &lt;enumeration value="application/vnd.koan"/&gt;
 *     &lt;enumeration value="application/vnd.liberty-request+xml"/&gt;
 *     &lt;enumeration value="application/vnd.llamagraphics.life-balance.desktop"/&gt;
 *     &lt;enumeration value="application/vnd.llamagraphics.life-balance.exchange+xml"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-1-2-3"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-approach"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-freelance"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-notes"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-organizer"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-screencam"/&gt;
 *     &lt;enumeration value="application/vnd.lotus-wordpro"/&gt;
 *     &lt;enumeration value="application/vnd.mcd"/&gt;
 *     &lt;enumeration value="application/vnd.mediastation.cdkey"/&gt;
 *     &lt;enumeration value="application/vnd.meridian-slingshot"/&gt;
 *     &lt;enumeration value="application/vnd.mfmp"/&gt;
 *     &lt;enumeration value="application/vnd.micrografx.flo"/&gt;
 *     &lt;enumeration value="application/vnd.micrografx.igx"/&gt;
 *     &lt;enumeration value="application/vnd.mif"/&gt;
 *     &lt;enumeration value="application/vnd.minisoft-hp3000-save"/&gt;
 *     &lt;enumeration value="application/vnd.mitsubishi.misty-guard.trustweb"/&gt;
 *     &lt;enumeration value="application/vnd.mophun.application"/&gt;
 *     &lt;enumeration value="application/vnd.mophun.certificate"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.adsi"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.fis"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.gotap"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.kmr"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.ttc"/&gt;
 *     &lt;enumeration value="application/vnd.motorola.flexsuite.wem"/&gt;
 *     &lt;enumeration value="application/vnd.mozilla.xul+xml"/&gt;
 *     &lt;enumeration value="application/vnd.ms-artgalry"/&gt;
 *     &lt;enumeration value="application/vnd.ms-asf"/&gt;
 *     &lt;enumeration value="application/vnd.ms-excel"/&gt;
 *     &lt;enumeration value="application/vnd.ms-lrm"/&gt;
 *     &lt;enumeration value="application/vnd.ms-powerpoint"/&gt;
 *     &lt;enumeration value="application/vnd.ms-project"/&gt;
 *     &lt;enumeration value="application/vnd.ms-tnef"/&gt;
 *     &lt;enumeration value="application/vnd.ms-works"/&gt;
 *     &lt;enumeration value="application/vnd.ms-wpl"/&gt;
 *     &lt;enumeration value="application/vnd.mseq"/&gt;
 *     &lt;enumeration value="application/vnd.msign"/&gt;
 *     &lt;enumeration value="application/vnd.music-niff"/&gt;
 *     &lt;enumeration value="application/vnd.musician"/&gt;
 *     &lt;enumeration value="application/vnd.nervana"/&gt;
 *     &lt;enumeration value="application/vnd.netfpx"/&gt;
 *     &lt;enumeration value="application/vnd.noblenet-directory"/&gt;
 *     &lt;enumeration value="application/vnd.noblenet-sealer"/&gt;
 *     &lt;enumeration value="application/vnd.noblenet-web"/&gt;
 *     &lt;enumeration value="application/vnd.nokia.landmark+wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.nokia.landmark+xml"/&gt;
 *     &lt;enumeration value="application/vnd.nokia.landmarkcollection+xml"/&gt;
 *     &lt;enumeration value="application/vnd.nokia.radio-preset"/&gt;
 *     &lt;enumeration value="application/vnd.nokia.radio-presets"/&gt;
 *     &lt;enumeration value="application/vnd.novadigm.EDM"/&gt;
 *     &lt;enumeration value="application/vnd.novadigm.EDX"/&gt;
 *     &lt;enumeration value="application/vnd.novadigm.EXT"/&gt;
 *     &lt;enumeration value="application/vnd.obn"/&gt;
 *     &lt;enumeration value="application/vnd.omads-email+xml"/&gt;
 *     &lt;enumeration value="application/vnd.omads-file+xml"/&gt;
 *     &lt;enumeration value="application/vnd.omads-folder+xml"/&gt;
 *     &lt;enumeration value="application/vnd.osa.netdeploy"/&gt;
 *     &lt;enumeration value="application/vnd.palm"/&gt;
 *     &lt;enumeration value="application/vnd.paos.xml"/&gt;
 *     &lt;enumeration value="application/vnd.pg.format"/&gt;
 *     &lt;enumeration value="application/vnd.pg.osasli"/&gt;
 *     &lt;enumeration value="application/vnd.picsel"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder6"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder6-s"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder7"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder7-s"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder75"/&gt;
 *     &lt;enumeration value="application/vnd.powerbuilder75-s"/&gt;
 *     &lt;enumeration value="application/vnd.previewsystems.box"/&gt;
 *     &lt;enumeration value="application/vnd.publishare-delta-tree"/&gt;
 *     &lt;enumeration value="application/vnd.pvi.ptid1"/&gt;
 *     &lt;enumeration value="application/vnd.pwg-multiplexed"/&gt;
 *     &lt;enumeration value="application/vnd.pwg-xhtml-print+xml"/&gt;
 *     &lt;enumeration value="application/vnd.rapid"/&gt;
 *     &lt;enumeration value="application/vnd.s3sms"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.doc"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.eml"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.mht"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.net"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.ppt"/&gt;
 *     &lt;enumeration value="application/vnd.sealed.xls"/&gt;
 *     &lt;enumeration value="application/vnd.sealedmedia.softseal.html"/&gt;
 *     &lt;enumeration value="application/vnd.sealedmedia.softseal.pdf"/&gt;
 *     &lt;enumeration value="application/vnd.seemail"/&gt;
 *     &lt;enumeration value="application/vnd.shana.informed.formdata"/&gt;
 *     &lt;enumeration value="application/vnd.shana.informed.formtemplate"/&gt;
 *     &lt;enumeration value="application/vnd.shana.informed.interchange"/&gt;
 *     &lt;enumeration value="application/vnd.shana.informed.package"/&gt;
 *     &lt;enumeration value="application/vnd.smaf"/&gt;
 *     &lt;enumeration value="application/vnd.sss-cod"/&gt;
 *     &lt;enumeration value="application/vnd.sss-dtf"/&gt;
 *     &lt;enumeration value="application/vnd.sss-ntf"/&gt;
 *     &lt;enumeration value="application/vnd.street-stream"/&gt;
 *     &lt;enumeration value="application/vnd.sus-calendar"/&gt;
 *     &lt;enumeration value="application/vnd.svd"/&gt;
 *     &lt;enumeration value="application/vnd.swiftview-ics"/&gt;
 *     &lt;enumeration value="application/vnd.syncml.+xml"/&gt;
 *     &lt;enumeration value="application/vnd.syncml.ds.notification"/&gt;
 *     &lt;enumeration value="application/vnd.triscape.mxs"/&gt;
 *     &lt;enumeration value="application/vnd.trueapp"/&gt;
 *     &lt;enumeration value="application/vnd.truedoc"/&gt;
 *     &lt;enumeration value="application/vnd.ufdl"/&gt;
 *     &lt;enumeration value="application/vnd.uiq.theme"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.alert"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.alert-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.bearer-choice"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.bearer-choice-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.cacheop"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.cacheop-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.channel"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.channel-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.list"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.list-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.listcmd"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.listcmd-wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.uplanet.signal"/&gt;
 *     &lt;enumeration value="application/vnd.vcx"/&gt;
 *     &lt;enumeration value="application/vnd.vectorworks"/&gt;
 *     &lt;enumeration value="application/vnd.vidsoft.vidconference"/&gt;
 *     &lt;enumeration value="application/vnd.visio"/&gt;
 *     &lt;enumeration value="application/vnd.visionary"/&gt;
 *     &lt;enumeration value="application/vnd.vividence.scriptfile"/&gt;
 *     &lt;enumeration value="application/vnd.vsf"/&gt;
 *     &lt;enumeration value="application/vnd.wap.sic"/&gt;
 *     &lt;enumeration value="application/vnd.wap.slc"/&gt;
 *     &lt;enumeration value="application/vnd.wap.wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.wap.wmlc"/&gt;
 *     &lt;enumeration value="application/vnd.wap.wmlscriptc"/&gt;
 *     &lt;enumeration value="application/vnd.webturbo"/&gt;
 *     &lt;enumeration value="application/vnd.wordperfect"/&gt;
 *     &lt;enumeration value="application/vnd.wqd"/&gt;
 *     &lt;enumeration value="application/vnd.wrq-hp3000-labelled"/&gt;
 *     &lt;enumeration value="application/vnd.wt.stf"/&gt;
 *     &lt;enumeration value="application/vnd.wv.csp+wbxml"/&gt;
 *     &lt;enumeration value="application/vnd.wv.csp+xml"/&gt;
 *     &lt;enumeration value="application/vnd.wv.ssp+xml"/&gt;
 *     &lt;enumeration value="application/vnd.xara"/&gt;
 *     &lt;enumeration value="application/vnd.xfdl"/&gt;
 *     &lt;enumeration value="application/vnd.yamaha.hv-dic"/&gt;
 *     &lt;enumeration value="application/vnd.yamaha.hv-script"/&gt;
 *     &lt;enumeration value="application/vnd.yamaha.hv-voice"/&gt;
 *     &lt;enumeration value="application/vnd.yamaha.smaf-audio"/&gt;
 *     &lt;enumeration value="application/vnd.yamaha.smaf-phrase"/&gt;
 *     &lt;enumeration value="application/vnd.yellowriver-custom-menu"/&gt;
 *     &lt;enumeration value="application/watcherinfo+xml"/&gt;
 *     &lt;enumeration value="application/whoispp-query"/&gt;
 *     &lt;enumeration value="application/whoispp-response"/&gt;
 *     &lt;enumeration value="application/wita"/&gt;
 *     &lt;enumeration value="application/wordperfect5.1"/&gt;
 *     &lt;enumeration value="application/x400-bp"/&gt;
 *     &lt;enumeration value="application/xhtml+xml"/&gt;
 *     &lt;enumeration value="application/xml"/&gt;
 *     &lt;enumeration value="application/xml-dtd"/&gt;
 *     &lt;enumeration value="application/xml-external-parsed-entity"/&gt;
 *     &lt;enumeration value="application/xmpp+xml"/&gt;
 *     &lt;enumeration value="application/xop+xml"/&gt;
 *     &lt;enumeration value="application/zip"/&gt;
 *     &lt;enumeration value="audio/32kadpcm"/&gt;
 *     &lt;enumeration value="audio/3gpp"/&gt;
 *     &lt;enumeration value="audio/AMR"/&gt;
 *     &lt;enumeration value="audio/AMR-WB"/&gt;
 *     &lt;enumeration value="audio/BV16"/&gt;
 *     &lt;enumeration value="audio/BV32"/&gt;
 *     &lt;enumeration value="audio/CN"/&gt;
 *     &lt;enumeration value="audio/DAT12"/&gt;
 *     &lt;enumeration value="audio/DVI4"/&gt;
 *     &lt;enumeration value="audio/EVRC"/&gt;
 *     &lt;enumeration value="audio/EVRC-QCP"/&gt;
 *     &lt;enumeration value="audio/EVRC0"/&gt;
 *     &lt;enumeration value="audio/G.722.1"/&gt;
 *     &lt;enumeration value="audio/G722"/&gt;
 *     &lt;enumeration value="audio/G723"/&gt;
 *     &lt;enumeration value="audio/G726-16"/&gt;
 *     &lt;enumeration value="audio/G726-24"/&gt;
 *     &lt;enumeration value="audio/G726-32"/&gt;
 *     &lt;enumeration value="audio/G726-40"/&gt;
 *     &lt;enumeration value="audio/G728"/&gt;
 *     &lt;enumeration value="audio/G729"/&gt;
 *     &lt;enumeration value="audio/G729D"/&gt;
 *     &lt;enumeration value="audio/G729E"/&gt;
 *     &lt;enumeration value="audio/GSM"/&gt;
 *     &lt;enumeration value="audio/GSM-EFR"/&gt;
 *     &lt;enumeration value="audio/L16"/&gt;
 *     &lt;enumeration value="audio/L20"/&gt;
 *     &lt;enumeration value="audio/L24"/&gt;
 *     &lt;enumeration value="audio/L8"/&gt;
 *     &lt;enumeration value="audio/LPC"/&gt;
 *     &lt;enumeration value="audio/MP4A-LATM"/&gt;
 *     &lt;enumeration value="audio/MPA"/&gt;
 *     &lt;enumeration value="audio/PCMA"/&gt;
 *     &lt;enumeration value="audio/PCMU"/&gt;
 *     &lt;enumeration value="audio/QCELP"/&gt;
 *     &lt;enumeration value="audio/RED"/&gt;
 *     &lt;enumeration value="audio/SMV"/&gt;
 *     &lt;enumeration value="audio/SMV-QCP"/&gt;
 *     &lt;enumeration value="audio/SMV0"/&gt;
 *     &lt;enumeration value="audio/VDVI"/&gt;
 *     &lt;enumeration value="audio/basic"/&gt;
 *     &lt;enumeration value="audio/clearmode"/&gt;
 *     &lt;enumeration value="audio/dsr-es201108"/&gt;
 *     &lt;enumeration value="audio/dsr-es202050"/&gt;
 *     &lt;enumeration value="audio/dsr-es202211"/&gt;
 *     &lt;enumeration value="audio/dsr-es202212"/&gt;
 *     &lt;enumeration value="audio/iLBC"/&gt;
 *     &lt;enumeration value="audio/mpa-robust"/&gt;
 *     &lt;enumeration value="audio/mpeg"/&gt;
 *     &lt;enumeration value="audio/mpeg4-generic"/&gt;
 *     &lt;enumeration value="audio/parityfec"/&gt;
 *     &lt;enumeration value="audio/prs.sid"/&gt;
 *     &lt;enumeration value="audio/telephone-event"/&gt;
 *     &lt;enumeration value="audio/tone"/&gt;
 *     &lt;enumeration value="audio/vnd.3gpp.iufp"/&gt;
 *     &lt;enumeration value="audio/vnd.audiokoz"/&gt;
 *     &lt;enumeration value="audio/vnd.cisco.nse"/&gt;
 *     &lt;enumeration value="audio/vnd.cns.anp1"/&gt;
 *     &lt;enumeration value="audio/vnd.cns.inf1"/&gt;
 *     &lt;enumeration value="audio/vnd.digital-winds"/&gt;
 *     &lt;enumeration value="audio/vnd.everad.plj"/&gt;
 *     &lt;enumeration value="audio/vnd.lucent.voice"/&gt;
 *     &lt;enumeration value="audio/vnd.nokia.mobile-xmf"/&gt;
 *     &lt;enumeration value="audio/vnd.nortel.vbk"/&gt;
 *     &lt;enumeration value="audio/vnd.nuera.ecelp4800"/&gt;
 *     &lt;enumeration value="audio/vnd.nuera.ecelp7470"/&gt;
 *     &lt;enumeration value="audio/vnd.nuera.ecelp9600"/&gt;
 *     &lt;enumeration value="audio/vnd.octel.sbc"/&gt;
 *     &lt;enumeration value="audio/vnd.qcelp"/&gt;
 *     &lt;enumeration value="audio/vnd.rhetorex.32kadpcm"/&gt;
 *     &lt;enumeration value="audio/vnd.sealedmedia.softseal.mpeg"/&gt;
 *     &lt;enumeration value="audio/vnd.vmx.cvsd"/&gt;
 *     &lt;enumeration value="image/cgm"/&gt;
 *     &lt;enumeration value="image/fits"/&gt;
 *     &lt;enumeration value="image/g3fax"/&gt;
 *     &lt;enumeration value="image/gif"/&gt;
 *     &lt;enumeration value="image/ief"/&gt;
 *     &lt;enumeration value="image/jp2"/&gt;
 *     &lt;enumeration value="image/jpeg"/&gt;
 *     &lt;enumeration value="image/jpm"/&gt;
 *     &lt;enumeration value="image/jpx"/&gt;
 *     &lt;enumeration value="image/naplps"/&gt;
 *     &lt;enumeration value="image/png"/&gt;
 *     &lt;enumeration value="image/prs.btif"/&gt;
 *     &lt;enumeration value="image/prs.pti"/&gt;
 *     &lt;enumeration value="image/t38"/&gt;
 *     &lt;enumeration value="image/tiff"/&gt;
 *     &lt;enumeration value="image/tiff-fx"/&gt;
 *     &lt;enumeration value="image/vnd.cns.inf2"/&gt;
 *     &lt;enumeration value="image/vnd.djvu"/&gt;
 *     &lt;enumeration value="image/vnd.dwg"/&gt;
 *     &lt;enumeration value="image/vnd.dxf"/&gt;
 *     &lt;enumeration value="image/vnd.fastbidsheet"/&gt;
 *     &lt;enumeration value="image/vnd.fpx"/&gt;
 *     &lt;enumeration value="image/vnd.fst"/&gt;
 *     &lt;enumeration value="image/vnd.fujixerox.edmics-mmr"/&gt;
 *     &lt;enumeration value="image/vnd.fujixerox.edmics-rlc"/&gt;
 *     &lt;enumeration value="image/vnd.globalgraphics.pgb"/&gt;
 *     &lt;enumeration value="image/vnd.microsoft.icon"/&gt;
 *     &lt;enumeration value="image/vnd.mix"/&gt;
 *     &lt;enumeration value="image/vnd.ms-modi"/&gt;
 *     &lt;enumeration value="image/vnd.net-fpx"/&gt;
 *     &lt;enumeration value="image/vnd.sealed.png"/&gt;
 *     &lt;enumeration value="image/vnd.sealedmedia.softseal.gif"/&gt;
 *     &lt;enumeration value="image/vnd.sealedmedia.softseal.jpg"/&gt;
 *     &lt;enumeration value="image/vnd.svf"/&gt;
 *     &lt;enumeration value="image/vnd.wap.wbmp"/&gt;
 *     &lt;enumeration value="image/vnd.xiff"/&gt;
 *     &lt;enumeration value="message/CPIM"/&gt;
 *     &lt;enumeration value="message/delivery-status"/&gt;
 *     &lt;enumeration value="message/disposition-notification"/&gt;
 *     &lt;enumeration value="message/external-body"/&gt;
 *     &lt;enumeration value="message/http"/&gt;
 *     &lt;enumeration value="message/news"/&gt;
 *     &lt;enumeration value="message/partial"/&gt;
 *     &lt;enumeration value="message/rfc822"/&gt;
 *     &lt;enumeration value="message/s-http"/&gt;
 *     &lt;enumeration value="message/sip"/&gt;
 *     &lt;enumeration value="message/sipfrag"/&gt;
 *     &lt;enumeration value="message/tracking-status"/&gt;
 *     &lt;enumeration value="model/iges"/&gt;
 *     &lt;enumeration value="model/mesh"/&gt;
 *     &lt;enumeration value="model/vnd.dwf"/&gt;
 *     &lt;enumeration value="model/vnd.flatland.3dml"/&gt;
 *     &lt;enumeration value="model/vnd.gdl"/&gt;
 *     &lt;enumeration value="model/vnd.gs-gdl"/&gt;
 *     &lt;enumeration value="model/vnd.gtw"/&gt;
 *     &lt;enumeration value="model/vnd.mts"/&gt;
 *     &lt;enumeration value="model/vnd.parasolid.transmit.binary"/&gt;
 *     &lt;enumeration value="model/vnd.parasolid.transmit.text"/&gt;
 *     &lt;enumeration value="model/vnd.vtu"/&gt;
 *     &lt;enumeration value="model/vrml"/&gt;
 *     &lt;enumeration value="multipart/alternative"/&gt;
 *     &lt;enumeration value="multipart/appledouble"/&gt;
 *     &lt;enumeration value="multipart/byteranges"/&gt;
 *     &lt;enumeration value="multipart/digest"/&gt;
 *     &lt;enumeration value="multipart/encrypted"/&gt;
 *     &lt;enumeration value="multipart/form-data"/&gt;
 *     &lt;enumeration value="multipart/header-set"/&gt;
 *     &lt;enumeration value="multipart/mixed"/&gt;
 *     &lt;enumeration value="multipart/parallel"/&gt;
 *     &lt;enumeration value="multipart/related"/&gt;
 *     &lt;enumeration value="multipart/report"/&gt;
 *     &lt;enumeration value="multipart/signed"/&gt;
 *     &lt;enumeration value="multipart/voice-message"/&gt;
 *     &lt;enumeration value="text/RED"/&gt;
 *     &lt;enumeration value="text/calendar"/&gt;
 *     &lt;enumeration value="text/css"/&gt;
 *     &lt;enumeration value="text/csv"/&gt;
 *     &lt;enumeration value="text/directory"/&gt;
 *     &lt;enumeration value="text/dns"/&gt;
 *     &lt;enumeration value="text/enriched"/&gt;
 *     &lt;enumeration value="text/html"/&gt;
 *     &lt;enumeration value="text/parityfec"/&gt;
 *     &lt;enumeration value="text/plain"/&gt;
 *     &lt;enumeration value="text/prs.fallenstein.rst"/&gt;
 *     &lt;enumeration value="text/prs.lines.tag"/&gt;
 *     &lt;enumeration value="text/rfc822-headers"/&gt;
 *     &lt;enumeration value="text/richtext"/&gt;
 *     &lt;enumeration value="text/rtf"/&gt;
 *     &lt;enumeration value="text/sgml"/&gt;
 *     &lt;enumeration value="text/t140"/&gt;
 *     &lt;enumeration value="text/tab-separated-values"/&gt;
 *     &lt;enumeration value="text/troff"/&gt;
 *     &lt;enumeration value="text/uri-list"/&gt;
 *     &lt;enumeration value="text/vnd.DMClientScript"/&gt;
 *     &lt;enumeration value="text/vnd.IPTC.NITF"/&gt;
 *     &lt;enumeration value="text/vnd.IPTC.NewsML"/&gt;
 *     &lt;enumeration value="text/vnd.abc"/&gt;
 *     &lt;enumeration value="text/vnd.curl"/&gt;
 *     &lt;enumeration value="text/vnd.esmertec.theme-descriptor"/&gt;
 *     &lt;enumeration value="text/vnd.fly"/&gt;
 *     &lt;enumeration value="text/vnd.fmi.flexstor"/&gt;
 *     &lt;enumeration value="text/vnd.in3d.3dml"/&gt;
 *     &lt;enumeration value="text/vnd.in3d.spot"/&gt;
 *     &lt;enumeration value="text/vnd.latex-z"/&gt;
 *     &lt;enumeration value="text/vnd.motorola.reflex"/&gt;
 *     &lt;enumeration value="text/vnd.ms-mediapackage"/&gt;
 *     &lt;enumeration value="text/vnd.net2phone.commcenter.command"/&gt;
 *     &lt;enumeration value="text/vnd.sun.j2me.app-descriptor"/&gt;
 *     &lt;enumeration value="text/vnd.wap.si"/&gt;
 *     &lt;enumeration value="text/vnd.wap.sl"/&gt;
 *     &lt;enumeration value="text/vnd.wap.wml"/&gt;
 *     &lt;enumeration value="text/vnd.wap.wmlscript"/&gt;
 *     &lt;enumeration value="text/xml"/&gt;
 *     &lt;enumeration value="text/xml-external-parsed-entity"/&gt;
 *     &lt;enumeration value="video/3gpp"/&gt;
 *     &lt;enumeration value="video/BMPEG"/&gt;
 *     &lt;enumeration value="video/BT656"/&gt;
 *     &lt;enumeration value="video/CelB"/&gt;
 *     &lt;enumeration value="video/DV"/&gt;
 *     &lt;enumeration value="video/H261"/&gt;
 *     &lt;enumeration value="video/H263"/&gt;
 *     &lt;enumeration value="video/H263-1998"/&gt;
 *     &lt;enumeration value="video/H263-2000"/&gt;
 *     &lt;enumeration value="video/H264"/&gt;
 *     &lt;enumeration value="video/JPEG"/&gt;
 *     &lt;enumeration value="video/MJ2"/&gt;
 *     &lt;enumeration value="video/MP1S"/&gt;
 *     &lt;enumeration value="video/MP2P"/&gt;
 *     &lt;enumeration value="video/MP2T"/&gt;
 *     &lt;enumeration value="video/MP4V-ES"/&gt;
 *     &lt;enumeration value="video/MPV"/&gt;
 *     &lt;enumeration value="video/SMPTE292M"/&gt;
 *     &lt;enumeration value="video/mpeg"/&gt;
 *     &lt;enumeration value="video/mpeg4-generic"/&gt;
 *     &lt;enumeration value="video/nv"/&gt;
 *     &lt;enumeration value="video/parityfec"/&gt;
 *     &lt;enumeration value="video/pointer"/&gt;
 *     &lt;enumeration value="video/quicktime"/&gt;
 *     &lt;enumeration value="video/raw"/&gt;
 *     &lt;enumeration value="video/vnd.fvt"/&gt;
 *     &lt;enumeration value="video/vnd.motorola.video"/&gt;
 *     &lt;enumeration value="video/vnd.motorola.videop"/&gt;
 *     &lt;enumeration value="video/vnd.mpegurl"/&gt;
 *     &lt;enumeration value="video/vnd.nokia.interleaved-multimedia"/&gt;
 *     &lt;enumeration value="video/vnd.objectvideo"/&gt;
 *     &lt;enumeration value="video/vnd.sealed.mpeg1"/&gt;
 *     &lt;enumeration value="video/vnd.sealed.mpeg4"/&gt;
 *     &lt;enumeration value="video/vnd.sealed.swf"/&gt;
 *     &lt;enumeration value="video/vnd.sealedmedia.softseal.mov"/&gt;
 *     &lt;enumeration value="video/vnd.vivo"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BinaryObjectMimeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:specification:IANAMIMEMediaType:2003")
@XmlEnum
public enum BinaryObjectMimeCodeContentType {

    @XmlEnumValue("application/CSTAdata+xml")
    APPLICATION_CST_ADATA_XML("application/CSTAdata+xml"),
    @XmlEnumValue("application/EDI-Consent")
    APPLICATION_EDI_CONSENT("application/EDI-Consent"),
    @XmlEnumValue("application/EDI-X12")
    APPLICATION_EDI_X_12("application/EDI-X12"),
    @XmlEnumValue("application/EDIFACT")
    APPLICATION_EDIFACT("application/EDIFACT"),
    @XmlEnumValue("application/activemessage")
    APPLICATION_ACTIVEMESSAGE("application/activemessage"),
    @XmlEnumValue("application/andrew-inset")
    APPLICATION_ANDREW_INSET("application/andrew-inset"),
    @XmlEnumValue("application/applefile")
    APPLICATION_APPLEFILE("application/applefile"),
    @XmlEnumValue("application/atomicmail")
    APPLICATION_ATOMICMAIL("application/atomicmail"),
    @XmlEnumValue("application/batch-SMTP")
    APPLICATION_BATCH_SMTP("application/batch-SMTP"),
    @XmlEnumValue("application/beep+xml")
    APPLICATION_BEEP_XML("application/beep+xml"),
    @XmlEnumValue("application/cals-1840")
    APPLICATION_CALS_1840("application/cals-1840"),
    @XmlEnumValue("application/cnrp+xml")
    APPLICATION_CNRP_XML("application/cnrp+xml"),
    @XmlEnumValue("application/commonground")
    APPLICATION_COMMONGROUND("application/commonground"),
    @XmlEnumValue("application/cpl+xml")
    APPLICATION_CPL_XML("application/cpl+xml"),
    @XmlEnumValue("application/csta+xml")
    APPLICATION_CSTA_XML("application/csta+xml"),
    @XmlEnumValue("application/cybercash")
    APPLICATION_CYBERCASH("application/cybercash"),
    @XmlEnumValue("application/dca-rft")
    APPLICATION_DCA_RFT("application/dca-rft"),
    @XmlEnumValue("application/dec-dx")
    APPLICATION_DEC_DX("application/dec-dx"),
    @XmlEnumValue("application/dialog-info+xml")
    APPLICATION_DIALOG_INFO_XML("application/dialog-info+xml"),
    @XmlEnumValue("application/dicom")
    APPLICATION_DICOM("application/dicom"),
    @XmlEnumValue("application/dns")
    APPLICATION_DNS("application/dns"),
    @XmlEnumValue("application/dvcs")
    APPLICATION_DVCS("application/dvcs"),
    @XmlEnumValue("application/epp+xml")
    APPLICATION_EPP_XML("application/epp+xml"),
    @XmlEnumValue("application/eshop")
    APPLICATION_ESHOP("application/eshop"),
    @XmlEnumValue("application/fits")
    APPLICATION_FITS("application/fits"),
    @XmlEnumValue("application/font-tdpfr")
    APPLICATION_FONT_TDPFR("application/font-tdpfr"),
    @XmlEnumValue("application/http")
    APPLICATION_HTTP("application/http"),
    @XmlEnumValue("application/hyperstudio")
    APPLICATION_HYPERSTUDIO("application/hyperstudio"),
    @XmlEnumValue("application/iges")
    APPLICATION_IGES("application/iges"),
    @XmlEnumValue("application/im-iscomposing+xml")
    APPLICATION_IM_ISCOMPOSING_XML("application/im-iscomposing+xml"),
    @XmlEnumValue("application/index")
    APPLICATION_INDEX("application/index"),
    @XmlEnumValue("application/index.cmd")
    APPLICATION_INDEX_CMD("application/index.cmd"),
    @XmlEnumValue("application/index.obj")
    APPLICATION_INDEX_OBJ("application/index.obj"),
    @XmlEnumValue("application/index.response")
    APPLICATION_INDEX_RESPONSE("application/index.response"),
    @XmlEnumValue("application/index.vnd")
    APPLICATION_INDEX_VND("application/index.vnd"),
    @XmlEnumValue("application/iotp")
    APPLICATION_IOTP("application/iotp"),
    @XmlEnumValue("application/ipp")
    APPLICATION_IPP("application/ipp"),
    @XmlEnumValue("application/isup")
    APPLICATION_ISUP("application/isup"),
    @XmlEnumValue("application/kpml-request+xml")
    APPLICATION_KPML_REQUEST_XML("application/kpml-request+xml"),
    @XmlEnumValue("application/kpml-response+xml")
    APPLICATION_KPML_RESPONSE_XML("application/kpml-response+xml"),
    @XmlEnumValue("application/mac-binhex40")
    APPLICATION_MAC_BINHEX_40("application/mac-binhex40"),
    @XmlEnumValue("application/macwriteii")
    APPLICATION_MACWRITEII("application/macwriteii"),
    @XmlEnumValue("application/marc")
    APPLICATION_MARC("application/marc"),
    @XmlEnumValue("application/mathematica")
    APPLICATION_MATHEMATICA("application/mathematica"),
    @XmlEnumValue("application/mbox")
    APPLICATION_MBOX("application/mbox"),
    @XmlEnumValue("application/mikey")
    APPLICATION_MIKEY("application/mikey"),
    @XmlEnumValue("application/mpeg4-generic")
    APPLICATION_MPEG_4_GENERIC("application/mpeg4-generic"),
    @XmlEnumValue("application/msword")
    APPLICATION_MSWORD("application/msword"),
    @XmlEnumValue("application/news-message-id")
    APPLICATION_NEWS_MESSAGE_ID("application/news-message-id"),
    @XmlEnumValue("application/news-transmission")
    APPLICATION_NEWS_TRANSMISSION("application/news-transmission"),
    @XmlEnumValue("application/ocsp-request")
    APPLICATION_OCSP_REQUEST("application/ocsp-request"),
    @XmlEnumValue("application/ocsp-response")
    APPLICATION_OCSP_RESPONSE("application/ocsp-response"),
    @XmlEnumValue("application/octet-stream")
    APPLICATION_OCTET_STREAM("application/octet-stream"),
    @XmlEnumValue("application/oda")
    APPLICATION_ODA("application/oda"),
    @XmlEnumValue("application/ogg")
    APPLICATION_OGG("application/ogg"),
    @XmlEnumValue("application/parityfec")
    APPLICATION_PARITYFEC("application/parityfec"),
    @XmlEnumValue("application/pdf")
    APPLICATION_PDF("application/pdf"),
    @XmlEnumValue("application/pgp-encrypted")
    APPLICATION_PGP_ENCRYPTED("application/pgp-encrypted"),
    @XmlEnumValue("application/pgp-keys")
    APPLICATION_PGP_KEYS("application/pgp-keys"),
    @XmlEnumValue("application/pgp-signature")
    APPLICATION_PGP_SIGNATURE("application/pgp-signature"),
    @XmlEnumValue("application/pidf+xml")
    APPLICATION_PIDF_XML("application/pidf+xml"),
    @XmlEnumValue("application/pkcs10")
    APPLICATION_PKCS_10("application/pkcs10"),
    @XmlEnumValue("application/pkcs7-mime")
    APPLICATION_PKCS_7_MIME("application/pkcs7-mime"),
    @XmlEnumValue("application/pkcs7-signature")
    APPLICATION_PKCS_7_SIGNATURE("application/pkcs7-signature"),
    @XmlEnumValue("application/pkix-cert")
    APPLICATION_PKIX_CERT("application/pkix-cert"),
    @XmlEnumValue("application/pkix-crl")
    APPLICATION_PKIX_CRL("application/pkix-crl"),
    @XmlEnumValue("application/pkix-pkipath")
    APPLICATION_PKIX_PKIPATH("application/pkix-pkipath"),
    @XmlEnumValue("application/pkixcmp")
    APPLICATION_PKIXCMP("application/pkixcmp"),
    @XmlEnumValue("application/postscript")
    APPLICATION_POSTSCRIPT("application/postscript"),
    @XmlEnumValue("application/prs.alvestrand.titrax-sheet")
    APPLICATION_PRS_ALVESTRAND_TITRAX_SHEET("application/prs.alvestrand.titrax-sheet"),
    @XmlEnumValue("application/prs.cww")
    APPLICATION_PRS_CWW("application/prs.cww"),
    @XmlEnumValue("application/prs.nprend")
    APPLICATION_PRS_NPREND("application/prs.nprend"),
    @XmlEnumValue("application/prs.plucker")
    APPLICATION_PRS_PLUCKER("application/prs.plucker"),
    @XmlEnumValue("application/qsig")
    APPLICATION_QSIG("application/qsig"),
    @XmlEnumValue("application/rdf+xml")
    APPLICATION_RDF_XML("application/rdf+xml"),
    @XmlEnumValue("application/reginfo+xml")
    APPLICATION_REGINFO_XML("application/reginfo+xml"),
    @XmlEnumValue("application/remote-printing")
    APPLICATION_REMOTE_PRINTING("application/remote-printing"),
    @XmlEnumValue("application/resource-lists+xml")
    APPLICATION_RESOURCE_LISTS_XML("application/resource-lists+xml"),
    @XmlEnumValue("application/riscos")
    APPLICATION_RISCOS("application/riscos"),
    @XmlEnumValue("application/rls-services+xml")
    APPLICATION_RLS_SERVICES_XML("application/rls-services+xml"),
    @XmlEnumValue("application/rtf")
    APPLICATION_RTF("application/rtf"),
    @XmlEnumValue("application/samlassertion+xml")
    APPLICATION_SAMLASSERTION_XML("application/samlassertion+xml"),
    @XmlEnumValue("application/samlmetadata+xml")
    APPLICATION_SAMLMETADATA_XML("application/samlmetadata+xml"),
    @XmlEnumValue("application/sbml+xml")
    APPLICATION_SBML_XML("application/sbml+xml"),
    @XmlEnumValue("application/sdp")
    APPLICATION_SDP("application/sdp"),
    @XmlEnumValue("application/set-payment")
    APPLICATION_SET_PAYMENT("application/set-payment"),
    @XmlEnumValue("application/set-payment-initiation")
    APPLICATION_SET_PAYMENT_INITIATION("application/set-payment-initiation"),
    @XmlEnumValue("application/set-registration")
    APPLICATION_SET_REGISTRATION("application/set-registration"),
    @XmlEnumValue("application/set-registration-initiation")
    APPLICATION_SET_REGISTRATION_INITIATION("application/set-registration-initiation"),
    @XmlEnumValue("application/sgml")
    APPLICATION_SGML("application/sgml"),
    @XmlEnumValue("application/sgml-open-catalog")
    APPLICATION_SGML_OPEN_CATALOG("application/sgml-open-catalog"),
    @XmlEnumValue("application/shf+xml")
    APPLICATION_SHF_XML("application/shf+xml"),
    @XmlEnumValue("application/sieve")
    APPLICATION_SIEVE("application/sieve"),
    @XmlEnumValue("application/simple-filter+xml")
    APPLICATION_SIMPLE_FILTER_XML("application/simple-filter+xml"),
    @XmlEnumValue("application/simple-message-summary")
    APPLICATION_SIMPLE_MESSAGE_SUMMARY("application/simple-message-summary"),
    @XmlEnumValue("application/slate")
    APPLICATION_SLATE("application/slate"),
    @XmlEnumValue("application/soap+xml")
    APPLICATION_SOAP_XML("application/soap+xml"),
    @XmlEnumValue("application/spirits-event+xml")
    APPLICATION_SPIRITS_EVENT_XML("application/spirits-event+xml"),
    @XmlEnumValue("application/timestamp-query")
    APPLICATION_TIMESTAMP_QUERY("application/timestamp-query"),
    @XmlEnumValue("application/timestamp-reply")
    APPLICATION_TIMESTAMP_REPLY("application/timestamp-reply"),
    @XmlEnumValue("application/tve-trigger")
    APPLICATION_TVE_TRIGGER("application/tve-trigger"),
    @XmlEnumValue("application/vemmi")
    APPLICATION_VEMMI("application/vemmi"),
    @XmlEnumValue("application/vnd.3M.Post-it-Notes")
    APPLICATION_VND_3_M_POST_IT_NOTES("application/vnd.3M.Post-it-Notes"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-large")
    APPLICATION_VND_3_GPP_PIC_BW_LARGE("application/vnd.3gpp.pic-bw-large"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-small")
    APPLICATION_VND_3_GPP_PIC_BW_SMALL("application/vnd.3gpp.pic-bw-small"),
    @XmlEnumValue("application/vnd.3gpp.pic-bw-var")
    APPLICATION_VND_3_GPP_PIC_BW_VAR("application/vnd.3gpp.pic-bw-var"),
    @XmlEnumValue("application/vnd.3gpp.sms")
    APPLICATION_VND_3_GPP_SMS("application/vnd.3gpp.sms"),
    @XmlEnumValue("application/vnd.FloGraphIt")
    APPLICATION_VND_FLO_GRAPH_IT("application/vnd.FloGraphIt"),
    @XmlEnumValue("application/vnd.Kinar")
    APPLICATION_VND_KINAR("application/vnd.Kinar"),
    @XmlEnumValue("application/vnd.Mobius.DAF")
    APPLICATION_VND_MOBIUS_DAF("application/vnd.Mobius.DAF"),
    @XmlEnumValue("application/vnd.Mobius.DIS")
    APPLICATION_VND_MOBIUS_DIS("application/vnd.Mobius.DIS"),
    @XmlEnumValue("application/vnd.Mobius.MBK")
    APPLICATION_VND_MOBIUS_MBK("application/vnd.Mobius.MBK"),
    @XmlEnumValue("application/vnd.Mobius.MQY")
    APPLICATION_VND_MOBIUS_MQY("application/vnd.Mobius.MQY"),
    @XmlEnumValue("application/vnd.Mobius.MSL")
    APPLICATION_VND_MOBIUS_MSL("application/vnd.Mobius.MSL"),
    @XmlEnumValue("application/vnd.Mobius.PLC")
    APPLICATION_VND_MOBIUS_PLC("application/vnd.Mobius.PLC"),
    @XmlEnumValue("application/vnd.Mobius.TXF")
    APPLICATION_VND_MOBIUS_TXF("application/vnd.Mobius.TXF"),
    @XmlEnumValue("application/vnd.Quark.QuarkXPress")
    APPLICATION_VND_QUARK_QUARK_X_PRESS("application/vnd.Quark.QuarkXPress"),
    @XmlEnumValue("application/vnd.RenLearn.rlprint")
    APPLICATION_VND_REN_LEARN_RLPRINT("application/vnd.RenLearn.rlprint"),
    @XmlEnumValue("application/vnd.accpac.simply.aso")
    APPLICATION_VND_ACCPAC_SIMPLY_ASO("application/vnd.accpac.simply.aso"),
    @XmlEnumValue("application/vnd.accpac.simply.imp")
    APPLICATION_VND_ACCPAC_SIMPLY_IMP("application/vnd.accpac.simply.imp"),
    @XmlEnumValue("application/vnd.acucobol")
    APPLICATION_VND_ACUCOBOL("application/vnd.acucobol"),
    @XmlEnumValue("application/vnd.acucorp")
    APPLICATION_VND_ACUCORP("application/vnd.acucorp"),
    @XmlEnumValue("application/vnd.adobe.xfdf")
    APPLICATION_VND_ADOBE_XFDF("application/vnd.adobe.xfdf"),
    @XmlEnumValue("application/vnd.aether.imp")
    APPLICATION_VND_AETHER_IMP("application/vnd.aether.imp"),
    @XmlEnumValue("application/vnd.amiga.ami")
    APPLICATION_VND_AMIGA_AMI("application/vnd.amiga.ami"),
    @XmlEnumValue("application/vnd.anser-web-certificate-issue-initiation")
    APPLICATION_VND_ANSER_WEB_CERTIFICATE_ISSUE_INITIATION("application/vnd.anser-web-certificate-issue-initiation"),
    @XmlEnumValue("application/vnd.anser-web-funds-transfer-initiation")
    APPLICATION_VND_ANSER_WEB_FUNDS_TRANSFER_INITIATION("application/vnd.anser-web-funds-transfer-initiation"),
    @XmlEnumValue("application/vnd.audiograph")
    APPLICATION_VND_AUDIOGRAPH("application/vnd.audiograph"),
    @XmlEnumValue("application/vnd.blueice.multipass")
    APPLICATION_VND_BLUEICE_MULTIPASS("application/vnd.blueice.multipass"),
    @XmlEnumValue("application/vnd.bmi")
    APPLICATION_VND_BMI("application/vnd.bmi"),
    @XmlEnumValue("application/vnd.businessobjects")
    APPLICATION_VND_BUSINESSOBJECTS("application/vnd.businessobjects"),
    @XmlEnumValue("application/vnd.canon-cpdl")
    APPLICATION_VND_CANON_CPDL("application/vnd.canon-cpdl"),
    @XmlEnumValue("application/vnd.canon-lips")
    APPLICATION_VND_CANON_LIPS("application/vnd.canon-lips"),
    @XmlEnumValue("application/vnd.cinderella")
    APPLICATION_VND_CINDERELLA("application/vnd.cinderella"),
    @XmlEnumValue("application/vnd.claymore")
    APPLICATION_VND_CLAYMORE("application/vnd.claymore"),
    @XmlEnumValue("application/vnd.commerce-battelle")
    APPLICATION_VND_COMMERCE_BATTELLE("application/vnd.commerce-battelle"),
    @XmlEnumValue("application/vnd.commonspace")
    APPLICATION_VND_COMMONSPACE("application/vnd.commonspace"),
    @XmlEnumValue("application/vnd.contact.cmsg")
    APPLICATION_VND_CONTACT_CMSG("application/vnd.contact.cmsg"),
    @XmlEnumValue("application/vnd.cosmocaller")
    APPLICATION_VND_COSMOCALLER("application/vnd.cosmocaller"),
    @XmlEnumValue("application/vnd.criticaltools.wbs+xml")
    APPLICATION_VND_CRITICALTOOLS_WBS_XML("application/vnd.criticaltools.wbs+xml"),
    @XmlEnumValue("application/vnd.ctc-posml")
    APPLICATION_VND_CTC_POSML("application/vnd.ctc-posml"),
    @XmlEnumValue("application/vnd.cups-postscript")
    APPLICATION_VND_CUPS_POSTSCRIPT("application/vnd.cups-postscript"),
    @XmlEnumValue("application/vnd.cups-raster")
    APPLICATION_VND_CUPS_RASTER("application/vnd.cups-raster"),
    @XmlEnumValue("application/vnd.cups-raw")
    APPLICATION_VND_CUPS_RAW("application/vnd.cups-raw"),
    @XmlEnumValue("application/vnd.curl")
    APPLICATION_VND_CURL("application/vnd.curl"),
    @XmlEnumValue("application/vnd.cybank")
    APPLICATION_VND_CYBANK("application/vnd.cybank"),
    @XmlEnumValue("application/vnd.data-vision.rdz")
    APPLICATION_VND_DATA_VISION_RDZ("application/vnd.data-vision.rdz"),
    @XmlEnumValue("application/vnd.dna")
    APPLICATION_VND_DNA("application/vnd.dna"),
    @XmlEnumValue("application/vnd.dpgraph")
    APPLICATION_VND_DPGRAPH("application/vnd.dpgraph"),
    @XmlEnumValue("application/vnd.dreamfactory")
    APPLICATION_VND_DREAMFACTORY("application/vnd.dreamfactory"),
    @XmlEnumValue("application/vnd.dxr")
    APPLICATION_VND_DXR("application/vnd.dxr"),
    @XmlEnumValue("application/vnd.ecdis-update")
    APPLICATION_VND_ECDIS_UPDATE("application/vnd.ecdis-update"),
    @XmlEnumValue("application/vnd.ecowin.chart")
    APPLICATION_VND_ECOWIN_CHART("application/vnd.ecowin.chart"),
    @XmlEnumValue("application/vnd.ecowin.filerequest")
    APPLICATION_VND_ECOWIN_FILEREQUEST("application/vnd.ecowin.filerequest"),
    @XmlEnumValue("application/vnd.ecowin.fileupdate")
    APPLICATION_VND_ECOWIN_FILEUPDATE("application/vnd.ecowin.fileupdate"),
    @XmlEnumValue("application/vnd.ecowin.series")
    APPLICATION_VND_ECOWIN_SERIES("application/vnd.ecowin.series"),
    @XmlEnumValue("application/vnd.ecowin.seriesrequest")
    APPLICATION_VND_ECOWIN_SERIESREQUEST("application/vnd.ecowin.seriesrequest"),
    @XmlEnumValue("application/vnd.ecowin.seriesupdate")
    APPLICATION_VND_ECOWIN_SERIESUPDATE("application/vnd.ecowin.seriesupdate"),
    @XmlEnumValue("application/vnd.enliven")
    APPLICATION_VND_ENLIVEN("application/vnd.enliven"),
    @XmlEnumValue("application/vnd.epson.esf")
    APPLICATION_VND_EPSON_ESF("application/vnd.epson.esf"),
    @XmlEnumValue("application/vnd.epson.msf")
    APPLICATION_VND_EPSON_MSF("application/vnd.epson.msf"),
    @XmlEnumValue("application/vnd.epson.quickanime")
    APPLICATION_VND_EPSON_QUICKANIME("application/vnd.epson.quickanime"),
    @XmlEnumValue("application/vnd.epson.salt")
    APPLICATION_VND_EPSON_SALT("application/vnd.epson.salt"),
    @XmlEnumValue("application/vnd.epson.ssf")
    APPLICATION_VND_EPSON_SSF("application/vnd.epson.ssf"),
    @XmlEnumValue("application/vnd.ericsson.quickcall")
    APPLICATION_VND_ERICSSON_QUICKCALL("application/vnd.ericsson.quickcall"),
    @XmlEnumValue("application/vnd.eudora.data")
    APPLICATION_VND_EUDORA_DATA("application/vnd.eudora.data"),
    @XmlEnumValue("application/vnd.fdf")
    APPLICATION_VND_FDF("application/vnd.fdf"),
    @XmlEnumValue("application/vnd.ffsns")
    APPLICATION_VND_FFSNS("application/vnd.ffsns"),
    @XmlEnumValue("application/vnd.fints")
    APPLICATION_VND_FINTS("application/vnd.fints"),
    @XmlEnumValue("application/vnd.framemaker")
    APPLICATION_VND_FRAMEMAKER("application/vnd.framemaker"),
    @XmlEnumValue("application/vnd.fsc.weblaunch")
    APPLICATION_VND_FSC_WEBLAUNCH("application/vnd.fsc.weblaunch"),
    @XmlEnumValue("application/vnd.fujitsu.oasys")
    APPLICATION_VND_FUJITSU_OASYS("application/vnd.fujitsu.oasys"),
    @XmlEnumValue("application/vnd.fujitsu.oasys2")
    APPLICATION_VND_FUJITSU_OASYS_2("application/vnd.fujitsu.oasys2"),
    @XmlEnumValue("application/vnd.fujitsu.oasys3")
    APPLICATION_VND_FUJITSU_OASYS_3("application/vnd.fujitsu.oasys3"),
    @XmlEnumValue("application/vnd.fujitsu.oasysgp")
    APPLICATION_VND_FUJITSU_OASYSGP("application/vnd.fujitsu.oasysgp"),
    @XmlEnumValue("application/vnd.fujitsu.oasysprs")
    APPLICATION_VND_FUJITSU_OASYSPRS("application/vnd.fujitsu.oasysprs"),
    @XmlEnumValue("application/vnd.fujixerox.ddd")
    APPLICATION_VND_FUJIXEROX_DDD("application/vnd.fujixerox.ddd"),
    @XmlEnumValue("application/vnd.fujixerox.docuworks")
    APPLICATION_VND_FUJIXEROX_DOCUWORKS("application/vnd.fujixerox.docuworks"),
    @XmlEnumValue("application/vnd.fujixerox.docuworks.binder")
    APPLICATION_VND_FUJIXEROX_DOCUWORKS_BINDER("application/vnd.fujixerox.docuworks.binder"),
    @XmlEnumValue("application/vnd.fut-misnet")
    APPLICATION_VND_FUT_MISNET("application/vnd.fut-misnet"),
    @XmlEnumValue("application/vnd.genomatix.tuxedo")
    APPLICATION_VND_GENOMATIX_TUXEDO("application/vnd.genomatix.tuxedo"),
    @XmlEnumValue("application/vnd.grafeq")
    APPLICATION_VND_GRAFEQ("application/vnd.grafeq"),
    @XmlEnumValue("application/vnd.groove-account")
    APPLICATION_VND_GROOVE_ACCOUNT("application/vnd.groove-account"),
    @XmlEnumValue("application/vnd.groove-help")
    APPLICATION_VND_GROOVE_HELP("application/vnd.groove-help"),
    @XmlEnumValue("application/vnd.groove-identity-message")
    APPLICATION_VND_GROOVE_IDENTITY_MESSAGE("application/vnd.groove-identity-message"),
    @XmlEnumValue("application/vnd.groove-injector")
    APPLICATION_VND_GROOVE_INJECTOR("application/vnd.groove-injector"),
    @XmlEnumValue("application/vnd.groove-tool-message")
    APPLICATION_VND_GROOVE_TOOL_MESSAGE("application/vnd.groove-tool-message"),
    @XmlEnumValue("application/vnd.groove-tool-template")
    APPLICATION_VND_GROOVE_TOOL_TEMPLATE("application/vnd.groove-tool-template"),
    @XmlEnumValue("application/vnd.groove-vcard")
    APPLICATION_VND_GROOVE_VCARD("application/vnd.groove-vcard"),
    @XmlEnumValue("application/vnd.hbci")
    APPLICATION_VND_HBCI("application/vnd.hbci"),
    @XmlEnumValue("application/vnd.hcl-bireports")
    APPLICATION_VND_HCL_BIREPORTS("application/vnd.hcl-bireports"),
    @XmlEnumValue("application/vnd.hhe.lesson-player")
    APPLICATION_VND_HHE_LESSON_PLAYER("application/vnd.hhe.lesson-player"),
    @XmlEnumValue("application/vnd.hp-HPGL")
    APPLICATION_VND_HP_HPGL("application/vnd.hp-HPGL"),
    @XmlEnumValue("application/vnd.hp-PCL")
    APPLICATION_VND_HP_PCL("application/vnd.hp-PCL"),
    @XmlEnumValue("application/vnd.hp-PCLXL")
    APPLICATION_VND_HP_PCLXL("application/vnd.hp-PCLXL"),
    @XmlEnumValue("application/vnd.hp-hpid")
    APPLICATION_VND_HP_HPID("application/vnd.hp-hpid"),
    @XmlEnumValue("application/vnd.hp-hps")
    APPLICATION_VND_HP_HPS("application/vnd.hp-hps"),
    @XmlEnumValue("application/vnd.httphone")
    APPLICATION_VND_HTTPHONE("application/vnd.httphone"),
    @XmlEnumValue("application/vnd.hzn-3d-crossword")
    APPLICATION_VND_HZN_3_D_CROSSWORD("application/vnd.hzn-3d-crossword"),
    @XmlEnumValue("application/vnd.ibm.MiniPay")
    APPLICATION_VND_IBM_MINI_PAY("application/vnd.ibm.MiniPay"),
    @XmlEnumValue("application/vnd.ibm.afplinedata")
    APPLICATION_VND_IBM_AFPLINEDATA("application/vnd.ibm.afplinedata"),
    @XmlEnumValue("application/vnd.ibm.electronic-media")
    APPLICATION_VND_IBM_ELECTRONIC_MEDIA("application/vnd.ibm.electronic-media"),
    @XmlEnumValue("application/vnd.ibm.modcap")
    APPLICATION_VND_IBM_MODCAP("application/vnd.ibm.modcap"),
    @XmlEnumValue("application/vnd.ibm.rights-management")
    APPLICATION_VND_IBM_RIGHTS_MANAGEMENT("application/vnd.ibm.rights-management"),
    @XmlEnumValue("application/vnd.ibm.secure-container")
    APPLICATION_VND_IBM_SECURE_CONTAINER("application/vnd.ibm.secure-container"),
    @XmlEnumValue("application/vnd.informix-visionary")
    APPLICATION_VND_INFORMIX_VISIONARY("application/vnd.informix-visionary"),
    @XmlEnumValue("application/vnd.intercon.formnet")
    APPLICATION_VND_INTERCON_FORMNET("application/vnd.intercon.formnet"),
    @XmlEnumValue("application/vnd.intertrust.digibox")
    APPLICATION_VND_INTERTRUST_DIGIBOX("application/vnd.intertrust.digibox"),
    @XmlEnumValue("application/vnd.intertrust.nncp")
    APPLICATION_VND_INTERTRUST_NNCP("application/vnd.intertrust.nncp"),
    @XmlEnumValue("application/vnd.intu.qbo")
    APPLICATION_VND_INTU_QBO("application/vnd.intu.qbo"),
    @XmlEnumValue("application/vnd.intu.qfx")
    APPLICATION_VND_INTU_QFX("application/vnd.intu.qfx"),
    @XmlEnumValue("application/vnd.ipunplugged.rcprofile")
    APPLICATION_VND_IPUNPLUGGED_RCPROFILE("application/vnd.ipunplugged.rcprofile"),
    @XmlEnumValue("application/vnd.irepository.package+xml")
    APPLICATION_VND_IREPOSITORY_PACKAGE_XML("application/vnd.irepository.package+xml"),
    @XmlEnumValue("application/vnd.is-xpr")
    APPLICATION_VND_IS_XPR("application/vnd.is-xpr"),
    @XmlEnumValue("application/vnd.japannet-directory-service")
    APPLICATION_VND_JAPANNET_DIRECTORY_SERVICE("application/vnd.japannet-directory-service"),
    @XmlEnumValue("application/vnd.japannet-jpnstore-wakeup")
    APPLICATION_VND_JAPANNET_JPNSTORE_WAKEUP("application/vnd.japannet-jpnstore-wakeup"),
    @XmlEnumValue("application/vnd.japannet-payment-wakeup")
    APPLICATION_VND_JAPANNET_PAYMENT_WAKEUP("application/vnd.japannet-payment-wakeup"),
    @XmlEnumValue("application/vnd.japannet-registration")
    APPLICATION_VND_JAPANNET_REGISTRATION("application/vnd.japannet-registration"),
    @XmlEnumValue("application/vnd.japannet-registration-wakeup")
    APPLICATION_VND_JAPANNET_REGISTRATION_WAKEUP("application/vnd.japannet-registration-wakeup"),
    @XmlEnumValue("application/vnd.japannet-setstore-wakeup")
    APPLICATION_VND_JAPANNET_SETSTORE_WAKEUP("application/vnd.japannet-setstore-wakeup"),
    @XmlEnumValue("application/vnd.japannet-verification")
    APPLICATION_VND_JAPANNET_VERIFICATION("application/vnd.japannet-verification"),
    @XmlEnumValue("application/vnd.japannet-verification-wakeup")
    APPLICATION_VND_JAPANNET_VERIFICATION_WAKEUP("application/vnd.japannet-verification-wakeup"),
    @XmlEnumValue("application/vnd.jisp")
    APPLICATION_VND_JISP("application/vnd.jisp"),
    @XmlEnumValue("application/vnd.kde.karbon")
    APPLICATION_VND_KDE_KARBON("application/vnd.kde.karbon"),
    @XmlEnumValue("application/vnd.kde.kchart")
    APPLICATION_VND_KDE_KCHART("application/vnd.kde.kchart"),
    @XmlEnumValue("application/vnd.kde.kformula")
    APPLICATION_VND_KDE_KFORMULA("application/vnd.kde.kformula"),
    @XmlEnumValue("application/vnd.kde.kivio")
    APPLICATION_VND_KDE_KIVIO("application/vnd.kde.kivio"),
    @XmlEnumValue("application/vnd.kde.kontour")
    APPLICATION_VND_KDE_KONTOUR("application/vnd.kde.kontour"),
    @XmlEnumValue("application/vnd.kde.kpresenter")
    APPLICATION_VND_KDE_KPRESENTER("application/vnd.kde.kpresenter"),
    @XmlEnumValue("application/vnd.kde.kspread")
    APPLICATION_VND_KDE_KSPREAD("application/vnd.kde.kspread"),
    @XmlEnumValue("application/vnd.kde.kword")
    APPLICATION_VND_KDE_KWORD("application/vnd.kde.kword"),
    @XmlEnumValue("application/vnd.kenameaapp")
    APPLICATION_VND_KENAMEAAPP("application/vnd.kenameaapp"),
    @XmlEnumValue("application/vnd.kidspiration")
    APPLICATION_VND_KIDSPIRATION("application/vnd.kidspiration"),
    @XmlEnumValue("application/vnd.koan")
    APPLICATION_VND_KOAN("application/vnd.koan"),
    @XmlEnumValue("application/vnd.liberty-request+xml")
    APPLICATION_VND_LIBERTY_REQUEST_XML("application/vnd.liberty-request+xml"),
    @XmlEnumValue("application/vnd.llamagraphics.life-balance.desktop")
    APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_DESKTOP("application/vnd.llamagraphics.life-balance.desktop"),
    @XmlEnumValue("application/vnd.llamagraphics.life-balance.exchange+xml")
    APPLICATION_VND_LLAMAGRAPHICS_LIFE_BALANCE_EXCHANGE_XML("application/vnd.llamagraphics.life-balance.exchange+xml"),
    @XmlEnumValue("application/vnd.lotus-1-2-3")
    APPLICATION_VND_LOTUS_1_2_3("application/vnd.lotus-1-2-3"),
    @XmlEnumValue("application/vnd.lotus-approach")
    APPLICATION_VND_LOTUS_APPROACH("application/vnd.lotus-approach"),
    @XmlEnumValue("application/vnd.lotus-freelance")
    APPLICATION_VND_LOTUS_FREELANCE("application/vnd.lotus-freelance"),
    @XmlEnumValue("application/vnd.lotus-notes")
    APPLICATION_VND_LOTUS_NOTES("application/vnd.lotus-notes"),
    @XmlEnumValue("application/vnd.lotus-organizer")
    APPLICATION_VND_LOTUS_ORGANIZER("application/vnd.lotus-organizer"),
    @XmlEnumValue("application/vnd.lotus-screencam")
    APPLICATION_VND_LOTUS_SCREENCAM("application/vnd.lotus-screencam"),
    @XmlEnumValue("application/vnd.lotus-wordpro")
    APPLICATION_VND_LOTUS_WORDPRO("application/vnd.lotus-wordpro"),
    @XmlEnumValue("application/vnd.mcd")
    APPLICATION_VND_MCD("application/vnd.mcd"),
    @XmlEnumValue("application/vnd.mediastation.cdkey")
    APPLICATION_VND_MEDIASTATION_CDKEY("application/vnd.mediastation.cdkey"),
    @XmlEnumValue("application/vnd.meridian-slingshot")
    APPLICATION_VND_MERIDIAN_SLINGSHOT("application/vnd.meridian-slingshot"),
    @XmlEnumValue("application/vnd.mfmp")
    APPLICATION_VND_MFMP("application/vnd.mfmp"),
    @XmlEnumValue("application/vnd.micrografx.flo")
    APPLICATION_VND_MICROGRAFX_FLO("application/vnd.micrografx.flo"),
    @XmlEnumValue("application/vnd.micrografx.igx")
    APPLICATION_VND_MICROGRAFX_IGX("application/vnd.micrografx.igx"),
    @XmlEnumValue("application/vnd.mif")
    APPLICATION_VND_MIF("application/vnd.mif"),
    @XmlEnumValue("application/vnd.minisoft-hp3000-save")
    APPLICATION_VND_MINISOFT_HP_3000_SAVE("application/vnd.minisoft-hp3000-save"),
    @XmlEnumValue("application/vnd.mitsubishi.misty-guard.trustweb")
    APPLICATION_VND_MITSUBISHI_MISTY_GUARD_TRUSTWEB("application/vnd.mitsubishi.misty-guard.trustweb"),
    @XmlEnumValue("application/vnd.mophun.application")
    APPLICATION_VND_MOPHUN_APPLICATION("application/vnd.mophun.application"),
    @XmlEnumValue("application/vnd.mophun.certificate")
    APPLICATION_VND_MOPHUN_CERTIFICATE("application/vnd.mophun.certificate"),
    @XmlEnumValue("application/vnd.motorola.flexsuite")
    APPLICATION_VND_MOTOROLA_FLEXSUITE("application/vnd.motorola.flexsuite"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.adsi")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_ADSI("application/vnd.motorola.flexsuite.adsi"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.fis")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_FIS("application/vnd.motorola.flexsuite.fis"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.gotap")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_GOTAP("application/vnd.motorola.flexsuite.gotap"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.kmr")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_KMR("application/vnd.motorola.flexsuite.kmr"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.ttc")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_TTC("application/vnd.motorola.flexsuite.ttc"),
    @XmlEnumValue("application/vnd.motorola.flexsuite.wem")
    APPLICATION_VND_MOTOROLA_FLEXSUITE_WEM("application/vnd.motorola.flexsuite.wem"),
    @XmlEnumValue("application/vnd.mozilla.xul+xml")
    APPLICATION_VND_MOZILLA_XUL_XML("application/vnd.mozilla.xul+xml"),
    @XmlEnumValue("application/vnd.ms-artgalry")
    APPLICATION_VND_MS_ARTGALRY("application/vnd.ms-artgalry"),
    @XmlEnumValue("application/vnd.ms-asf")
    APPLICATION_VND_MS_ASF("application/vnd.ms-asf"),
    @XmlEnumValue("application/vnd.ms-excel")
    APPLICATION_VND_MS_EXCEL("application/vnd.ms-excel"),
    @XmlEnumValue("application/vnd.ms-lrm")
    APPLICATION_VND_MS_LRM("application/vnd.ms-lrm"),
    @XmlEnumValue("application/vnd.ms-powerpoint")
    APPLICATION_VND_MS_POWERPOINT("application/vnd.ms-powerpoint"),
    @XmlEnumValue("application/vnd.ms-project")
    APPLICATION_VND_MS_PROJECT("application/vnd.ms-project"),
    @XmlEnumValue("application/vnd.ms-tnef")
    APPLICATION_VND_MS_TNEF("application/vnd.ms-tnef"),
    @XmlEnumValue("application/vnd.ms-works")
    APPLICATION_VND_MS_WORKS("application/vnd.ms-works"),
    @XmlEnumValue("application/vnd.ms-wpl")
    APPLICATION_VND_MS_WPL("application/vnd.ms-wpl"),
    @XmlEnumValue("application/vnd.mseq")
    APPLICATION_VND_MSEQ("application/vnd.mseq"),
    @XmlEnumValue("application/vnd.msign")
    APPLICATION_VND_MSIGN("application/vnd.msign"),
    @XmlEnumValue("application/vnd.music-niff")
    APPLICATION_VND_MUSIC_NIFF("application/vnd.music-niff"),
    @XmlEnumValue("application/vnd.musician")
    APPLICATION_VND_MUSICIAN("application/vnd.musician"),
    @XmlEnumValue("application/vnd.nervana")
    APPLICATION_VND_NERVANA("application/vnd.nervana"),
    @XmlEnumValue("application/vnd.netfpx")
    APPLICATION_VND_NETFPX("application/vnd.netfpx"),
    @XmlEnumValue("application/vnd.noblenet-directory")
    APPLICATION_VND_NOBLENET_DIRECTORY("application/vnd.noblenet-directory"),
    @XmlEnumValue("application/vnd.noblenet-sealer")
    APPLICATION_VND_NOBLENET_SEALER("application/vnd.noblenet-sealer"),
    @XmlEnumValue("application/vnd.noblenet-web")
    APPLICATION_VND_NOBLENET_WEB("application/vnd.noblenet-web"),
    @XmlEnumValue("application/vnd.nokia.landmark+wbxml")
    APPLICATION_VND_NOKIA_LANDMARK_WBXML("application/vnd.nokia.landmark+wbxml"),
    @XmlEnumValue("application/vnd.nokia.landmark+xml")
    APPLICATION_VND_NOKIA_LANDMARK_XML("application/vnd.nokia.landmark+xml"),
    @XmlEnumValue("application/vnd.nokia.landmarkcollection+xml")
    APPLICATION_VND_NOKIA_LANDMARKCOLLECTION_XML("application/vnd.nokia.landmarkcollection+xml"),
    @XmlEnumValue("application/vnd.nokia.radio-preset")
    APPLICATION_VND_NOKIA_RADIO_PRESET("application/vnd.nokia.radio-preset"),
    @XmlEnumValue("application/vnd.nokia.radio-presets")
    APPLICATION_VND_NOKIA_RADIO_PRESETS("application/vnd.nokia.radio-presets"),
    @XmlEnumValue("application/vnd.novadigm.EDM")
    APPLICATION_VND_NOVADIGM_EDM("application/vnd.novadigm.EDM"),
    @XmlEnumValue("application/vnd.novadigm.EDX")
    APPLICATION_VND_NOVADIGM_EDX("application/vnd.novadigm.EDX"),
    @XmlEnumValue("application/vnd.novadigm.EXT")
    APPLICATION_VND_NOVADIGM_EXT("application/vnd.novadigm.EXT"),
    @XmlEnumValue("application/vnd.obn")
    APPLICATION_VND_OBN("application/vnd.obn"),
    @XmlEnumValue("application/vnd.omads-email+xml")
    APPLICATION_VND_OMADS_EMAIL_XML("application/vnd.omads-email+xml"),
    @XmlEnumValue("application/vnd.omads-file+xml")
    APPLICATION_VND_OMADS_FILE_XML("application/vnd.omads-file+xml"),
    @XmlEnumValue("application/vnd.omads-folder+xml")
    APPLICATION_VND_OMADS_FOLDER_XML("application/vnd.omads-folder+xml"),
    @XmlEnumValue("application/vnd.osa.netdeploy")
    APPLICATION_VND_OSA_NETDEPLOY("application/vnd.osa.netdeploy"),
    @XmlEnumValue("application/vnd.palm")
    APPLICATION_VND_PALM("application/vnd.palm"),
    @XmlEnumValue("application/vnd.paos.xml")
    APPLICATION_VND_PAOS_XML("application/vnd.paos.xml"),
    @XmlEnumValue("application/vnd.pg.format")
    APPLICATION_VND_PG_FORMAT("application/vnd.pg.format"),
    @XmlEnumValue("application/vnd.pg.osasli")
    APPLICATION_VND_PG_OSASLI("application/vnd.pg.osasli"),
    @XmlEnumValue("application/vnd.picsel")
    APPLICATION_VND_PICSEL("application/vnd.picsel"),
    @XmlEnumValue("application/vnd.powerbuilder6")
    APPLICATION_VND_POWERBUILDER_6("application/vnd.powerbuilder6"),
    @XmlEnumValue("application/vnd.powerbuilder6-s")
    APPLICATION_VND_POWERBUILDER_6_S("application/vnd.powerbuilder6-s"),
    @XmlEnumValue("application/vnd.powerbuilder7")
    APPLICATION_VND_POWERBUILDER_7("application/vnd.powerbuilder7"),
    @XmlEnumValue("application/vnd.powerbuilder7-s")
    APPLICATION_VND_POWERBUILDER_7_S("application/vnd.powerbuilder7-s"),
    @XmlEnumValue("application/vnd.powerbuilder75")
    APPLICATION_VND_POWERBUILDER_75("application/vnd.powerbuilder75"),
    @XmlEnumValue("application/vnd.powerbuilder75-s")
    APPLICATION_VND_POWERBUILDER_75_S("application/vnd.powerbuilder75-s"),
    @XmlEnumValue("application/vnd.previewsystems.box")
    APPLICATION_VND_PREVIEWSYSTEMS_BOX("application/vnd.previewsystems.box"),
    @XmlEnumValue("application/vnd.publishare-delta-tree")
    APPLICATION_VND_PUBLISHARE_DELTA_TREE("application/vnd.publishare-delta-tree"),
    @XmlEnumValue("application/vnd.pvi.ptid1")
    APPLICATION_VND_PVI_PTID_1("application/vnd.pvi.ptid1"),
    @XmlEnumValue("application/vnd.pwg-multiplexed")
    APPLICATION_VND_PWG_MULTIPLEXED("application/vnd.pwg-multiplexed"),
    @XmlEnumValue("application/vnd.pwg-xhtml-print+xml")
    APPLICATION_VND_PWG_XHTML_PRINT_XML("application/vnd.pwg-xhtml-print+xml"),
    @XmlEnumValue("application/vnd.rapid")
    APPLICATION_VND_RAPID("application/vnd.rapid"),
    @XmlEnumValue("application/vnd.s3sms")
    APPLICATION_VND_S_3_SMS("application/vnd.s3sms"),
    @XmlEnumValue("application/vnd.sealed.doc")
    APPLICATION_VND_SEALED_DOC("application/vnd.sealed.doc"),
    @XmlEnumValue("application/vnd.sealed.eml")
    APPLICATION_VND_SEALED_EML("application/vnd.sealed.eml"),
    @XmlEnumValue("application/vnd.sealed.mht")
    APPLICATION_VND_SEALED_MHT("application/vnd.sealed.mht"),
    @XmlEnumValue("application/vnd.sealed.net")
    APPLICATION_VND_SEALED_NET("application/vnd.sealed.net"),
    @XmlEnumValue("application/vnd.sealed.ppt")
    APPLICATION_VND_SEALED_PPT("application/vnd.sealed.ppt"),
    @XmlEnumValue("application/vnd.sealed.xls")
    APPLICATION_VND_SEALED_XLS("application/vnd.sealed.xls"),
    @XmlEnumValue("application/vnd.sealedmedia.softseal.html")
    APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_HTML("application/vnd.sealedmedia.softseal.html"),
    @XmlEnumValue("application/vnd.sealedmedia.softseal.pdf")
    APPLICATION_VND_SEALEDMEDIA_SOFTSEAL_PDF("application/vnd.sealedmedia.softseal.pdf"),
    @XmlEnumValue("application/vnd.seemail")
    APPLICATION_VND_SEEMAIL("application/vnd.seemail"),
    @XmlEnumValue("application/vnd.shana.informed.formdata")
    APPLICATION_VND_SHANA_INFORMED_FORMDATA("application/vnd.shana.informed.formdata"),
    @XmlEnumValue("application/vnd.shana.informed.formtemplate")
    APPLICATION_VND_SHANA_INFORMED_FORMTEMPLATE("application/vnd.shana.informed.formtemplate"),
    @XmlEnumValue("application/vnd.shana.informed.interchange")
    APPLICATION_VND_SHANA_INFORMED_INTERCHANGE("application/vnd.shana.informed.interchange"),
    @XmlEnumValue("application/vnd.shana.informed.package")
    APPLICATION_VND_SHANA_INFORMED_PACKAGE("application/vnd.shana.informed.package"),
    @XmlEnumValue("application/vnd.smaf")
    APPLICATION_VND_SMAF("application/vnd.smaf"),
    @XmlEnumValue("application/vnd.sss-cod")
    APPLICATION_VND_SSS_COD("application/vnd.sss-cod"),
    @XmlEnumValue("application/vnd.sss-dtf")
    APPLICATION_VND_SSS_DTF("application/vnd.sss-dtf"),
    @XmlEnumValue("application/vnd.sss-ntf")
    APPLICATION_VND_SSS_NTF("application/vnd.sss-ntf"),
    @XmlEnumValue("application/vnd.street-stream")
    APPLICATION_VND_STREET_STREAM("application/vnd.street-stream"),
    @XmlEnumValue("application/vnd.sus-calendar")
    APPLICATION_VND_SUS_CALENDAR("application/vnd.sus-calendar"),
    @XmlEnumValue("application/vnd.svd")
    APPLICATION_VND_SVD("application/vnd.svd"),
    @XmlEnumValue("application/vnd.swiftview-ics")
    APPLICATION_VND_SWIFTVIEW_ICS("application/vnd.swiftview-ics"),
    @XmlEnumValue("application/vnd.syncml.+xml")
    APPLICATION_VND_SYNCML_XML("application/vnd.syncml.+xml"),
    @XmlEnumValue("application/vnd.syncml.ds.notification")
    APPLICATION_VND_SYNCML_DS_NOTIFICATION("application/vnd.syncml.ds.notification"),
    @XmlEnumValue("application/vnd.triscape.mxs")
    APPLICATION_VND_TRISCAPE_MXS("application/vnd.triscape.mxs"),
    @XmlEnumValue("application/vnd.trueapp")
    APPLICATION_VND_TRUEAPP("application/vnd.trueapp"),
    @XmlEnumValue("application/vnd.truedoc")
    APPLICATION_VND_TRUEDOC("application/vnd.truedoc"),
    @XmlEnumValue("application/vnd.ufdl")
    APPLICATION_VND_UFDL("application/vnd.ufdl"),
    @XmlEnumValue("application/vnd.uiq.theme")
    APPLICATION_VND_UIQ_THEME("application/vnd.uiq.theme"),
    @XmlEnumValue("application/vnd.uplanet.alert")
    APPLICATION_VND_UPLANET_ALERT("application/vnd.uplanet.alert"),
    @XmlEnumValue("application/vnd.uplanet.alert-wbxml")
    APPLICATION_VND_UPLANET_ALERT_WBXML("application/vnd.uplanet.alert-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.bearer-choice")
    APPLICATION_VND_UPLANET_BEARER_CHOICE("application/vnd.uplanet.bearer-choice"),
    @XmlEnumValue("application/vnd.uplanet.bearer-choice-wbxml")
    APPLICATION_VND_UPLANET_BEARER_CHOICE_WBXML("application/vnd.uplanet.bearer-choice-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.cacheop")
    APPLICATION_VND_UPLANET_CACHEOP("application/vnd.uplanet.cacheop"),
    @XmlEnumValue("application/vnd.uplanet.cacheop-wbxml")
    APPLICATION_VND_UPLANET_CACHEOP_WBXML("application/vnd.uplanet.cacheop-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.channel")
    APPLICATION_VND_UPLANET_CHANNEL("application/vnd.uplanet.channel"),
    @XmlEnumValue("application/vnd.uplanet.channel-wbxml")
    APPLICATION_VND_UPLANET_CHANNEL_WBXML("application/vnd.uplanet.channel-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.list")
    APPLICATION_VND_UPLANET_LIST("application/vnd.uplanet.list"),
    @XmlEnumValue("application/vnd.uplanet.list-wbxml")
    APPLICATION_VND_UPLANET_LIST_WBXML("application/vnd.uplanet.list-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.listcmd")
    APPLICATION_VND_UPLANET_LISTCMD("application/vnd.uplanet.listcmd"),
    @XmlEnumValue("application/vnd.uplanet.listcmd-wbxml")
    APPLICATION_VND_UPLANET_LISTCMD_WBXML("application/vnd.uplanet.listcmd-wbxml"),
    @XmlEnumValue("application/vnd.uplanet.signal")
    APPLICATION_VND_UPLANET_SIGNAL("application/vnd.uplanet.signal"),
    @XmlEnumValue("application/vnd.vcx")
    APPLICATION_VND_VCX("application/vnd.vcx"),
    @XmlEnumValue("application/vnd.vectorworks")
    APPLICATION_VND_VECTORWORKS("application/vnd.vectorworks"),
    @XmlEnumValue("application/vnd.vidsoft.vidconference")
    APPLICATION_VND_VIDSOFT_VIDCONFERENCE("application/vnd.vidsoft.vidconference"),
    @XmlEnumValue("application/vnd.visio")
    APPLICATION_VND_VISIO("application/vnd.visio"),
    @XmlEnumValue("application/vnd.visionary")
    APPLICATION_VND_VISIONARY("application/vnd.visionary"),
    @XmlEnumValue("application/vnd.vividence.scriptfile")
    APPLICATION_VND_VIVIDENCE_SCRIPTFILE("application/vnd.vividence.scriptfile"),
    @XmlEnumValue("application/vnd.vsf")
    APPLICATION_VND_VSF("application/vnd.vsf"),
    @XmlEnumValue("application/vnd.wap.sic")
    APPLICATION_VND_WAP_SIC("application/vnd.wap.sic"),
    @XmlEnumValue("application/vnd.wap.slc")
    APPLICATION_VND_WAP_SLC("application/vnd.wap.slc"),
    @XmlEnumValue("application/vnd.wap.wbxml")
    APPLICATION_VND_WAP_WBXML("application/vnd.wap.wbxml"),
    @XmlEnumValue("application/vnd.wap.wmlc")
    APPLICATION_VND_WAP_WMLC("application/vnd.wap.wmlc"),
    @XmlEnumValue("application/vnd.wap.wmlscriptc")
    APPLICATION_VND_WAP_WMLSCRIPTC("application/vnd.wap.wmlscriptc"),
    @XmlEnumValue("application/vnd.webturbo")
    APPLICATION_VND_WEBTURBO("application/vnd.webturbo"),
    @XmlEnumValue("application/vnd.wordperfect")
    APPLICATION_VND_WORDPERFECT("application/vnd.wordperfect"),
    @XmlEnumValue("application/vnd.wqd")
    APPLICATION_VND_WQD("application/vnd.wqd"),
    @XmlEnumValue("application/vnd.wrq-hp3000-labelled")
    APPLICATION_VND_WRQ_HP_3000_LABELLED("application/vnd.wrq-hp3000-labelled"),
    @XmlEnumValue("application/vnd.wt.stf")
    APPLICATION_VND_WT_STF("application/vnd.wt.stf"),
    @XmlEnumValue("application/vnd.wv.csp+wbxml")
    APPLICATION_VND_WV_CSP_WBXML("application/vnd.wv.csp+wbxml"),
    @XmlEnumValue("application/vnd.wv.csp+xml")
    APPLICATION_VND_WV_CSP_XML("application/vnd.wv.csp+xml"),
    @XmlEnumValue("application/vnd.wv.ssp+xml")
    APPLICATION_VND_WV_SSP_XML("application/vnd.wv.ssp+xml"),
    @XmlEnumValue("application/vnd.xara")
    APPLICATION_VND_XARA("application/vnd.xara"),
    @XmlEnumValue("application/vnd.xfdl")
    APPLICATION_VND_XFDL("application/vnd.xfdl"),
    @XmlEnumValue("application/vnd.yamaha.hv-dic")
    APPLICATION_VND_YAMAHA_HV_DIC("application/vnd.yamaha.hv-dic"),
    @XmlEnumValue("application/vnd.yamaha.hv-script")
    APPLICATION_VND_YAMAHA_HV_SCRIPT("application/vnd.yamaha.hv-script"),
    @XmlEnumValue("application/vnd.yamaha.hv-voice")
    APPLICATION_VND_YAMAHA_HV_VOICE("application/vnd.yamaha.hv-voice"),
    @XmlEnumValue("application/vnd.yamaha.smaf-audio")
    APPLICATION_VND_YAMAHA_SMAF_AUDIO("application/vnd.yamaha.smaf-audio"),
    @XmlEnumValue("application/vnd.yamaha.smaf-phrase")
    APPLICATION_VND_YAMAHA_SMAF_PHRASE("application/vnd.yamaha.smaf-phrase"),
    @XmlEnumValue("application/vnd.yellowriver-custom-menu")
    APPLICATION_VND_YELLOWRIVER_CUSTOM_MENU("application/vnd.yellowriver-custom-menu"),
    @XmlEnumValue("application/watcherinfo+xml")
    APPLICATION_WATCHERINFO_XML("application/watcherinfo+xml"),
    @XmlEnumValue("application/whoispp-query")
    APPLICATION_WHOISPP_QUERY("application/whoispp-query"),
    @XmlEnumValue("application/whoispp-response")
    APPLICATION_WHOISPP_RESPONSE("application/whoispp-response"),
    @XmlEnumValue("application/wita")
    APPLICATION_WITA("application/wita"),
    @XmlEnumValue("application/wordperfect5.1")
    APPLICATION_WORDPERFECT_5_1("application/wordperfect5.1"),
    @XmlEnumValue("application/x400-bp")
    APPLICATION_X_400_BP("application/x400-bp"),
    @XmlEnumValue("application/xhtml+xml")
    APPLICATION_XHTML_XML("application/xhtml+xml"),
    @XmlEnumValue("application/xml")
    APPLICATION_XML("application/xml"),
    @XmlEnumValue("application/xml-dtd")
    APPLICATION_XML_DTD("application/xml-dtd"),
    @XmlEnumValue("application/xml-external-parsed-entity")
    APPLICATION_XML_EXTERNAL_PARSED_ENTITY("application/xml-external-parsed-entity"),
    @XmlEnumValue("application/xmpp+xml")
    APPLICATION_XMPP_XML("application/xmpp+xml"),
    @XmlEnumValue("application/xop+xml")
    APPLICATION_XOP_XML("application/xop+xml"),
    @XmlEnumValue("application/zip")
    APPLICATION_ZIP("application/zip"),
    @XmlEnumValue("audio/32kadpcm")
    AUDIO_32_KADPCM("audio/32kadpcm"),
    @XmlEnumValue("audio/3gpp")
    AUDIO_3_GPP("audio/3gpp"),
    @XmlEnumValue("audio/AMR")
    AUDIO_AMR("audio/AMR"),
    @XmlEnumValue("audio/AMR-WB")
    AUDIO_AMR_WB("audio/AMR-WB"),
    @XmlEnumValue("audio/BV16")
    AUDIO_BV_16("audio/BV16"),
    @XmlEnumValue("audio/BV32")
    AUDIO_BV_32("audio/BV32"),
    @XmlEnumValue("audio/CN")
    AUDIO_CN("audio/CN"),
    @XmlEnumValue("audio/DAT12")
    AUDIO_DAT_12("audio/DAT12"),
    @XmlEnumValue("audio/DVI4")
    AUDIO_DVI_4("audio/DVI4"),
    @XmlEnumValue("audio/EVRC")
    AUDIO_EVRC("audio/EVRC"),
    @XmlEnumValue("audio/EVRC-QCP")
    AUDIO_EVRC_QCP("audio/EVRC-QCP"),
    @XmlEnumValue("audio/EVRC0")
    AUDIO_EVRC_0("audio/EVRC0"),
    @XmlEnumValue("audio/G.722.1")
    AUDIO_G_722_1("audio/G.722.1"),
    @XmlEnumValue("audio/G722")
    AUDIO_G_722("audio/G722"),
    @XmlEnumValue("audio/G723")
    AUDIO_G_723("audio/G723"),
    @XmlEnumValue("audio/G726-16")
    AUDIO_G_726_16("audio/G726-16"),
    @XmlEnumValue("audio/G726-24")
    AUDIO_G_726_24("audio/G726-24"),
    @XmlEnumValue("audio/G726-32")
    AUDIO_G_726_32("audio/G726-32"),
    @XmlEnumValue("audio/G726-40")
    AUDIO_G_726_40("audio/G726-40"),
    @XmlEnumValue("audio/G728")
    AUDIO_G_728("audio/G728"),
    @XmlEnumValue("audio/G729")
    AUDIO_G_729("audio/G729"),
    @XmlEnumValue("audio/G729D")
    AUDIO_G_729_D("audio/G729D"),
    @XmlEnumValue("audio/G729E")
    AUDIO_G_729_E("audio/G729E"),
    @XmlEnumValue("audio/GSM")
    AUDIO_GSM("audio/GSM"),
    @XmlEnumValue("audio/GSM-EFR")
    AUDIO_GSM_EFR("audio/GSM-EFR"),
    @XmlEnumValue("audio/L16")
    AUDIO_L_16("audio/L16"),
    @XmlEnumValue("audio/L20")
    AUDIO_L_20("audio/L20"),
    @XmlEnumValue("audio/L24")
    AUDIO_L_24("audio/L24"),
    @XmlEnumValue("audio/L8")
    AUDIO_L_8("audio/L8"),
    @XmlEnumValue("audio/LPC")
    AUDIO_LPC("audio/LPC"),
    @XmlEnumValue("audio/MP4A-LATM")
    AUDIO_MP_4_A_LATM("audio/MP4A-LATM"),
    @XmlEnumValue("audio/MPA")
    AUDIO_MPA("audio/MPA"),
    @XmlEnumValue("audio/PCMA")
    AUDIO_PCMA("audio/PCMA"),
    @XmlEnumValue("audio/PCMU")
    AUDIO_PCMU("audio/PCMU"),
    @XmlEnumValue("audio/QCELP")
    AUDIO_QCELP("audio/QCELP"),
    @XmlEnumValue("audio/RED")
    AUDIO_RED("audio/RED"),
    @XmlEnumValue("audio/SMV")
    AUDIO_SMV("audio/SMV"),
    @XmlEnumValue("audio/SMV-QCP")
    AUDIO_SMV_QCP("audio/SMV-QCP"),
    @XmlEnumValue("audio/SMV0")
    AUDIO_SMV_0("audio/SMV0"),
    @XmlEnumValue("audio/VDVI")
    AUDIO_VDVI("audio/VDVI"),
    @XmlEnumValue("audio/basic")
    AUDIO_BASIC("audio/basic"),
    @XmlEnumValue("audio/clearmode")
    AUDIO_CLEARMODE("audio/clearmode"),
    @XmlEnumValue("audio/dsr-es201108")
    AUDIO_DSR_ES_201108("audio/dsr-es201108"),
    @XmlEnumValue("audio/dsr-es202050")
    AUDIO_DSR_ES_202050("audio/dsr-es202050"),
    @XmlEnumValue("audio/dsr-es202211")
    AUDIO_DSR_ES_202211("audio/dsr-es202211"),
    @XmlEnumValue("audio/dsr-es202212")
    AUDIO_DSR_ES_202212("audio/dsr-es202212"),
    @XmlEnumValue("audio/iLBC")
    AUDIO_I_LBC("audio/iLBC"),
    @XmlEnumValue("audio/mpa-robust")
    AUDIO_MPA_ROBUST("audio/mpa-robust"),
    @XmlEnumValue("audio/mpeg")
    AUDIO_MPEG("audio/mpeg"),
    @XmlEnumValue("audio/mpeg4-generic")
    AUDIO_MPEG_4_GENERIC("audio/mpeg4-generic"),
    @XmlEnumValue("audio/parityfec")
    AUDIO_PARITYFEC("audio/parityfec"),
    @XmlEnumValue("audio/prs.sid")
    AUDIO_PRS_SID("audio/prs.sid"),
    @XmlEnumValue("audio/telephone-event")
    AUDIO_TELEPHONE_EVENT("audio/telephone-event"),
    @XmlEnumValue("audio/tone")
    AUDIO_TONE("audio/tone"),
    @XmlEnumValue("audio/vnd.3gpp.iufp")
    AUDIO_VND_3_GPP_IUFP("audio/vnd.3gpp.iufp"),
    @XmlEnumValue("audio/vnd.audiokoz")
    AUDIO_VND_AUDIOKOZ("audio/vnd.audiokoz"),
    @XmlEnumValue("audio/vnd.cisco.nse")
    AUDIO_VND_CISCO_NSE("audio/vnd.cisco.nse"),
    @XmlEnumValue("audio/vnd.cns.anp1")
    AUDIO_VND_CNS_ANP_1("audio/vnd.cns.anp1"),
    @XmlEnumValue("audio/vnd.cns.inf1")
    AUDIO_VND_CNS_INF_1("audio/vnd.cns.inf1"),
    @XmlEnumValue("audio/vnd.digital-winds")
    AUDIO_VND_DIGITAL_WINDS("audio/vnd.digital-winds"),
    @XmlEnumValue("audio/vnd.everad.plj")
    AUDIO_VND_EVERAD_PLJ("audio/vnd.everad.plj"),
    @XmlEnumValue("audio/vnd.lucent.voice")
    AUDIO_VND_LUCENT_VOICE("audio/vnd.lucent.voice"),
    @XmlEnumValue("audio/vnd.nokia.mobile-xmf")
    AUDIO_VND_NOKIA_MOBILE_XMF("audio/vnd.nokia.mobile-xmf"),
    @XmlEnumValue("audio/vnd.nortel.vbk")
    AUDIO_VND_NORTEL_VBK("audio/vnd.nortel.vbk"),
    @XmlEnumValue("audio/vnd.nuera.ecelp4800")
    AUDIO_VND_NUERA_ECELP_4800("audio/vnd.nuera.ecelp4800"),
    @XmlEnumValue("audio/vnd.nuera.ecelp7470")
    AUDIO_VND_NUERA_ECELP_7470("audio/vnd.nuera.ecelp7470"),
    @XmlEnumValue("audio/vnd.nuera.ecelp9600")
    AUDIO_VND_NUERA_ECELP_9600("audio/vnd.nuera.ecelp9600"),
    @XmlEnumValue("audio/vnd.octel.sbc")
    AUDIO_VND_OCTEL_SBC("audio/vnd.octel.sbc"),
    @XmlEnumValue("audio/vnd.qcelp")
    AUDIO_VND_QCELP("audio/vnd.qcelp"),
    @XmlEnumValue("audio/vnd.rhetorex.32kadpcm")
    AUDIO_VND_RHETOREX_32_KADPCM("audio/vnd.rhetorex.32kadpcm"),
    @XmlEnumValue("audio/vnd.sealedmedia.softseal.mpeg")
    AUDIO_VND_SEALEDMEDIA_SOFTSEAL_MPEG("audio/vnd.sealedmedia.softseal.mpeg"),
    @XmlEnumValue("audio/vnd.vmx.cvsd")
    AUDIO_VND_VMX_CVSD("audio/vnd.vmx.cvsd"),
    @XmlEnumValue("image/cgm")
    IMAGE_CGM("image/cgm"),
    @XmlEnumValue("image/fits")
    IMAGE_FITS("image/fits"),
    @XmlEnumValue("image/g3fax")
    IMAGE_G_3_FAX("image/g3fax"),
    @XmlEnumValue("image/gif")
    IMAGE_GIF("image/gif"),
    @XmlEnumValue("image/ief")
    IMAGE_IEF("image/ief"),
    @XmlEnumValue("image/jp2")
    IMAGE_JP_2("image/jp2"),
    @XmlEnumValue("image/jpeg")
    IMAGE_JPEG("image/jpeg"),
    @XmlEnumValue("image/jpm")
    IMAGE_JPM("image/jpm"),
    @XmlEnumValue("image/jpx")
    IMAGE_JPX("image/jpx"),
    @XmlEnumValue("image/naplps")
    IMAGE_NAPLPS("image/naplps"),
    @XmlEnumValue("image/png")
    IMAGE_PNG("image/png"),
    @XmlEnumValue("image/prs.btif")
    IMAGE_PRS_BTIF("image/prs.btif"),
    @XmlEnumValue("image/prs.pti")
    IMAGE_PRS_PTI("image/prs.pti"),
    @XmlEnumValue("image/t38")
    IMAGE_T_38("image/t38"),
    @XmlEnumValue("image/tiff")
    IMAGE_TIFF("image/tiff"),
    @XmlEnumValue("image/tiff-fx")
    IMAGE_TIFF_FX("image/tiff-fx"),
    @XmlEnumValue("image/vnd.cns.inf2")
    IMAGE_VND_CNS_INF_2("image/vnd.cns.inf2"),
    @XmlEnumValue("image/vnd.djvu")
    IMAGE_VND_DJVU("image/vnd.djvu"),
    @XmlEnumValue("image/vnd.dwg")
    IMAGE_VND_DWG("image/vnd.dwg"),
    @XmlEnumValue("image/vnd.dxf")
    IMAGE_VND_DXF("image/vnd.dxf"),
    @XmlEnumValue("image/vnd.fastbidsheet")
    IMAGE_VND_FASTBIDSHEET("image/vnd.fastbidsheet"),
    @XmlEnumValue("image/vnd.fpx")
    IMAGE_VND_FPX("image/vnd.fpx"),
    @XmlEnumValue("image/vnd.fst")
    IMAGE_VND_FST("image/vnd.fst"),
    @XmlEnumValue("image/vnd.fujixerox.edmics-mmr")
    IMAGE_VND_FUJIXEROX_EDMICS_MMR("image/vnd.fujixerox.edmics-mmr"),
    @XmlEnumValue("image/vnd.fujixerox.edmics-rlc")
    IMAGE_VND_FUJIXEROX_EDMICS_RLC("image/vnd.fujixerox.edmics-rlc"),
    @XmlEnumValue("image/vnd.globalgraphics.pgb")
    IMAGE_VND_GLOBALGRAPHICS_PGB("image/vnd.globalgraphics.pgb"),
    @XmlEnumValue("image/vnd.microsoft.icon")
    IMAGE_VND_MICROSOFT_ICON("image/vnd.microsoft.icon"),
    @XmlEnumValue("image/vnd.mix")
    IMAGE_VND_MIX("image/vnd.mix"),
    @XmlEnumValue("image/vnd.ms-modi")
    IMAGE_VND_MS_MODI("image/vnd.ms-modi"),
    @XmlEnumValue("image/vnd.net-fpx")
    IMAGE_VND_NET_FPX("image/vnd.net-fpx"),
    @XmlEnumValue("image/vnd.sealed.png")
    IMAGE_VND_SEALED_PNG("image/vnd.sealed.png"),
    @XmlEnumValue("image/vnd.sealedmedia.softseal.gif")
    IMAGE_VND_SEALEDMEDIA_SOFTSEAL_GIF("image/vnd.sealedmedia.softseal.gif"),
    @XmlEnumValue("image/vnd.sealedmedia.softseal.jpg")
    IMAGE_VND_SEALEDMEDIA_SOFTSEAL_JPG("image/vnd.sealedmedia.softseal.jpg"),
    @XmlEnumValue("image/vnd.svf")
    IMAGE_VND_SVF("image/vnd.svf"),
    @XmlEnumValue("image/vnd.wap.wbmp")
    IMAGE_VND_WAP_WBMP("image/vnd.wap.wbmp"),
    @XmlEnumValue("image/vnd.xiff")
    IMAGE_VND_XIFF("image/vnd.xiff"),
    @XmlEnumValue("message/CPIM")
    MESSAGE_CPIM("message/CPIM"),
    @XmlEnumValue("message/delivery-status")
    MESSAGE_DELIVERY_STATUS("message/delivery-status"),
    @XmlEnumValue("message/disposition-notification")
    MESSAGE_DISPOSITION_NOTIFICATION("message/disposition-notification"),
    @XmlEnumValue("message/external-body")
    MESSAGE_EXTERNAL_BODY("message/external-body"),
    @XmlEnumValue("message/http")
    MESSAGE_HTTP("message/http"),
    @XmlEnumValue("message/news")
    MESSAGE_NEWS("message/news"),
    @XmlEnumValue("message/partial")
    MESSAGE_PARTIAL("message/partial"),
    @XmlEnumValue("message/rfc822")
    MESSAGE_RFC_822("message/rfc822"),
    @XmlEnumValue("message/s-http")
    MESSAGE_S_HTTP("message/s-http"),
    @XmlEnumValue("message/sip")
    MESSAGE_SIP("message/sip"),
    @XmlEnumValue("message/sipfrag")
    MESSAGE_SIPFRAG("message/sipfrag"),
    @XmlEnumValue("message/tracking-status")
    MESSAGE_TRACKING_STATUS("message/tracking-status"),
    @XmlEnumValue("model/iges")
    MODEL_IGES("model/iges"),
    @XmlEnumValue("model/mesh")
    MODEL_MESH("model/mesh"),
    @XmlEnumValue("model/vnd.dwf")
    MODEL_VND_DWF("model/vnd.dwf"),
    @XmlEnumValue("model/vnd.flatland.3dml")
    MODEL_VND_FLATLAND_3_DML("model/vnd.flatland.3dml"),
    @XmlEnumValue("model/vnd.gdl")
    MODEL_VND_GDL("model/vnd.gdl"),
    @XmlEnumValue("model/vnd.gs-gdl")
    MODEL_VND_GS_GDL("model/vnd.gs-gdl"),
    @XmlEnumValue("model/vnd.gtw")
    MODEL_VND_GTW("model/vnd.gtw"),
    @XmlEnumValue("model/vnd.mts")
    MODEL_VND_MTS("model/vnd.mts"),
    @XmlEnumValue("model/vnd.parasolid.transmit.binary")
    MODEL_VND_PARASOLID_TRANSMIT_BINARY("model/vnd.parasolid.transmit.binary"),
    @XmlEnumValue("model/vnd.parasolid.transmit.text")
    MODEL_VND_PARASOLID_TRANSMIT_TEXT("model/vnd.parasolid.transmit.text"),
    @XmlEnumValue("model/vnd.vtu")
    MODEL_VND_VTU("model/vnd.vtu"),
    @XmlEnumValue("model/vrml")
    MODEL_VRML("model/vrml"),
    @XmlEnumValue("multipart/alternative")
    MULTIPART_ALTERNATIVE("multipart/alternative"),
    @XmlEnumValue("multipart/appledouble")
    MULTIPART_APPLEDOUBLE("multipart/appledouble"),
    @XmlEnumValue("multipart/byteranges")
    MULTIPART_BYTERANGES("multipart/byteranges"),
    @XmlEnumValue("multipart/digest")
    MULTIPART_DIGEST("multipart/digest"),
    @XmlEnumValue("multipart/encrypted")
    MULTIPART_ENCRYPTED("multipart/encrypted"),
    @XmlEnumValue("multipart/form-data")
    MULTIPART_FORM_DATA("multipart/form-data"),
    @XmlEnumValue("multipart/header-set")
    MULTIPART_HEADER_SET("multipart/header-set"),
    @XmlEnumValue("multipart/mixed")
    MULTIPART_MIXED("multipart/mixed"),
    @XmlEnumValue("multipart/parallel")
    MULTIPART_PARALLEL("multipart/parallel"),
    @XmlEnumValue("multipart/related")
    MULTIPART_RELATED("multipart/related"),
    @XmlEnumValue("multipart/report")
    MULTIPART_REPORT("multipart/report"),
    @XmlEnumValue("multipart/signed")
    MULTIPART_SIGNED("multipart/signed"),
    @XmlEnumValue("multipart/voice-message")
    MULTIPART_VOICE_MESSAGE("multipart/voice-message"),
    @XmlEnumValue("text/RED")
    TEXT_RED("text/RED"),
    @XmlEnumValue("text/calendar")
    TEXT_CALENDAR("text/calendar"),
    @XmlEnumValue("text/css")
    TEXT_CSS("text/css"),
    @XmlEnumValue("text/csv")
    TEXT_CSV("text/csv"),
    @XmlEnumValue("text/directory")
    TEXT_DIRECTORY("text/directory"),
    @XmlEnumValue("text/dns")
    TEXT_DNS("text/dns"),
    @XmlEnumValue("text/enriched")
    TEXT_ENRICHED("text/enriched"),
    @XmlEnumValue("text/html")
    TEXT_HTML("text/html"),
    @XmlEnumValue("text/parityfec")
    TEXT_PARITYFEC("text/parityfec"),
    @XmlEnumValue("text/plain")
    TEXT_PLAIN("text/plain"),
    @XmlEnumValue("text/prs.fallenstein.rst")
    TEXT_PRS_FALLENSTEIN_RST("text/prs.fallenstein.rst"),
    @XmlEnumValue("text/prs.lines.tag")
    TEXT_PRS_LINES_TAG("text/prs.lines.tag"),
    @XmlEnumValue("text/rfc822-headers")
    TEXT_RFC_822_HEADERS("text/rfc822-headers"),
    @XmlEnumValue("text/richtext")
    TEXT_RICHTEXT("text/richtext"),
    @XmlEnumValue("text/rtf")
    TEXT_RTF("text/rtf"),
    @XmlEnumValue("text/sgml")
    TEXT_SGML("text/sgml"),
    @XmlEnumValue("text/t140")
    TEXT_T_140("text/t140"),
    @XmlEnumValue("text/tab-separated-values")
    TEXT_TAB_SEPARATED_VALUES("text/tab-separated-values"),
    @XmlEnumValue("text/troff")
    TEXT_TROFF("text/troff"),
    @XmlEnumValue("text/uri-list")
    TEXT_URI_LIST("text/uri-list"),
    @XmlEnumValue("text/vnd.DMClientScript")
    TEXT_VND_DM_CLIENT_SCRIPT("text/vnd.DMClientScript"),
    @XmlEnumValue("text/vnd.IPTC.NITF")
    TEXT_VND_IPTC_NITF("text/vnd.IPTC.NITF"),
    @XmlEnumValue("text/vnd.IPTC.NewsML")
    TEXT_VND_IPTC_NEWS_ML("text/vnd.IPTC.NewsML"),
    @XmlEnumValue("text/vnd.abc")
    TEXT_VND_ABC("text/vnd.abc"),
    @XmlEnumValue("text/vnd.curl")
    TEXT_VND_CURL("text/vnd.curl"),
    @XmlEnumValue("text/vnd.esmertec.theme-descriptor")
    TEXT_VND_ESMERTEC_THEME_DESCRIPTOR("text/vnd.esmertec.theme-descriptor"),
    @XmlEnumValue("text/vnd.fly")
    TEXT_VND_FLY("text/vnd.fly"),
    @XmlEnumValue("text/vnd.fmi.flexstor")
    TEXT_VND_FMI_FLEXSTOR("text/vnd.fmi.flexstor"),
    @XmlEnumValue("text/vnd.in3d.3dml")
    TEXT_VND_IN_3_D_3_DML("text/vnd.in3d.3dml"),
    @XmlEnumValue("text/vnd.in3d.spot")
    TEXT_VND_IN_3_D_SPOT("text/vnd.in3d.spot"),
    @XmlEnumValue("text/vnd.latex-z")
    TEXT_VND_LATEX_Z("text/vnd.latex-z"),
    @XmlEnumValue("text/vnd.motorola.reflex")
    TEXT_VND_MOTOROLA_REFLEX("text/vnd.motorola.reflex"),
    @XmlEnumValue("text/vnd.ms-mediapackage")
    TEXT_VND_MS_MEDIAPACKAGE("text/vnd.ms-mediapackage"),
    @XmlEnumValue("text/vnd.net2phone.commcenter.command")
    TEXT_VND_NET_2_PHONE_COMMCENTER_COMMAND("text/vnd.net2phone.commcenter.command"),
    @XmlEnumValue("text/vnd.sun.j2me.app-descriptor")
    TEXT_VND_SUN_J_2_ME_APP_DESCRIPTOR("text/vnd.sun.j2me.app-descriptor"),
    @XmlEnumValue("text/vnd.wap.si")
    TEXT_VND_WAP_SI("text/vnd.wap.si"),
    @XmlEnumValue("text/vnd.wap.sl")
    TEXT_VND_WAP_SL("text/vnd.wap.sl"),
    @XmlEnumValue("text/vnd.wap.wml")
    TEXT_VND_WAP_WML("text/vnd.wap.wml"),
    @XmlEnumValue("text/vnd.wap.wmlscript")
    TEXT_VND_WAP_WMLSCRIPT("text/vnd.wap.wmlscript"),
    @XmlEnumValue("text/xml")
    TEXT_XML("text/xml"),
    @XmlEnumValue("text/xml-external-parsed-entity")
    TEXT_XML_EXTERNAL_PARSED_ENTITY("text/xml-external-parsed-entity"),
    @XmlEnumValue("video/3gpp")
    VIDEO_3_GPP("video/3gpp"),
    @XmlEnumValue("video/BMPEG")
    VIDEO_BMPEG("video/BMPEG"),
    @XmlEnumValue("video/BT656")
    VIDEO_BT_656("video/BT656"),
    @XmlEnumValue("video/CelB")
    VIDEO_CEL_B("video/CelB"),
    @XmlEnumValue("video/DV")
    VIDEO_DV("video/DV"),
    @XmlEnumValue("video/H261")
    VIDEO_H_261("video/H261"),
    @XmlEnumValue("video/H263")
    VIDEO_H_263("video/H263"),
    @XmlEnumValue("video/H263-1998")
    VIDEO_H_263_1998("video/H263-1998"),
    @XmlEnumValue("video/H263-2000")
    VIDEO_H_263_2000("video/H263-2000"),
    @XmlEnumValue("video/H264")
    VIDEO_H_264("video/H264"),
    @XmlEnumValue("video/JPEG")
    VIDEO_JPEG("video/JPEG"),
    @XmlEnumValue("video/MJ2")
    VIDEO_MJ_2("video/MJ2"),
    @XmlEnumValue("video/MP1S")
    VIDEO_MP_1_S("video/MP1S"),
    @XmlEnumValue("video/MP2P")
    VIDEO_MP_2_P("video/MP2P"),
    @XmlEnumValue("video/MP2T")
    VIDEO_MP_2_T("video/MP2T"),
    @XmlEnumValue("video/MP4V-ES")
    VIDEO_MP_4_V_ES("video/MP4V-ES"),
    @XmlEnumValue("video/MPV")
    VIDEO_MPV("video/MPV"),
    @XmlEnumValue("video/SMPTE292M")
    VIDEO_SMPTE_292_M("video/SMPTE292M"),
    @XmlEnumValue("video/mpeg")
    VIDEO_MPEG("video/mpeg"),
    @XmlEnumValue("video/mpeg4-generic")
    VIDEO_MPEG_4_GENERIC("video/mpeg4-generic"),
    @XmlEnumValue("video/nv")
    VIDEO_NV("video/nv"),
    @XmlEnumValue("video/parityfec")
    VIDEO_PARITYFEC("video/parityfec"),
    @XmlEnumValue("video/pointer")
    VIDEO_POINTER("video/pointer"),
    @XmlEnumValue("video/quicktime")
    VIDEO_QUICKTIME("video/quicktime"),
    @XmlEnumValue("video/raw")
    VIDEO_RAW("video/raw"),
    @XmlEnumValue("video/vnd.fvt")
    VIDEO_VND_FVT("video/vnd.fvt"),
    @XmlEnumValue("video/vnd.motorola.video")
    VIDEO_VND_MOTOROLA_VIDEO("video/vnd.motorola.video"),
    @XmlEnumValue("video/vnd.motorola.videop")
    VIDEO_VND_MOTOROLA_VIDEOP("video/vnd.motorola.videop"),
    @XmlEnumValue("video/vnd.mpegurl")
    VIDEO_VND_MPEGURL("video/vnd.mpegurl"),
    @XmlEnumValue("video/vnd.nokia.interleaved-multimedia")
    VIDEO_VND_NOKIA_INTERLEAVED_MULTIMEDIA("video/vnd.nokia.interleaved-multimedia"),
    @XmlEnumValue("video/vnd.objectvideo")
    VIDEO_VND_OBJECTVIDEO("video/vnd.objectvideo"),
    @XmlEnumValue("video/vnd.sealed.mpeg1")
    VIDEO_VND_SEALED_MPEG_1("video/vnd.sealed.mpeg1"),
    @XmlEnumValue("video/vnd.sealed.mpeg4")
    VIDEO_VND_SEALED_MPEG_4("video/vnd.sealed.mpeg4"),
    @XmlEnumValue("video/vnd.sealed.swf")
    VIDEO_VND_SEALED_SWF("video/vnd.sealed.swf"),
    @XmlEnumValue("video/vnd.sealedmedia.softseal.mov")
    VIDEO_VND_SEALEDMEDIA_SOFTSEAL_MOV("video/vnd.sealedmedia.softseal.mov"),
    @XmlEnumValue("video/vnd.vivo")
    VIDEO_VND_VIVO("video/vnd.vivo");
    private final String value;

    BinaryObjectMimeCodeContentType(String v) {
        value = v;
    }

    public static BinaryObjectMimeCodeContentType fromValue(String v) {
        for (BinaryObjectMimeCodeContentType c : BinaryObjectMimeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
