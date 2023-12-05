import java.util.Scanner;

public class CountWaysToReachNStairs {
    public static int waysToReachNthStairs(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        return waysToReachNthStairs(n-1)+waysToReachNthStairs(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = waysToReachNthStairs(n);
        System.out.println(ans);
    }
}
