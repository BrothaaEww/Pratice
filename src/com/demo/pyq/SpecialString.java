package com.demo.pyq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Statement –
 * 
 * Capgemini in its online written test have a coding question, wherein the
 * students are given a string with multiple characters that are repeated
 * consecutively. You’re supposed to reduce the size of this string using
 * mathematical logic given as in the example below :
 * 
 * Input :
 * 
 * aabbbbeeeeffggg
 * 
 * Output:
 * 
 * a2b4e4f2g3
 * 
 * Input :
 * 
 * abbccccc
 * 
 * Output:
 * 
 * ab2c5
 */

public class SpecialString {

	public static String compress(String str) {
		String output = "";

		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch))
				map.put(ch, map.get(ch) + 1);
			else
				map.put(ch, 1);
		}

		for (Map.Entry<Character, Integer> e : map.entrySet()) {
			output = output + e.getKey() + e.getValue();
		}
		return output;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = in.readLine();
		System.out.println(compress(str));

	}

}
