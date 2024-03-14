package com.dilip.collectionsAndGenerics.lesson2;

import java.util.Objects;

public class Vehicle {

    String make;
    String model;
    int price;
    boolean fourWDrive;

    public Vehicle(String make, String model, int price, boolean fourWDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWDrive = fourWDrive;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourWDrive() {
        return fourWDrive;
    }

    public void setFourWDrive(boolean fourWDrive) {
        this.fourWDrive = fourWDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWDrive=" + fourWDrive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return price == vehicle.price && fourWDrive == vehicle.fourWDrive && Objects.equals(make, vehicle.make) && Objects.equals(model, vehicle.model);
    }
/*
    @Override
    public int hashCode() {
        return Objects.hash(make, model, price, fourWDrive);
    }*/
}
