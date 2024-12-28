package com.extra;

public class BasicImplementationOfDLL {

    public static void displayLinkedList(Node head)
    {
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void displayInReverseOrder(Node tail)
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    public static void printAllWhenGivenARandomNode(Node random)
    {
        Node temp = random;
        while (temp.prev!=null)
        {
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public  static Node InsertAtHead(Node head, int val)
    {
        Node newHead = new Node(val);
        newHead.next=head;
        head.prev=newHead;
        head=newHead;

        return head;
    }

    public static Node InsertAtTail(Node head, int data)
    {
        Node node = head;
        Node temp = head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node newNode = new Node(data);
        temp.next=newNode;
        newNode.prev=temp;
        return node;
    }

    public static void InsertAtAnyIdx(Node head, int idx, int data) {
        if (head == null && idx != 0) {
            System.out.println("Index out of bounds");
            return;
        }

        // Special case: inserting at head (idx == 0)
        if (idx == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode; // Update head reference
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp == null) { // Index out of bounds
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }

        if (temp == null) { // Index out of bounds
            System.out.println("Index out of bounds");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) { // Update next node's prev reference if exists
            temp.next.prev = newNode;
        }
        temp.next = newNode;
    }

    public static Node DeleteAtHead(Node node)
    {
        node = node.next;
        node.prev=null;

        return node;
    }

    public static void DeleteAtTail(Node node)
    {
        Node temp = node;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.prev.next=null;
    }

    public static void main(String[] args) {
        Node node = new Node(12);
        Node node1 = new Node(32);
        Node node2= new Node(14);
        Node node3= new Node(53);
        Node node4 = new Node(61);
        Node node5 = new Node(82);
        Node node6 = new Node(71);

        node.next=node1;
        node1.prev=node;
        node1.next=node2;
        node2.prev=node1;
        node2.next=node3;
        node3.prev=node2;
        node3.next=node4;
        node4.prev=node3;
        node4.next=node5;
        node5.prev=node4;
        node5.next=node6;
        node6.prev=node5;

        displayLinkedList(node);
        System.out.println();
        displayInReverseOrder(node6);
        System.out.println();
        printAllWhenGivenARandomNode(node3);

        System.out.println();

        Node head = InsertAtHead(node,89);
        displayLinkedList(head);

        System.out.println();
        Node newHead = InsertAtTail(node,91);
        displayLinkedList(newHead);

        System.out.println();
        InsertAtAnyIdx(node,3,201);
        displayLinkedList(node);

        System.out.println();
        Node newDelHEad = DeleteAtHead(node);
        displayLinkedList(newDelHEad);

        System.out.println();
        DeleteAtTail(node);
        displayLinkedList(node);
    }
}
