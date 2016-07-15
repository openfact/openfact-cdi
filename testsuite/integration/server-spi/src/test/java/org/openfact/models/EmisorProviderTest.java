package org.openfact.models;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.as.process.Main;
import org.jboss.logging.Logger;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.models.jpa.JpaEmisorProvider;
import org.openfact.resources.HelloWorldEndpoint;
import org.openfact.resources.RestApplication;
import org.openfact.services.MyService;
import org.wildfly.swarm.spi.api.JARArchive;
import org.wildfly.swarm.undertow.WARArchive;

@RunWith(Arquillian.class)
public class EmisorProviderTest {

    private static final Logger LOGGER = Logger.getLogger(EmisorProviderTest.class);

    @Inject
    private EmisorProvider service;

    @Test
    public void testMyComponent() {
        EmisorModel model = service.create("PE", "4234", "dasdas");
        assertTrue(model.getEstado());
        assertTrue(true);
    }

    @Deployment
    public static Archive createDeployment() {
        WARArchive archive = ShrinkWrap.create(WARArchive.class);
        
        archive.addPackages(true, "org.openfact");
        archive.addPackages(true, "org.openfact.models");
        archive.addPackages(true, "org.openfact.models.jpa");
        archive.addPackages(true, "org.openfact.models.jpa.entities");
        archive.addPackages(true, "org.openfact.models.jpa.search");
        archive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        archive.addAsResource("META-INF/test-persistence.xml", "META-INF/persistence.xml");
        
        return archive;
    }

}
