package com.definex.tddunit;

public class Passenger {
    private String name;
    private boolean vip;

    public Passenger(String name, boolean vip){
        this.vip = vip;
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public boolean isVip(){
        return vip;
    }
}
