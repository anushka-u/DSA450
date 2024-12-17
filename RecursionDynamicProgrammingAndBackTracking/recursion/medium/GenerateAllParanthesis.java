package recursion.medium;

import java.util.ArrayList;

public class GenerateAllParanthesis {

    static ArrayList<String> allValidParanthesis = new ArrayList<>();

    public static void generateParantheses(String curr, int n, int open, int close)
    {
        if(curr.length()==2*n)
        {
            allValidParanthesis.add(curr);
            return;
        }
        if(open<n)
        {
            generateParantheses(curr+"(",n,open+1,close);
        }
        if(close<open && close<n)
        {
            generateParantheses(curr+")",n,open,close+1);
        }
    }

    public static void main(String[] args) {
        int n=3;
        int open =0;
        int close =0;
        generateParantheses("",n,open,close);
        System.out.println(allValidParanthesis);
    }
}
