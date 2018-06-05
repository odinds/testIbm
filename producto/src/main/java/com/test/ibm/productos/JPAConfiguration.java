package com.test.ibm.productos;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.test.ibm.productos.entities"})
@EnableJpaRepositories(basePackages={"com.test.ibm.productos.repositories"})//Path of your CRUD repositories package
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
public class JPAConfiguration {

}
