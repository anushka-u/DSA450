import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();

        System.out.println(SumOfDigits(n));
    }

    static int SumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        return n%10+SumOfDigits(n/10);
    }
}
