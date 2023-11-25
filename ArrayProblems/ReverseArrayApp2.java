
import java.util.Scanner;

public class ReverseArrayApp2 {
    public static void main(String... args)
    {
        Scanner scanner = new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }

        int i =0;
        int j = n-1;
        int k = (i+j)/2;

        while(i<=k && j>=k)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
