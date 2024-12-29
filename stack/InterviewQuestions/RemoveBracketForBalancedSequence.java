package InterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

public class RemoveBracketForBalancedSequence {

    public static int removeBracketToGetBalancedBracket(String str)
    {
        Stack<Character> st = new Stack<>();
        int unmatchedClosingBracket =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='(')
            {
                st.push(ch);
            }
            else if(!st.isEmpty())
            {
                st.pop();
            }
            else{
                unmatchedClosingBracket++;
            }
        }
        int unmatchedOpeningBracket = st.size();
        return unmatchedOpeningBracket+unmatchedClosingBracket;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int numberOfBracketsNeedToRemoved = removeBracketToGetBalancedBracket(str);
        System.out.println(numberOfBracketsNeedToRemoved);
    }
}
