package com.medium;

import com.linkedlist.Node;


public class checkIfLinkedListIsPalindrome {

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

    public static boolean isPalindrome(Node node)
    {
        int mid = (0+count(node))/2;
        Node head = node;
        for(int i=0;i<mid;i++)
        {
            head=head.next;
        }
        Node reversedNode = reverseALinkList(head);

        Node temp1=node;
        Node temp2=reversedNode;

        while(temp2!=null)
        {
            if(temp1.data!=temp2.data)
            {
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }

    public static Node reverseALinkList(Node node)
    {
        Node head = node;
        Node current = head.next;
        head.next=null;

        while(current!=null)
        {
            Node nextNode = current.next;
             current.next=head;
             head=current;
             current=nextNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Node node1=new Node(1);
        node1.next=new Node(2);
        node1.next.next=new Node(3);
        node1.next.next.next=new Node(3);
        node1.next.next.next.next=new Node(2);
        node1.next.next.next.next.next=new Node(1);

        System.out.println(isPalindrome(node1));

    }
}
