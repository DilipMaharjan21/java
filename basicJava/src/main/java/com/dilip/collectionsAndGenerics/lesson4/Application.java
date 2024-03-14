package com.dilip.collectionsAndGenerics.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {

    public static void main(String[] args) {

        //ArrayList<Integer> list1 = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(15);
        hashSet.add(67);
        hashSet.add(43);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);
        hashSet.add(10);

        ArrayList<Integer> myList = new ArrayList<>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);

        HashSet<Employee> hashSet1 = new HashSet<>();
        hashSet1.add(new Employee("David",10000, "Accounting"));
        hashSet1.add(new Employee("Quish",25000, "Finance"));
        hashSet1.add(new Employee("Quishna",20000, "HR"));

        System.out.println(hashSet1);
        ArrayList<Employee> mylist1 = new ArrayList<>(hashSet1);

        Collections.sort(mylist1);
        System.out.println(mylist1);



/*

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(10);
        newlist.add(67);
        newlist.add(15);

        list1.clear();
        System.out.println(list1);
        System.out.println(newlist);
*/



    }
}
