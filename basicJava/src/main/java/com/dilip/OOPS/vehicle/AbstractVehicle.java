package com.dilip.OOPS;

public abstract class AbstractVehicle implements Vehicle{
    protected String make;
    protected String model;
    protected int year;

    public AbstractVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
