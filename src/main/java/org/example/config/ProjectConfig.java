package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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

    // Example - 3
    @Bean(name = "marutiVehicle")
    Vehicle vehicle4() {
        var val = new Vehicle();
        val.setName("Maruti");
        return val;
    }

    @Bean(value = "nanoVehicle")
    Vehicle vehicle5() {
        var val = new Vehicle();
        val.setName("Nano");
        return val;
    }

   /* @Bean("kiaVehicle")
    Vehicle vehicle6() {
        var val = new Vehicle();
        val.setName("Kia");
        return val;
    }*/

    // Example - 4
    @Primary
    @Bean("kiaVehicle")
    Vehicle vehicle6() {
        var val = new Vehicle();
        val.setName("Kia");
        return val;
    }
}