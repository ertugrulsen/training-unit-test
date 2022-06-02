package com.definex.tddunit;

public class EconomyFlight extends Flight {

    public EconomyFlight(String id){
        super(id);
    }
    public boolean addPassenger(Passenger passenger){
        return passengerList.add(passenger);
    }
    public boolean removePassenger(Passenger passenger){
        if (!passenger.isVip()){
            return passengerList.remove(passenger);
        }
        return false;
    }

}
