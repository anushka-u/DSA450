package com.in.iterators;

import java.util.*;

public class IteratorIntroduction {

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        list.add(12);
        list.add(92);
        list.add(82);
        list.add(72);

        System.out.println("Iterating a List ");
        Iterator<Integer> itr  =  list.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Set<Integer> set = new HashSet<>();
        set.add(98);
        set.add(87);
        set.add(21);
        set.add(12);

        System.out.println("Iterating a Set ");
        Iterator<Integer> itr2 = set.iterator();
        while(itr2.hasNext())
        {
            System.out.println(itr2.next());
        }

        Map<Integer, String > map = new HashMap<>();
        map.put(1,"Kausiki");
        map.put(2,"Kartikey");
        map.put(3,"Aastha");
        map.put(4,"Anushka");

        System.out.println("Iterating a Map - will only iterate keys ");
        Iterator<Integer> itr3 =  map.keySet().iterator();
        while(itr3.hasNext())
        {
            System.out.println(itr3.next());
        }

        System.out.println("To Print key and value of hashmap");
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

    }
}
