package src.com.fibonacci;

import java.util.Scanner;

public class ClimbingStairsTabulization {
	
	public static int climbingStairs(int n)
	{
		int[] dp = new int[n+1];
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(climbingStairs(n));
	}

}
