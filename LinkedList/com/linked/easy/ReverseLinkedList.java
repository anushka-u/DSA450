package com.linked.easy;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void reverseLinkList(LinkedList<Integer> linkedList)
    {
        for(int i=0;i<linkedList.size()/2;i++)
        {
            int temp = linkedList.get(i);
            linkedList.set(i,linkedList.get(linkedList.size()-1-i));
            linkedList.set(linkedList.size()-1-i,temp);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(3,4,5,8,12));
        reverseLinkList(linkedList);
        System.out.println(linkedList);
    }
}
