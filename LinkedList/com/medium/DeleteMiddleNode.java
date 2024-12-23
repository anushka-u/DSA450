package com.medium;

import com.linkedlist.Node;

public class DeleteMiddleNode {

    public static Node deleteMiddleNode(Node head)
    {
        Node dummy = new Node(-1);
        dummy.next=head;

        int middle=(0+sizeOfLinkedList(head))/2;

        Node curr = dummy;

        for(int i=0;i<middle;i++)
        {
            curr=curr.next;
        }
        curr.next=curr.next.next;

        return dummy.next;
    }

    public static int sizeOfLinkedList(Node head)
    {
        int count =0;
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

        deleteMiddleNode(head);

        display(head);
    }
}
