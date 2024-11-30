import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {2,4,7,10};
        int[] b ={2,3};
/*
Not an appropriate soln in cp as it has tc of O(n^2)
 for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]>b[j])
                {
                    int temp = a[i];
                    a[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        Arrays.sort(b);
 */
        int i =a.length-1;
        int j=0;
        //TC : o(nlogn)
        while(i>=0 && j<b.length)
        {
//            System.out.println(a[i]);
//            System.out.println(i);
            if(a[i]>=b[j])
            {
                int temp = a[i];
                a[i]=b[j];
                b[j]=temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);


    }
}
