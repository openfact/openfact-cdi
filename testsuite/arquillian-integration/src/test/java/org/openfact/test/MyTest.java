package org.openfact.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.testsuite.arquillian.Calculadora;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

//@RunWith(Arquillian.class)
public class MyTest {
    
    //@Deployment
    public static Archive createDeployment() {
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addResource(Calculadora.class );
        return deployment;
    }
    
    //@Test
    public void testMyComponent() {
      int result = Calculadora.sumar(1, 2);
      assertThat(result, equalTo(3));
    }

}
