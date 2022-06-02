package com.definex.tddunit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Flight {
    private String id;
    List<Passenger> passengerList = new ArrayList<Passenger>();

    public Flight(String id){
        this.id= id;
    }
    public List<Passenger> getPassengerList(){
        return Collections.unmodifiableList(passengerList);
    }
    public String getId(){
        return id;
    }

    public abstract boolean addPassenger(Passenger passenger);
    public abstract boolean removePassenger(Passenger passenger);

}
