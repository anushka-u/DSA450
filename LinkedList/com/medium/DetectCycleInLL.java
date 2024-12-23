package com.medium;

import com.linkedlist.Node;

public class DetectCycleInLL {

    public static Node detectCycle(Node head)
    {
        if(head==null || head.next==null)
        {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow)
            {
                Node temp=head;
                while(temp!=slow)
                {
                    temp=temp.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        //Creating object of Node class
        Node a = new Node(5);
        Node b= new Node(3);
        Node c= new Node(7);
        Node d= new Node(8);
        Node e= new Node(11);
        //At this point our node look like 5 3 7 8 11 without any linkage in between

        a.next=b; //5->3 7 8 11 creating linkage in between first and second node.
        b.next=c; //5->3->7 8 11 creating linkage in between second and third node.
        c.next=d;//5->3->7->8 11 creating linkage in between third and fourth node.
        d.next=e;//5->3->7->8->11  creating linkage in between fourth and fifth node.
        e.next=c; // cyclic linked list.

        Node cyclicNode = detectCycle(a);
        System.out.println(cyclicNode.data);

    }
}
