package org.openfact.services.resources.admin;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.jboss.ejb3.annotation.SecurityDomain;
import org.openfact.models.DireccionRegionalModel;
import org.openfact.models.DireccionRegionalProvider;
import org.openfact.models.utils.ModelToRepresentation;
import org.openfact.representations.idm.DireccionRegionalRepresentation;
import org.openfact.services.managers.DireccionRegionalManager;

//@SecurityDomain(Config.KEYCLOAK_SECURITY_DOMAIN)
@Stateless
public class DireccionRegionalResourceImpl implements DireccionRegionalResource {

    //@PathParam("idDireccionRegional")
    private String idDireccionRegional;

    @Inject
    private DireccionRegionalManager direccionRegionalManager;

    @Inject
    private DireccionRegionalProvider direccionRegionalProvider;

    //@Inject
    //private ProyectosResource_direccionRegional proyectosResource;

    //@Inject
    //private TrabajadoresResource_direccionRegional trabajadoresResource;

    private DireccionRegionalModel getDireccionRegionalModel() {
        return direccionRegionalProvider.findById(idDireccionRegional);
    }

    //@RolesAllowed(value = { Roles.ver_direcciones_regionales })
    @Override
    public DireccionRegionalRepresentation toRepresentation() {
        DireccionRegionalRepresentation rep = ModelToRepresentation
                .toRepresentation(getDireccionRegionalModel());
        if (rep != null) {
            return rep;
        } else {
            throw new NotFoundException("Direccion regional no encontrada");
        }
    }

    //@RolesAllowed(value = { Roles.administrar_direcciones_regionales })
    @Override
    public void update(DireccionRegionalRepresentation rep) {
        direccionRegionalManager.update(getDireccionRegionalModel(), rep);
    }

    //@RolesAllowed(value = { Roles.eliminar_direcciones_regionales })
    @Override
    public Response enable() {
        /*DireccionRegionalModel direccionRegional = getDireccionRegionalModel();

        boolean result = direccionRegionalManager.enable(direccionRegional);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Caja no pudo ser desactivada", Response.Status.BAD_REQUEST);
        }*/
        return null;
    }

    //@RolesAllowed(value = { Roles.eliminar_direcciones_regionales })
    @Override
    public Response disable() {
        /*DireccionRegionalModel direccionRegional = getDireccionRegionalModel();

        boolean result = direccionRegionalManager.disable(direccionRegional);
        if (result) {
            return Response.noContent().build();
        } else {
            return ErrorResponse.error("Caja no pudo ser desactivada", Response.Status.BAD_REQUEST);
        }*/
        return null;
    }

    /*@PermitAll
    @Override
    public ProyectosResource_direccionRegional proyectos() {
        return proyectosResource;
    }

    @PermitAll
    @Override
    public TrabajadoresResource_direccionRegional trabajadores() {
        return trabajadoresResource;
    }*/

}
