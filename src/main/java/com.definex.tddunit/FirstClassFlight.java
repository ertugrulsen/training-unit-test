package com.definex.tddunit;


public class FirstClassFlight extends FlightClass {

    public FirstClassFlight(String id) {

        super(id);
    }

    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return passengersList.add(passenger);
        }
        return false;
    }

    public boolean removePassenger(Passenger passenger) {
        return false;
    }

}
