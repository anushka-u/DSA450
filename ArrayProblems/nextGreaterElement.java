public class nextGreaterElement {

    public static int[] nextGreater(int[] arr)
    {
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    result[i] = arr[j];
                    break;
                }
                if(j==arr.length-1)
                {
                    result[i]=-1;
                }
            }
        }
        result[arr.length-1]=-1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] result = nextGreater(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
