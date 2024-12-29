package Easy;

import java.util.Stack;

public class InsertAtAnyIndex {
    //Your task is to insert 84 in stack at 3rd position
    public static Stack<Integer> insertAtAnyIdx(Stack<Integer>st, int idx, int element)
    {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx)
        {
            rt.push(st.pop());
        }
        st.push(element);
        while(!rt.isEmpty())
        {
            st.push(rt.pop());
        }
        return st;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(81);
        st.push(53);
        st.push(63);
        st.push(13);
        st.push(64);
        st.push(36);

        //Call the method
        insertAtAnyIdx(st,3,84);
        System.out.println(st);
    }
}
