package com.dilip.collectionsAndGenerics.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        ArrayList <String> animals = new ArrayList<>();
        animals.add("lion");
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

/*        for (int i = 0; i<animals.size(); i++){
            System.out.println(i);
            System.out.println(animals.get(i));
            System.out.println(animals +"\n");

        }
        for(String value : animals){
            System.out.println(value);
        }*/

        //ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();
        List<Vehicle> vehicles = new LinkedList<>();
        Vehicle vehicle = new Vehicle("Ford","Hummer", 120000, true);
        System.out.println(vehicle.toString());
        vehicles.add(new Vehicle("Toyota","Camry",37000, false));
        vehicles.add(new Vehicle("Mercedes","G-wagon", 200000,true));
        vehicles.add(vehicle);
        for( Vehicle car: vehicles ){
            //System.out.println(car.getMake()+", "+car.getModel()+", "+car.getPrice());
            //System.out.println(car);

        }
        printElements(vehicles);
        printElements(animals);

    }

    public static void printElements(List list){
        for (int i = 0; i<list.size(); i++){
            //System.out.println(i);
            System.out.println(list.get(i));
            //System.out.println(somelist +"\n");

        }
    }
}
