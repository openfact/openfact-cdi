package com.example.rest.util.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.models.EmisorModel;
import org.openfact.models.EmisorProvider;

import com.example.rest.util.Calculadora;
import static org.junit.Assert.assertEquals;

import javax.ejb.EJB;
import javax.inject.Inject;

import org.jboss.arquillian.junit.Arquillian;

@RunWith(Arquillian.class)
public class CalculadoraTest {

    /*@EJB
    private EmisorProvider emisores;*/
    
    //@Deployment
    //public static Archive createDeployment() {
        //JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        //deployment.addResource(RestApplication.class);
        //deployment.addResource(HelloWorldEndpoint.class);
        //deployment.addResource(Calculadora.class);
        //return deployment;
    //    return null;
    //}

    @Test
    public void testSuma() throws Exception {
        int result = Calculadora.sumar(1, 2);
        assertEquals(result, 3);
        assertEquals(true, true);
        //assertEquals(provider, null);       
    }
    
    /*@Test
    public void create() {
        EmisorModel model = emisores.create("PE", "10467793549", "Sistcoop S.A.C.");
        assertEquals(model.getEstado(), true);
    }*/

}