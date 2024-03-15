package org.example.main;

import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh4 = context.getBean("marutiVehicle", Vehicle.class);
        System.out.println("Vehicle 4 name is: " + veh4.getName());

        Vehicle veh5 = context.getBean("nanoVehicle", Vehicle.class);
        System.out.println("Vehicle 5 name is: " + veh5.getName());

        Vehicle veh6 = context.getBean("kiaVehicle", Vehicle.class);
        System.out.println("Vehicle 6 name is: " + veh6.getName());
    }
}