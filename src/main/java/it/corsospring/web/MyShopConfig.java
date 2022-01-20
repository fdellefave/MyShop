package it.corsospring.web;

import it.corsospring.web.dao.CategoriaDAO;
import it.corsospring.web.dao.ClienteDAO;
import it.corsospring.web.dao.ProdottoDAO;
import it.corsospring.web.dao.implement.CategoriaDAOImpl;
import it.corsospring.web.dao.implement.ClienteDAOImpl;
import it.corsospring.web.dao.implement.ProdottoDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.sql.DataSource;


@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "it.corsospring.web.controller")
public class MyShopConfig {

    @Bean
    public FreeMarkerViewResolver configureResolver() {
        FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();

        resolver.setPrefix("");
        resolver.setSuffix(".ftl");
        resolver.setCache(true);

        return resolver;
    }

    @Bean
    public FreeMarkerConfigurer configureFreeMarker() {
        FreeMarkerConfigurer config = new FreeMarkerConfigurer();
        config.setTemplateLoaderPath("/WEB-INF/view/");

        return config;
    }

    @Bean
    public DataSource getDBconnection() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        ds.setUsername("root");
        ds.setPassword("root");
        ds.setUrl("jdbc:mariadb://localhost:3306/corso_spring");

        return ds;
    }

    @Bean
    public ClienteDAO getClienteService() {
        return new ClienteDAOImpl(getDBconnection());
    }

    @Bean
    public ProdottoDAO getProdottoService() {
        return new ProdottoDAOImpl(getDBconnection());
    }

    @Bean
    public CategoriaDAO getCategoriaService() {
        return new CategoriaDAOImpl(getDBconnection());
    }
}
