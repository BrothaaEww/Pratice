package com.demo.pyq;

/**
 * . char*MoveHyphen(char str[],int n);
 * 
 * The function accepts a string “str” of length ‘n’, that contains alphabets
 * and hyphens (-). Implement the function to move all hyphens(-) in the string
 * to the front of the given string.
 * 
 * NOTE:- Return null if str is null.
 * 
 * Example :-
 * 
 * Input: str.Move-Hyphens-to-Front Output: —MoveHyphenstoFront Explanation:-
 * 
 * The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the
 * front of the string, this output is “— MoveHyphen”
 * 
 * Sample Input
 * 
 * Str: String-Compare Sample Output-
 * 
 * -StringCompare
 */
public class MoveHypen {

//	public static String move(String str) {
//		if (str.equals(null))
//			return null;
//		String output = "";
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != '-')
//				output = output + str.charAt(i);
//			else
//				count++;
//		}
//		String hyphen = "";
//
//		for (int i = 0; i < count; i++)
//			hyphen = hyphen + '-';
//		return (hyphen + output).trim();
//
//	}

	public static String move(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i++)
			res = (str.charAt(i) == '-') ? str.charAt(i) + res : res + str.charAt(i);
		return res;
	}

	public static void main(String[] args) {
		String str = "String-Compare";
		System.out.println(move(str));

	}

}
