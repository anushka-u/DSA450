package com.fibonacci;

import java.util.Scanner;

public class ClimbingStairsUsingMemoization {
	
	
	public static int climbingStairs(int n,int[] dp)
	{
		if(n==0 || n==1)
			return 1;
		
		if(dp[n]!=-1)
			return dp[n];
		
		return dp[n] = climbingStairs(n-1,dp) + climbingStairs(n-2,dp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] dp = new int[n+1];
		for(int i=0;i<=n;i++) {
			dp[i]=-1;	
		}
		System.out.println(climbingStairs(n,dp));
	}

}
