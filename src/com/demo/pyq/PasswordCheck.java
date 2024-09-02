package com.demo.pyq;

import java.util.Scanner;

/**
 * You are given a function. int CheckPassword(char str[], int n); The function
 * accepts string str of size n as an argument. Implement the function which
 * returns 1 if given string str is valid password else 0. str is a valid
 * password if it satisfies the below conditions.
 * 
 * – At least 4 characters – At least one numeric digit – At Least one Capital
 * Letter – Must not have space or slash (/) – Starting character must not be a
 * number Assumption: Input string will not be empty.
 * 
 * Example:
 * 
 * Input 1: aA1_67
 * 
 * Output 1: 1
 * 
 * Input 2: a987 abC012
 * 
 * Output 2: 0
 */

public class PasswordCheck {

	public static int checkPassword(String str, int n) {
		if (n < 4)
			return 0;
		char c = str.charAt(0);
		if (Character.isDigit(c))
			return 0;
		int num = 0;
		int capital = 0;
		for (int i = 0; i < n; i++) {
			char ch = str.charAt(i);
			if (Character.isWhitespace(ch) || ch == '/')
				return 0;
			else if (Character.isDigit(ch))
				num++;
			else if (Character.isUpperCase(ch))
				capital++;
		}
		if (num > 0 && capital > 0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string: ");
		String str = sc.next();
		sc.close();
		System.out.println(checkPassword(str, str.length()));

	}

}
