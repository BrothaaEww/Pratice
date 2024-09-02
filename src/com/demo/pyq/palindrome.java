package com.demo.pyq;

import java.util.Scanner;

/**
 * Question: Write a program in C such that it takes a lower limit and upper
 * limit as inputs and print all the intermediate palindrome numbers.
 * 
 * Test Cases:
 * 
 * TestCase 1: Input : 10 , 80 Expected Result: 11 , 22 , 33 , 44 , 55 , 66 ,
 * 77.
 * 
 * Test Case 2: Input: 100,200 Expected Result: 101 , 111 , 121 , 131 , 141 ,
 * 151 , 161 , 171 , 181 , 191.
 */
public class palindrome {

	public static boolean check(int n) {
		if (n > 0 && n <= 9)
			return true;
		int temp = n;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp / 10;
		}

		return (n == sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upper and Lower Limit");
		int ul = sc.nextInt();
		int ll = sc.nextInt();

		for (int i = ul; i <= ll; i++) {
			if (check(i))
				System.out.print(i + " ");
		}
	}

}
