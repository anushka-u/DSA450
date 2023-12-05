public class BinarySearch {
    public static boolean binarySearch(int arr[], int low, int high, int key)
    {

        if(low>high)
        {
            return false;
        }
        int mid = (low + high)/2;
        if(arr[mid]==key)
        {
            return true;
        }
        if(arr[mid]> key)
        {
            return binarySearch(arr,low,mid-1,key);
        }
        else{
            return binarySearch(arr,mid+1,high,key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,6,9,12,15,18,21};
        int key = 21;
        boolean flag =  binarySearch(arr,0,arr.length-1,key);

        if(flag)
        {
            System.out.println("Found");
        }
        else {
            System.out.println("Not Found");
        }
    }
}
