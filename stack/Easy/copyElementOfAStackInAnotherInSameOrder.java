package Easy;

import java.util.Stack;

public class copyElementOfAStackInAnotherInSameOrder {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(98);
        st.push(55);
        st.push(81);
        st.push(75);
        st.push(107);

        System.out.println(st);

        Stack<Integer> helperStack = new Stack<>();
        while(!st.isEmpty())
        {
            helperStack.push(st.pop());
        }

        Stack<Integer> copiedStack =  new Stack<>();
        while(!helperStack.isEmpty())
        {
            copiedStack.push(helperStack.pop());
        }

        System.out.println("Copied Stack " + copiedStack);
    }
}
