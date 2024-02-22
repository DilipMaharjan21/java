package com.dilip.basicMethodOOP;

public class Zoo {
    public static void main(String[] args) {
        //Here animal1 is an instance variable type of Animal
        //new Animal is an object/instance
        //object are runtime concept, and it exits during running time only
        Animal animal1 = new Animal(12, "M", 60);
        animal1.eat();
        animal1.sleep();

        Bird bird1 = new Bird(3, "F", 10);
        bird1.eat();

        Fish fish1= new Fish(5,"M",5);
        fish1.swim();

    }
}
