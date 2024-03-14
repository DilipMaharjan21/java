package com.dilip.carDealership;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1=new Customer("Tom","123 Ferncliff Dr", 13000);
        Vehicle vehicle=new Vehicle("Toyota","Camry", 20000);
        Employee emp=new Employee("David");
        cust1.purchaseCar(vehicle,emp,false);



    }
}
