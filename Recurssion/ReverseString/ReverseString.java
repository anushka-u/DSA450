import java.util.Scanner;

public class ReverseString {
    public static void ReverseString(String str)
    {
        if(str==null || str.length()<=1)
        {
            System.out.println(str);
        }
        else {
            System.out.print(str.charAt(str.length()-1));
            ReverseString(str.substring(0,str.length()-1));
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        ReverseString(str);
    }
}
