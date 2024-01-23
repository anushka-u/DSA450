package com.in.listIterator;

import java.sql.SQLOutput;
import java.util.*;

public class ListIteratorIntroduction {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(12);
        list.add(92);
        list.add(82);
        list.add(72);

        System.out.println("Iterating list using list iterator");
        ListIterator<Integer> litr = list.listIterator();

        while (litr.hasNext())
        {
            System.out.println(litr.next());
        }



        System.out.println("Iterating list in reverse order using list iterator");
        ListIterator<Integer> litr2 = list.listIterator(list.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }

    }
}
