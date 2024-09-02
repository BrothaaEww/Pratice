package com.demo.pyq;

public class Binary {

//	public static int getBinary(int n) {
//
//		int binary = 0;
//		int multiplier = 1;
//
//		int temp = n;
//		while (temp > 0) {
//			int rem = temp % 2;
//			binary = binary + (rem * multiplier);
//			multiplier = multiplier * 10;
//			temp = temp / 2;
//		}
//		return binary;
//
//	}
	
	public static int getBinary(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * getBinary(n / 2);
    }

	public static void main(String[] args) {
		System.out.print(getBinary(96));
	}

}
