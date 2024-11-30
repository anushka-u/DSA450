import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else{
                hashMap.put(arr[i],1);
            }
        }
        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: hashMap.entrySet())
        {
           if(entry.getValue()==2)
           {
               duplicates.add(entry.getKey());
           }
        }

        for(int i : duplicates)
        {
            System.out.printf(i+" ");
        }
    }
}
