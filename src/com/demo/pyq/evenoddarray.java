package com.demo.pyq;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are required to input the size of the matrix then the elements of matrix,
 * then you have to divide the main matrix in two sub matrices (even and odd) in
 * such a way that element at 0 index will be considered as even and element at
 * 1st index will be considered as odd and so on. then you have sort the even
 * and odd matrices in ascending order then print the sum of second largest
 * number from both the matrices
 * 
 * Example
 * 
 * enter the size of array : 5 enter element at 0 index : 3 enter element at 1
 * index : 4 enter element at 2 index : 1 enter element at 3 index : 7 enter
 * element at 4 index : 9 Sorted even array : 1 3 9 Sorted odd array : 4 7
 * 
 * 7
 */
public class evenoddarray {

	public static int arraysum(int[] arr) {

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		int l = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}

		Collections.sort(even);
		Collections.sort(odd);

		return even.get(even.size() - 2) + odd.get(odd.size() - 2);
	}

	public static void main(String[] args) {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		System.out.println(arraysum(arr));

	}

}
