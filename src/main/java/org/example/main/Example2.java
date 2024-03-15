package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("vehicle1", Vehicle.class);
        System.out.println("Vehicle 1 name is: " + veh1.getName());

        Vehicle veh2 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle 2 name is: " + veh2.getName());

        Vehicle veh3 = context.getBean("vehicle3", Vehicle.class);
        System.out.println("Vehicle 3 name is: " + veh3.getName());
    }
}