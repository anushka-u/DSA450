package recursion.medium;

import java.util.ArrayList;

public class SubstringFinder {

    // This will hold all the substrings
    static ArrayList<String> substringCollection = new ArrayList<>();

    public static void generateSubstrings(String str) {
        // Base case: If we've reached the end of bgthe string, return
        if (str.length() == 1) {
            substringCollection.add(str);
            return;
        } else {
            substringCollection.add(str);
            generateSubstrings(str.substring(0,str.length()-1));
            generateSubstrings(str.substring(1,str.length()));

        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        generateSubstrings(str);

        System.out.println(substringCollection);
    }
}
