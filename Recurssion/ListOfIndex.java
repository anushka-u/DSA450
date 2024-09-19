import java.util.ArrayList;

public class ListOfIndex {

    //ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3,4,5};
        int target = 2;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = findAllIndex(arr, target, 0, list);
        System.out.println(list);

    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index== arr.length-1)
            return list;
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);

    }
}
