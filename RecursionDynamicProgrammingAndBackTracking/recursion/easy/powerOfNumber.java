package recursion.easy;

public class powerOfNumber {
    public static int powerOfNum(int x, int n)
    {
        if(n==1)
            return x;

        return x*powerOfNum(x,n-1);
    }

    public static void main(String[] args) {
        int x =2;
        int n =4;
        System.out.println(powerOfNum(x,n));
    }
}
