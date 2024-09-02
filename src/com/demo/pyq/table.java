package com.demo.pyq;

/**
 * Problem: Write a program in C to display the table of a number and print the
 * sum of all the multiples in it.
 * 
 * Test Cases:
 * 
 * Test Case 1: Input: 5 Expected Result Value: 5, 10, 15, 20, 25, 30, 35, 40,
 * 45, 50 275
 * 
 * Test Case 2: Input: 12 Expected Result Value: 12, 24, 36, 48, 60, 72, 84, 96,
 * 108, 120 660
 */

public class table {

	public static void printTable(int n) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print((n * i) + " ");
			sum = sum + (n * i);
		}
		System.out.println("\n" + sum);
	}

	public static void main(String[] args) {
		int n = 25;
		printTable(n);
	}
}
