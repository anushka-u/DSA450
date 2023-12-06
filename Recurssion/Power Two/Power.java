import java.util.Scanner;

public class Power {
    public static int Power(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a;
        }
        int ans = Power(a,b/2);
        if(b%2==0)
        {
            return ans*ans;
        }
        else{
            return a*ans*ans;
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(Power(a,b));

    }
}
