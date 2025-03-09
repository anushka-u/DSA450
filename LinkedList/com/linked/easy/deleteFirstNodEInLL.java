package com.linked.easy;

import com.linkedlist.Node;

public class deleteFirstNodEInLL {

    public  static void deleteLastNodeInCircularLinkedList(Node tail)
    {
        if(tail==null)
        {
            return;
        }
        if(tail.next==null)
        {
            return;
        }
        tail.next = tail.next.next;
    }

    public static void display(Node tail)
    {
        Node current =  tail.next;
        while(current!=tail)
        {
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println(current.data);
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

        deleteLastNodeInCircularLinkedList(e);
        display(e);
    }
}
