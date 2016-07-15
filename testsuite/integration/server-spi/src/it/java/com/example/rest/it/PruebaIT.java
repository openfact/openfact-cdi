package com.example.rest.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.as.process.Main;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.resources.HelloWorldEndpoint;
import org.openfact.resources.RestApplication;
import org.openfact.services.MyService;
import org.wildfly.swarm.spi.api.JARArchive;

@RunWith(Arquillian.class)
public class PruebaIT {

    @Inject
    private MyService service;

    @Test
    public void testMyComponent() {
        service.getMessage();
        assertTrue("Hola carlos".equals(service.getMessage()));
    }

    @Deployment
    public static Archive createDeployment() {
        JARArchive archive = ShrinkWrap.create(JARArchive.class);

        archive.addClass(Main.class);
        archive.addClass(MyService.class);
        archive.addClass(HelloWorldEndpoint.class);
        archive.addClass(RestApplication.class);
        archive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        return archive;
    }

}