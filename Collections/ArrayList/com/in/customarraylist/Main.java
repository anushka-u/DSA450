package com.in.customarraylist;

public class Main {

    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList(2);
        arr.insert(2);
        arr.insert(7);
        arr.insert(4);
        System.out.println(arr.toString());
       }
}
