package recursion.easy;

public class reverseAString {
    static String revString = "";
    public static String reverseAString(String str)
    {
        if(str.isEmpty())
        {
            return revString;
        }
        char current = str.charAt(str.length()-1);
        revString= revString+current;
        return reverseAString(str.substring(0,str.length()-1));
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(reverseAString(str));
    }
}
