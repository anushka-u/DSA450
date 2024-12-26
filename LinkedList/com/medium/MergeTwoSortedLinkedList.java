package com.medium;

import com.linkedlist.Node;

public class MergeTwoSortedLinkedList {

    public static Node mergeTwoLinkList(Node node1, Node node2)
    {
        Node temp1 = node1;
        Node temp2 = node2;

        Node dummy = new Node(-1);
        Node temp = dummy;

        while (temp1!=null && temp2!=null){
            if(temp1.data <temp2.data)
            {
                Node a = new Node(temp1.data);
                temp.next=a;
                temp=a;
                temp1=temp1.next;
            }
            else{
                Node a = new Node(temp2.data);
                temp.next=a;
                temp=a;
                temp2=temp2.next;
            }
        }
        if(temp1!=null)
        {
            temp.next=temp1;
        }
        else{
            temp.next=temp2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node node1 =  new Node(1);
        node1.next=new Node(3);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(7);


        Node node2 = new Node(2);
        node2.next=new Node(4);
        node2.next.next = new Node(6);
        node2.next.next.next = new Node(8);

        Node head = mergeTwoLinkList(node1,node2);

        while(head!=null)
        {
            System.out.print(head.data+ " ");
            head=head.next;
        }

    }
}
