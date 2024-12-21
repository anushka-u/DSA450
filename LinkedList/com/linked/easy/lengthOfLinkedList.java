package com.linked.easy;

import java.util.Arrays;
import java.util.LinkedList;

public class lengthOfLinkedList {

    public static int lengthOfLinkList(LinkedList<Integer> linkedList)
    {
        int count = 0;
        int i =0;
        while (i!=linkedList.size())
        {
            count+=1;
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(7,9,4,3,2,56));
        System.out.println(lengthOfLinkList(linkedList));
        //use inbuilt method to print length of linked list -> size()
        System.out.println(linkedList.size());
    }
}
