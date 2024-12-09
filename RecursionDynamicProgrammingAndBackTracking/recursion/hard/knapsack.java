package recursion.hard;

public class knapsack {

    public static int knapsack01prb(int wt[], int val[], int wgt, int n)
    {
        if(n==0 || wgt ==0)
        {
            return 0;
        }

        if(wt[n-1]<=wgt)
        {
            int include = val[n-1]+knapsack01prb(wt,val,wgt-wt[n-1],n-1);
            int exclude = knapsack01prb(wt,val,wgt,n-1);
            return Integer.max(include,exclude);
        }
        else {
            return knapsack01prb(wt, val, wgt, n - 1);
        }
    }

    public static void main(String[] args) {
        int wt[] ={1,3,4,5};
        int val[] ={1,4,5,7};
        int weight = 7;
        System.out.println(knapsack01prb(wt,val,weight,wt.length));
    }
}
