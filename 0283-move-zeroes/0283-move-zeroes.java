class Solution {
    public void moveZeroes(int[] arr) {
        int p1 =0;
        int p2=0;
        
        while(p2<arr.length)
        {
            if(arr[p2]!=0)
            {
                int temp=arr[p1];
                arr[p1]=arr[p2];
                arr[p2]=temp;
                
                p1++;
            }
            p2++;
        }
    }
}