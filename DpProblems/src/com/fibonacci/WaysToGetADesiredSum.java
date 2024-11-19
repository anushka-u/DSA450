package com.fibonacci;

import java.util.Scanner;

//Given 3 numbers {1, 3, 5}, The task is to tell the total number of ways we can form a number N using the sum of the given three numbers.
public class WaysToGetADesiredSum {
	public static int[] dp = new int[1000];
	
	public static int solve(int n)
	{
		if(n<0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		if(dp[n]!=-1)
		{
			return dp[n];
		}
		return dp[n]=solve(n-1)+solve(n-3)+solve(n-5);
	}
//	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n= scn.nextInt();
		
		for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
		
		
		int result = solve(n);
		System.out.println("The ways to get sum N using 1,3 and 5 is "+ result);
		
	}

}
