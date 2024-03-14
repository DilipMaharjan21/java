package com.dilip.collectionsAndGenerics.lesson5;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Brave","ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brave1","ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brave2","ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brave3","ready to face and endure danger or pain; showing courage.");

        for(String word:dictionary.keySet()){
            System.out.println(word);
        }

        for(Map.Entry<String, String> entry :dictionary.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());
            //System.out.println(entry.getValue());

        }

    }
}
