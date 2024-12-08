package recursion.easy;

public class countDigit {
    static int count =0;
    public static int countDigitsInNumber(int n)
    {
        if(n==0)
        {
            return count;
        }
        if(n!=0)
        {
            count+=1;
        }
        return countDigitsInNumber(n/10);
    }

    public static void main(String[] args) {
        int n = 12345987;
        System.out.println(countDigitsInNumber(n));
    }
}
