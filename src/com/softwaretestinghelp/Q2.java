package com.softwaretestinghelp;
/*Q #2) Write a Java Program to reverse a string without 
 * using String inbuilt function reverse().
 */
public class Q2 {
	
	public static String reverseString(String string) {
		StringBuilder reversedString = new StringBuilder();
		
		for (int j=0;j<string.length();j++) {
			reversedString.append(string.charAt(string.length()-j-1)) ;
		}
		return reversedString.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("shivington"));
	}

}
