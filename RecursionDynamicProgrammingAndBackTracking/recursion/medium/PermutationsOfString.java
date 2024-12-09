package recursion.medium;

import java.util.ArrayList;

public class PermutationsOfString {

    static ArrayList<String> permutations = new ArrayList<>();
    public static void permuationsOfString(String str,String temp, int idx)
    {
        if(idx==str.length())
        {
            permutations.add(temp);
            return;
        }

        for(int i=0;i<str.length();i++)
        {
            if(temp.contains(String.valueOf(str.charAt(i))))
            {
                continue;
            }

            temp+=str.charAt(i);

            permuationsOfString(str,temp,idx+1);

            temp=temp.substring(0,temp.length()-1);
        }
    }

    public static void main(String[] args) {
        String str= "ABC";
        permuationsOfString(str,"",0);
        System.out.println(permutations);
    }
}
