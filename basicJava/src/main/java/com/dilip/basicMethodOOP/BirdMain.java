package com.dilip.basicMethodOOP;

public class BirdMain {

    public static void main(String[] args) {
        Chicken chick1 = new Chicken(1,"M", 7);
        chick1.fly();

        Sparrow sparrow1 = new Sparrow(2,"F", 2);
        sparrow1.fly();

        AbstractFish aFish = new AbstractFish();
        aFish.move();

        AbstractSparrow aSparrow = new AbstractSparrow();
        aSparrow.move();

        moveAnimals(aFish);
        moveAnimals(aSparrow);
    }

    public static void moveAnimals(AbstractAnimal animal){
        animal.move();
    }
}
