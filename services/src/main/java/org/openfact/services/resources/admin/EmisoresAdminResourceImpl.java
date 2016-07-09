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
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class EmisoresAdminResourceImpl implements EmisoresAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;

    @Inject
    private EmisorAdminResource emisorResource;

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private RepresentationToModel representationToModel;

    @Override
    public EmisorAdminResource emisor(String idEmisor) {
        return emisorResource;
    }

    @Inject
    public EmisoresAdminResourceImpl(AppAuthManager authManager) {
        this.authManager = authManager;
    }

    @Override
    public Response create(EmisorRepresentation rep) {
        try {
            EmisorModel model = representationToModel.createEmisor(rep, emisorProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
                    .header("Access-Control-Expose-Headers", "Location")
                    .entity(ModelToRepresentation.toRepresentation(model)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Emisor ya registrado");
        }
    }

    @Override
    public List<EmisorRepresentation> getAll() {
        List<EmisorModel> models = emisorProvider.getAll();
        List<EmisorRepresentation> result = new ArrayList<>();
        models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
        return result;
    }

}
