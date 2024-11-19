package com.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fibonacciByMemoization {

	public static int fibonacci(int n, Map<Integer,Integer> cache)
	{
		if(cache.containsKey(n))
		{
			return cache.get(n);
		}
		int result;
		if(n==0)
		{
			result=0;
		}
		else if(n==1) {
			result=1;
		}
		else {
			result = fibonacci(n-1,cache)+fibonacci(n-2,cache);
		}
		
		cache.put(n,result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scn.nextInt();
		Map<Integer,Integer>cache = new HashMap<>();
		int result = fibonacci(n,cache);
		System.out.println("The "+ n +"th number of series is "+ result);

	}


}
