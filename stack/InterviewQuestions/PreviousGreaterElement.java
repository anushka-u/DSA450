package InterviewQuestions;

import Easy.ImplementStackUsingLinkedList;

import java.util.Stack;

public class PreviousGreaterElement {

    public static int[] previousGreater(int[] arr)
    {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        result[0]=-1;
        stack.push(arr[0]);
        for(int i=1;i<arr.length;i++)
        {
            while(!stack.isEmpty() && arr[i]> stack.peek())
                stack.pop();

            result[i] = stack.isEmpty()?-1: stack.peek();

            stack.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr ={100,80,60,70,60,75,85};
        int[] result = previousGreater(arr);

        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
