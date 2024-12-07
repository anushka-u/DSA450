import java.util.Scanner;

public class ReverseString {
    static String revString="";

    public static void ReverseString(String str) {
        if (str == null || str.length() <= 1) {
            System.out.println(str);
        } else {
            System.out.print(str.charAt(str.length() - 1));
            ReverseString(str.substring(0, str.length() - 1));
        }
    }

    public static String ReverseStringStr(String str, int idx, String revString)
    {
        if(idx==str.length())
        {
            return revString;
        }
        revString = str.charAt(idx)+revString;
        return ReverseStringStr(str,idx+1,revString);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(ReverseStringStr(str,0, revString));
    }
}
