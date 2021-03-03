package com.brewed.brewed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class BrewedApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrewedApplication.class, args);
    }

}
