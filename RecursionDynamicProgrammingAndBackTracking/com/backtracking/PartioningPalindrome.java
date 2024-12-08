package com.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class PartioningPalindrome {
    //static  ArrayList<ArrayList<String>> result = new ArrayList<>(new ArrayList<>());

    public static boolean checkPalindrome(String str)
    {
        int first =0;
        int last = str.length()-1;
        while(first<=last)
        {
            if(str.charAt(first)==str.charAt(last))
            {
                first++;
                last--;
            }
            else{
                return false;
            }
        }
        return  true;
    }

    public static void palindromePartioning(String str, int idx, ArrayList<String> current, ArrayList<ArrayList<String>> result)
    {
        if(idx==str.length())
        {
            result.add(new ArrayList<>(current));
            return;
        }

        String temp ="";

        for(int i=idx;i<str.length();i++)
        {
            temp+=str.charAt(i);

            if(checkPalindrome(temp))
            {
                current.add(temp);

                palindromePartioning(str,idx+1,current,result);

                current.remove(current.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        String str = "nitin";
        System.out.println(checkPalindrome(str));
        String str2 = "geeks";
        System.out.println(checkPalindrome(str2));
        ArrayList<String> current = new ArrayList<>();
        ArrayList<ArrayList<String>> result = new ArrayList<>(new ArrayList<>());
        palindromePartioning(str,0, current,result);
        System.out.println(result);
    }

}
