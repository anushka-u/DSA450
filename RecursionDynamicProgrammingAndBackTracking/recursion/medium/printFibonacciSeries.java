package recursion.medium;

public class printFibonacciSeries {

    public static void printFibonacci(int n)
    {
        printFibonacciRecurssive(n,0,1);
    }

    public static void printFibonacciRecurssive(int n,int a,int b)
    {
        if(n==0)
        {
            return;
        }
        System.out.printf(a+" ");
        printFibonacciRecurssive(n-1,b,a+b);
    }

    public static void main(String[] args) {
        printFibonacci(6);
    }
}
