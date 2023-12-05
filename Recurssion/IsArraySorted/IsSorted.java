public class IsSorted {
    public static boolean isSorted(int arr[], int n) {
        if (n == 0 || n==1){
            return true;
        }
        if(arr[n-1]<arr[n-2])
        {
            return false;
        }
        else{
            return isSorted(arr,n-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,8,6,7,9,13};
        int n =6;
         boolean flag = isSorted(arr,n);
         if(flag)
         {
             System.out.println("Sorted");
         }
         else{
             System.out.println("Unsorted");
         }

    }
}
