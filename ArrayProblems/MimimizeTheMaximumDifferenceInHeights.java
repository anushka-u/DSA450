import java.util.Arrays;
import java.util.Scanner;

public class MimimizeTheMaximumDifferenceInHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int k =scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        // logic
        Arrays.sort(arr);
//        for(int a:arr)
//        {
//            System.out.print(a + " ");
//        }
        System.out.println();
        int ans = arr[n-1]-arr[0];
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;

        int mi, ma;
        for(int i=0;i<n-1;i++)
        {
            mi = Math.min(smallest, arr[i+1]-k);
            ma = Math.max(largest,arr[i]+k);

            if(mi<0)
            {
                continue;
            }
            ans = Math.min(ans,ma-mi);
        }
        System.out.println(ans);

    }

}
