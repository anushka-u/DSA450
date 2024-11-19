package com.fibonacci;

import java.util.Scanner;

public class TribonacciByRecurssion {
	
	public static int tribonacci(int n)
	{
		if(n==0 || n==1 || n==2)
		{
			return 0;
		}
		if(n==3)
		{
			return 1;
		}
		
		return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
	}
	
	public static void main(String[] args)
	{
		Scanner scn =new Scanner(System.in);
		int n= scn.nextInt();
		System.out.println("The "+n+"th number of tribonacci Series is "+ tribonacci(n));
	}

}
