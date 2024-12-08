package recursion.easy;

//The code is for series : 1,1,2,3,5,8,13,21---------- as per this 6th number in series is 8.
public class fibonacci {

    public static int fibonacciNumber(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        return fibonacciNumber(n-1)+ fibonacciNumber(n-2);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacciNumber(n));
    }
}
