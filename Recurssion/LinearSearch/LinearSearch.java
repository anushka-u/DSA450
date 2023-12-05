public class LinearSearch {
    public static boolean linearSearch(int arr[], int n, int key)
    {
        if(n==0){
            return false;
        }
        if(arr[n-1]==key)
            return true;
        return linearSearch(arr,n-1,key);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,6,78,31,21};
        int key = 78;
       boolean flag =  linearSearch(arr,arr.length,key);

       if(flag)
       {
           System.out.println("Found");
       }
       else {
           System.out.println("Not Found");
       }

    }
}
