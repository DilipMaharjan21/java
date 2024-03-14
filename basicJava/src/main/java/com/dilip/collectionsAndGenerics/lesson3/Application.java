package com.dilip.collectionsAndGenerics.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
    public static void main(String[] args) {
        //LinkedHashSet<String> values = new LinkedHashSet<>(); #will use this to print data in order as it has in index.
        HashSet<Animal> animals = new HashSet<>();
        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 6);
        Animal animal3 = new Animal("Dog", 12);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

/*        System.out.println(animal1.equals(animal3));
        System.out.println(animal1.hashCode());
        System.out.println(animal3.hashCode());*/

        for ( Animal animal : animals){
            System.out.println(animal);
        }



    }
}
