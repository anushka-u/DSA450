package recursion.medium;

public class BinarySearch {

    public static boolean binarySearch(int[] arr, int s, int e, int mid,int ele)
    {
        if(arr[mid]== ele)
        {
            return true;
        }
        if(s>=e)
        {
            return false;
        }
        if(ele>arr[mid])
        {
            return binarySearch(arr,mid+1,e,(s+e)/2,ele);
        }
        else{
           return binarySearch(arr,s,mid-1,(s+e)/2,ele);
        }
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        int ele =8;
        System.out.println(binarySearch(arr,0,arr.length-1,(0+arr.length-1)/2, ele));
    }
}
