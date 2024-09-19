public class BubbleSortWithRecu {

    public static void main(String[] args) {
        int[] arr={1,3,2,5,4,7,6};
        bubbleSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    static void bubbleSort(int[] arr,int st,int en){
        if(en==0){
            return;
        }
        if(en>st){
            if(arr[st]>arr[en]){
                    int temp = arr[st];
                    arr[st] = arr[en];
                    arr[en] = temp;
            }
            bubbleSort(arr,st+1,en);
        }else{
            bubbleSort(arr,0,en-1);
        }
    }
}
