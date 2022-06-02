package com.definex.tddunit;

public class BusinessFlight extends Flight {

    public BusinessFlight(String id){
        super(id);
    }
    public boolean addPassenger(Passenger passenger){
        if(passenger.isVip()){
            return passengerList.add(passenger);
        }
        return false;
    }
    public boolean removePassenger(Passenger passenger){
        return false;
    }
}
