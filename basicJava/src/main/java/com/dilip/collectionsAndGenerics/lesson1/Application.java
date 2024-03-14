package com.dilip.collectionsAndGenerics.lesson1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("trader");
        words.add("200");
        words.remove(2);

        System.out.println(words);

        LinkedList <Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.remove();
        System.out.println(numbers);
        for(int number : numbers){
            System.out.println(number);
        }
    }

}
