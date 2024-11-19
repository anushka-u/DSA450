package com.fibonacci;

import java.util.Scanner;

public class ClimbingStairs {
	
	public static int climbingStairsToTop(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		return climbingStairsToTop(n-1)+climbingStairsToTop(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println("Ways to reach top of stairs are "+ climbingStairsToTop(n));
	}

}
