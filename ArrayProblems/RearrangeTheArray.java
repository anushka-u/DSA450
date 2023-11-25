import java.util.Scanner;

public class RearrangeTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }

        int neg=0;
        int pos = n-1;
        System.out.println(neg+ " " + pos);


        for(int i=0;i<n;i++) {
            if (arr[neg] < 0 ) {
                neg++;
            } else if (arr[neg] > 0 && arr[pos] < 0) {
                int temp = arr[neg];
                arr[neg] = arr[pos];
                arr[pos] = temp;
                neg++;
                pos--;
            } else if (arr[pos] > 0) {
                pos--;
            }

            for(int a:arr)
            {
                System.out.print(a + " ");
            }
            System.out.println();
            System.out.println(neg);
            System.out.println(pos);

            if(neg == pos)
                break;
        }
        for(int a:arr)
        {
            System.out.print(a + " ");
        }


    }
}
