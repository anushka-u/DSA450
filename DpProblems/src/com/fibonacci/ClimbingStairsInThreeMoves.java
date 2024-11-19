package com.fibonacci;

import java.util.Scanner;

public class ClimbingStairsInThreeMoves {
	
	public static int climbingStairsInThreeMoves(int n)
	{
		if(n==0)
			return 1;
		if(n<0)
			return 0;
		return climbingStairsInThreeMoves(n-1)+climbingStairsInThreeMoves(n-2)+
				climbingStairsInThreeMoves(n-3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		System.out.println(climbingStairsInThreeMoves(n));
		
	}

}
