package pl.edu.agh.wat.configuration;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configuring our repository for testing, use spring boot
 */




@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"pl.edu.agh.wat.domain.model"})
@EnableJpaRepositories(basePackages = {"pl.edu.agh.wat.domain.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}