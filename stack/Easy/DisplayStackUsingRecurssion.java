package Easy;

import java.util.Stack;

public class DisplayStackUsingRecurssion {
    public static void display(Stack<Integer> st)
    {
        if(st.size()==0)
        {
            return;
        }
        int top = st.pop() ;
        System.out.print(top+" "); //Will print in reverse
        display(st);
        System.out.print(top+" "); //will print in same ordered as inserted.
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(252);
        st.push(93);
        st.push(27);
        st.push(108);
        st.push(264);
        st.push(354);

        display(st);
        System.out.println();
        System.out.println(st);
    }
}
