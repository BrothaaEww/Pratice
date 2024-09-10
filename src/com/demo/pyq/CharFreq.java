package com.demo.pyq;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFreq {
	public static int getFrequency(int[] arr, int n) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

//		int max = Integer.MIN_VALUE;
		int frequency = 0;

		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

//		for (Map.Entry <Integer,Integer> e : map.entrySet()) {
//			if(e.getValue() > max) {
//				max = e.getValue();
//				item = e.getKey();
//			}
//		}
		if (!map.containsKey(n))
			System.out.println("item does not exist");
		else
			frequency = map.get(n);
		return frequency;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 1, 4, 5, 2, 1, 8, 5, 6, 3, 2, 1, 4, 7, 1, 2, 4, 5, 6, 8, 9, 3, 6, 5, 7, 4, 1, 2, 5, 4, 6, 3,
				9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int frequency = getFrequency(arr, n);
		if (frequency != 0)
			System.out.println(frequency);
	}

}
