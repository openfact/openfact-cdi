package com.example.rest.it;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;
import org.wildfly.swarm.undertow.WARArchive;

import com.example.rest.util.Calculadora;
import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;

@RunWith(Arquillian.class)
public class CalculadoraIT {

    @Inject
    private EmisorProvider emisores;
    
    /*@Deployment
    public static WARArchive createDeployment() throws Exception {
        WARArchive deployment = ShrinkWrap.create(WARArchive.class);
        deployment.addAllDependencies();
        return deployment;
    }*/

    @Test
    public void testSuma() throws Exception {
        int result = Calculadora.sumar(1, 2);
        assertEquals(result, 3);
        assertEquals(true, true);      
    }
    
    @Test
    public void create() {
        EmisorModel model = emisores.create("PE", "123456", "Sistcoop S.A.C.");
        assertEquals(model.getEstado(), true);
    }

}