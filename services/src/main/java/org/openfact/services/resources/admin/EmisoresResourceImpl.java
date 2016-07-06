package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.services.ErrorResponse;

@Stateless
public class EmisoresResourceImpl implements EmisoresResource {

    @Context
    private UriInfo uriInfo;

    @Inject
    private EmisorResource emisorResource;

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private RepresentationToModel representationToModel;

    @Override
    public EmisorResource emisor(String idEmisor) {
        return emisorResource;
    }

    public Response create(EmisorRepresentation rep) {
        try {
            EmisorModel model = representationToModel.createEmisor(rep, emisorProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
                    .header("Access-Control-Expose-Headers", "Location")
                    .entity(ModelToRepresentation.toRepresentation(model)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("DireccionRegional existe con la misma denominacion");
        }
    }

    public List<EmisorRepresentation> getAll() {
        List<EmisorModel> models = emisorProvider.getAll();
        List<EmisorRepresentation> result = new ArrayList<>();
        models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
        return result;
    }

}
