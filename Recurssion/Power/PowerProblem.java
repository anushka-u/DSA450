import java.util.Scanner;

public class PowerProblem {

    public static int power(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return 2*power(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = power(n);
        System.out.println(ans);
    }
}
