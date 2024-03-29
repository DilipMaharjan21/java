package com.dilip.carDealership;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    public void handelCustomer(Customer cust, boolean finance, Vehicle vehicle){
        if(finance==true){
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
            runCreditHistory(cust, loanAmount);
        }else if(vehicle.getPrice()<= cust.getCashOnHand()){
            //Customer pay cash
            processTransaction(cust,vehicle);

        }else{
            System.out.println("Customer will need more money to purchase vehicle: "+vehicle);
        }
    }

    private void runCreditHistory(Customer cust, double loanAmount) {
        System.out.println("Ran credit history for Customer....");
        System.out.println("Customer has been approved to purchase the vehicle.");
    }

    public void processTransaction(Customer cust, Vehicle vehicle){
        System.out.println("Customer has purchased the vehicle: "+
                vehicle+ "for the price "+vehicle.getPrice());
    }
}
