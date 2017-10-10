package it.cle.project.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


// TODO: Auto-generated Javadoc
/**
 * The Class DataConfig.
 */
@Configuration
@EnableTransactionManagement
public class DataConfig {

    /** The Constant log. */
    private static final Logger log = LoggerFactory.getLogger(DataConfig.class);
    


    /**
     * Hibernate exception translator.
     *
     * @return the hibernate exception translator
     */
    @Bean
    public HibernateExceptionTranslator hibernateExceptionTranslator() {
    	//System.out.println("bean hibernateexceptiontranslator");
        return new HibernateExceptionTranslator();
    }

    /**
     * The Class Production.
     */
    @Configuration
    @Profile("production")
    @Import(PropertyPlaceholderConfig.class)
    static class Production {
 	
        /** The hibernate show sql. */
        @Value("${hibernate.show_sql}")
        protected String hibernateShowSql;
        
        /** The hibernate hbm2 ddl. */
        @Value("${hibernate.hbm2ddl_auto}")
        protected String hibernateHbm2DDL;
        
        /** The hibernate schema. */
        @Value("${hibernate.default_schema}")
        protected String hibernateSchema;
        
        /** The jdbc driver. */
        @Value("${jdbc.driverClassName}")
        protected String jdbcDriver;
        
        /** The jdbc username. */
        @Value("${jdbc.username}")
        protected String jdbcUsername;
        
        /** The jdbc password. */
        @Value("${jdbc.password}")
        protected String jdbcPassword;
        
        /** The jdbc url. */
        @Value("${jdbc.url}")
        protected String jdbcUrl;

        /**
         * Session factory.
         *
         * @return the session factory
         */
        @Bean
        public SessionFactory sessionFactory() {
            LocalSessionFactoryBean factoryBean;
            try {
                factoryBean = new LocalSessionFactoryBean();
                Properties pp = new Properties();
                pp.setProperty("hibernate.show_sql", hibernateShowSql);
                pp.setProperty("hibernate.hbm2ddl.auto", hibernateHbm2DDL);
                pp.setProperty("hibernate.default_schema", hibernateSchema);

                factoryBean.setDataSource(dataSource());
                factoryBean.setPackagesToScan("it.cle.project.model");
                factoryBean.setHibernateProperties(pp);
                factoryBean.afterPropertiesSet();
                return factoryBean.getObject();
            } catch (Exception e) {
                log.error("Couldn't configure the sessionFactory bean", e);
            }
            throw new RuntimeException("Couldn't configure the sessionFactory bean");
        }

        /**
         * Data source.
         *
         * @return the data source
         */
        @Bean
        public DataSource dataSource() {
        	DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName(jdbcDriver);
            ds.setUsername(jdbcUsername);
            ds.setPassword(jdbcPassword);
            ds.setUrl(jdbcUrl);
            return ds;
        }
    }

    /**
     * The Class Tests.
     */
    @Configuration
    //@Profile("dev")
    @Import(PropertyPlaceholderConfig.class)
    static class Tests {

    	/** The hibernate show sql. */
	    @Value("${test.hibernate.show_sql}")
        protected String hibernateShowSql;
        
        /** The hibernate hbm2 ddl. */
        @Value("${test.hibernate.hbm2ddl_auto}")
        protected String hibernateHbm2DDL;
        
        /** The hibernate schema. */
        @Value("${test.hibernate.default_schema}")
        protected String hibernateSchema;
        
        /** The jdbc driver. */
        @Value("${test.jdbc.driverClassName}")
        protected String jdbcDriver;
        
        /** The jdbc username. */
        @Value("${test.jdbc.username}")
        protected String jdbcUsername;
        
        /** The jdbc password. */
        @Value("${test.jdbc.password}")
        protected String jdbcPassword;
        
        /** The jdbc url. */
        @Value("${test.jdbc.url}")
        protected String jdbcUrl;
        

        /**
         * Transaction manager.
         *
         * @return the platform transaction manager
         */
        @Bean
        public PlatformTransactionManager transactionManager() {
           return new HibernateTransactionManager(sessionFactory());
        }
        

        
        /**
         * Session factory.
         *
         * @return the session factory
         */
        @Bean
        public SessionFactory sessionFactory() {
            LocalSessionFactoryBean factoryBean;
            try {
                factoryBean = new LocalSessionFactoryBean();
                Properties pp = new Properties();
                pp.setProperty("hibernate.show_sql", hibernateShowSql);
                pp.setProperty("hibernate.hbm2ddl.auto", hibernateHbm2DDL);
                pp.setProperty("hibernate.default_schema", hibernateSchema);
                //System.out.println("hibernateschema = " + hibernateSchema);
                //System.out.println("hibernate auto = " + hibernateHbm2DDL);
                factoryBean.setDataSource(dataSource());
                factoryBean.setPackagesToScan("it.cle.project.model");
                factoryBean.setHibernateProperties(pp);
                factoryBean.afterPropertiesSet();
                return factoryBean.getObject();
            } catch (Exception e) {
                log.error("Couldn't configure the sessionFactory bean", e);
            }
            throw new RuntimeException("Couldn't configure the sessionFactory bean");
        }
        


        /**
         * Data source.
         *
         * @return the data source
         */
        @Bean
        public DataSource dataSource() {
        	DriverManagerDataSource ds = new DriverManagerDataSource();
            ds.setDriverClassName(jdbcDriver);
            ds.setUsername(jdbcUsername);
            ds.setPassword(jdbcPassword);
            ds.setUrl(jdbcUrl);
            return ds;
        }
    }
}