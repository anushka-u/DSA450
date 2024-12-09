package recursion.medium;

import java.util.ArrayList;

public class AllCombinations {

    static ArrayList<String> combinations = new ArrayList<>();

    public static void allCombinationsOfString(String str,String temp)
    {
        if(str.isEmpty())
        {
            combinations.add(temp);
            return;
        }
        // Include the current character and recurse
        allCombinationsOfString(str.substring(1), temp + str.charAt(0));

        // Exclude the current character and recurse
        allCombinationsOfString(str.substring(1), temp);
    }

    public static void main(String[] args) {
        String str = "ABC";
        allCombinationsOfString(str,"");
        System.out.println(combinations);
    }
}
