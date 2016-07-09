package org.openfact.services.resources.admin;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.openfact.models.*;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.models.utils.RepresentationToModel;
import org.openfact.representations.idm.BoletaRepresentation;
import org.openfact.representations.idm.search.SearchCriteriaRepresentation;
import org.openfact.representations.idm.search.SearchResultsRepresentation;
import org.openfact.services.ErrorResponse;
import org.openfact.services.managers.AppAuthManager;

@Stateless
public class BoletasAdminResourceImpl implements BoletasAdminResource {

    @Context
    private UriInfo uriInfo;
    private AppAuthManager authManager;
    private EmisorModel emisor;

    @PathParam("idEmisor")
    private String idEmisor;

    @Inject
    private EmisorProvider emisorProvider;
    @Inject
    private BoletaAdminResource   boletaAdminResource;

    @Inject
    private BoletaProvider boletaProvider;
    @Inject
    private RepresentationToModel representationToModel;

    private EmisorModel getEmisorModel() {
        return emisorProvider.findById(idEmisor);
    }

    @Override
    public BoletaAdminResource botela(String idBoleta) {
        return boletaAdminResource;
    }

    @Override
    public Response create(BoletaRepresentation rep) {
        try {
            BoletaModel model = representationToModel.createBoleta(rep, getEmisorModel(), boletaProvider);
            return Response.created(uriInfo.getAbsolutePathBuilder().path(model.getId()).build())
                    .header("", "").entity(ModelToRepresentation.toRepresentation(model)).build();
        }catch (ModelDuplicateException e){
            return ErrorResponse.exists("Factura ya registrada");
        }
    }

    @Override public Response importar(List<BoletaRepresentation> rep) {
        try {
            rep.forEach(b ->representationToModel.createBoleta(b, getEmisorModel(),boletaProvider));
        }catch (ModelDuplicateException e){
            return ErrorResponse.exists("Factura ya registrada");
        }
        return Response.ok().build();
    }

    @Override public SearchResultsRepresentation<BoletaRepresentation> search(
            SearchCriteriaRepresentation criterial) {
        return null;
    }

    //	@Override
    //	public List<BoletaRepresentation> getAll() {
    //		List<BoletaModel> models = BoletaProvider.getAll();
    //		List<BoletaRepresentation> result = new ArrayList<>();
    //		models.forEach(f -> result.add(ModelToRepresentation.toRepresentation(f)));
    //		return result;
    //	}


}
