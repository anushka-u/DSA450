package com.linkedlist;

public class ImplementingLinkedList {

    public static class linkedList{
        Node head;
        Node tail;

        //To Insert Element At End
        void insertAtEnd(int val)
        {
            Node temp = new Node(val);
            if(head==null)
            {
                head=temp;
                tail=temp;
            }
            else {
                tail.next=temp;
                tail=temp;
            }
        }

        //To print all element of Linked List
        void display()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }

        //To find length of linked list
        int size()
        {
            Node temp= head;
            int count=0;
            while (temp!=null)
            {
                count+=1;
                temp=temp.next;
            }

            return count;
        }

        //To Insert Element At Begining of Linked List
        void insertAtBegin(int val)
        {
            Node temp = new Node(val);
            if(head==null)
            {
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        //To Insert Element in middle of Linked List
        void insertInMid(int idx, int val) {
            Node t = new Node(val);
            Node temp=head;
            if (idx == size()) {
                insertAtEnd(val);
                return;
            }
            if (idx == 0)
            {
                insertAtBegin(val);
                return;
            }
            if(idx<0 || idx>size())
            {
                System.err.println("Given Index is wrong");
            }
            for(int i=1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        //To get Element at a particular index
        int getElement(int idx)
        {
            Node temp =head;
            if(temp==null)
                return -1;

            if(idx<0 || idx>size())
            {
                System.err.println("Index out of bound exception");
                return -1;
            }

            for(int i=1;i<=idx;i++)
            {
                temp=temp.next;
            }
            return temp.data;
        }

        //Delete element at a particulare index
        void deleteAtIndex(int idx) {
            if (idx < 0 || idx >= size()) {
                System.err.println("Index out of bounds");
                return;
            }

            if (idx == 0) { // Special case: Deleting the head
                head = head.next;
                if (head == null) { // If the list becomes empty
                    tail = null;
                }
                return;
            }

            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            // Check if the node to be deleted is the tail
            if (temp.next == tail) {
                tail = temp; // Update tail to the previous node
            }

            temp.next = temp.next.next; // Remove the node
        }

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(71);
        ll.insertAtEnd(35);

        ll.display();
        System.out.println();

        ll.insertAtEnd(67);
        ll.insertAtEnd(96);

//        ll.display();
        System.out.println();
        System.out.println(ll.size());

        ll.insertAtBegin(101);
//        ll.display();

        ll.insertInMid(4,87);
        ll.display();

        System.out.println();
        System.out.println(ll.getElement(5));

        System.out.println(ll.size());

        ll.deleteAtIndex(3);
        ll.display();
        System.out.println();
        System.out.println(ll.tail.data);
    }
}
