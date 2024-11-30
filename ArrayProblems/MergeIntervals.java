import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.max;

public class MergeIntervals {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,3)),
                new ArrayList<>(Arrays.asList(2,6)),
                new ArrayList<>(Arrays.asList(7,8)),
                new ArrayList<>(Arrays.asList(9,14)),
                new ArrayList<>(Arrays.asList(15,18))
        ));

        ArrayList<ArrayList<Integer>> mergedInterval = new ArrayList<>();

        Collections.sort(arr,(a,b)->Integer.compare(a.get(0),b.get(0)));
        System.out.println(arr);

        for(ArrayList<Integer> currentInterval : arr)
        {
            if(mergedInterval.isEmpty())
            {
                mergedInterval.add(currentInterval);
            }
            else{
                ArrayList<Integer> lastInterval = mergedInterval.get(mergedInterval.size() - 1);
                if(lastInterval.get(1)>=currentInterval.get(0))
                {
                    lastInterval.set(1,Math.max(lastInterval.get(1),currentInterval.get(1)));
                }
                else{
                    mergedInterval.add(currentInterval);
                }
            }
        }
        System.out.println(mergedInterval);
    }
}
