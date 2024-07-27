class Solution {
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;

        for(int k=0;k<arr.length;k++)
        {
            if(arr[j]!=0 && arr[i]==0)
            {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }        
    }
}