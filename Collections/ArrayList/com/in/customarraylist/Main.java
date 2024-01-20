package com.in.customarraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        CustomArrayList arr = new CustomArrayList(2);
        arr.insert(2);
        arr.insert(7);
        arr.insert(4);
        arr.insert(42);
        arr.insert(81);
        arr.PrintArray();
        System.out.println();
        int a = (int) arr.remove(4);
        System.out.println(a);
        arr.PrintArray();
       }
}
