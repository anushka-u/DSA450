package Easy;

import java.util.Stack;

public class ReverseStackRecursively {

    public static void reverseTheStack(Stack<Integer> st)
    {
        if(st.size()==0)
        {
            return;
        }
        int top = st.pop();
        reverseTheStack(st);
        pushAtBottom(st,top);
    }

    public static void pushAtBottom(Stack<Integer>st, int element)
    {
        if(st.size()==0)
        {
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,element);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(24);
        st.push(47);
        st.push(29);
        st.push(98);
        st.push(39);

        reverseTheStack(st);
        System.out.println(st);
    }
}
