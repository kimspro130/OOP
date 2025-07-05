/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passengersource;

/**
 *
 * @author Cp9-30
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Initialize company and add some vehicles
        Company company = new Company();
        for (int i = 0; i < 3; i++) {
            company.addVehicle(new Vehicle());
        }
        
        PassengerSource passengerSource = new PassengerSource(company);
        Random rand = new Random();
        
        System.out.println("----- BALEKTRANIT TRANSPORTATION SIMULATOR -----");
        System.out.println("Initial vehicle count: " + 3 + "\n");
        
        // Simulate 5 pickup requests
        for (int i = 1; i <= 5; i++) {
            System.out.println("Request #" + i);
            
            boolean success = passengerSource.requestPickup();
            
            if (success) {
                System.out.println("Pickup scheduled successfully");
                System.out.println(" Assigned one vehicle");
            } else {
                System.out.println("✗ No vehicles available (Lost fare)");
            }
            
           
            if (rand.nextDouble() < 0.3 && i < 4) {
                company.removeVehicle();
                System.out.println("A vehicle completed its trip and is now available again");
            }
            
            System.out.println();
        }
    }
}


