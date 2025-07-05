/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.passengersource;

/**
 *
 * @author Cp9-30
 */
public class Passenger {
    private final Location pickupLocation;
    private final Location destinationLocation;

    public Passenger(Location pickupLocation, Location destinationLocation) {
        this.pickupLocation = pickupLocation;
        this.destinationLocation = destinationLocation;
    }

    // Getters and setters
    public Location getPickupLocation() { return pickupLocation; }
    public Location getDestinationLocation() { return destinationLocation; }
}
