package com.linked.easy;

import com.linkedlist.Node;

public class splitALinkedListIntoTwo {

    public static void splitALinkedList(Node node1)
    {
        Node temp = node1;
        Node list1 = new Node(-1);
        Node temp1 = list1;
        Node list2= new Node(-1);
        Node temp2 = list2;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                Node a = new Node(temp.data);
                temp1.next = a;
                temp1=a;
                temp=temp.next;
            }
            else{
                Node a = new Node(temp.data);
                temp2.next=a;
                temp2=a;
                temp=temp.next;
            }
        }
        System.out.println("Even List ");
        while(list1.next!=null)
        {
            System.out.print(list1.next.data+ " ");
            list1 = list1.next;
        }
        System.out.println();
        System.out.println("Odd List ");
        while (list2.next!=null)
        {
            System.out.print(list2.next.data+" ");
            list2=list2.next;
        }
    }

    public static void main(String[] args) {
        Node node1= new Node(1);
        node1.next=new Node(2);
        node1.next.next=new Node(3);
        node1.next.next.next=new Node(4);
        node1.next.next.next.next=new Node(5);
        node1.next.next.next.next.next = new Node(6);
        node1.next.next.next.next.next.next = new Node(8);
        node1.next.next.next.next.next.next.next = new Node(11);

        splitALinkedList(node1);
    }
}
