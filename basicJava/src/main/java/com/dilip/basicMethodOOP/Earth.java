package com.dilip.basicMethodOOP;

public class Earth {
    public static void main(String[] args) {
/*        Human dlip;
        dlip = new Human("Qusih", 12, 72, "blue");
        dlip.age=5;
        dlip.eyeColor="brown";
        dlip.heightInInches=36;
        dlip.name="Qusih";*/

        Human dlip = new Human("Qusih", 12, 72, "blue");
        dlip.eat();
        dlip.walk();
        dlip.work();
        dlip.speak();


    }
}
