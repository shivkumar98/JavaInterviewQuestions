package com.edabit.medium;
/*
 * Create a function that takes an integer n and reverses it.
Examples

rev(5121) ➞ "1215"

rev(69) ➞ "96"

rev(-122157) ➞ "751221"

Notes

    This challenge is about using two operators that are related to division.
    If the number is negative, treat it like it's positive.
 */

public class RevNumber {
	
	static String rev(int n) {
//		if (n<0)
//			n=-1*n;
//		char[] charArray =String.valueOf(n).toCharArray();
//		StringBuilder string = new StringBuilder();
//		
//		for (int i = 0; i<charArray.length;i++) {
//			string.append(charArray[charArray.length-i-1]);
//		}
//		return string.toString();
		
		if (n<0)
			n = n*-1;
		
		StringBuilder sb = new StringBuilder(String.valueOf(n));
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		System.out.println(rev(1234));
	}

}
