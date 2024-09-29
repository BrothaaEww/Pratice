package com.demo.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Fibonacci {
	
	static HashMap<Integer, Integer> map = new HashMap<>();


	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	
	public static int fiboFinderTabular(int n) {

		if (n == 0)
			return 0;

		else if (n == 1)
			return 1;

		int[] fib = new int[n + 1];

		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];

	}
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(2^n)
	 */

	public static int fiboFinderRecursion(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fiboFinderRecursion(n - 1) + fiboFinderRecursion(n - 2);

	}
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */

	public static int fiboFinderMemoization(int n) {

		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;

		if (map.containsKey(n))
			return map.get(n);
		
		int result = fiboFinderMemoization(n - 1) + fiboFinderMemoization(n - 2);
		map.put(n, result);

		return map.get(n);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value of n: ");
		int n = Integer.parseInt(in.readLine());

		System.out.println(n + " th number of Fibonacci series is: " + fiboFinderTabular(n - 1) + " Tabular method");
		System.out.println(n + " th number of Fibonacci series is: " + fiboFinderRecursion(n - 1) + " Recursion");
		System.out.println(n + " th number of Fibonacci series is: " + fiboFinderMemoization(n - 1) + " Memoization");


	}

}
