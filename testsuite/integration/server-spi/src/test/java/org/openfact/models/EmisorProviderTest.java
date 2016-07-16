package org.openfact.models;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openfact.models.jpa.AbstractHibernateStorage;
import org.openfact.models.jpa.JpaEmisorProvider;
import org.openfact.models.jpa.entities.EmisorEntity;
import org.openfact.models.jpa.search.SearchCriteriaJoinAliasModel;
import org.openfact.models.jpa.search.SearchCriteriaJoinModel;
import org.openfact.models.search.OrderByModel;
import org.openfact.models.search.PagingModel;
import org.openfact.models.search.SearchCriteriaFilterModel;
import org.openfact.models.search.SearchCriteriaModel;
import org.openfact.models.search.SearchResultsModel;
import org.openfact.provider.Provider;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;

//@UsingDataSet("empty.xml")
@RunWith(Arquillian.class)
public class EmisorProviderTest {

    @Inject
    private EmisorProvider emisores;

    @Deployment
    public static Archive createDeployment() {
        JavaArchive archive = ShrinkWrap.create(JavaArchive.class);

        archive.addClass(Model.class);
        archive.addClass(EmisorModel.class);

        archive.addClass(Provider.class);
        archive.addClass(EmisorProvider.class);
        archive.addClass(JpaEmisorProvider.class);
        archive.addClass(EmisorEntity.class);

        archive.addClass(AbstractHibernateStorage.class);
        archive.addClass(SearchCriteriaJoinAliasModel.class);
        archive.addClass(SearchCriteriaJoinModel.class);
        archive.addClass(OrderByModel.class);
        archive.addClass(PagingModel.class);
        archive.addClass(SearchCriteriaFilterModel.class);
        archive.addClass(SearchCriteriaModel.class);
        archive.addClass(SearchResultsModel.class);

        archive.addPackages(true, "org.openfact");

        archive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        archive.addAsResource("META-INF/persistence.xml", "META-INF/persistence.xml");

        return archive;
    }

    @Test
    public void create() {
        EmisorModel model = emisores.create("PE", "10467793549", "Sistcoop S.A.C.");

        assertThat(model, is(notNullValue()));
        assertThat(model.getId(), is(notNullValue()));
        assertThat(model.getPais(), equalTo("PE"));
        assertThat(model.getRuc(), equalTo("10467793549"));
        assertThat(model.getRazonSocial(), equalTo("Sistcoop S.A.C."));
        assertThat(model.getEstado(), is(true));
    }
    
    @Test
    public void createDuplicate() {
        EmisorModel model1 = null;
        EmisorModel model2 = null;
        try {
            model1 = emisores.create("PE", "10467793540", "Sistcoop S.A.C. 01");
            //model2 = emisores.create("PE", "10467793540", "Sistcoop S.A.C. 02");             
        } catch (ModelDuplicateException e) {
            assertThat(model1, is(notNullValue()));
            assertThat(model2, is(nullValue()));
        }        
    }
    
    /*@Test
    public void findByAbreviatura() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);

        String abreviatura = model1.getAbreviatura();
        EmisorModel model2 = emisores.findByAbreviatura(abreviatura);

        assertThat("model1 debe ser igual a model2", model1, is(equalTo(model2)));
    }*/

    

