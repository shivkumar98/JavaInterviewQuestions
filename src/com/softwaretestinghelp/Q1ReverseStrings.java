package com.softwaretestinghelp;
/*Q1) Write a Java Program to reverse a string 
 * without using String inbuilt function.
 */
public class Q1ReverseStrings {
	
	public static String reverseString(String string) {
		StringBuilder reversedString = new StringBuilder(string);
		return reversedString.reverse().toString();
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("shivington"));
		
	}

}
