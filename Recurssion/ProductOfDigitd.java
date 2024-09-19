import java.util.Scanner;

public class ProductOfDigitd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        System.out.println(ProductOfDigit(n));

    }
    static int ProductOfDigit(int n){
        if(n==0){
            return 1;
        }
        return n%10 * ProductOfDigit(n/10);
    }
}
