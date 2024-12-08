package recursion.easy;

public class prime {

    public static boolean primeOrNot(int n, int divisor)
    {
        if(divisor==n/2)
        {
            return true;
        }
        if(n%divisor==0)
        {
            return false;
        }
        return primeOrNot(n,divisor+1);
    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(primeOrNot(n,2));
        int p = 12;
        System.out.println(primeOrNot(p,2));
    }
}
