package com.medium;

import com.linkedlist.Node;

public class ReverseALinkedListWay {

    public static Node reverseALinkedList(Node node)
    {
        if (node == null || node.next == null) {
            return node;
        }

        Node head = node;
        Node current = head.next;
        head.next = null; // Set the next of head to null

        while (current != null) {
            Node nextNode = current.next; // Save the next node
            current.next = head; // Reverse the link
            head = current; // Move head to current node
            current = nextNode; // Move to the next node
        }

        return head; // Return the new head of the reversed list
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        node1.next= new Node(5);
        node1.next.next=new Node(1);
        node1.next.next.next=new Node(2);
        node1.next.next.next.next=new Node(4);

        Node head = reverseALinkedList(node1);

        while (head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
