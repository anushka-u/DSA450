package recursion.medium;

public class countWaysToReachNstairs {

    public static int countWaysToReachNStairss(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }

        return countWaysToReachNStairss(n-1) + countWaysToReachNStairss(n-2);
    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(countWaysToReachNStairss(n));
    }
}
