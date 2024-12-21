package com.linkedlist;

public class LinkedListExample {

    static int count =0;
    //Can we print our linked list without for loop
    public static void display(Node head)
    {
        if(head==null)
            return;

        System.out.print(head.data+" ");
        display(head.next);
    }

    //To reverse a linked list
    public static void reverseALinkedList(Node head)
    {
        if(head==null)
            return;

        reverseALinkedList(head.next);
        System.out.print(head.data+" ");
    }

    //To find out length of a linked List -- Recurssive method
    public static int lengthOfLinkedList(Node head)
    {
        if(head==null)
            return count;

        count+=1;
        return lengthOfLinkedList(head.next);

    }

    //To fing length of linked List -> Non Recursive method
    public static int lengthOfLinkList(Node head)
    {
        int count=0;
        while (head!=null)
        {
            count+=1;
            head=head.next;
        }
        return count;

    }

    public static void main(String[] args) {

        //Creating object of Node class
        Node a = new Node(5);
        Node b= new Node(3);
        Node c= new Node(7);
        Node d= new Node(8);
        Node e= new Node(11);
        //At this point our node look like 5 3 7 8 11 without any linkage in between

        a.next=b; //5->3 7 8 11 creating linkage in between first and second node.
        b.next=c; //5->3->7 8 11 creating linkage in between second and third node.
        c.next=d;//5->3->7->8 11 creating linkage in between third and fourth node.
        d.next=e;//5->3->7->8->11  creating linkage in between fourth and fifth node.


        //Print Linked List
        Node temp = a; //here temp is pointing at 'a'.
//        while(temp!=null)
//        {
//            System.out.print(temp.data+ " ");
//            temp= temp.next; // Now it will point to it's next element.
//        }

        display(temp);
        System.out.println();
        reverseALinkedList(temp);

        System.out.println();
        System.out.println(lengthOfLinkedList(temp));
        System.out.println(lengthOfLinkList(temp));

    }
}
