package org.openfact.test;

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
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.openfact.models.Model;
import org.openfact.models.jpa.JpaModel;
import org.openfact.resources.HelloWorldEndpoint;
import org.openfact.resources.RestApplication;
import org.openfact.services.MyService;
import org.wildfly.swarm.spi.api.JARArchive;

@RunWith(Arquillian.class)
public class EmisorProviderTest {

    @Inject
    private EmisorProvider emisores;

    @Test
    public void testMyComponent() {
        EmisorModel model = emisores.create("PE", "1046779354", "Sistcoop S.A.C.");
        assertTrue(model.getEstado());
    }

    @Deployment
    public static Archive createDeployment() {
        JARArchive archive = ShrinkWrap.create(JARArchive.class);

        archive.addClass(Main.class);
        archive.addClass(MyService.class);
        archive.addClass(HelloWorldEndpoint.class);
        archive.addClass(RestApplication.class);
        
        archive.addPackages(true, Model.class.getPackage());
        archive.addPackages(true, JpaModel.class.getPackage());
        
        archive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");

        return archive;
    }

}
