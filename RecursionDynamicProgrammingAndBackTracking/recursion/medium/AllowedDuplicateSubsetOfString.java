package recursion.medium;

import java.util.ArrayList;

public class AllowedDuplicateSubsetOfString {

    static ArrayList<String> subset = new ArrayList<>();
    public static void subsetOfString(String str, String temp){
        if(str.isEmpty())
        {
                subset.add(temp);
            return;
        }

        subsetOfString(str.substring(0,str.length()-1),str.charAt(str.length()-1)+temp);

        subsetOfString(str.substring(0,str.length()-1),temp);
    }

    public static void main(String[] args) {
        String str = "hello";
        subsetOfString(str,"");
        System.out.println(subset);
    }
}
