package com.in.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetIntro {
    public static void main(String[] args) {

        //Set is an inteface, which is implemented by HashSet,
        /*
        HashSet internal implementation is HAshMap
        and the value we pass in HashSet goes as a key in HashMap, In hashmap keys need to be unique and cannot be duplicated
         */
        Set<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(45);
        hs.add(12);
        hs.add(32);
        hs.add(65);

        System.out.println(hs.size());
        System.out.println(hs);

        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(45);
        l.add(32);
        l.add(65);

        System.out.println(hs.containsAll(l));

        //To check if set does contain x element or not
        System.out.println(hs.contains(12));




    }
}