    /*@Test
    public void remove() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);

        String abreviatura = model1.getAbreviatura();
        boolean result = emisores.remove(model1);

        EmisorModel model2 = emisores.findByAbreviatura(abreviatura);

        assertThat("result false", result, is(true));
        assertThat("model2 is notNull", model2, is(nullValue()));
    }

    @Test
    public void search1() {
        @SuppressWarnings("unused")
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);

        List<EmisorModel> searched = emisores.getAll();

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 2", searched.size(), is(2));
    }

    @Test
    public void search2() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);

        model1.setEstado(false);
        model1.commit();

        List<EmisorModel> searched = emisores.getAll();

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 1", searched.size(), is(2));
    }

    @Test
    public void searchCriteria1() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        model1.setEstado(false);
        model1.commit();

        // add filters
        SearchCriteriaModel criteria = new SearchCriteriaModel();
        criteria.addFilter("tipoPersona", TipoPersona.NATURAL.toString(), SearchCriteriaFilterOperator.eq);

        SearchResultsModel<EmisorModel> searched = emisores.search(criteria);

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 2", searched.getTotalSize(), is(2));
        assertThat("searched.getModels() is not 2", searched.getModels().size(), is(2));
    }

    @Test
    public void searchCriteria2() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        model1.setEstado(false);
        model1.commit();

        // add filters
        SearchCriteriaModel criteria = new SearchCriteriaModel();
        criteria.addFilter("estado", true, SearchCriteriaFilterOperator.bool_eq);

        SearchResultsModel<EmisorModel> searched = emisores.search(criteria);

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 2", searched.getTotalSize(), is(2));
        assertThat("searched.getModels() is not 2", searched.getModels().size(), is(2));
    }

    @Test
    public void searchCriteria3() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        model1.setEstado(false);
        model1.commit();

        // add filters
        SearchCriteriaModel criteria = new SearchCriteriaModel();
        criteria.addFilter("tipoPersona", TipoPersona.NATURAL.toString(), SearchCriteriaFilterOperator.eq);
        criteria.addFilter("estado", true, SearchCriteriaFilterOperator.bool_eq);

        SearchResultsModel<EmisorModel> searched = emisores.search(criteria);

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 1", searched.getTotalSize(), is(1));
        assertThat("searched.getModels() is not 1", searched.getModels().size(), is(1));
    }

    @Test
    public void searchCriteriaFiltertext1() {
        @SuppressWarnings("unused")
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("Pasaporte", "Pasaporte", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model4 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        SearchCriteriaModel criteria = new SearchCriteriaModel();
        SearchResultsModel<EmisorModel> searched = emisores.search(criteria, "ruc");

        assertThat("searched is Null", searched, is(notNullValue()));
        assertThat("searched.getTotalSize() is not 1", searched.getTotalSize(), is(1));
        assertThat("searched.getModels() is not 1", searched.getModels().size(), is(1));
    }

    @Test
    public void searchCriteriaFiltertext2() {
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("Pasaporte", "Pasaporte", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model4 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        model1.setEstado(false);
        model1.commit();

        // add filters
        SearchCriteriaModel criteria = new SearchCriteriaModel();
        criteria.addFilter("estado", true, SearchCriteriaFilterOperator.bool_eq);

        SearchResultsModel<EmisorModel> searched = emisores.search(criteria, "dni");

        assertThat(searched, is(notNullValue()));
        assertThat(searched.getTotalSize(), is(0));
        assertThat(searched.getModels().size(), is(0));
    }

    @Test
    public void searchCriteriaFiltertext3() {
        @SuppressWarnings("unused")
        EmisorModel model1 = emisores.create("DNI", "Documento nacional de identidad", 8,
                TipoPersona.NATURAL);
        EmisorModel model2 = emisores.create("P.NAC", "Partida de nacimiento", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model3 = emisores.create("Pasaporte", "Pasaporte", 11, TipoPersona.NATURAL);
        @SuppressWarnings("unused")
        EmisorModel model4 = emisores.create("RUC", "Registro unico de contribuyente", 11,
                TipoPersona.JURIDICA);

        model2.setEstado(false);
        model2.commit();

        // add filters
        SearchCriteriaModel criteria = new SearchCriteriaModel();
        criteria.addFilter("tipoPersona", TipoPersona.NATURAL.toString(), SearchCriteriaFilterOperator.eq);
        criteria.addFilter("estado", true, SearchCriteriaFilterOperator.bool_eq);

        SearchResultsModel<EmisorModel> searched = emisores.search(criteria, "dni");

        assertThat(searched, is(notNullValue()));
        assertThat(searched.getTotalSize(), is(1));
        assertThat(searched.getModels().size(), is(1));
    }*/

}
