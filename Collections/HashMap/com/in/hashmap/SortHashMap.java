package com.in.hashmap;

import java.util.*;

public class SortHashMap {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("a",123);
        map.put("b",35);
        map.put("A",987);
        map.put("@",12);

        Set<Map.Entry<String, Integer>> entryMap = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entryMap);

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //ToSort the map by using key
                //return o1.getKey().compareTo(o2.getKey());

                //To sort the map by using value
                return (o1.getValue()>o2.getValue())?1:(o1.getValue()==o2.getValue())?0:-1;
            }
        });

        System.out.println(list);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>();
        for(int i=0;i<list.size();i++)
        {
            linkedHashMap.put(list.get(i).getKey(), list.get(i).getValue());
        }

        System.out.println("Converted the list into LinkedHAshMap");
        System.out.println(linkedHashMap);


    }
}
