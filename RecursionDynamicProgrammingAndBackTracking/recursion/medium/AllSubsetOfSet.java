package recursion.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AllSubsetOfSet {

    static Set<ArrayList<Integer>> subsets = new HashSet<>();

    public static void allSubset(int[]arr,int idx, ArrayList<Integer> current)
    {
        if(idx== arr.length) //->0<3 ,1<3,2<3
        {
            subsets.add(new ArrayList<>(current));
            return;
        }

        //Include the current element
        current.add(arr[idx]);
        //Call the method
        allSubset(arr,idx+1,current);

        //Exclude the current element
        current.remove(current.size()-1);
        allSubset(arr,idx+1,current);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> current  = new ArrayList<>();
        allSubset(arr,0,current);
//        for(ArrayList<Integer> a : subsets)
//        {
//            System.out.println(a);
//        }

        System.out.println(subsets);
    }
}
