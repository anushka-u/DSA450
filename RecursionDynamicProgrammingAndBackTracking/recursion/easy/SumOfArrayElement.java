package recursion.easy;

public class SumOfArrayElement {

    static int sumOfElement=0;

    public static int sumOfArray(int arr[],int n)
    {
        if(n==0)
        {
            return sumOfElement;
        }
        return arr[n-1]+sumOfArray(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,5,4,3,2};
        System.out.println(sumOfArray(arr,arr.length));
    }
}
