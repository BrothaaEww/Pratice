package com.demo.pyq;

import java.util.Scanner;

/**
 * def LargeSmallSum(arr)
 * 
 * The function accepts an integers arr of size ’length’ as its arguments you
 * are required to return the sum of second largest element from the even
 * positions and second smallest from the odd position of given ‘arr’
 * 
 * Assumption:
 * 
 * All array elements are unique Treat the 0th position as even NOTE
 * 
 * Return 0 if array is empty Return 0, if array length is 3 or less than 3
 * Example
 * 
 * Input
 * 
 * arr:3 2 1 7 5 4
 * 
 * Output
 * 
 * 7
 * 
 * Explanation
 * 
 * Second largest among even position elements(1 3 5) is 3 Second smallest among
 * odd position element is 4 Thus output is 3+4 = 7 Sample Input
 * 
 * arr:1 8 0 2 3 5 6
 * 
 * Sample Output
 * 
 * 8
 */

public class OddEvenSum {

	public static int findSum(int[] arr, int length) {
		if (arr == null || length <= 3)
			return -1;
		int[] arrodd = new int[length / 2];
		int[] arreven = new int[(length / 2) + 1];
		int j = 0, k = 0;
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				arreven[j] = arr[i];
				j++;
			} else {
				arrodd[k] = arr[i];
			}
		}

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int secondsmallest = Integer.MAX_VALUE;
		for (int i = 1; i < arreven.length; i++)
			largest = (arreven[i] > largest) ? arreven[i] : largest;
		for (int i = 0; i < arreven.length; i++)
			secondlargest = (arreven[i] != largest) ? (arreven[i] > secondlargest) ? arreven[i] : secondlargest
					: secondlargest;

		for (int i = 1; i < arrodd.length; i++)
			smallest = (arrodd[i] < smallest) ? arrodd[i] : smallest;
		for (int i = 0; i < arrodd.length; i++)
			secondsmallest = (arrodd[i] != smallest) ? (arrodd[i] < secondsmallest) ? arrodd[i] : secondsmallest
					: secondsmallest;
		return secondlargest + secondsmallest;
	}

	public static void main(String[] args) {
		System.out.println("enter the values: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(findSum(arr, n));
	}

}
