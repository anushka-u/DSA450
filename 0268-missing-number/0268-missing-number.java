class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumOfAll=0;
        for(int i=0;i<=n;i++)
        {
            sumOfAll+=i;
        }
        int sumOfArray=0;
        for(int i=0;i<n;i++)
        {
            sumOfArray+=nums[i];
        }

        return sumOfAll-sumOfArray;
    }
}