package Easy;

import com.linkedlist.Node;


public class ImplementStackUsingLinkedList {

    public static class Stack{
        Node head = null;
        int size =0;

        void push(int ele)
        {
            Node node = new Node(ele);
            node.next=head;
            head=node;
            size++;
        }

        int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
        }

        int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is Empty");
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        boolean isEmpty(){
            if(head==null)
            {
                return true;
            }
            return false;
        }

        void displayRev(){
            Node temp = head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        void display(Stack stack)
        {
            if(stack.size==0)
            {
                return;
            }
            int x = stack.pop();
            display(stack);
            System.out.print(x+" ");
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(23);
        stack.push(22);
        stack.push(44);
        stack.push(93);
        stack.push(87);

        //Print stack using display
        stack.displayRev();

        //Pop an element from stack
        System.out.println(stack.pop());

        //peek the top most element in stack
        System.out.println(stack.peek());

        //check is stack is empty or not
        System.out.println(stack.isEmpty());

        //size of stack
        System.out.println(stack.size);

        //display
        stack.display(stack);
    }
}
