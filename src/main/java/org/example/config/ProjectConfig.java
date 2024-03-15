package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        var val = new Vehicle();
        val.setName("Audi");
        return val;
    }

    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer value() {
        return 25;
    }

    // Example - 2
    @Bean
    Vehicle vehicle1() {
        var val = new Vehicle();
        val.setName("Maruti");
        return val;
    }

    @Bean
    Vehicle vehicle2() {
        var val = new Vehicle();
        val.setName("Nano");
        return val;
    }

    @Bean
    Vehicle vehicle3() {
        var val = new Vehicle();
        val.setName("Kia");
        return val;
    }
}