package com.medium;

import com.linkedlist.Node;

public class RemoveNthNodeFromEnd {

    static int count =0;

    public static int sizeOfLinkedList(Node head)
    {
        if(head==null)
            return count;

        count++;
        return sizeOfLinkedList(head.next);
    }

//    public static void removeNodeFromEnd(Node head, int n)
//    {
//        int sizeOfLL= sizeOfLinkedList(head);
//        int a = sizeOfLL-n+1;
//
//        Node temp = head;
//        for(int i=0;i<=a-2;i++)
//        {
//            temp=temp.next;
//        }
//        temp.next=temp.next.next;
//
//    }

    public static Node removeNthNode(Node head, int n)
    {
        Node dummy = new Node(-1);
        dummy.next=head;

        int sizeOfList = sizeOfLinkedList(head);

        int positionOfElement = sizeOfList-n;

        Node current = dummy;

        for(int i=0;i<positionOfElement;i++)
        {
            current=current.next;
        }
        current.next=current.next.next;

        return dummy.next;
    }

    public static void display(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next=new Node(100);
        head.next.next=new Node(13);
        head.next.next.next=new Node(12);
        head.next.next.next.next=new Node(25);
        head.next.next.next.next.next=new Node(42);

        removeNthNode(head,4);
        display(head);

    }
}
