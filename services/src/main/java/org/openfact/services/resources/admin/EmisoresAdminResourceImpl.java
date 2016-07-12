package org.openfact.services.resources.admin;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.ForbiddenException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.ModelDuplicateException;
import org.openfact.models.OpenfactSession;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.EmisorRepresentation;
import org.openfact.services.ErrorResponse;
import org.openfact.services.managers.EmisorManager;

@Stateless
public class EmisoresAdminResourceImpl implements EmisoresAdminResource {

    @Context
    private UriInfo uriInfo;
    
    @Inject
    private AdminAuth auth;
    
    @Inject
    private EmisorManager emisorManager;

    @Inject
    private OpenfactSession session;
    
    @Inject
    private EmisorAdminResource emisorResource;


    @Inject
    private RepresentationToModel representationToModel;

    @Override
    public EmisorAdminResource emisor(String idEmisor) {
        return emisorResource;
    }

    @Override
    public Response create(EmisorRepresentation rep) {
        try {
            EmisorModel model = representationToModel.createEmisor(rep, session.emisores());
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
                    .header("Access-Control-Expose-Headers", "Location")
                    .entity(ModelToRepresentation.toRepresentation(model)).build();
        } catch (ModelDuplicateException e) {
            return ErrorResponse.exists("Emisor ya registrado");
        }
    }

    @Override
    public List<EmisorRepresentation> getAll() {
        List<EmisorRepresentation> result = new ArrayList<>();
        if (auth.getEmisor().equals(emisorManager.getOpenfactAdminstrationEmisor())) {
            List<EmisorModel> models = session.emisores().getAll();
            models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
        } else {
            addRealmRep(result,auth.getEmisor());
        }     
        
        if (result.isEmpty()) {
            throw new ForbiddenException();
        }
        
        return result;
    }

    private void addRealmRep(List<EmisorRepresentation> result, EmisorModel emisor) {
        /*if (auth.hasAppRole(realmManagementClient, AdminRoles.VIEW_REALM)) {
            reps.add(ModelToRepresentation.toRepresentation(realm, false));
        } else if (auth.hasOneOfAppRole(realmManagementClient, AdminRoles.ALL_REALM_ROLES)) {
            RealmRepresentation rep = new RealmRepresentation();
            rep.setRealm(realm.getName());
            reps.add(rep);
        }*/
    }

}
