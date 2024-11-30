public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 36, 4, 35, 52, 61, 7, 8, 83, 3, 3, 45, 51};
        int i=0;
        int j=arr.length-1;

        while(i<=j)
        {
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        for(int a:arr){
            System.out.printf(a+" ");
        }


    }
}
