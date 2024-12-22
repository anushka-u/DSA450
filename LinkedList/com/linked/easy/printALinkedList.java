package com.linked.easy;

import java.util.Arrays;
import java.util.LinkedList;

public class printALinkedList {

    public static void printLinkedList(LinkedList<Integer> linkedList)
    {
        int size= linkedList.size();
        for(int i=0;i<size;i++)
        {
            System.out.print(linkedList.get(i)+ " ");
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(7,8,12,89,70));
        printLinkedList(linkedList);
    }
}
