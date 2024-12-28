package com.medium;

import com.linkedlist.Node;

public class oddAndEvenListBasedOnIndices
{
    public static Node oddEvenLinkedList(Node node)
    {
        if(node==null || node.next==null || node.next.next==null)
            return node;
        Node oddNode = new Node(-1);
        Node evenNode = new Node(-1);

        Node tempOdd = oddNode;
        Node tempEven = evenNode;

        Node temp=node;

        int count=1;
        while(temp!=null)
        {
            if(count%2==0)
            {
                evenNode.next=temp;
                evenNode=temp;
            }
            else {
                oddNode.next=temp;
                oddNode=temp;
            }
            Node nextTemp = temp.next;
            temp.next=null;
            temp=nextTemp;
            count+=1;
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
