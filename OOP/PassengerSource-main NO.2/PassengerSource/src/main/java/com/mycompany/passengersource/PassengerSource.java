/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.passengersource;

/**
 *
 * @author Cp9-30
 */
import java.util.Random;

public class PassengerSource {
    private final Company company;

    public PassengerSource(Company company) {
        this.company = company;
    }

    public boolean requestPickup() {
        Random random = new Random();
        Location pickup = new Location(random.nextInt(101), random.nextInt(101));
        Location destination = new Location(random.nextInt(101), random.nextInt(101));
        return company.scheduleVehicle(new Passenger(pickup, destination));
    }
}
