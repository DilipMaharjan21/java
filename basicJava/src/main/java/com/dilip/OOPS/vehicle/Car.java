package com.dilip.OOPS;

public class Car extends AbstractVehicle{
    private boolean engineRunning;

    public Car(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting car engine.....");
        engineRunning=true;

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping car engine.....");
        engineRunning=false;

    }
}
