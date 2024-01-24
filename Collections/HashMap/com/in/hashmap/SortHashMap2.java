package com.in.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap2 {

    public static void main(String[] args) {

        Map<Integer,String> sortMe = new HashMap<>();
        sortMe.put(23,"keshav");
        sortMe.put(12,"rohan");
        sortMe.put(41,"Aastha");
        sortMe.put(1,"arvind");

        Map<Integer,String> treeMap = new TreeMap<>(sortMe);
        System.out.println(treeMap);
    }
}
