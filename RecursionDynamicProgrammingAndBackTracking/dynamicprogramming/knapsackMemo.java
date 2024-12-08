package dynamicprogramming;

public class knapsackMemo {

    public static int knapsack01prob(int wt[], int val[], int w, int n, int[][]dp)
    {
        if(n==0 || w ==0)
        {
            return 0;
        }
        if(dp[n][w]!=-1)
        {
            return dp[n][w];
        }

        if(wt[n-1]<=w)
        {
            return dp[n][w] = Integer.max(val[n-1]+knapsack01prob(wt,val,w-wt[n-1],n-1,dp),knapsack01prob(wt,val,w,n-1,dp));
        }
        else{
            return dp[n][w]=knapsack01prob(wt,val,w,n-1,dp);
        }


    }

    public static void main(String[] args) {
        int wt[] ={1,3,4,5};
        int val[] ={1,4,5,7};
        int weight = 7;
        int[][] dp = new int[wt.length+1][weight+1];
        for(int i=0;i<wt.length+1;i++)
        {
            for(int j=0;j<weight+1;j++)
            {
                dp[i][j]=-1;
            }
        }
        System.out.println(knapsack01prob(wt,val,weight,wt.length,dp));
    }

}
