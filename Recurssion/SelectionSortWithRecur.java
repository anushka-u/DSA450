public class SelectionSortWithRecur {

    public static void main(String[] args) {
        int[]arr={1,4,2,5};
        SelectionSort(arr,0,arr.length-1,0);
       for(int i:arr){
           System.out.print(i+" ");
       }
    }

    static void SelectionSort(int[] arr, int st, int en,int largest){
        if(en==0){
            return;
        }
        if(en>st){
            if(arr[st]>arr[largest]){
                SelectionSort(arr,st+1,en,st);
            }else{
                SelectionSort(arr,st+1,en,largest);
            }
        }
        else{
            int temp =arr[largest];
            arr[largest] = arr[en-1];
            arr[en-1] = temp;
            SelectionSort(arr,0,en-1,0);


        }
    }
}
