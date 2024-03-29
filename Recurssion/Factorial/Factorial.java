import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*findFactorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = findFactorial(n);
        System.out.println(ans);
    }
}
