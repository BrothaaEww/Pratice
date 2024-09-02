package com.demo.pyq;

import java.util.Scanner;

/**
 * Int OperationChoices(int c, int n, int a , int b )
 * 
 * The function accepts 3 positive integers ‘a’ , ‘b’ and ‘c ‘ as its arguments.
 * Implement the function to return.
 * 
 * ( a+ b ) , if c=1 ( a – b ) , if c=2 ( a * b ) , if c=3 (a / b) , if c =4
 * Assumption : All operations will result in integer output.
 * 
 * Example:
 * 
 * Input c :1 a:12 b:16 Output: Since ‘c’=1 , (12+16) is performed which is
 * equal to 28 , hence 28 is returned. Sample Input
 * 
 * c : 2
 * 
 * a : 16
 * 
 * b : 20
 * 
 * Sample Output
 * 
 * -4F
 */

public class Calculator {

	public static int operationChoices(int a, int b, int c) {
		return (c == 1) ? a + b : (c == 2) ? a - b : (c == 3) ? a * b : a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		System.out.println(operationChoices(a, b, c));

	}

}
