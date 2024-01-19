package com.in.customarraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        CustomArrayList arr = new CustomArrayList(2);
        arr.insert(2);
        arr.insert(7);
        arr.insert(4);
        arr.remove(6);
        arr.PrintArray();
       }
}
