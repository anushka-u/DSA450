package com.linked.easy;

import com.linkedlist.Node;

public class RemoveLinkedListElement {

    public static Node removeElement(Node head, int data)
    {
        //creating a dummy node to keep track of head
        Node dummy = new Node(-1);
        dummy.next=head;
        Node prev =dummy;
        Node curr=head;

        while(curr!=null)
        {
            if(curr.data == data)
            {
                prev.next=curr.next;
            }
            else{
                prev=curr;
            }
            curr=curr.next;
        }
        return dummy.next;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(6);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(6);

        head = removeElement(head, 1);
        display(head);

    }
}
//Execution:
//dummy = -1 -> 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
//prev = -1, curr = 1
//curr.data == data (1 == 1):
//prev.next = curr.next
//List becomes: -1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
//Move curr = 2.
//Continue loop for the rest of the list.
