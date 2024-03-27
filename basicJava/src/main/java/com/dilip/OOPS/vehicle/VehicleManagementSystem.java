package com.dilip.OOPS;

public class VehicleManagementSystem {

    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Camry", 2022);
        Motorcycle motorcycle = new Motorcycle("Harley", "Sportdter", 2021);

        System.out.println("==== Car Actions ====");
        performActions(car);

        System.out.println("\n==== Motorcycle Actions ====");
        performActions(motorcycle);
    }

    public static void performActions(Vehicle vehicle) {
        vehicle.startEngine();
        vehicle.stopEngine();
    }
}
