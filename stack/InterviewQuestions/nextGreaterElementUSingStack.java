package InterviewQuestions;

import java.util.Stack;

public class nextGreaterElementUSingStack {

    public static int[] nextGreater(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        int n= arr.length;
        int[] result = new int[n];

        result[n-1] = -1;
        st.push(arr[n-1]);

        for (int i=n-2;i>=0;i--) {
            while (!st.isEmpty() && st.peek()<arr[i])
            {
                st.pop();
            }

            result[i] = st.isEmpty()?-1:st.peek();

            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] result  = nextGreater(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
