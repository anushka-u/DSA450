import java.util.Arrays;

import static java.lang.Math.min;
//It will work in negative cases too.
public class minimizeTheHeight {

    public static void main(String[] args) {
        int[] arr = {1,8,10,6,4,6,9,1};
        int k=7;
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1]-arr[0];
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        int mi,ma;

        for(int i=0;i<n-1;i++)
        {
            mi = min(smallest,arr[i+1]-k);
            ma = Math.max(largest,arr[i]+k);
            ans = min(ans,ma-mi);
        }

        System.out.println(ans);

    }
}
