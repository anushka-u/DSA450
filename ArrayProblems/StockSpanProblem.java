public class StockSpanProblem {

    public static int[] stockSpan(int[] arr)
    {
        int[] result = new int[arr.length];
        result[0] = 1;
        int count =1;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j>=0;j--)
            {
                if(arr[i]>arr[j])
                {
                    count+=1;
                }
                else if(arr[i]<arr[j])
                {
                    break;
                }
            }
            result[i] = count;
            count=1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] result = stockSpan(arr);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}
