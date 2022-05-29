package com.definex.tddunit;

public class SecondClassFlight extends FlightClass {
    public SecondClassFlight(String id) {
        super(id);
    }
    public boolean addPassenger(Passenger passenger){
        return passengersList.add(passenger);
    }
    public boolean removePassenger(Passenger passenger){
        if(!passenger.isVip()){
            return passengersList.remove(passenger);
        }
        return false;
    }
}
