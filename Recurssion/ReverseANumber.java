import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        reverseANumber(num);
    }
    static void reverseANumber(int num) {
        if(num==0)
        {
            return;
        }
        System.out.print(num%10);
        reverseANumber(num/10);
    }
}
