public class SortArray {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,0};
        int low =0;
        int mid = 0;
        int high = arr.length-1;
        int temp=0;
        while(mid<=high)
        {
            if(arr[mid] == 0)
            {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2)
            {
                temp=arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
 //           To check the flow
//            for(int a:arr)
//            {
//                System.out.print(a+" ");
//            }
//            System.out.println();

        }
        System.out.println("Final Output");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

    }
}
