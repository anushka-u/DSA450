package Easy;

import java.util.ArrayList;
import java.util.Stack;

public class ImplementStackUSingArray {

    public static class Stack{
        int[] arr = new int[10];
        int idx=0;
        void push(int x)
        {
            arr[idx] = x;
            idx+=1;
        }

        int peek()
        {
           if(idx==0)
           {
               System.out.println("Stack is Empty, returning an invalid integer");
               return -1;
           }
           return arr[idx-1];
        }
        int pop()
        {
            int x = arr[idx-1];
            arr[idx-1] =0;
            idx-=1;
            return x;
        }

        boolean isEmpty(){
            if(idx==0)
            {
                return true;
            }
            else{
                return false;
            }
        }

        boolean isFull(){
            if(idx==10)
            {
                return true;
            }
            else{
                return false;
            }
        }

        void display()
        {
            for(int i=0;i<idx;i++)
            {
                System.out.print(arr[i]+ " ");
            }
        }

        int size(){
            return idx;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(13);
        st.push(45);
        st.push(78);

        st.display();
        System.out.println();
        System.out.println(st.pop());

        System.out.println(st.peek());

        System.out.println(st.isEmpty());

        System.out.println(st.isFull());

        System.out.println(st.size());
    }

}
