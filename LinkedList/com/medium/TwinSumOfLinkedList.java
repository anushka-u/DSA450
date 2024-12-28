package com.medium;

import com.linkedlist.Node;

public class TwinSumOfLinkedList {

    public static int maximumTwinSum(Node node)
    {
        int middle = (0+count(node))/2;
        Node temp = node;
        for(int i=0;i<middle;i++)
        {
            temp=temp.next;
        }
        Node reversedHead = reverseLinkedList(temp);

        Node temp1 = node;
        Node temp2 = reversedHead;

        int sum=0;
        while(temp2!=null)
        {
            sum = Integer.max(sum,temp1.data+temp2.data);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return sum;
    }

    public static Node reverseLinkedList(Node node)
    {
        Node head = node;
        Node current = head.next;
        head.next=null;

        while(current!=null)
        {
            Node nextNode = current.next;
            current.next=head;
            head= current;
            current = nextNode;
        }
        return head;
    }
    public static int count(Node node)
    {
        int  count=0;
        while(node!=null)
        {
            count+=1;
            node=node.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Node node1=new Node(12);
        node1.next=new Node(2);
        node1.next.next=new Node(13);
        node1.next.next.next=new Node(31);
        node1.next.next.next.next=new Node(22);
        node1.next.next.next.next.next=new Node(1);

        int answer = maximumTwinSum(node1);
        System.out.println(answer);
    }
}
