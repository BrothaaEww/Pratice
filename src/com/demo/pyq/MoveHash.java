package com.demo.pyq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem Statement –
 * 
 * You have write a function that accepts, a string which length is “len”, the
 * string has some “#”, in it you have to move all the hashes to the front of
 * the string and return the whole string back and print it.
 * 
 * char* moveHash(char str[],int n);
 * 
 * example :-
 * 
 * Sample Test Case
 * 
 * Input:
 * 
 * Move#Hash#to#Front
 * 
 * Output:
 * 
 * ###MoveHashtoFront
 */
public class MoveHash {

	public static String move(String str) {
		if (str == null)
			return "";
		if (!str.contains("#"))
			return str;

		String output = "";
		for (char ch : str.toCharArray())
			if (ch == '#')
				output = ch + output;
			else
				output = output + ch;
		return output;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = in.readLine();
		String output = move(str);
		System.out.println(output);
	}

}
