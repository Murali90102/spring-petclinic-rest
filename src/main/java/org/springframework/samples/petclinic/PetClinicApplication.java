package org.springframework.samples.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "org.springframework.samples.petclinic")
public class PetClinicApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicApplication.class, args);
    }

    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(PetClinicApplication.class);
    }

}