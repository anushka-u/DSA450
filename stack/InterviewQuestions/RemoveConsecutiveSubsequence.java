package InterviewQuestions;
import java.util.Stack;

public class RemoveConsecutiveSubsequence {

    public static int[] removeSubsequences(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length-1;i++) {
            if (st.size() == 0) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i])
            {
                if (i != arr.length - 1 || arr[i] != arr[i + 1])
                    st.pop();
                else {
                    st.push(arr[i]);
                }
            }
        }

        int[] result = new int[st.size()];
        for(int i=0;i<st.size();i++)
        {
            result[i]= st.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr= {1,2,2,3,10,10,10,4,4,4,5,7,7};
        int[] res = removeSubsequences(arr);

       for(int i=0;i<res.length;i++)
       {
           System.out.print(res[i]+" ");
       }
    }
}
