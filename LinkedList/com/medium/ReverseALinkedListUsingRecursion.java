package com.medium;

import com.linkedlist.Node;

public class ReverseALinkedListUsingRecursion {

    public static void reverseALinkedList(Node node1)
    {
        if(node1.next==null)
        {
            System.out.print(node1.data+ " ");
            return;
        }
        reverseALinkedList(node1.next);
        System.out.print(node1.data+ " ");
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next=new Node(3);
        node.next.next=new Node(5);
        node.next.next.next=new Node(7);
        node.next.next.next.next=new Node(11);

        reverseALinkedList(node);
    }
}
