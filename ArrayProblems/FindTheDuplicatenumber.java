import java.util.Scanner;

public class FindTheDuplicatenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i =0 ;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        int duplicate =0;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    duplicate = arr[i];
                }
            }
        }
        System.out.println("Duplicate Element in array is "+ duplicate);

    }
}
