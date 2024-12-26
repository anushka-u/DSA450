package com.medium;

import com.linkedlist.Node;

public class RemoveDuplicatesFromLinkedList{
    public static Node removeDuplicatesFromLinkedList(Node node)
    {
        Node dummy = new Node(-1);
        Node head = node;
        dummy.next=head;
        Node temp1= head.next;

        while (temp1!=null){
            if(head.data==temp1.data)
            {
                head.next=temp1.next;
                temp1=temp1.next;
            }
            else{
                head=head.next;
                temp1=temp1.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.next=new Node(1);
        node.next.next=new Node(2);
        node.next.next.next=new Node(2);
        node.next.next.next.next=new Node(3);
        node.next.next.next.next.next=new Node(3);
        node.next.next.next.next.next.next=new Node(3);
        node.next.next.next.next.next.next.next=new Node(4);
        node.next.next.next.next.next.next.next.next=new Node(4);

        Node head = removeDuplicatesFromLinkedList(node);

        while (head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

}
