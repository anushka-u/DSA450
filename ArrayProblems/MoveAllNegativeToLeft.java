public class MoveAllNegativeToLeft {
    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]>0)
            {
                while(arr[j]>0)
                {
                    j--;
                    System.out.println(j);
                }
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j--;
            }
            i++;
        }
        for(int a:arr){
            System.out.printf(a+" ");
        }


    }
}
