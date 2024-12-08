package recursion.medium;

public class countZeroes {

    static int count = 0;

    public static int countZero(int[] arr,int n)
    {
        if(n==0)
            return count;

        if(arr[n-1]==0)
        {
            count+=1;
        }
        return countZero(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr= {1,1,1,1,0,0,0,0,1,1,1,0,0,1,0};
        System.out.println(countZero(arr,arr.length));

    }
}
