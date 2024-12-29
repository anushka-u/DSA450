package InterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

public class validParanthesisLeetCode {

    public static boolean isValid(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                if((top=='('&&s.charAt(i)==')')||(top=='[' && s.charAt(i)==']')
                ||(top=='{'&& s.charAt(i)=='}'))
                {
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(isValid(str));
    }
}
