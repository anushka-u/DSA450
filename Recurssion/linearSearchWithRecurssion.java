public class linearSearchWithRecurssion {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        System.out.println(linearSearchWithRec(arr,6,0));
    }

    static int linearSearchWithRec(int[]arr, int target, int index){
        if(index== arr.length-1)
        {
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearchWithRec(arr, target, index+1);
    }
}
