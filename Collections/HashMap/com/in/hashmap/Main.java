package com.in.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Map<Employee, Integer> empMap =  new HashMap<>();
        empMap.put(new Employee(123, "Ankita"), 123);
        empMap.put(new Employee(123, "Ankita"), 456);
        empMap.put(new Employee(123, "Anaha"), 980);

        Map<Employee, Integer> empMap1 = new HashMap<>();
        empMap1.put(new Employee(123, "Anushka"), 234);
        empMap1.put(new Employee(123, "Ashmita"),786);
        empMap1.put(new Employee(234,"Kulsum"),980);


        System.out.println("Size of empMap is "+ empMap.size());
        System.out.println("Size of empMap1 is "+empMap1.size());


    }
}
