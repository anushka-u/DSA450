package com.fibonacci;

public class fibonacciByTabulation {

	public static int fibonacci(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		int[] table = new int[n+1];
		table[0]=0;
		table[1]=1;
		for(int  i =2;i<=n;i++) {
			table[i] = table[i-1]+table[i-2];
		}
		return table[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int result  = fibonacci(n);
		System.out.println("The "+n+"th number of series is "+result);
	}

}
