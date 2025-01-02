package InterviewQuestions;

import java.util.Stack;

public class stockSpanProblem {

    public static int[] stackSpan(int[] arr)
    {
        Stack<Integer> stack = new Stack<>();
        int n=arr.length;
        int[] result = new int[n];

        result[0] = 1;
        stack.push(0);
        for(int i=1;i<n;i++)
        {
           while (!stack.isEmpty() && arr[i] >= arr[stack.peek()])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                result[i]=i+1;
            }
            else{
                result[i]=i-stack.peek();
            }

            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] result = stackSpan(arr);

        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
