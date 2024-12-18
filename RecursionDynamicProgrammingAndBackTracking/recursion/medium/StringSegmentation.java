package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class StringSegmentation {

    public static boolean stringSegmentation(String str, int idx, ArrayList<String> dictionary)
    {
        if(idx==str.length())
            return true;

        String temp="";
        for(int i=idx;i<str.length();i++)
        {
            temp = temp+str.charAt(i);
            if(dictionary.contains(temp) && stringSegmentation(str,i+1,dictionary))
            {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        String str = "catsandog";
        ArrayList<String> arr = new ArrayList<>(List.of("cats","and","dog"));
        System.out.println(stringSegmentation(str,0,arr));
    }
}
