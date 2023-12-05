import java.util.Scanner;

public class fibonacciNumber {
    public static int fibonacci(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = fibonacci(n);
        System.out.println(ans);
    }
}
