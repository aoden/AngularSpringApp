package com.tdt.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@SpringBootApplication
@EnableWebSecurity
@EnableJpaRepositories(basePackages = "com.tdt.springapp.dao")
@EntityScan("com.tdt.springapp.model")
@EnableAutoConfiguration
@ComponentScan("com.tdt.springapp")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

} 