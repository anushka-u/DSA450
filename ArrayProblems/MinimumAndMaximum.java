import java.util.Scanner;

public class MinimumAndMaximum {
    public static void main(String...args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int Max=arr[0];
        int Min = arr[0];

        for(int i=0;i<n;i++)
        {
            if(Max<arr[i])
            {
                Max=arr[i];
            }
            if(Min>arr[i])
            {
                Min=arr[i];
            }
        }

        System.out.println("Maximum Value in array is "+ Max);
        System.out.println("Minimum Value in array is "+Min);

    }
}
