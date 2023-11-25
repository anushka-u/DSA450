import java.util.*;
import java.util.Scanner;
public class ReverseArray{
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

        for(int i=0;i<n;i++)
        {
            int temp = arr[n-1];
            for(int j=n-1;j>i;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[i]=temp;
        }


        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}