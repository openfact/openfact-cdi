package com.example.rest;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/hello")
@Stateless
public class HelloWorldEndpoint {

    @Inject
    private EmployeeService service;

    @Inject
    private EmisorProvider emisores;

    @GET
    @Produces("text/plain")
    public Response doGet() {
        EmisorModel model = emisores.create("PE", "40467793549", "Sistcoop S.A.C.");
        return Response
                .ok(model.getId() + " " + model.getEstado() + service.findAll() + "Hello from WildFly Swarm!")
                .build();
    }

}