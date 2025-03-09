package com.linked.easy;

import com.linkedlist.Node;

public class NumberOfNodesInCircularLinkedList {

    public static int circularListLength(Node e)
    {
        int length =0;
        Node circularLength = e.next;

        while(circularLength!=e)
        {
            length++;
            circularLength=circularLength.next;
        }
        return length+1;
    }
    public static void main(String[] args) {
        Node a  = new Node(41);
        Node b = new Node(78);
        Node c = new Node(3);
        Node d  = new Node(14);
        Node e = new Node(40);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=a;


        System.out.println(circularListLength(e));
    }
}
