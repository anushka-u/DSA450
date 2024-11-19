package com.fibonacci;

import java.util.Scanner;

public class TribonacciUsingMemoization {

	
	public static int tribonacci(int n,int[] dp)
	{
		if(n==0 || n==1 ||n==2)
		{
			return 0;
		}
		if(n==3)
		{
			return 1;
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		
		return dp[n] = tribonacci(n-1,dp)+tribonacci(n-2,dp)+tribonacci(n-3,dp);
		
	}
	
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n= scn.nextInt();
		int[] dp = new int[n+1];
		for(int i=0;i<=n;i++)
		{
			dp[i]=-1;
		}
		System.out.println("The "+n+"th number of tribonacci Series is "+ tribonacci(n,dp));
	}
}
