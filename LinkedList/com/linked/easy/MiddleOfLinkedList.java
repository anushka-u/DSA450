package com.linked.easy;

import com.linkedlist.Node;

public class MiddleOfLinkedList {

    public static Node middleNode(Node head) {
        int mid = (0+sizeOfList(head))/2;

        for(int i=0;i<mid;i++)
        {
            head=head.next;
        }
        return head;
    }

    public static int sizeOfList(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }

    public static void display(Node head)
    {
        while (head!=null)
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

        Node temp = middleNode(head);
        display(temp);
    }
}
