/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passengersource;

/**
 *
 * @author Cp9-30
 */
import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean scheduleVehicle(Passenger passenger) {
        return !vehicles.isEmpty(); // Simple availability check
    }
        public void removeVehicle() {
        if (!vehicles.isEmpty()) {
            vehicles.remove(0);
        }
    }
}

