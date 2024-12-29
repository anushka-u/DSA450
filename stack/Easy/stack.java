package Easy;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        //Push operation in stack is to push an element in stack
        st.push(45);
        st.push(31);
        st.push(92);
        st.push(41);
        st.push(15);
        st.push(99);
        //Peel operation in statck is to see the uppermost element in stack-> If you do peek you will get 99, that's our element in top
        st.peek();
        // Pop in stack is there to remove the element from stack
        System.out.println("Removing " + st.pop() + " from stack");
        //size operation in statck is to find out the number of elements/size of exoisting stack.
        System.out.println("Size of Stack " + st.size());
        //isEmpty() operation in stack is to check if our stack is empty or not
        //Stack works on LIFO/FILO -> so when you print manually try to print a stack you will always get the last inserted elemnt first and first inserted element at the last
        System.out.println("Printing stack ");
        while (!st.isEmpty()){
            System.out.print(st.peek()+" ");
            st.pop();
        }
    }
}
