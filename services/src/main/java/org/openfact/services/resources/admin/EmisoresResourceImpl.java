package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.PermitAll;
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

@Stateless
public class EmisoresResourceImpl implements EmisoresResource {

    @Inject
    private EmisorProvider emisorProvider;

    @Inject
    private RepresentationToModel representationToModel;

    @Context
    private UriInfo uriInfo;

    @Inject
    private EmisorResource emisorResource;

    @Override
    public EmisorResource emisor(String idEmisor) {
        return emisorResource;
    }

    @Override
    public Response create(EmisorRepresentation rep) {
        // TODO Auto-generated method stub
        if (emisorProvider.findByRuc(rep.getRuc()) != null) {
            return null; // ErrorResponse.exists("Emisor con el ruc ingresado ya
                         // existente");
        }

        try {
            EmisorModel emisorModel = representationToModel.createEmisor(rep, emisorProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(emisorModel.getRuc()).build())
                    .header("Access-Control-Expose-Headers", "Location")
                    .entity(ModelToRepresentation.toRepresentation(emisorModel)).build();
        } catch (ModelDuplicateException e) {
            return null;// ErrorResponse.exists("DireccionRegional existe con la
                        // misma denominacion");
        }
    }

    @Override
    public List<EmisorRepresentation> getAll() {
        List<EmisorModel> models = emisorProvider.getAll();
        List<EmisorRepresentation> result = new ArrayList<>();
        for (EmisorModel model : models) {
            result.add(ModelToRepresentation.toRepresentation(model));
        }
        return result;
    }

}
