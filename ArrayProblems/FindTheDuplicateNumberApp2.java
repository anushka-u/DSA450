import java.util.Scanner;

public class FindTheDuplicateNumberApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr[arr[i]%n]=arr[arr[i]%n]+n;
            System.out.println("Array after "+ i +" iteration");
            for(int a :arr)
            {
                System.out.print(a+" ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]/n>1)
            {
                System.out.println(i);
            }
        }
    }

}
