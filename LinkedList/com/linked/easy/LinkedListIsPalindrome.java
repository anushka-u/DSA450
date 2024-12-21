package com.linked.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListIsPalindrome {

    public static boolean isPalindrome(LinkedList<Integer> linkedList)
    {
        int size = linkedList.size();

        for(int i=0;i<size/2;i++)
        {
            if(linkedList.get(i)!=linkedList.get(linkedList.size()-1-i))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,2,1));
        System.out.println(isPalindrome(linkedList));
    }
}
