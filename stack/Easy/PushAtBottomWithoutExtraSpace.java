package Easy;

import java.util.Stack;

public class PushAtBottomWithoutExtraSpace {

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
        Stack<Integer>st = new Stack<>();
        st.push(72);
        st.push(13);
        st.push(387);
        st.push(93);
        st.push(28);
        st.push(19);

        pushAtBottom(st,82);
        System.out.println(st);
    }
}
