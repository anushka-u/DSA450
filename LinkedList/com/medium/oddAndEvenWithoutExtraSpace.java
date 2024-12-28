package com.medium;

import com.linkedlist.Node;

public class oddAndEvenWithoutExtraSpace {

    public static Node oddEvenLinkedList(Node node) {
        Node oddNode = new Node(-1);
        Node evenNode = new Node(-1);

        Node temp = node;

        Node tempOdd = oddNode;
        Node tempEven = evenNode;

        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                evenNode.next=temp;
                evenNode=temp;
            }
            else{
                oddNode.next=temp;
                oddNode=temp;
            }
            Node nextTemp = temp.next; // Save the next node
            temp.next = null; // Break the connection to avoid cyclic reference
            temp = nextTemp;
        }

        oddNode.next=tempEven.next;
        return tempOdd.next;
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

        Node head  = oddEvenLinkedList(node1);
        System.out.println(head);
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
