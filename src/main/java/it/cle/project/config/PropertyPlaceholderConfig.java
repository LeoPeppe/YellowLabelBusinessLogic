package it.cle.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyPlaceholderConfig.
 */
@Configuration
@PropertySource({"classpath:hibernate.properties"}) 
public class PropertyPlaceholderConfig {

    /**
     * Property sources placeholder configurer.
     *
     * @return the property sources placeholder configurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
