package org.openfact.models.utils;

import org.openfact.models.EmisorModel;
import org.openfact.representations.idm.EmisorRepresentation;

/**
 * Helper interface used just because EmisorManager is in openfact-services and
 * not accessible for ImportUtils
 */
public interface EmisorImporter {

    EmisorModel importEmisor(EmisorRepresentation rep);
}
