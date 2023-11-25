import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int sum=0;
        int max_Sum=arr[0];

        for(int i=0;i<n;i++)
        {
            if(sum<0)
            {
                sum=0;
            }
            sum+=arr[i];
            max_Sum = Math.max(sum,max_Sum);
        }

        System.out.println(max_Sum);
    }
}
