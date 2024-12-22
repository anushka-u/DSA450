package com.linked.easy;

import com.linkedlist.Node;

public class DeleteANode {

    public static void deleteANode(Node node)
    {
        node.data=node.next.data;
        node.next=node.next.next;
    }

    public static void display(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(19);
        head.next= new Node(34);
        head.next.next=new Node(87);
        head.next.next.next = new Node(52);

        deleteANode(head.next.next);
        display(head);

    }
}
