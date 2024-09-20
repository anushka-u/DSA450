package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 1, 5};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }
            }
            if(min_idx!=i){
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
    }
}
