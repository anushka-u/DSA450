import java.util.Scanner;

public class CyclicallyRotate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0] = temp;

        for(int a:arr)
        {
            System.out.print(a+" ");
        }


    }
}
