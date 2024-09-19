import java.util.Scanner;

public class CountZero {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        System.out.println((CountZeros(num)));
    }

    static int CountZeros(int num) {
        if(num==0)
        {
            return 0;
        }
        if(num%10!=0)
        {
            return CountZeros(num/10);
        }
        return 1+ CountZeros(num/10);
    }
}
