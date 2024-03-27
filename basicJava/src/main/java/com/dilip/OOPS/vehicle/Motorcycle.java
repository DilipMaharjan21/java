package com.dilip.OOPS;

public class Motorcycle extends AbstractVehicle{
    private boolean engineRunning;

    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting motorcycle engine.....");
        this.engineRunning=true;

    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping motorcycle engine.....");
        this.engineRunning=false;

    }
}
