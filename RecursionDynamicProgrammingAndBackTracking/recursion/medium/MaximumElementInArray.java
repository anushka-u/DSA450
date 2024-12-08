package recursion.medium;

public class MaximumElementInArray {

    static int max=-1;

    public static int maximumElementInArray(int[] arr, int n)
    {
        if(n==0)
        {
            return max;
        }

       return Integer.max(arr[n-1],maximumElementInArray(arr,n-1));
    }

    public static void main(String[] args) {
        int [] arr = {1,13,23,4,5};
        System.out.println(maximumElementInArray(arr,arr.length-1));
    }

}
