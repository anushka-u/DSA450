package com.linked.easy;

import com.linkedlist.Node;

public class NthNodeFromEnd {

    static int count =0;
    public static Node nthFromLast(Node head,int n)
    {
        int sizeOfLL= sizeOfLinkedList(head);
        //System.out.println(sizeOfLL);
        int a = sizeOfLL-n+1;
        //System.out.println(a);
        Node temp = head;
        for(int i=0;i<=a-1;i++)
        {
            temp=temp.next;
        }
        return temp;

    }

    public static int sizeOfLinkedList(Node head)
    {
        if(head==null)
            return count;

        count++;
        return sizeOfLinkedList(head.next);

    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next=new Node(100);
        head.next.next=new Node(13);
        head.next.next.next=new Node(12);
        head.next.next.next.next=new Node(25);
        head.next.next.next.next.next=new Node(42);


        Node q = nthFromLast(head,4);
        System.out.println(q.data);
    }
}
