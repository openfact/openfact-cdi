package org.openfact.swarm;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.datasources.DatasourcesFraction;
import org.wildfly.swarm.jpa.JPAFraction;
import org.wildfly.swarm.undertow.WARArchive;

public class Main {

    public static void main(String[] args) throws Exception {
        Swarm container = new Swarm(args);
        container.fraction(new DatasourcesFraction().jdbcDriver("postgresql", (d) -> {
            d.driverClassName("org.postgresql.Driver");
            d.xaDatasourceClass("org.postgresql.xa.PGXADataSource");
            d.driverModuleName("org.postgresql");
        }).dataSource("OpenfactDS", (ds) -> {
            ds.driverName("postgresql");
            ds.connectionUrl("jdbc:postgresql://localhost:5432/openfact");
            ds.userName("postgres");
            ds.password("123456");
        }));

        container.fraction(new JPAFraction().inhibitDefaultDatasource()
                .defaultDatasource("java:jboss/datasources/OpenfactDS"));

        container.start();

        WARArchive deployment = ShrinkWrap.create(WARArchive.class);
        deployment.addAllDependencies();
        
        container.deploy(deployment);
    }

}
