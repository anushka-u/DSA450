package InterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String str)
    {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                stack.push(str.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println("Given String "+ str+ " is balanced?: " + isBalanced(str));
    }
}
