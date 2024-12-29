package Easy;

import java.util.Stack;

public class InsertAtBottom {

    public static Stack<Integer> insertAtBtm(Stack<Integer>st, int element)
    {
        Stack<Integer> helperStack = new Stack<>();
        while(!st.isEmpty())
        {
            helperStack.push(st.pop());
        }
        helperStack.push(element);
        while(!helperStack.isEmpty())
        {
            st.push(helperStack.pop());
        }
        return st;
    }
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(87);
        st.push(73);
        st.push(62);
        st.push(20);
        st.push(37);
        st.push(93);

        insertAtBtm(st,102);
        System.out.println(st);

    }
}
