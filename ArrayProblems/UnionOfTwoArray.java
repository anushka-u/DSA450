import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m= scanner.nextInt();
        int[] arr= new int[m];

        int n = scanner.nextInt();
        int[] brr= new int[n];

        for(int i=0;i<m;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            brr[i]=scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            if(list.contains(arr[i]))
            {
                continue;
            }
            else{
                list.add(arr[i]);
            }
        }

        for(int j=0;j<n;j++)
        {
            if(list.contains(brr[j]))
            {
                continue;
            }
            else{
                list.add(brr[j]);
            }

        }
        for(int a:list)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(list.size());

    }
}
