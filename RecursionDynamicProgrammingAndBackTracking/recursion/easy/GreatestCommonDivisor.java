package recursion.easy;

public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int a, int b)
    {
        if(a<0 || b<0)
            return -1;
        if(b==0)
            return a;
        return greatestCommonDivisor(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(12,24));
    }
}
