package com.medium;

import com.linkedlist.Node;

public class MergeTwoSortedLinkedListWithoutExtraSpace {

    public static Node mergeTwoSortedLinkedList(Node node1, Node node2)
    {
        Node temp1 = node1;
        Node temp2 = node2;
      Node head = new Node(-1);
      Node temp = head;

      while(temp1!=null && temp2!=null)
      {
          if(temp1.data<temp2.data)
          {
              temp.next=temp1;
              temp=temp1;
              temp1=temp1.next;
          }
          else{
              temp.next=temp2;
              temp=temp2;
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
      return head.next;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next=new Node(3);
        n1.next.next=new Node(5);
        n1.next.next.next=new Node(7);

        Node n2 = new Node(2);
        n2.next=new Node(4);
        n2.next.next=new Node(6);
        n2.next.next.next=new Node(8);

        Node head = mergeTwoSortedLinkedList(n1,n2);

        while (head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }

    }
}
